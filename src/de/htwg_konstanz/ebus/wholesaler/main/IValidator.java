package de.htwg_konstanz.ebus.wholesaler.main;

import java.util.ArrayList;

import org.w3c.dom.Document;

public interface IValidator {
	
	/**
	 * validates DOM against scheme
	 * @param document
	 * @param errorList
	 * @return boolean
	 */
	abstract boolean validateDOM(Document document, ArrayList<String> errorList);
}
