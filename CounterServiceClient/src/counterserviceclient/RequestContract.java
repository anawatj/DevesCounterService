/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package counterserviceclient;

import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author anawat.j
 */

public class RequestContract {
    public RequestContract()
    {
        
    }
    
    private String taxID;

    private String logID;
    
    private String vendorID;
    
    private String serviceID;
 
    private String method;
   
    private String counterNo;
   
    private String termNo;
   
    private String postaxID;
   
    private String serviceRunNo;
   
    private String recordStatus;
    
    private String clientServiceRunNo;
   
    private Double amountReceived;
  
    private Double vatAmount;
    
    private String billType;
    
    private String reference1;
   
    private String reference2;
   
    private String reference3;
   
    private String reference4;
 
    private String customerName;
    
    private String customerAddr1;
   
    private String customerAddr2;
   
    private String customerAddr3;
    
    private String customerTelNo;
   
    private String zone;
    
    private String rserviceRunNo;
    
    private String cancelOperating;
    
    private String operateByStaff;
  
    private Date systemDateTime;

    private String userID;
  
    private String password;

    /**
     * @return the taxID
     */
    public String getTaxID() {
        return taxID;
    }

    /**
     * @param taxID the taxID to set
     */
    @XmlElement(name = "TX_ID")
    public void setTaxID(String taxID) {
        this.taxID = taxID;
    }

    /**
     * @return the logID
     */
    public String getLogID() {
        return logID;
    }

    /**
     * @param logID the logID to set
     */
        @XmlElement(name="LOG_ID")
    public void setLogID(String logID) {
        this.logID = logID;
    }

    /**
     * @return the vendorID
     */
    public String getVendorID() {
        return vendorID;
    }

    /**
     * @param vendorID the vendorID to set
     */
    @XmlElement(name = "VENDOR_ID")
    public void setVendorID(String vendorID) {
        this.vendorID = vendorID;
    }

    /**
     * @return the serviceID
     */
    public String getServiceID() {
        return serviceID;
    }

    /**
     * @param serviceID the serviceID to set
     */
    @XmlElement(name = "SERVICE_ID")
    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    /**
     * @return the method
     */
    public String getMethod() {
        return method;
    }

    /**
     * @param method the method to set
     */
       @XmlElement(name = "METHOD")
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * @return the counterNo
     */
    public String getCounterNo() {
        return counterNo;
    }

    /**
     * @param counterNo the counterNo to set
     */
     @XmlElement(name = "COUNTER_NO")
    public void setCounterNo(String counterNo) {
        this.counterNo = counterNo;
    }

    /**
     * @return the termNo
     */
    public String getTermNo() {
        return termNo;
    }

    /**
     * @param termNo the termNo to set
     */
     @XmlElement(name ="TERM_NO")
    public void setTermNo(String termNo) {
        this.termNo = termNo;
    }

    /**
     * @return the postaxID
     */
    public String getPostaxID() {
        return postaxID;
    }

    /**
     * @param postaxID the postaxID to set
     */
     @XmlElement(name = "POS_TAX_ID")
    public void setPostaxID(String postaxID) {
        this.postaxID = postaxID;
    }

    /**
     * @return the serviceRunNo
     */
    public String getServiceRunNo() {
        return serviceRunNo;
    }

    /**
     * @param serviceRunNo the serviceRunNo to set
     */
     @XmlElement(name = "SERVICE_RUN_NO")
    public void setServiceRunNo(String serviceRunNo) {
        this.serviceRunNo = serviceRunNo;
    }

    /**
     * @return the recordStatus
     */
    public String getRecordStatus() {
        return recordStatus;
    }

    /**
     * @param recordStatus the recordStatus to set
     */
     @XmlElement(name = "RECORD_STATUS")
    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
    }

    /**
     * @return the clientServiceRunNo
     */
    public String getClientServiceRunNo() {
        return clientServiceRunNo;
    }

    /**
     * @param clientServiceRunNo the clientServiceRunNo to set
     */
    @XmlElement(name = "CLIENT_SERVICE_RUNNO")
    public void setClientServiceRunNo(String clientServiceRunNo) {
        this.clientServiceRunNo = clientServiceRunNo;
    }

    /**
     * @return the amountReceived
     */
    public Double getAmountReceived() {
        return amountReceived;
    }

    /**
     * @param amountReceived the amountReceived to set
     */
     @XmlElement(name = "AMOUNT_RECEIVED")
    public void setAmountReceived(Double amountReceived) {
        this.amountReceived = amountReceived;
    }

    /**
     * @return the vatAmount
     */
    public Double getVatAmount() {
        return vatAmount;
    }

    /**
     * @param vatAmount the vatAmount to set
     */
      @XmlElement(name = "VAT_AMOUNT")
    public void setVatAmount(Double vatAmount) {
        this.vatAmount = vatAmount;
    }

    /**
     * @return the billType
     */
    public String getBillType() {
        return billType;
    }

    /**
     * @param billType the billType to set
     */
    @XmlElement(name = "BILL_TYPE")
    public void setBillType(String billType) {
        this.billType = billType;
    }

    /**
     * @return the reference1
     */
    public String getReference1() {
        return reference1;
    }

    /**
     * @param reference1 the reference1 to set
     */
    @XmlElement(name = "REFERENCE_1")
    public void setReference1(String reference1) {
        this.reference1 = reference1;
    }

    /**
     * @return the reference2
     */
    public String getReference2() {
        return reference2;
    }

    /**
     * @param reference2 the reference2 to set
     */
     @XmlElement(name = "REFERENCE_2")
    public void setReference2(String reference2) {
        this.reference2 = reference2;
    }

    /**
     * @return the reference3
     */
    public String getReference3() {
        return reference3;
    }

    /**
     * @param reference3 the reference3 to set
     */
     @XmlElement(name = "REFERENCE_3")
    public void setReference3(String reference3) {
        this.reference3 = reference3;
    }

    /**
     * @return the reference4
     */
    public String getReference4() {
        return reference4;
    }

    /**
     * @param reference4 the reference4 to set
     */
     @XmlElement(name = "REFERENCE_4")
    public void setReference4(String reference4) {
        this.reference4 = reference4;
    }

    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
       @XmlElement(name = "CUSTOMER_NAME")
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the customerAddr1
     */
    public String getCustomerAddr1() {
        return customerAddr1;
    }

    /**
     * @param customerAddr1 the customerAddr1 to set
     */
    @XmlElement(name = "CUSTOMER_ADDR1")
    public void setCustomerAddr1(String customerAddr1) {
        this.customerAddr1 = customerAddr1;
    }

    /**
     * @return the customerAddr2
     */
    public String getCustomerAddr2() {
        return customerAddr2;
    }

    /**
     * @param customerAddr2 the customerAddr2 to set
     */
     @XmlElement(name = "CUSTOMER_ADDR2")
    public void setCustomerAddr2(String customerAddr2) {
        this.customerAddr2 = customerAddr2;
    }

    /**
     * @return the customerAddr3
     */
    public String getCustomerAddr3() {
        return customerAddr3;
    }

    /**
     * @param customerAddr3 the customerAddr3 to set
     */
     @XmlElement(name = "CUSTOMER_ADDR3")
    public void setCustomerAddr3(String customerAddr3) {
        this.customerAddr3 = customerAddr3;
    }

    /**
     * @return the customerTelNo
     */
    public String getCustomerTelNo() {
        return customerTelNo;
    }

    /**
     * @param customerTelNo the customerTelNo to set
     */
    @XmlElement(name = "CUSTOMER_TEL_NO")
    public void setCustomerTelNo(String customerTelNo) {
        this.customerTelNo = customerTelNo;
    }

    /**
     * @return the zone
     */
    public String getZone() {
        return zone;
    }

    /**
     * @param zone the zone to set
     */
     @XmlElement(name = "ZONE")
    public void setZone(String zone) {
        this.zone = zone;
    }

    /**
     * @return the rserviceRunNo
     */
    public String getRserviceRunNo() {
        return rserviceRunNo;
    }

    /**
     * @param rserviceRunNo the rserviceRunNo to set
     */
    @XmlElement(name = "R_SERVICE_RUNNO")
    public void setRserviceRunNo(String rserviceRunNo) {
        this.rserviceRunNo = rserviceRunNo;
    }

    /**
     * @return the cancelOperating
     */
    public String getCancelOperating() {
        return cancelOperating;
    }

    /**
     * @param cancelOperating the cancelOperating to set
     */
    @XmlElement(name = "CANCEL_OPERATING")
    public void setCancelOperating(String cancelOperating) {
        this.cancelOperating = cancelOperating;
    }

    /**
     * @return the operateByStaff
     */
    public String getOperateByStaff() {
        return operateByStaff;
    }

    /**
     * @param operateByStaff the operateByStaff to set
     */
    @XmlElement(name = "OPERATE_BY_STAFF")
    public void setOperateByStaff(String operateByStaff) {
        this.operateByStaff = operateByStaff;
    }

    /**
     * @return the systemDateTime
     */
    public Date getSystemDateTime() {
        return systemDateTime;
    }

    /**
     * @param systemDateTime the systemDateTime to set
     */
      @XmlElement(name = "SYSTEM_DATE_TIME")
    public void setSystemDateTime(Date systemDateTime) {
        this.systemDateTime = systemDateTime;
    }

    /**
     * @return the userID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
        @XmlElement(name = "USERID")
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
      @XmlElement(name = "PASSWORD")
    public void setPassword(String password) {
        this.password = password;
    }
}
