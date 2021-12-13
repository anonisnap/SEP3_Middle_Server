package com.group5.sep3.DataBaseCommunication;

import com.group5.sep3.BusinessLogic.model.Order;
import com.group5.sep3.BusinessLogic.model.OrderEntry;
import com.group5.sep3.util.JsonHelper;
import com.group5.sep3.util.ProjectUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;


public class RestClientImpl implements RestClient {
	private static RestClient instance;
	private final String ROOT = "http://localhost:5000/";
	private final RestTemplate rest = new RestTemplate();

	public static final String ADD_URL = "/add";
	public static final String UPDATE_URL = "/update";

	private RestClientImpl() {
	}

	public static RestClient getInstance() {


		if (instance == null) {
			instance = new RestClientImpl();
			return instance;
		}

		return instance;
	}

	@Override
	public Object put(String restUrl, Object obj) throws RestClientException {
		//Post is used the get back result-- spring put returns void
		ResponseEntity<String> result = rest.postForEntity(ROOT + restUrl, obj, String.class);
		return result.getBody();
	}

	@Override
	public Object post(String restUrl, Object obj) throws RestClientException {
		try {
			return rest.postForEntity(ROOT + restUrl, obj, String.class).getBody();
		} catch (RestClientException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Object get(String restUrl) throws RestClientException {
		try {

			return rest.getForEntity(ROOT + restUrl, String.class).getBody();
		} catch (RestClientException e) {
			ProjectUtil.testPrint("Could not get " + e.getMessage());
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean delete(String restUrl) throws RestClientException {

		try {
			rest.delete(ROOT + restUrl);
			return true;
		} catch (RestClientException e) {
			ProjectUtil.testPrint("Could not delete item: " + e.getMessage());
			e.printStackTrace();
			return false;
		}
	}
}
