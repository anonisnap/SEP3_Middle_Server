package com.group5.sep3.GrpcCommunication.Services;

import com.group5.sep3.BusinessLogic.LogicModels.LocationModel;
import com.group5.sep3.BusinessLogic.model.Location;
import com.group5.sep3.util.ProjectUtil;
import io.grpc.stub.StreamObserver;
import protos.LocationGrpc.LocationImplBase;
import protos.LocationOuterClass.gLocation;
import protos.LocationOuterClass.gLocationList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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

		System.out.println("Location from the gLocation Request: " + requestLocation);

		// Perform Model Call
		Location returnLocation = null;
		try {
			returnLocation = model.register(requestLocation);
		} catch (Exception e) {
			System.out.println("Failed to Register an Location (" + requestLocation.getDescription() + ")");
			e.printStackTrace();
		}

		if (returnLocation == null) {
			System.out.println("<!> Location was null");
			returnLocation = requestLocation;
		}

		System.out.println("\t>> Return Location :\n" + returnLocation);

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
		Location returnLocation = null;
		try {
			returnLocation = model.get(requestLocation);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Ensure Location was retrieved. If location is null, Echo back the Location requested. Optionally throw an Error
		if (returnLocation == null) {
			returnLocation = requestLocation;
//			throw new NullPointerException();
		}
		System.out.println("\t>> Return Location :\n" + returnLocation);

		// Create Response Object
		gLocation.Builder response = gLocation.newBuilder();

		// Set Values Of Response Object
		parseAndMergeLocation(response, returnLocation);

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

		Collection<Location> locations;

		// Parse Model Locations to gRPC Locations
		try {
			locations = model.getAll();
			for (Location location : locations) {
				gLocation.Builder builder = gLocation.newBuilder();
				parseAndMergeLocation(builder, location);
				returnLocations.add(builder.build());
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

		System.out.println("\t>> Return Location :\n" + returnLocation);

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

		System.out.println("\t>> Return Location :\n" + returnLocation);

		// Create Response Object
		gLocation.Builder response = gLocation.newBuilder();

		// Add the gLocations to the Response
		parseAndMergeLocation(response, returnLocation);

		// Link the Response to the Observer
		responseObserver.onNext(response.build());

		// Tell Observer the Method is finished, and let it return the Response
		responseObserver.onCompleted();

		System.out.println("- Removing Location");
	}

	private Location getLocationFromRequest(gLocation req) {
		Location tmp = new Location(req.getId(), req.getDescription());
		ProjectUtil.testPrint("Temporary location : " + tmp);
		return tmp;
	}

	private gLocation.Builder parseAndMergeLocation(gLocation.Builder builder, Location location) {
		return builder.setId(location.getId()).setDescription(location.getDescription());
	}
}