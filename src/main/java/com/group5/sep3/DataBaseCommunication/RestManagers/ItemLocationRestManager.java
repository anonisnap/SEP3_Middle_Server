package com.group5.sep3.DataBaseCommunication.RestManagers;

import com.group5.sep3.BusinessLogic.model.ItemLocation;
import org.springframework.web.client.RestClientException;

import java.util.Collection;

public interface ItemLocationRestManager extends RestManager<ItemLocation>{



    Collection<ItemLocation> getByItemId(ItemLocation itemLocation) throws RestClientException ;

    Collection<ItemLocation> getByLocationId(ItemLocation itemLocation) throws RestClientException ;

}
