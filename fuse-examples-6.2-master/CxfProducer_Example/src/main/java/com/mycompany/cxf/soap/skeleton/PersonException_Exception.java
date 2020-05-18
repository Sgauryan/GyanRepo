
package com.mycompany.cxf.soap.skeleton;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.5.0
 * 2015-08-15T22:44:36.975+05:30
 * Generated source version: 2.5.0
 */

@WebFault(name = "PersonException", targetNamespace = "http://model.soap.cxf.mycompany.com/")
public class PersonException_Exception extends Exception {
    
    private com.mycompany.cxf.soap.skeleton.PersonException personException;

    public PersonException_Exception() {
        super();
    }
    
    public PersonException_Exception(String message) {
        super(message);
    }
    
    public PersonException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public PersonException_Exception(String message, com.mycompany.cxf.soap.skeleton.PersonException personException) {
        super(message);
        this.personException = personException;
    }

    public PersonException_Exception(String message, com.mycompany.cxf.soap.skeleton.PersonException personException, Throwable cause) {
        super(message, cause);
        this.personException = personException;
    }

    public com.mycompany.cxf.soap.skeleton.PersonException getFaultInfo() {
        return this.personException;
    }
}
