package com.group5.sep3.DataBaseCommunication;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;


public class RestClientImpl implements RestClient {

    private static RestClient instance;

    private final String ROOT = "http://localhost:5000/";

    private final RestTemplate rest = new RestTemplate();

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
    public Object put(String restUrl, Object obj) {

        try {
            rest.put(ROOT + restUrl, obj);
        } catch (RestClientException e) {
            e.printStackTrace();
            return null;
        }

        return obj;
    }

    @Override
    public Object post(String restUrl, Object obj) {


        try {
            return rest.postForObject(ROOT+restUrl, obj, obj.getClass());
        } catch (RestClientException e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public Object get(String restUrl) {

        try {
            return rest.getForObject(ROOT + restUrl, String.class);
        } catch (RestClientException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean delete(String restUrl) {

        try {
            rest.delete(ROOT+restUrl);
            return true;
        } catch (RestClientException e) {
            e.printStackTrace();
            return false;
        }

    }

}
