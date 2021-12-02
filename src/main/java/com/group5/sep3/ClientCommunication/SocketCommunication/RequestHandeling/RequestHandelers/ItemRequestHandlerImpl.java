package com.group5.sep3.ClientCommunication.SocketCommunication.RequestHandeling.RequestHandelers;

import com.group5.sep3.BusinessLogic.LogicModels.ItemModel;
import com.group5.sep3.BusinessLogic.LogicModels.impl.ItemModelImpl;
import com.group5.sep3.BusinessLogic.model.Item;
import com.group5.sep3.ClientCommunication.SocketCommunication.RequestHandeling.RequestHandler;
import com.group5.sep3.ClientCommunication.SocketCommunication.TransferObjects.Request;
import com.group5.sep3.ClientCommunication.SocketCommunication.TransferObjects.RequestType;
import com.group5.sep3.LogicModelFactory;
import com.group5.sep3.util.EntityTypes;

import java.beans.PropertyChangeListener;

public class ItemRequestHandlerImpl implements RequestHandler {

    private ItemModel itemModel;


    public ItemRequestHandlerImpl() {
        this.itemModel = (ItemModel) LogicModelFactory.getInstance().getLogicModel(EntityTypes.Item);
    }

    @Override
    public Object handleRequest(Request request) throws Exception {

        ItemRequestTypes requestType = ItemRequestTypes.valueOf(request.getType().name());

        Item item = request.getArg(Item.class);

        switch (requestType) {
            case GET -> {
                return itemModel.get(item);
            }
            case GETALL -> {
                return itemModel.getAll();
            }
            case PUT -> {
                return itemModel.register(item);
            }
            case POST -> {
                return itemModel.update(item);
            }
            case DELETE -> {
                return itemModel.remove(item);
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

    enum ItemRequestTypes {
        PUT,
        POST,
        GET,
        GETALL,
        DELETE
    }
}
