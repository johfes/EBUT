/* ClassFinderUtil.java
 ***********************************************************************************
 * 14.03.2007 ** tdi
 * - created
 *
 ***********************************************************************************
 * Copyright 2007 HTWG Konstanz
 * 
 * Prof. Dr.-Ing. Juergen Waesch
 * Dipl. -Inf. (FH) Thomas Dietrich
 * Fakultaet Informatik - Department of Computer Science
 * E-Business Technologien 
 * 
 * Hochschule Konstanz Technik, Wirtschaft und Gestaltung
 * University of Applied Sciences
 * Brauneggerstrasse 55
 * D-78462 Konstanz
 * 
 * E-Mail: juergen.waesch(at)htwg-konstanz.de
 ************************************************************************************/
package de.htwg_konstanz.ebus.wholesaler.demo.util;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import de.htwg_konstanz.ebus.wholesaler.demo.IAction;

public class ClassFinderUtil {
	public ClassFinderUtil() {
		super();
	}

	/**
	 * Load all the classes inheriting or implementing a given class in a given
	 * package.
	 * 
	 * @param pckgname
	 *            the fully qualified name of the package
	 * @param tosubclass
	 *            the Class object to inherit from
	 */
	public static List<IAction> findAll(String packageName, Class<?> className) {
		List<IAction> actionList = new ArrayList<IAction>();

		// Translate the package name into an absolute path
		String name = new String(packageName);
		if (!name.startsWith("/")) {
			name = "/" + name;
		}
		name = name.replace('.', '/');

		// Get a File object for the package
		URL url = ClassFinderUtil.class.getResource(name);
		System.out.println(name + "->" + url);

		if (url == null)
			return actionList;

		File directory = null;
		try {
			directory = new File(url.toURI().getPath());
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (directory.exists()) {
			// Get the list of the files contained in the package
			String[] files = directory.list();
			for (String fileName : files) {
				// we are only interested in .class files
				if (fileName.endsWith(".class")) {
					// removes the .class extension
					String foundClassName = fileName.substring(0,
							fileName.length() - 6);
					try {
						// Try to create an instance of the object
						Object obj = Class.forName(
								packageName + "." + foundClassName)
								.newInstance();
						if (className.isInstance(obj)) {
							System.out.println(foundClassName);
							actionList.add((IAction) obj);
						}
					} catch (ClassNotFoundException cnfex) {
						System.err.println(cnfex);
					} catch (InstantiationException iex) {
						// We try to instanciate an interface
						// or an object that does not have a
						// default constructor
					} catch (IllegalAccessException iaex) {
						// The class is not public
					}
				}
			}
		}

		return actionList;
	}

	public static void main(String[] args) {
		findAll("de.htwg_konstanz.ebus.wholesaler.demo", IAction.class);
	}
}
