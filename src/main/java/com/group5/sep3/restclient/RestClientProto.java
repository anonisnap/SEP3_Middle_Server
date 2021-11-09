package com.group5.sep3.restclient;

import com.group5.sep3.BusinessLogic.model.Spike;
import org.springframework.web.client.RestTemplate;

import java.util.Scanner;

public class RestClientProto {
	private static final String ROOT = "http://localhost:5000/";
	private RestTemplate rest = new RestTemplate();

	public static void main(String[] args) {
		new RestClientProto().run();
	}

	public void run() {
		userInputs();
//		Spike aSpike = GetSpike("test 1");
//		System.out.println(aSpike.toString());
	}

	public Spike GetSpike(String spikeName) {
		String result = rest.getForObject(ROOT + "spike/" + spikeName, String.class);
		Spike spike = Spike.FromJson(result);
		return spike;
	}


	public void userInputs() {
		boolean loop = true;
		Scanner s = new Scanner(System.in);
		String input = "";
		String[] cmdAndArg;
		do {
			System.out.println("<put|get> <spike name>");
			input = s.nextLine();
			cmdAndArg = input.split(" ", 2);
			if ("put".equalsIgnoreCase(cmdAndArg[0])) {
				testPut(cmdAndArg[1]);
			} else if ("get".equalsIgnoreCase(cmdAndArg[0])) {
				testGet(cmdAndArg[1]);
			} else if ("exit".equalsIgnoreCase(cmdAndArg[0])) {
				loop = false;
			} else {
				System.out.println("unknown command");
			}
		} while (loop);
	}

	private void testPut(String arg) {
		rest.put(ROOT + "Spike", new Spike(arg));
	}

	private void testGet(String arg) {
		String spikeJson = rest.getForObject(ROOT + "Spike/" + arg, String.class);
		Spike requestedSpike = Spike.FromJson(spikeJson);
		if (requestedSpike == null) {
			System.out.println("Spike was null");
		} else {
			System.out.println(requestedSpike);
		}
	}
}
