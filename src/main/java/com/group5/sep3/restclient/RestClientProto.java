package com.group5.sep3.restclient;

import com.group5.sep3.BusinessLogic.model.Spike;
import com.group5.sep3.util.ProjectUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.Scanner;

public class RestClientProto {
	private static final String ROOT = "http://localhost:5100/";
	private final RestTemplate rest = new RestTemplate(); // IMPORTANT: THIS THROWS ERRORS IN THE CASE OF 4xx OR 5xx CODES BEING SENT FROM THE SERVER SIDE
	// https://www.baeldung.com/spring-rest-template-error-handling <-- Information about Spring Rest Template Error Handling

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
		return Spike.FromJson(result);
	}


	public void userInputs() {
		boolean loop = true;
		Scanner s = new Scanner(System.in);
		String input;
		String[] cmdAndArg;
		do {
			System.out.println("<put|get|delete|post> <spike name>");
			input = s.nextLine();
			cmdAndArg = input.split(" ", 2);
			if ("put".equalsIgnoreCase(cmdAndArg[0])) {
				testPut(cmdAndArg[1]);
			} else if ("get".equalsIgnoreCase(cmdAndArg[0])) {
				testGet(cmdAndArg[1]);
			} else if ("delete".equalsIgnoreCase(cmdAndArg[0])) {
				testDelete(cmdAndArg[1]);
			} else if ("post".equalsIgnoreCase(cmdAndArg[0])) {
				testPost(cmdAndArg[1]);
			} else if ("exit".equalsIgnoreCase(cmdAndArg[0])) {
				loop = false;
			} else {
				System.out.println("unknown command");
			}
		} while (loop);
	}

	/**
	 * Sends a HTTP Put request to the Rest Server, creating a Spike with the Spike Name as the arg
	 *
	 * @param arg Spike Name for Spike to create
	 */
	private void testPut(String arg) {
		rest.put(ROOT + "Spike", new Spike(arg));
	}

	/**
	 * Sends a HTTP GET request to the Rest Server, with the arg as route / query. Prints out the result using the ProjectUtil.TestPrint
	 *
	 * @param arg Spike Name on Spike to Request
	 */
	private void testGet(String arg) {
		ResponseEntity<?> httpResponse;
		// Send HTTP Request. Throws a Rest Client Exception (4xx) if
		try {
			// httpResponse.getBody() should have the json representation of the requested item
			httpResponse = rest.getForEntity(ROOT + "Spike/" + arg, String.class);
		} catch (RestClientException e) {
			// Most likely going to be a 404 by the DB Server
			ProjectUtil.testPrint("Error in query\n\t" + e.getMessage());
			return;
		}

		// Convert response to Spike
		String spikeJson = (String) httpResponse.getBody();
		Spike requestedSpike = Spike.FromJson(spikeJson);

		// Assert Spike was not null
		if (requestedSpike == null) {
			ProjectUtil.testPrint("Spike was null");
		} else {
			ProjectUtil.testPrint(requestedSpike.toString());
		}
	}

	/**
	 * Deletes a Spike from the Rest Server and returns the deleted object
	 *
	 * @param arg Name of the Spike to delete
	 */
	private void testDelete(String arg) {
		ResponseEntity<?> httpResponse;
		try {
			httpResponse = rest.getForEntity(ROOT + "Spike/" + arg, String.class);
			rest.delete(ROOT + "Spike/" + arg);
		} catch (RestClientException e) {
			ProjectUtil.testPrint("Error in query\n\t" + e.getMessage());
			return; // return null;
		}

		// Convert response to Spike
		String spikeJson = (String) httpResponse.getBody();
		Spike requestedSpike = Spike.FromJson(spikeJson);

		// Assert Spike was not null
		if (requestedSpike == null) {
			ProjectUtil.testPrint("Spike was null");
		} else {
			ProjectUtil.testPrint(requestedSpike.toString());
		}
		//return null
	}

	/**
	 * If possible, updates an existing Spike, else, creates a new
	 *
	 * @param arg Old Spike Name and New Spike Name, seperated comma
	 */
	private void testPost(String arg) {
		String[] args = arg.split(",");
		if (args.length < 2) {
			ProjectUtil.testPrint("Not enough arguments. Did you forget to comma separate the POST request?");
			return;
		}

		ResponseEntity<?> httpResponse;

		try {
			httpResponse = rest.postForEntity(ROOT + "Spike/" + args[0], new Spike(args[1]), String.class);
		} catch (
				RestClientException e) {
			ProjectUtil.testPrint("Error in query\n\t" + e.getMessage());
			return; // return null;
		}

		ProjectUtil.testPrint(httpResponse.getStatusCode().

				name()); // Check Status Code and Inform User if <Created> or <Updated>
	}
}
