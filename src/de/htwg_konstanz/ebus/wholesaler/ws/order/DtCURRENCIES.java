
package de.htwg_konstanz.ebus.wholesaler.ws.order;

import javax.xml.bind.annotation.XmlEnum;


/**
 * <p>Java class for dtCURRENCIES.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dtCURRENCIES">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADP"/>
 *     &lt;enumeration value="AED"/>
 *     &lt;enumeration value="AFA"/>
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="ANG"/>
 *     &lt;enumeration value="AOK"/>
 *     &lt;enumeration value="ARA"/>
 *     &lt;enumeration value="ATS"/>
 *     &lt;enumeration value="AUD"/>
 *     &lt;enumeration value="AWG"/>
 *     &lt;enumeration value="BBD"/>
 *     &lt;enumeration value="BDT"/>
 *     &lt;enumeration value="BEF"/>
 *     &lt;enumeration value="BGL"/>
 *     &lt;enumeration value="BHD"/>
 *     &lt;enumeration value="BIF"/>
 *     &lt;enumeration value="BMD"/>
 *     &lt;enumeration value="BND"/>
 *     &lt;enumeration value="BOB"/>
 *     &lt;enumeration value="BRC"/>
 *     &lt;enumeration value="BSD"/>
 *     &lt;enumeration value="BTN"/>
 *     &lt;enumeration value="BUK"/>
 *     &lt;enumeration value="BWP"/>
 *     &lt;enumeration value="BZD"/>
 *     &lt;enumeration value="CAD"/>
 *     &lt;enumeration value="CHF"/>
 *     &lt;enumeration value="CLF"/>
 *     &lt;enumeration value="CLP"/>
 *     &lt;enumeration value="CNY"/>
 *     &lt;enumeration value="COP"/>
 *     &lt;enumeration value="CRC"/>
 *     &lt;enumeration value="CSK"/>
 *     &lt;enumeration value="CUP"/>
 *     &lt;enumeration value="CVE"/>
 *     &lt;enumeration value="CYP"/>
 *     &lt;enumeration value="DDM"/>
 *     &lt;enumeration value="DEM"/>
 *     &lt;enumeration value="DJF"/>
 *     &lt;enumeration value="DKK"/>
 *     &lt;enumeration value="DOP"/>
 *     &lt;enumeration value="DZD"/>
 *     &lt;enumeration value="ECS"/>
 *     &lt;enumeration value="EGP"/>
 *     &lt;enumeration value="ESP"/>
 *     &lt;enumeration value="ETB"/>
 *     &lt;enumeration value="EUR"/>
 *     &lt;enumeration value="FIM"/>
 *     &lt;enumeration value="FJD"/>
 *     &lt;enumeration value="FKP"/>
 *     &lt;enumeration value="FRF"/>
 *     &lt;enumeration value="GBP"/>
 *     &lt;enumeration value="GHC"/>
 *     &lt;enumeration value="GIP"/>
 *     &lt;enumeration value="GMD"/>
 *     &lt;enumeration value="GNF"/>
 *     &lt;enumeration value="GRD"/>
 *     &lt;enumeration value="GTQ"/>
 *     &lt;enumeration value="GWP"/>
 *     &lt;enumeration value="GYD"/>
 *     &lt;enumeration value="HKD"/>
 *     &lt;enumeration value="HNL"/>
 *     &lt;enumeration value="HTG"/>
 *     &lt;enumeration value="HUF"/>
 *     &lt;enumeration value="IDR"/>
 *     &lt;enumeration value="IEP"/>
 *     &lt;enumeration value="ILS"/>
 *     &lt;enumeration value="INR"/>
 *     &lt;enumeration value="IQD"/>
 *     &lt;enumeration value="IRR"/>
 *     &lt;enumeration value="ISK"/>
 *     &lt;enumeration value="ITL"/>
 *     &lt;enumeration value="JMD"/>
 *     &lt;enumeration value="JOD"/>
 *     &lt;enumeration value="JPY"/>
 *     &lt;enumeration value="KES"/>
 *     &lt;enumeration value="KHR"/>
 *     &lt;enumeration value="KMF"/>
 *     &lt;enumeration value="KPW"/>
 *     &lt;enumeration value="KRW"/>
 *     &lt;enumeration value="KWD"/>
 *     &lt;enumeration value="KYD"/>
 *     &lt;enumeration value="LAK"/>
 *     &lt;enumeration value="LBP"/>
 *     &lt;enumeration value="LKR"/>
 *     &lt;enumeration value="LRD"/>
 *     &lt;enumeration value="LSL"/>
 *     &lt;enumeration value="LUF"/>
 *     &lt;enumeration value="LYD"/>
 *     &lt;enumeration value="MAD"/>
 *     &lt;enumeration value="MGF"/>
 *     &lt;enumeration value="MNT"/>
 *     &lt;enumeration value="MOP"/>
 *     &lt;enumeration value="MRO"/>
 *     &lt;enumeration value="MTL"/>
 *     &lt;enumeration value="MUR"/>
 *     &lt;enumeration value="MVR"/>
 *     &lt;enumeration value="MWK"/>
 *     &lt;enumeration value="MXP"/>
 *     &lt;enumeration value="MYR"/>
 *     &lt;enumeration value="MZM"/>
 *     &lt;enumeration value="NGN"/>
 *     &lt;enumeration value="NIC"/>
 *     &lt;enumeration value="NLG"/>
 *     &lt;enumeration value="NOK"/>
 *     &lt;enumeration value="NPR"/>
 *     &lt;enumeration value="NZD"/>
 *     &lt;enumeration value="OMR"/>
 *     &lt;enumeration value="PAB"/>
 *     &lt;enumeration value="PEI"/>
 *     &lt;enumeration value="PGK"/>
 *     &lt;enumeration value="PHP"/>
 *     &lt;enumeration value="PKR"/>
 *     &lt;enumeration value="PLZ"/>
 *     &lt;enumeration value="PTE"/>
 *     &lt;enumeration value="PYG"/>
 *     &lt;enumeration value="QAR"/>
 *     &lt;enumeration value="ROL"/>
 *     &lt;enumeration value="RWF"/>
 *     &lt;enumeration value="SAR"/>
 *     &lt;enumeration value="SBD"/>
 *     &lt;enumeration value="SCR"/>
 *     &lt;enumeration value="SDP"/>
 *     &lt;enumeration value="SEK"/>
 *     &lt;enumeration value="SGD"/>
 *     &lt;enumeration value="SHP"/>
 *     &lt;enumeration value="SLL"/>
 *     &lt;enumeration value="SKK"/>
 *     &lt;enumeration value="SOS"/>
 *     &lt;enumeration value="SRG"/>
 *     &lt;enumeration value="STD"/>
 *     &lt;enumeration value="SUR"/>
 *     &lt;enumeration value="SVC"/>
 *     &lt;enumeration value="SYP"/>
 *     &lt;enumeration value="SZL"/>
 *     &lt;enumeration value="THB"/>
 *     &lt;enumeration value="TND"/>
 *     &lt;enumeration value="TOP"/>
 *     &lt;enumeration value="TPE"/>
 *     &lt;enumeration value="TRL"/>
 *     &lt;enumeration value="TTD"/>
 *     &lt;enumeration value="TWD"/>
 *     &lt;enumeration value="TZS"/>
 *     &lt;enumeration value="UGS"/>
 *     &lt;enumeration value="USD"/>
 *     &lt;enumeration value="UYP"/>
 *     &lt;enumeration value="VEB"/>
 *     &lt;enumeration value="VND"/>
 *     &lt;enumeration value="VUV"/>
 *     &lt;enumeration value="WST"/>
 *     &lt;enumeration value="YDD"/>
 *     &lt;enumeration value="YER"/>
 *     &lt;enumeration value="YUD"/>
 *     &lt;enumeration value="ZAR"/>
 *     &lt;enumeration value="ZMK"/>
 *     &lt;enumeration value="ZRZ"/>
 *     &lt;enumeration value="ZWD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum DtCURRENCIES {

    ADP,
    AED,
    AFA,
    ALL,
    ANG,
    AOK,
    ARA,
    ATS,
    AUD,
    AWG,
    BBD,
    BDT,
    BEF,
    BGL,
    BHD,
    BIF,
    BMD,
    BND,
    BOB,
    BRC,
    BSD,
    BTN,
    BUK,
    BWP,
    BZD,
    CAD,
    CHF,
    CLF,
    CLP,
    CNY,
    COP,
    CRC,
    CSK,
    CUP,
    CVE,
    CYP,
    DDM,
    DEM,
    DJF,
    DKK,
    DOP,
    DZD,
    ECS,
    EGP,
    ESP,
    ETB,
    EUR,
    FIM,
    FJD,
    FKP,
    FRF,
    GBP,
    GHC,
    GIP,
    GMD,
    GNF,
    GRD,
    GTQ,
    GWP,
    GYD,
    HKD,
    HNL,
    HTG,
    HUF,
    IDR,
    IEP,
    ILS,
    INR,
    IQD,
    IRR,
    ISK,
    ITL,
    JMD,
    JOD,
    JPY,
    KES,
    KHR,
    KMF,
    KPW,
    KRW,
    KWD,
    KYD,
    LAK,
    LBP,
    LKR,
    LRD,
    LSL,
    LUF,
    LYD,
    MAD,
    MGF,
    MNT,
    MOP,
    MRO,
    MTL,
    MUR,
    MVR,
    MWK,
    MXP,
    MYR,
    MZM,
    NGN,
    NIC,
    NLG,
    NOK,
    NPR,
    NZD,
    OMR,
    PAB,
    PEI,
    PGK,
    PHP,
    PKR,
    PLZ,
    PTE,
    PYG,
    QAR,
    ROL,
    RWF,
    SAR,
    SBD,
    SCR,
    SDP,
    SEK,
    SGD,
    SHP,
    SKK,
    SLL,
    SOS,
    SRG,
    STD,
    SUR,
    SVC,
    SYP,
    SZL,
    THB,
    TND,
    TOP,
    TPE,
    TRL,
    TTD,
    TWD,
    TZS,
    UGS,
    USD,
    UYP,
    VEB,
    VND,
    VUV,
    WST,
    YDD,
    YER,
    YUD,
    ZAR,
    ZMK,
    ZRZ,
    ZWD;

    public String value() {
        return name();
    }

    public static DtCURRENCIES fromValue(String v) {
        return valueOf(v);
    }

}
