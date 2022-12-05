
package com.wsclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.wsclient package. 
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

    private final static QName _Add_QNAME = new QName("http://pkg/", "add");
    private final static QName _AddResponse_QNAME = new QName("http://pkg/", "addResponse");
    private final static QName _Addnumber_QNAME = new QName("http://pkg/", "addnumber");
    private final static QName _AddnumberResponse_QNAME = new QName("http://pkg/", "addnumberResponse");
    private final static QName _Dividenumber_QNAME = new QName("http://pkg/", "dividenumber");
    private final static QName _DividenumberResponse_QNAME = new QName("http://pkg/", "dividenumberResponse");
    private final static QName _Multiplynumber_QNAME = new QName("http://pkg/", "multiplynumber");
    private final static QName _MultiplynumberResponse_QNAME = new QName("http://pkg/", "multiplynumberResponse");
    private final static QName _Restnumber_QNAME = new QName("http://pkg/", "restnumber");
    private final static QName _RestnumberResponse_QNAME = new QName("http://pkg/", "restnumberResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.wsclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link Addnumber }
     * 
     */
    public Addnumber createAddnumber() {
        return new Addnumber();
    }

    /**
     * Create an instance of {@link AddnumberResponse }
     * 
     */
    public AddnumberResponse createAddnumberResponse() {
        return new AddnumberResponse();
    }

    /**
     * Create an instance of {@link Dividenumber }
     * 
     */
    public Dividenumber createDividenumber() {
        return new Dividenumber();
    }

    /**
     * Create an instance of {@link DividenumberResponse }
     * 
     */
    public DividenumberResponse createDividenumberResponse() {
        return new DividenumberResponse();
    }

    /**
     * Create an instance of {@link Multiplynumber }
     * 
     */
    public Multiplynumber createMultiplynumber() {
        return new Multiplynumber();
    }

    /**
     * Create an instance of {@link MultiplynumberResponse }
     * 
     */
    public MultiplynumberResponse createMultiplynumberResponse() {
        return new MultiplynumberResponse();
    }

    /**
     * Create an instance of {@link Restnumber }
     * 
     */
    public Restnumber createRestnumber() {
        return new Restnumber();
    }

    /**
     * Create an instance of {@link RestnumberResponse }
     * 
     */
    public RestnumberResponse createRestnumberResponse() {
        return new RestnumberResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Add }{@code >}
     */
    @XmlElementDecl(namespace = "http://pkg/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://pkg/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Addnumber }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Addnumber }{@code >}
     */
    @XmlElementDecl(namespace = "http://pkg/", name = "addnumber")
    public JAXBElement<Addnumber> createAddnumber(Addnumber value) {
        return new JAXBElement<Addnumber>(_Addnumber_QNAME, Addnumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddnumberResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddnumberResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://pkg/", name = "addnumberResponse")
    public JAXBElement<AddnumberResponse> createAddnumberResponse(AddnumberResponse value) {
        return new JAXBElement<AddnumberResponse>(_AddnumberResponse_QNAME, AddnumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Dividenumber }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Dividenumber }{@code >}
     */
    @XmlElementDecl(namespace = "http://pkg/", name = "dividenumber")
    public JAXBElement<Dividenumber> createDividenumber(Dividenumber value) {
        return new JAXBElement<Dividenumber>(_Dividenumber_QNAME, Dividenumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DividenumberResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DividenumberResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://pkg/", name = "dividenumberResponse")
    public JAXBElement<DividenumberResponse> createDividenumberResponse(DividenumberResponse value) {
        return new JAXBElement<DividenumberResponse>(_DividenumberResponse_QNAME, DividenumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiplynumber }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Multiplynumber }{@code >}
     */
    @XmlElementDecl(namespace = "http://pkg/", name = "multiplynumber")
    public JAXBElement<Multiplynumber> createMultiplynumber(Multiplynumber value) {
        return new JAXBElement<Multiplynumber>(_Multiplynumber_QNAME, Multiplynumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplynumberResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MultiplynumberResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://pkg/", name = "multiplynumberResponse")
    public JAXBElement<MultiplynumberResponse> createMultiplynumberResponse(MultiplynumberResponse value) {
        return new JAXBElement<MultiplynumberResponse>(_MultiplynumberResponse_QNAME, MultiplynumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Restnumber }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Restnumber }{@code >}
     */
    @XmlElementDecl(namespace = "http://pkg/", name = "restnumber")
    public JAXBElement<Restnumber> createRestnumber(Restnumber value) {
        return new JAXBElement<Restnumber>(_Restnumber_QNAME, Restnumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestnumberResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RestnumberResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://pkg/", name = "restnumberResponse")
    public JAXBElement<RestnumberResponse> createRestnumberResponse(RestnumberResponse value) {
        return new JAXBElement<RestnumberResponse>(_RestnumberResponse_QNAME, RestnumberResponse.class, null, value);
    }

}
