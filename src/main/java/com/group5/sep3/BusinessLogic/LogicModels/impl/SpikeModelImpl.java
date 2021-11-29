package com.group5.sep3.BusinessLogic.LogicModels.impl;

import com.group5.sep3.BusinessLogic.LogicModels.SpikeModel;
import com.group5.sep3.BusinessLogic.model.Spike;
import com.group5.sep3.ClientCommunication.TransferObjects.Request;
import com.group5.sep3.ClientCommunication.TransferObjects.RequestType;
import com.group5.sep3.DataBaseCommunication.RestClient;
import com.group5.sep3.util.ProjectUtil;

import java.beans.PropertyChangeListener;

public class SpikeModelImpl implements SpikeModel {


    PropertyChangeListener propertyChangeListener;
    private RestClient restClient;

    public SpikeModelImpl(RestClient restClient) {
        this.restClient = restClient;
    }

    @Override
    public Object handleSpike(Request request) {
        ProjectUtil.testPrint("Handling: " + request);

        Spike returnSpike = null;

        if (request.getType() == RequestType.POST) {

            postSpikeToDb(request.getArg(Spike.class));

        } else if (request.getType() == RequestType.GET){
            returnSpike = getSpikeFromDb(request.getArg(Spike.class));
        }

        return returnSpike;
    }



    @Override
    public Spike getSpikeFromDb(String spikeName) {
       return null;
    }

    @Override
    public void postSpikeToDb(Spike spike) {

    }

    @Override
    public void addListener(String name, PropertyChangeListener listener) {
        ProjectUtil.NotImplemented();
    }

    @Override
    public void addListener(PropertyChangeListener listener) {
        propertyChangeListener = listener; // todo: do stuff
    }

    @Override
    public void removeListener(String name, PropertyChangeListener listener) {

    }

    @Override
    public void removeListener(PropertyChangeListener listener) {

    }
}
