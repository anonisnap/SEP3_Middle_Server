package com.group5.sep3.DataBaseCommunication;
import com.group5.sep3.util.ProjectUtil;
import org.springframework.web.client.RestTemplate;


public class RestClientImpl implements RestClient {

    private static RestClient instance;


    private String ROOT = "http://localhost:5000/";

    private RestTemplate rest = new RestTemplate();

    private RestClientImpl() {
    }


    public static RestClient getInstance(){


        if (instance == null){
            instance = new RestClientImpl();
            return instance;
        }

        return instance;
    }


    @Override
    public void put(String restUrl, Object obj) {
        ProjectUtil.TestPrint("Putting with: "+ ROOT+restUrl + " object to put: " + obj );
        rest.put(ROOT + restUrl, obj);
    }

    @Override
    public void post(String restUrl, Object obj) {
        ProjectUtil.NotImplemented();
    }

    @Override
    public Object get(String restUrl) {

        String result = rest.getForObject(ROOT + restUrl, String.class);

        return result;
    }

    @Override
    public Object delete(String restUrl) {
        ProjectUtil.NotImplemented();
        return null;
    }


}
