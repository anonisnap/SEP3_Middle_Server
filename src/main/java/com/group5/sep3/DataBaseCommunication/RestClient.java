package com.group5.sep3.DataBaseCommunication;


import com.group5.sep3.BusinessLogic.model.Spike;

public interface RestClient {


    void postSpike(Spike spike);
    Spike getSpike(String spikeName);


}
