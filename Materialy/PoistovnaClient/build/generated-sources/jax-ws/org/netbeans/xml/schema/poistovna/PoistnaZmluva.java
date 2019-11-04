
package org.netbeans.xml.schema.poistovna;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PoistnaZmluva complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PoistnaZmluva">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xml.netbeans.org/schema/poistovna}NavrhZmluvy">
 *       &lt;sequence>
 *         &lt;element name="datum-uzavretia" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="cislo-zmluvy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PoistnaZmluva", propOrder = {
    "datumUzavretia",
    "cisloZmluvy"
})
public class PoistnaZmluva
    extends NavrhZmluvy
{

    @XmlElement(name = "datum-uzavretia", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumUzavretia;
    @XmlElement(name = "cislo-zmluvy", required = true)
    protected String cisloZmluvy;

    /**
     * Gets the value of the datumUzavretia property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumUzavretia() {
        return datumUzavretia;
    }

    /**
     * Sets the value of the datumUzavretia property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumUzavretia(XMLGregorianCalendar value) {
        this.datumUzavretia = value;
    }

    /**
     * Gets the value of the cisloZmluvy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCisloZmluvy() {
        return cisloZmluvy;
    }

    /**
     * Sets the value of the cisloZmluvy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCisloZmluvy(String value) {
        this.cisloZmluvy = value;
    }

}
