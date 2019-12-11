/**
 * EMICalculatorServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.webserviseclasses;

public class EMICalculatorServiceLocator extends org.apache.axis.client.Service implements com.webserviseclasses.EMICalculatorService {

    public EMICalculatorServiceLocator() {
    }


    public EMICalculatorServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EMICalculatorServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EMICalculator
    private java.lang.String EMICalculator_address = "http://localhost:7070/FindCategory/services/EMICalculator";

    public java.lang.String getEMICalculatorAddress() {
        return EMICalculator_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EMICalculatorWSDDServiceName = "EMICalculator";

    public java.lang.String getEMICalculatorWSDDServiceName() {
        return EMICalculatorWSDDServiceName;
    }

    public void setEMICalculatorWSDDServiceName(java.lang.String name) {
        EMICalculatorWSDDServiceName = name;
    }

    public com.webserviseclasses.EMICalculator getEMICalculator() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EMICalculator_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEMICalculator(endpoint);
    }

    public com.webserviseclasses.EMICalculator getEMICalculator(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.webserviseclasses.EMICalculatorSoapBindingStub _stub = new com.webserviseclasses.EMICalculatorSoapBindingStub(portAddress, this);
            _stub.setPortName(getEMICalculatorWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEMICalculatorEndpointAddress(java.lang.String address) {
        EMICalculator_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.webserviseclasses.EMICalculator.class.isAssignableFrom(serviceEndpointInterface)) {
                com.webserviseclasses.EMICalculatorSoapBindingStub _stub = new com.webserviseclasses.EMICalculatorSoapBindingStub(new java.net.URL(EMICalculator_address), this);
                _stub.setPortName(getEMICalculatorWSDDServiceName());
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
        if ("EMICalculator".equals(inputPortName)) {
            return getEMICalculator();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webserviseclasses.com", "EMICalculatorService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webserviseclasses.com", "EMICalculator"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EMICalculator".equals(portName)) {
            setEMICalculatorEndpointAddress(address);
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
