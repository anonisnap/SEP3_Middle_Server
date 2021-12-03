package com.group5.sep3.ClientCommunication.SocketCommunication.RequestHandeling.RequestHandelers;

import com.group5.sep3.BusinessLogic.LogicModels.LocationModel;
import com.group5.sep3.BusinessLogic.model.Location;
import com.group5.sep3.ClientCommunication.SocketCommunication.RequestHandeling.RequestHandler;
import com.group5.sep3.ClientCommunication.SocketCommunication.TransferObjects.Request;
import com.group5.sep3.LogicModelFactory;
import com.group5.sep3.util.EntityTypes;

import java.beans.PropertyChangeListener;

public class LocationRequestHandlerImpl implements RequestHandler {


    LocationModel locationModel;

    public LocationRequestHandlerImpl() {
        locationModel = (LocationModel) LogicModelFactory.getInstance().getLogicModel(EntityTypes.Location);
    }

    @Override
    public Object handleRequest(Request request) throws Exception {

        LocationRequestTypes requestType = LocationRequestTypes.valueOf(request.getType().name());

        Location location = request.getArg(Location.class);

        switch (requestType) {
            case GET -> {
                return locationModel.get(location);
            }
            case GETALL -> {
                return locationModel.getAll();
            }
            case PUT -> {
                return locationModel.register(location);
            }
            case POST -> {
                return locationModel.update(location);
            }
            case DELETE -> {
                return locationModel.remove(location);
            }

        }
        return null;
    }

    @Override
    public void addListener(String name, PropertyChangeListener listener) {

    }

    @Override
    public void addListener(PropertyChangeListener listener) {

    }

    enum LocationRequestTypes{
        PUT,
        POST,
        GET,
        GETALL,
        DELETE,

    }

}
