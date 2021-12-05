package com.group5.sep3.GrpcCommunication.Services;

import java.util.ArrayList;

public class LocationService extends LocationImplBase {
	LocationModel model;

	public LocationService(LocationModel model) {
		this.model = model;
	}

	@Override
	public void registerLocation(gLocation request, StreamObserver<gLocation> responseObserver) {
		System.out.println("+ Receiving Location from Client");

		// METHOD CALLING
		// Extract Object from Request
		Location requestLocation = getLocationFromRequest(request);

		// Perform Model Call
		Location returnLocation = null;
		try {
			returnLocation = model.register(requestLocation);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (returnLocation == null) {
			returnLocation = requestLocation;
		}

		// == == == == == == == == == == == ==

		// METHOD RESPONSE SECTION | Here we do a bit of Magic to return the requested stuff
		// Create Response Object | Since the proto file calls for a gLocation as a return value, we instantiate a gLocation.Builder object to create a Response
		gLocation.Builder response = gLocation.newBuilder();

		// Set Values Of Response Object | This Simply copies the location's information into the response.Location
		parseAndMergeLocation(response, returnLocation);

		// Link the Response to the Observer | This tells the responseObserver, that when it is completed, it should send back the response (which is a gLocation object)
		responseObserver.onNext(response.build());

		// Tell Observer the Method is finished, and let it return the Response
		responseObserver.onCompleted();

		System.out.println("- Receiving Location from Client");
	}

	@Override
	public void getLocation(gLocation request, StreamObserver<gLocation> responseObserver) {
		System.out.println("+ Sending Location to Client");

		// Fetch the Location from Request
		Location requestLocation = getLocationFromRequest(request);

		// Fetch the Location from the Server
		Location location = null;
		try {
			location = model.get(requestLocation);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Ensure Location was retrieved. If location is null, Echo back the Location requested. Optionally throw an Error
		if (location == null) {
			location = requestLocation;
//			throw new NullPointerException();
		}

		// Create Response Object
		gLocation.Builder response = gLocation.newBuilder();

		// Set Values Of Response Object
		parseAndMergeLocation(response, location);

		// Link the Response to the Observer
		responseObserver.onNext(response.build());

		// Tell Observer the Method is finished, and let it return the Response
		responseObserver.onCompleted();

		System.out.println("- Sending Location to Client");
	}

	@Override
	public void getAllLocation(gLocation request, StreamObserver<gLocationList> responseObserver) {
		System.out.println("+ Sending all Locations from Client");

		List<gLocation> returnLocations = new ArrayList<>();

		Collection<Location> locations = new ArrayList<>();

		// Parse Model Locations to gRPC Locations
		try {
			locations = model.getAll();
			for (Location location : locations) {
				gLocation.Builder builder = gLocation.newBuilder();
				parseAndMergeLocation(builder, location);
				returnLocations.add(builder.build()); // THIS LIKELY WON'T WORK. UNSURE OF HOW PARSEFROM IS IMPLEMENTED
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Create Response Object
		gLocationList.Builder response = gLocationList.newBuilder();

		// Add the gLocations to the Response
		response.addAllLocation(returnLocations); // Add Locations to Builder

		// Link the Response to the Observer
		responseObserver.onNext(response.build());

		// Tell Observer the Method is finished, and let it return the Response
		responseObserver.onCompleted();

		System.out.println("- Sending all Locations from Client");
	}

	@Override
	public void updateLocation(gLocation request, StreamObserver<gLocation> responseObserver) {
		System.out.println("+ Updating Location");

		// Fetch Location
		Location requestLocation = getLocationFromRequest(request);

		// Update Location on Server
		Location returnLocation = null;
		try {
			returnLocation = model.update(requestLocation);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Ensure ReturnLocation is not Null | Consider throwing an Error Instead
		if (returnLocation == null) {
			returnLocation = requestLocation;
		}

		// Create Response Object
		gLocation.Builder response = gLocation.newBuilder();

		// Add the gLocations to the Response
		parseAndMergeLocation(response, returnLocation);

		// Link the Response to the Observer
		responseObserver.onNext(response.build());

		// Tell Observer the Method is finished, and let it return the Response
		responseObserver.onCompleted();

		System.out.println("- Updating Location");
	}

	@Override
	public void removeLocation(gLocation request, StreamObserver<gLocation> responseObserver) {
		System.out.println("+ Removing Location");

		// Fetch Location
		Location requestLocation = getLocationFromRequest(request);

		// Remove Location on Server
		Location returnLocation = null;
		try {
			returnLocation = model.remove(requestLocation);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Ensure ReturnLocation is not Null | Consider throwing an Error Instead
		if (returnLocation == null) {
			returnLocation = requestLocation;
		}

		// Create Response Object
		gLocation.Builder response = gLocation.newBuilder();

		// Add the gLocations to the Response
		parseAndMergeLocation(response, returnLocation);

		// Link the Response to the Observer
		responseObserver.onNext(response.build());

		// Tell Observer the Method is finished, and let it return the Response
		responseObserver.onCompleted();

		System.out.println("- Receiving Location");
	}

	private Location getLocationFromRequest(gLocation req) {
		return new Location(req.getId(), req.getDescription());
	}

	private gLocation.Builder parseAndMergeLocation(gLocation.Builder builder, Location location) {
		return builder.setId(location.getId()).setDescription(location.getDescription());
	}

}
