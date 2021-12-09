package com.group5.sep3.DataBaseCommunication.RestManagers;

import com.group5.sep3.BusinessLogic.model.ItemLocation;
import org.springframework.web.client.RestClientException;

import java.util.List;

public interface ItemLocationRestManager extends RestManager<ItemLocation>{



    List<ItemLocation> getByItemId(int itemId) throws RestClientException ;

    List<ItemLocation> getByLocationId(int locationId) throws RestClientException ;

}
