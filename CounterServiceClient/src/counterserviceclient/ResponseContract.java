/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package counterserviceclient;

import javax.xml.bind.annotation.*;

/**
 *
 * @author anawat.j
 */
@XmlRootElement(name = "RESPONSE")
@XmlAccessorType(XmlAccessType.FIELD)
public class ResponseContract {
    public ResponseContract()
    {
        
    }
    @XmlElement(name = "TX_ID")
    private String txID;
    @XmlElement(name = "LOG_ID")
    private String logID;
    
    @XmlElement(name = "VENDOR_ID")
    private String vendorID;
    
    
    @XmlElement(name = "SERVICE_ID")
    private String serviceID;
    
    @XmlElement(name = "METHOD")
    private String method;
    
    @XmlElement(name = "SUCCESS")
    private String success;
    
    @XmlElement(name = "CODE")
    private String code;
    
    @XmlElement(name = "DESC")
    private String desc;
    
    @XmlElement(name = "REFERENCE_1")
    private String reference1;
    
    @XmlElement(name = "REFERENCE_2")
    private String reference2;
    
    @XmlElement(name = "REFERENCE_3")
    private String reference3;
    
    @XmlElement(name = "REFERENCE_4")
    private String reference4;
    
    @XmlElement(name = "CUSTOMER_NAME")
    private String customerName;
    
    @XmlElement(name = "CUSTOMER_ADDR_1")
    private String customerAddr1;
    
    @XmlElement(name = "CUSTOMER_ADDR_2")
    private String customerAddr2;
    
    @XmlElement(name = "CUSTOMER_ADDR_3")
    private String customerAddr3;
    
    @XmlElement(name = "CUSTOMER_TEL_NO")
    private String customerTelNo;
    
    @XmlElement(name = "RETURN1")
    private String return1;
    
    @XmlElement(name = "RETURN2")
    private String return2;
    
    @XmlElement(name = "RETURN3")
    private String return3;
    
    @XmlElement(name = "AMOUNT_RECEIVED")
    private String amountReceived;

    /**
     * @return the txID
     */
    public String getTxID() {
        return txID;
    }

    /**
     * @param txID the txID to set
     */
    public void setTxID(String txID) {
        this.txID = txID;
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
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * @return the success
     */
    public String getSuccess() {
        return success;
    }

    /**
     * @param success the success to set
     */
    public void setSuccess(String success) {
        this.success = success;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
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
    public void setCustomerTelNo(String customerTelNo) {
        this.customerTelNo = customerTelNo;
    }

    /**
     * @return the return1
     */
    public String getReturn1() {
        return return1;
    }

    /**
     * @param return1 the return1 to set
     */
    public void setReturn1(String return1) {
        this.return1 = return1;
    }

    /**
     * @return the return2
     */
    public String getReturn2() {
        return return2;
    }

    /**
     * @param return2 the return2 to set
     */
    public void setReturn2(String return2) {
        this.return2 = return2;
    }

    /**
     * @return the return3
     */
    public String getReturn3() {
        return return3;
    }

    /**
     * @param return3 the return3 to set
     */
    public void setReturn3(String return3) {
        this.return3 = return3;
    }

    /**
     * @return the amountReceived
     */
    public String getAmountReceived() {
        return amountReceived;
    }

    /**
     * @param amountReceived the amountReceived to set
     */
    public void setAmountReceived(String amountReceived) {
        this.amountReceived = amountReceived;
    }
    
}
