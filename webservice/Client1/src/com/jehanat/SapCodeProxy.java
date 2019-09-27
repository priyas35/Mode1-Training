package com.jehanat;

public class SapCodeProxy implements com.jehanat.SapCode {
  private String _endpoint = null;
  private com.jehanat.SapCode sapCode = null;
  
  public SapCodeProxy() {
    _initSapCodeProxy();
  }
  
  public SapCodeProxy(String endpoint) {
    _endpoint = endpoint;
    _initSapCodeProxy();
  }
  
  private void _initSapCodeProxy() {
    try {
      sapCode = (new com.jehanat.SapCodeServiceLocator()).getSapCode();
      if (sapCode != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sapCode)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sapCode)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sapCode != null)
      ((javax.xml.rpc.Stub)sapCode)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.jehanat.SapCode getSapCode() {
    if (sapCode == null)
      _initSapCodeProxy();
    return sapCode;
  }
  
  public int getInt() throws java.rmi.RemoteException{
    if (sapCode == null)
      _initSapCodeProxy();
    return sapCode.getInt();
  }
  
  
}