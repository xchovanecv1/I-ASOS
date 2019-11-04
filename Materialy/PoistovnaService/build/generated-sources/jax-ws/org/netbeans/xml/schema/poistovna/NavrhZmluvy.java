
package org.netbeans.xml.schema.poistovna;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for NavrhZmluvy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NavrhZmluvy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="druh" type="{http://xml.netbeans.org/schema/poistovna}DruhPoistenia"/&gt;
 *         &lt;element name="poistna-suma" type="{http://xml.netbeans.org/schema/poistovna}poistna-sumaFormat" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}ID"/&gt;
 *         &lt;element name="poistena-osoba" type="{http://www.w3.org/2001/XMLSchema}IDREFS"/&gt;
 *         &lt;element name="ucastnik-zmluvy" type="{http://xml.netbeans.org/schema/poistovna}Osoba" maxOccurs="unbounded"/&gt;
 *         &lt;element name="poistnik" type="{http://www.w3.org/2001/XMLSchema}IDREFS"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavrhZmluvy", propOrder = {
    "druh",
    "poistnaSuma",
    "id",
    "poistenaOsoba",
    "ucastnikZmluvy",
    "poistnik"
})
@XmlSeeAlso({
    PoistnaZmluva.class
})
public class NavrhZmluvy {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DruhPoistenia druh;
    @XmlElementRef(name = "poistna-suma", namespace = "http://xml.netbeans.org/schema/poistovna", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> poistnaSuma;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlList
    @XmlElement(name = "poistena-osoba", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> poistenaOsoba;
    @XmlElement(name = "ucastnik-zmluvy", required = true)
    protected List<Osoba> ucastnikZmluvy;
    @XmlList
    @XmlElement(required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> poistnik;

    /**
     * Gets the value of the druh property.
     * 
     * @return
     *     possible object is
     *     {@link DruhPoistenia }
     *     
     */
    public DruhPoistenia getDruh() {
        return druh;
    }

    /**
     * Sets the value of the druh property.
     * 
     * @param value
     *     allowed object is
     *     {@link DruhPoistenia }
     *     
     */
    public void setDruh(DruhPoistenia value) {
        this.druh = value;
    }

    /**
     * Gets the value of the poistnaSuma property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPoistnaSuma() {
        return poistnaSuma;
    }

    /**
     * Sets the value of the poistnaSuma property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPoistnaSuma(JAXBElement<BigDecimal> value) {
        this.poistnaSuma = value;
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

    /**
     * Gets the value of the poistenaOsoba property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the poistenaOsoba property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoistenaOsoba().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getPoistenaOsoba() {
        if (poistenaOsoba == null) {
            poistenaOsoba = new ArrayList<Object>();
        }
        return this.poistenaOsoba;
    }

    /**
     * Gets the value of the ucastnikZmluvy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ucastnikZmluvy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUcastnikZmluvy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Osoba }
     * 
     * 
     */
    public List<Osoba> getUcastnikZmluvy() {
        if (ucastnikZmluvy == null) {
            ucastnikZmluvy = new ArrayList<Osoba>();
        }
        return this.ucastnikZmluvy;
    }

    /**
     * Gets the value of the poistnik property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the poistnik property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoistnik().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getPoistnik() {
        if (poistnik == null) {
            poistnik = new ArrayList<Object>();
        }
        return this.poistnik;
    }

}
