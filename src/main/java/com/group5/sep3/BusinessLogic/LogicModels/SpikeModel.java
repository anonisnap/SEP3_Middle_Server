package com.group5.sep3.BusinessLogic.LogicModels;

import com.group5.sep3.BusinessLogic.model.Spike;
import com.group5.sep3.ClientCommunication.SocketCommunication.TransferObjects.Request;
import com.group5.sep3.util.Subject;

public interface SpikeModel extends Subject {


    Object handleSpike(Request request);

    Spike getSpikeFromDb(String spikeName);

    void postSpikeToDb(Spike spike);

}
