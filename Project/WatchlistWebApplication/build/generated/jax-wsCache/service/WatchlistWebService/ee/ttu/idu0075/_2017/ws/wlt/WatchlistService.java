
package ee.ttu.idu0075._2017.ws.wlt;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WatchlistService", targetNamespace = "http://www.ttu.ee/idu0075/2017/ws/wlt", wsdlLocation = "file:/D:/Users/Lenovo/Desktop/VeebiProjekt/TestVersionToBeModified/WatchlistWebApplication/src/conf/xml-resources/web-services/WatchlistWebService/wsdl/WatchlistService.wsdl")
public class WatchlistService
    extends Service
{

    private final static URL WATCHLISTSERVICE_WSDL_LOCATION;
    private final static WebServiceException WATCHLISTSERVICE_EXCEPTION;
    private final static QName WATCHLISTSERVICE_QNAME = new QName("http://www.ttu.ee/idu0075/2017/ws/wlt", "WatchlistService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/Users/Lenovo/Desktop/VeebiProjekt/TestVersionToBeModified/WatchlistWebApplication/src/conf/xml-resources/web-services/WatchlistWebService/wsdl/WatchlistService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WATCHLISTSERVICE_WSDL_LOCATION = url;
        WATCHLISTSERVICE_EXCEPTION = e;
    }

    public WatchlistService() {
        super(__getWsdlLocation(), WATCHLISTSERVICE_QNAME);
    }

    public WatchlistService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WATCHLISTSERVICE_QNAME, features);
    }

    public WatchlistService(URL wsdlLocation) {
        super(wsdlLocation, WATCHLISTSERVICE_QNAME);
    }

    public WatchlistService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WATCHLISTSERVICE_QNAME, features);
    }

    public WatchlistService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WatchlistService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WatchlistPortType
     */
    @WebEndpoint(name = "WatchlistPort")
    public WatchlistPortType getWatchlistPort() {
        return super.getPort(new QName("http://www.ttu.ee/idu0075/2017/ws/wlt", "WatchlistPort"), WatchlistPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WatchlistPortType
     */
    @WebEndpoint(name = "WatchlistPort")
    public WatchlistPortType getWatchlistPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.ttu.ee/idu0075/2017/ws/wlt", "WatchlistPort"), WatchlistPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WATCHLISTSERVICE_EXCEPTION!= null) {
            throw WATCHLISTSERVICE_EXCEPTION;
        }
        return WATCHLISTSERVICE_WSDL_LOCATION;
    }

}