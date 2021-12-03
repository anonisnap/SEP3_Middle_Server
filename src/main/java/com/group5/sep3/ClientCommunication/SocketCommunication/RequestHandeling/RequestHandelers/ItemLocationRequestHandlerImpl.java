package com.group5.sep3.ClientCommunication.SocketCommunication.RequestHandeling.RequestHandelers;

import com.group5.sep3.BusinessLogic.LogicModels.ItemLocationModel;
import com.group5.sep3.BusinessLogic.model.ItemLocation;
import com.group5.sep3.ClientCommunication.SocketCommunication.RequestHandeling.RequestHandler;
import com.group5.sep3.ClientCommunication.SocketCommunication.TransferObjects.Request;
import com.group5.sep3.LogicModelFactory;
import com.group5.sep3.util.EntityTypes;
import com.group5.sep3.util.ProjectUtil;

import java.beans.PropertyChangeListener;

public class ItemLocationRequestHandlerImpl implements RequestHandler {


    ItemLocationModel itemLocationModel;

    public ItemLocationRequestHandlerImpl() {
        this.itemLocationModel = (ItemLocationModel) LogicModelFactory.getInstance().getLogicModel(EntityTypes.ItemLocation);
    }

    @Override
    public Object handleRequest(Request request) throws Exception {

        ItemLocationRequestTypes requestType = ItemLocationRequestTypes.valueOf(request.getType().name());
        ItemLocation itemLocation = request.getArg(ItemLocation.class);

        ProjectUtil.testPrint(requestType.toString());

        switch (requestType) {
            case GET -> {
                return itemLocationModel.get(itemLocation);
            }
            case GETALL -> {
                return itemLocationModel.getAll();
            }
            case PUT -> {
                return itemLocationModel.register(itemLocation);
            }
            case POST -> {
                return itemLocationModel.update(itemLocation);
            }
            case DELETE -> {
                return itemLocationModel.remove(itemLocation);
            }
            case GETBYITEMID -> {
                return itemLocationModel.getByItemId(itemLocation);
            }
            case GETBYLOCATIONID -> {
                return itemLocationModel.getByLocationId(itemLocation);
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

    enum ItemLocationRequestTypes {
        PUT,
        POST,
        GET,
        GETALL,
        DELETE,
        GETBYITEMID,
        GETBYLOCATIONID
    }
}
