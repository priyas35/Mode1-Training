package com.priya;

public class PriyaProxy implements com.priya.Priya {
  private String _endpoint = null;
  private com.priya.Priya priya = null;
  
  public PriyaProxy() {
    _initPriyaProxy();
  }
  
  public PriyaProxy(String endpoint) {
    _endpoint = endpoint;
    _initPriyaProxy();
  }
  
  private void _initPriyaProxy() {
    try {
      priya = (new com.priya.PriyaServiceLocator()).getPriya();
      if (priya != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)priya)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)priya)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (priya != null)
      ((javax.xml.rpc.Stub)priya)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.priya.Priya getPriya() {
    if (priya == null)
      _initPriyaProxy();
    return priya;
  }
  
  public java.lang.String getName() throws java.rmi.RemoteException{
    if (priya == null)
      _initPriyaProxy();
    return priya.getName();
  }
  
  
}