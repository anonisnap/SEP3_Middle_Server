package com.group5.sep3.BusinessLogic;

import com.group5.sep3.BusinessLogic.LogicModels.SpikeModel;
import com.group5.sep3.ClientCommunication.TransferObjects.Request;
import com.group5.sep3.util.ProjectUtil;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class RequestHandlerImpl implements RequestHandler, PropertyChangeListener {

    PropertyChangeListener propertyChangeListener;
    private SpikeModel spikeModel;

    public RequestHandlerImpl(SpikeModel spikeModel) {
        this.spikeModel = spikeModel;
        this.spikeModel.addListener(this);
    }

    @Override
    public void handleRequest(Request request) {
        ProjectUtil.TestPrint("Hallo im requestHandler imple boii, i got this");
        if (request.getClassName().equalsIgnoreCase("spike"))
            spikeModel.handleSpike(request);

    }


    @Override
    public void addListener(String name, PropertyChangeListener listener) {

    }

    @Override
    public void addListener(PropertyChangeListener listener) {
        this.propertyChangeListener = listener;
    }

    @Override
    public void removeListener(String name, PropertyChangeListener listener) {

    }

    @Override
    public void removeListener(PropertyChangeListener listener) {

    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        ProjectUtil.NotImplemented();
    }
}
