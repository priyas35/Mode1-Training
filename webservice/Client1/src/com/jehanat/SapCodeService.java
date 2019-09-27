/**
 * SapCodeService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jehanat;

public interface SapCodeService extends javax.xml.rpc.Service {
    public java.lang.String getSapCodeAddress();

    public com.jehanat.SapCode getSapCode() throws javax.xml.rpc.ServiceException;

    public com.jehanat.SapCode getSapCode(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
