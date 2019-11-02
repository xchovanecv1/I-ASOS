
package org.netbeans.xml.schema.poistovna;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Osoba complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Osoba"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="meno" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rodne-cislo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bydlisko" type="{http://xml.netbeans.org/schema/poistovna}Adresa"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}ID"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Osoba", propOrder = {
    "meno",
    "rodneCislo",
    "bydlisko",
    "id"
})
public class Osoba {

    @XmlElement(required = true)
    protected String meno;
    @XmlElement(name = "rodne-cislo", required = true)
    protected String rodneCislo;
    @XmlElement(required = true)
    protected Adresa bydlisko;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the meno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeno() {
        return meno;
    }

    /**
     * Sets the value of the meno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeno(String value) {
        this.meno = value;
    }

    /**
     * Gets the value of the rodneCislo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRodneCislo() {
        return rodneCislo;
    }

    /**
     * Sets the value of the rodneCislo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRodneCislo(String value) {
        this.rodneCislo = value;
    }

    /**
     * Gets the value of the bydlisko property.
     * 
     * @return
     *     possible object is
     *     {@link Adresa }
     *     
     */
    public Adresa getBydlisko() {
        return bydlisko;
    }

    /**
     * Sets the value of the bydlisko property.
     * 
     * @param value
     *     allowed object is
     *     {@link Adresa }
     *     
     */
    public void setBydlisko(Adresa value) {
        this.bydlisko = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
