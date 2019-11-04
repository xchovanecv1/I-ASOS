
package org.netbeans.xml.schema.poistovna;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Adresa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Adresa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ulica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="obec" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Adresa", propOrder = {
    "ulica",
    "obec"
})
public class Adresa {

    @XmlElement(required = true)
    protected String ulica;
    @XmlElement(required = true)
    protected String obec;

    /**
     * Gets the value of the ulica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUlica() {
        return ulica;
    }

    /**
     * Sets the value of the ulica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUlica(String value) {
        this.ulica = value;
    }

    /**
     * Gets the value of the obec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObec() {
        return obec;
    }

    /**
     * Sets the value of the obec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObec(String value) {
        this.obec = value;
    }

}
