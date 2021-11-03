package com.group5.sep3.restclient;

import com.group5.sep3.BusinessLogic.model.Spike;
import org.springframework.web.client.RestTemplate;

public class RestClientProto {
	private static final String ROOT = "http://localhost:5000/";
	private RestTemplate rest = new RestTemplate();

	public static void main(String[] args) {
		new RestClientProto().run();
	}

	public void run() {
		Spike aSpike = GetSpike("snor");
		System.out.println(aSpike.toString());
	}

	public Spike GetSpike(String spikeName) {
		String result = rest.getForObject(ROOT +"spike/" + spikeName, String.class);
		Spike spike = Spike.FromJson(result);
		return spike;
	}

}
