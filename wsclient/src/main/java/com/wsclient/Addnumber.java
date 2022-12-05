
package com.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para addnumber complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="addnumber"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="value1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="value2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addnumber", propOrder = {
    "value1",
    "value2"
})
public class Addnumber {

    protected int value1;
    protected int value2;

    /**
     * Obtiene el valor de la propiedad value1.
     * 
     */
    public int getValue1() {
        return value1;
    }

    /**
     * Define el valor de la propiedad value1.
     * 
     */
    public void setValue1(int value) {
        this.value1 = value;
    }

    /**
     * Obtiene el valor de la propiedad value2.
     * 
     */
    public int getValue2() {
        return value2;
    }

    /**
     * Define el valor de la propiedad value2.
     * 
     */
    public void setValue2(int value) {
        this.value2 = value;
    }

}
