package com.webserviseclasses;

public class EMICalculatorProxy implements com.webserviseclasses.EMICalculator {
  private String _endpoint = null;
  private com.webserviseclasses.EMICalculator eMICalculator = null;
  
  public EMICalculatorProxy() {
    _initEMICalculatorProxy();
  }
  
  public EMICalculatorProxy(String endpoint) {
    _endpoint = endpoint;
    _initEMICalculatorProxy();
  }
  
  private void _initEMICalculatorProxy() {
    try {
      eMICalculator = (new com.webserviseclasses.EMICalculatorServiceLocator()).getEMICalculator();
      if (eMICalculator != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)eMICalculator)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)eMICalculator)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (eMICalculator != null)
      ((javax.xml.rpc.Stub)eMICalculator)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.webserviseclasses.EMICalculator getEMICalculator() {
    if (eMICalculator == null)
      _initEMICalculatorProxy();
    return eMICalculator;
  }
  
  public java.lang.String getEMI(float principle, float noOfMonths) throws java.rmi.RemoteException{
    if (eMICalculator == null)
      _initEMICalculatorProxy();
    return eMICalculator.getEMI(principle, noOfMonths);
  }
  
  
}