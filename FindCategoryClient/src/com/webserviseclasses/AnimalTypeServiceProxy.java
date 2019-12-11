package com.webserviseclasses;

public class AnimalTypeServiceProxy implements com.webserviseclasses.AnimalTypeService {
  private String _endpoint = null;
  private com.webserviseclasses.AnimalTypeService animalTypeService = null;
  
  public AnimalTypeServiceProxy() {
    _initAnimalTypeServiceProxy();
  }
  
  public AnimalTypeServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initAnimalTypeServiceProxy();
  }
  
  private void _initAnimalTypeServiceProxy() {
    try {
      animalTypeService = (new com.webserviseclasses.AnimalTypeServiceServiceLocator()).getAnimalTypeService();
      if (animalTypeService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)animalTypeService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)animalTypeService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (animalTypeService != null)
      ((javax.xml.rpc.Stub)animalTypeService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.webserviseclasses.AnimalTypeService getAnimalTypeService() {
    if (animalTypeService == null)
      _initAnimalTypeServiceProxy();
    return animalTypeService;
  }
  
  public java.lang.String getAnimalType(java.lang.String animal) throws java.rmi.RemoteException{
    if (animalTypeService == null)
      _initAnimalTypeServiceProxy();
    return animalTypeService.getAnimalType(animal);
  }
  
  
}