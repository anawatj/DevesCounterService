/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counterserviceclient;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.w3c.dom.Document;

/**
 *
 * @author anawat.j
 */
public class CounterServiceClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            try {

                RequestData data = new RequestData();
                Date sysDateTime = new Date();
                DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

                List<RequestContract> requests = new ArrayList<RequestContract>();

                RequestContract request = new RequestContract();
                request.setTaxID("9975116");
                request.setLogID("14287959");
                request.setVendorID("0107537002478");
                request.setServiceID("99");
                request.setMethod("DataExchange");
                request.setCounterNo("90009");
                request.setTermNo("1");
                request.setPostaxID("");
                request.setServiceRunNo("0");
                request.setAmountReceived(Double.parseDouble("500.0"));
                request.setVatAmount(Double.valueOf("0.0"));
                request.setRecordStatus("A");
                request.setReference1("310619910550010568");
                request.setReference2("030516");
                request.setReference3("");
                request.setReference4("");
                request.setBillType("");
                
            //    request.setRserviceRunNo("0");

                //sysDateTime = df.parse("");
             //  request.setSystemDateTime(new Date());
                requests.add(request);
                data.setRequests(requests);

                String xml = serializeXML(RequestData.class, data);

                System.out.println("HttpURLConnection request : " + xml);
                String line = "";
                String strResponse = "";

                //-------------------------------------------------//
                HttpClient httpClient = new DefaultHttpClient();
                HttpPost post = new HttpPost("http://192.168.3.65/CounterService/CounterServiceWS.svc/CreatePayIn2");
                post.setHeader("content-type", "application/xml; charset=UTF-8");
                post.setHeader("Accept", "application/xml");
                //createTextFileXml("D:\\inputJavaXml.xml", xml);
                StringEntity entity = new StringEntity(xml, "UTF-8");
                post.setEntity(entity);
                HttpResponse resp = httpClient.execute(post);
                System.out.println("status : " + resp.getStatusLine().getStatusCode());
                HttpEntity resEntity = resp.getEntity();
                resp.getStatusLine().getStatusCode();
                BufferedReader reader = new BufferedReader(new InputStreamReader(resEntity.getContent()));
                while ((line = reader.readLine()) != null) {
                    strResponse += line;
                }
                reader.close();
                System.out.println("HttpURLConnection response : " + strResponse);

                ResponseContract resData = deserializeXML(ResponseContract.class, strResponse);
                System.out.println(resData.getSuccess());

            } catch (Exception ex) {
                ex.printStackTrace();

            } finally {
                //return "";
            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    public static void createTextFileXml(String fileName, String xml) throws Exception {
        ByteArrayInputStream is = new ByteArrayInputStream(xml.getBytes());
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.parse(is);
        // Document doc = docBuilder.newDocument();
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(fileName));

        // Output to console for testing
        // StreamResult result = new StreamResult(System.out);
        transformer.transform(source, result);

        System.out.println("File saved!");
    }

    public static <T> String serializeXML(Class<T> t_class, T root) throws Exception {
        try {
            T t = t_class.newInstance();
            ByteArrayOutputStream out = new ByteArrayOutputStream();

            JAXBContext context = JAXBContext.newInstance(t.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); // pretty
            marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8"); // specify encoding
            // output xml to outputstream.
            marshaller.marshal(root, out);
            String xml = new String(out.toByteArray());
            return xml;
        } catch (JAXBException e) {
            throw e;
        }
    }

    public static <T> T deserializeXML(Class<T> c_type, String data) throws Exception {
        T t_type = c_type.newInstance();

        JAXBContext jc = JAXBContext.newInstance(t_type.getClass());

        Unmarshaller unmarshaller = jc.createUnmarshaller();
        InputStream is = new ByteArrayInputStream(data.getBytes());
        T t = (T) unmarshaller.unmarshal(is);

        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(t, System.out);
        return t;
    }

}
