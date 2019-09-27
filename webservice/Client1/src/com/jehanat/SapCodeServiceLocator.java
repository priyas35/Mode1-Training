/**
 * SapCodeServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jehanat;

public class SapCodeServiceLocator extends org.apache.axis.client.Service implements com.jehanat.SapCodeService {

    public SapCodeServiceLocator() {
    }


    public SapCodeServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SapCodeServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SapCode
    private java.lang.String SapCode_address = "http://192.168.1.37:8091/SOAPWebServiceDemo3/services/SapCode";

    public java.lang.String getSapCodeAddress() {
        return SapCode_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SapCodeWSDDServiceName = "SapCode";

    public java.lang.String getSapCodeWSDDServiceName() {
        return SapCodeWSDDServiceName;
    }

    public void setSapCodeWSDDServiceName(java.lang.String name) {
        SapCodeWSDDServiceName = name;
    }

    public com.jehanat.SapCode getSapCode() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SapCode_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSapCode(endpoint);
    }

    public com.jehanat.SapCode getSapCode(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.jehanat.SapCodeSoapBindingStub _stub = new com.jehanat.SapCodeSoapBindingStub(portAddress, this);
            _stub.setPortName(getSapCodeWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSapCodeEndpointAddress(java.lang.String address) {
        SapCode_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.jehanat.SapCode.class.isAssignableFrom(serviceEndpointInterface)) {
                com.jehanat.SapCodeSoapBindingStub _stub = new com.jehanat.SapCodeSoapBindingStub(new java.net.URL(SapCode_address), this);
                _stub.setPortName(getSapCodeWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SapCode".equals(inputPortName)) {
            return getSapCode();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://jehanat.com", "SapCodeService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://jehanat.com", "SapCode"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SapCode".equals(portName)) {
            setSapCodeEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
