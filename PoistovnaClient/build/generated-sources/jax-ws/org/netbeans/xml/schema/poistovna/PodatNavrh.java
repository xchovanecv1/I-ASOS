
package org.netbeans.xml.schema.poistovna;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="navrh" type="{http://xml.netbeans.org/schema/poistovna}NavrhZmluvy"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "navrh"
})
@XmlRootElement(name = "podatNavrh")
public class PodatNavrh {

    @XmlElement(required = true)
    protected NavrhZmluvy navrh;

    /**
     * Gets the value of the navrh property.
     * 
     * @return
     *     possible object is
     *     {@link NavrhZmluvy }
     *     
     */
    public NavrhZmluvy getNavrh() {
        return navrh;
    }

    /**
     * Sets the value of the navrh property.
     * 
     * @param value
     *     allowed object is
     *     {@link NavrhZmluvy }
     *     
     */
    public void setNavrh(NavrhZmluvy value) {
        this.navrh = value;
    }

}
