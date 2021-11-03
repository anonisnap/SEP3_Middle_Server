package com.group5.sep3.DataBaseCommunication;


import com.group5.sep3.model.Spike;

public interface RestClient {


    void postSpike(Spike spike);
    Spike getSpike(String spikeName);


}
