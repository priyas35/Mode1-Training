/**
 * PriyaServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.priya;

public class PriyaServiceLocator extends org.apache.axis.client.Service implements com.priya.PriyaService {

    public PriyaServiceLocator() {
    }


    public PriyaServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PriyaServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Priya
    private java.lang.String Priya_address = "http://192.168.1.127:8080/SOAPWS/services/Priya";

    public java.lang.String getPriyaAddress() {
        return Priya_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PriyaWSDDServiceName = "Priya";

    public java.lang.String getPriyaWSDDServiceName() {
        return PriyaWSDDServiceName;
    }

    public void setPriyaWSDDServiceName(java.lang.String name) {
        PriyaWSDDServiceName = name;
    }

    public com.priya.Priya getPriya() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Priya_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPriya(endpoint);
    }

    public com.priya.Priya getPriya(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.priya.PriyaSoapBindingStub _stub = new com.priya.PriyaSoapBindingStub(portAddress, this);
            _stub.setPortName(getPriyaWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPriyaEndpointAddress(java.lang.String address) {
        Priya_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.priya.Priya.class.isAssignableFrom(serviceEndpointInterface)) {
                com.priya.PriyaSoapBindingStub _stub = new com.priya.PriyaSoapBindingStub(new java.net.URL(Priya_address), this);
                _stub.setPortName(getPriyaWSDDServiceName());
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
        if ("Priya".equals(inputPortName)) {
            return getPriya();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://priya.com", "PriyaService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://priya.com", "Priya"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Priya".equals(portName)) {
            setPriyaEndpointAddress(address);
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
