/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package counterserviceclient;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchema;

/**
 *
 * @author anawat.j
 */
@XmlRootElement(name = "REQUEST_DATA")
public class RequestData {
    public RequestData()
    {
        
    }
   
   private List<RequestContract> requests;

    /**
     * @return the requests
     */
    public List<RequestContract> getRequests() {
        return requests;
    }

    /**
     * @param requests the requests to set
     */
    @javax.xml.bind.annotation.XmlElementWrapper(name = "REQUESTS")
    @XmlElement(name = "REQUEST")
    public void setRequests(List<RequestContract> requests) {
        this.requests = requests;
    }
   
   
}
