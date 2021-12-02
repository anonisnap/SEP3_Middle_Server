package com.group5.sep3.DataBaseCommunication.RestManagers;

import com.group5.sep3.BusinessLogic.model.ItemLocation;
import com.group5.sep3.util.ProjectUtil;
import org.springframework.web.client.RestClientException;

public interface ItemLocationRestManager extends RestManager<ItemLocation>{



    ItemLocation getByItemId(ItemLocation itemLocation) throws RestClientException ;

    ItemLocation getByLocationId(ItemLocation itemLocation) throws RestClientException ;

}
