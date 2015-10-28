package com.emdeon.ITSWebService;

public class ITSWSSoapProxy implements com.emdeon.ITSWebService.ITSWSSoap {
  private String _endpoint = null;
  private com.emdeon.ITSWebService.ITSWSSoap iTSWSSoap = null;
  
  public ITSWSSoapProxy() {
    _initITSWSSoapProxy();
  }
  
  public ITSWSSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initITSWSSoapProxy();
  }
  
  private void _initITSWSSoapProxy() {
    try {
      iTSWSSoap = (new com.emdeon.ITSWebService.ITSWSLocator()).getITSWSSoap();
      if (iTSWSSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iTSWSSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iTSWSSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iTSWSSoap != null)
      ((javax.xml.rpc.Stub)iTSWSSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.emdeon.ITSWebService.ITSWSSoap getITSWSSoap() {
    if (iTSWSSoap == null)
      _initITSWSSoapProxy();
    return iTSWSSoap;
  }
  
  public com.emdeon.ITSWebService.ITSReturn authenticate(java.lang.String sUserID, java.lang.String sPassword) throws java.rmi.RemoteException{
    if (iTSWSSoap == null)
      _initITSWSSoapProxy();
    return iTSWSSoap.authenticate(sUserID, sPassword);
  }
  
  public com.emdeon.ITSWebService.ITSReturn changePassword(java.lang.String sUserID, java.lang.String sPassword, java.lang.String sNewPassword) throws java.rmi.RemoteException{
    if (iTSWSSoap == null)
      _initITSWSSoapProxy();
    return iTSWSSoap.changePassword(sUserID, sPassword, sNewPassword);
  }
  
  public com.emdeon.ITSWebService.ITSReturn sendRequest(java.lang.String sUserID, java.lang.String sPassword, java.lang.String sMessageType, java.lang.String sEncodedRequest) throws java.rmi.RemoteException{
    if (iTSWSSoap == null)
      _initITSWSSoapProxy();
    return iTSWSSoap.sendRequest(sUserID, sPassword, sMessageType, sEncodedRequest);
  }
  
  public com.emdeon.ITSWebService.ITSReturnA sendRequestA(java.lang.String sUserID, java.lang.String sPassword, java.lang.String sMessageType, java.lang.String sEncodedRequest) throws java.rmi.RemoteException{
    if (iTSWSSoap == null)
      _initITSWSSoapProxy();
    return iTSWSSoap.sendRequestA(sUserID, sPassword, sMessageType, sEncodedRequest);
  }
  
  public com.emdeon.ITSWebService.ITSReturn putFileExt(java.lang.String sUserID, java.lang.String sPassword, java.lang.String sMessageType, java.lang.String sFileName, java.lang.String sEncodedPutFile) throws java.rmi.RemoteException{
    if (iTSWSSoap == null)
      _initITSWSSoapProxy();
    return iTSWSSoap.putFileExt(sUserID, sPassword, sMessageType, sFileName, sEncodedPutFile);
  }
  
  public com.emdeon.ITSWebService.ITSReturn putFile(java.lang.String sUserID, java.lang.String sPassword, java.lang.String sMessageType, java.lang.String sEncodedPutFile) throws java.rmi.RemoteException{
    if (iTSWSSoap == null)
      _initITSWSSoapProxy();
    return iTSWSSoap.putFile(sUserID, sPassword, sMessageType, sEncodedPutFile);
  }
  
  public com.emdeon.ITSWebService.ITSReturn getFile(java.lang.String sUserID, java.lang.String sPassword, java.lang.String sMessageType) throws java.rmi.RemoteException{
    if (iTSWSSoap == null)
      _initITSWSSoapProxy();
    return iTSWSSoap.getFile(sUserID, sPassword, sMessageType);
  }
  
  public java.lang.String isAlive(java.lang.String s) throws java.rmi.RemoteException{
    if (iTSWSSoap == null)
      _initITSWSSoapProxy();
    return iTSWSSoap.isAlive(s);
  }
  
  
}