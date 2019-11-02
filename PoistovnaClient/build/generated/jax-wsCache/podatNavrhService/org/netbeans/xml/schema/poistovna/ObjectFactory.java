
package org.netbeans.xml.schema.poistovna;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.netbeans.xml.schema.poistovna package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NavrhZmluvyPoistnaSuma_QNAME = new QName("http://xml.netbeans.org/schema/poistovna", "poistna-suma");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.netbeans.xml.schema.poistovna
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PodatNavrh }
     * 
     */
    public PodatNavrh createPodatNavrh() {
        return new PodatNavrh();
    }

    /**
     * Create an instance of {@link NavrhZmluvy }
     * 
     */
    public NavrhZmluvy createNavrhZmluvy() {
        return new NavrhZmluvy();
    }

    /**
     * Create an instance of {@link PodatNavrhRes }
     * 
     */
    public PodatNavrhRes createPodatNavrhRes() {
        return new PodatNavrhRes();
    }

    /**
     * Create an instance of {@link PoistnaZmluva }
     * 
     */
    public PoistnaZmluva createPoistnaZmluva() {
        return new PoistnaZmluva();
    }

    /**
     * Create an instance of {@link Osoba }
     * 
     */
    public Osoba createOsoba() {
        return new Osoba();
    }

    /**
     * Create an instance of {@link Adresa }
     * 
     */
    public Adresa createAdresa() {
        return new Adresa();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/poistovna", name = "poistna-suma", scope = NavrhZmluvy.class)
    public JAXBElement<BigDecimal> createNavrhZmluvyPoistnaSuma(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_NavrhZmluvyPoistnaSuma_QNAME, BigDecimal.class, NavrhZmluvy.class, value);
    }

}
