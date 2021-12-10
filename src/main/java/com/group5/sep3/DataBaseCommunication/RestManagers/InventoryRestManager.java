package com.group5.sep3.DataBaseCommunication.RestManagers;

import com.group5.sep3.BusinessLogic.model.Inventory;
import org.springframework.web.client.RestClientException;

import java.util.List;

public interface InventoryRestManager extends RestManager<Inventory>{



    List<Inventory> getByItemId(int itemId) throws RestClientException;

    List<Inventory> getByLocationId(int locationId) throws RestClientException;

    List<Inventory> GetInventoryStock() throws RestClientException;

}
