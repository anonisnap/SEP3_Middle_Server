package com.group5.sep3.GrpcCommunication.Services;

import com.group5.sep3.BusinessLogic.LogicModels.UserModel;
import com.group5.sep3.BusinessLogic.model.User;
import io.grpc.stub.StreamObserver;
import protos.UserServiceGrpc.UserServiceImplBase;
import protos.UserServiceOuterClass.*;

public class UserService extends UserServiceImplBase {
	UserModel model;

	public UserService(UserModel model) {
		this.model = model;
	}

	@Override
	public void login(UserDetails request, StreamObserver<UserDetails> responseObserver) {
		User user = getUser(request);


		// Create Response Object
		UserDetails.Builder response = UserDetails.newBuilder();

		// Set Values Of Response Object
		setResponseValues(response, model.login(user));

		// Link the Response to the Observer
		responseObserver.onNext(response.build());

		// Tell Observer the Method is finished, and let it return the Response
		responseObserver.onCompleted();
	}

	@Override
	public void logout(UserDetails request, StreamObserver<UserDetails> responseObserver) {
		User user = getUser(request);

		// Create Response Object
		UserDetails.Builder response = UserDetails.newBuilder();

		// Set Values Of Response Object
		setResponseValues(response, model.logout(user));

		// Link the Response to the Observer
		responseObserver.onNext(response.build());

		// Tell Observer the Method is finished, and let it return the Response
		responseObserver.onCompleted();
	}

	private User getUser(UserDetails userDetails){
		return new User(userDetails.getUsername(), userDetails.getPassword(), userDetails.getRole(), userDetails.getSecurityLevel());
	}

	private UserDetails.Builder setResponseValues(UserDetails.Builder response, User user) {
		return response.setUsername(user.getUsername()).setPassword(user.getPassword()).setRole(user.getRole()).setSecurityLevel(user.getSecurityLevel());
	}
}
