
package org.netbeans.xml.schema.poistovna;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DruhPoistenia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DruhPoistenia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="cestovne"/>
 *     &lt;enumeration value="zivotne"/>
 *     &lt;enumeration value="urazove"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DruhPoistenia")
@XmlEnum
public enum DruhPoistenia {

    @XmlEnumValue("cestovne")
    CESTOVNE("cestovne"),
    @XmlEnumValue("zivotne")
    ZIVOTNE("zivotne"),
    @XmlEnumValue("urazove")
    URAZOVE("urazove");
    private final String value;

    DruhPoistenia(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DruhPoistenia fromValue(String v) {
        for (DruhPoistenia c: DruhPoistenia.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
