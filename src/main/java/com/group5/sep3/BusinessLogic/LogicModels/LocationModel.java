package com.group5.sep3.BusinessLogic.LogicModels;

import com.group5.sep3.BusinessLogic.model.Location;

import java.util.Collection;

public interface LocationModel extends LogicModel {

	Location registerLocation(Location location) throws Exception;

	Location updateLocation(Location location) throws Exception;

	Collection<Location> getAll(Location location) throws Exception;

	Location getLocation(Location location) throws Exception;

	Location removeLocation(Location location) throws Exception;
}
