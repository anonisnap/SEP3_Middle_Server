package com.group5.sep3.DataBaseCommunication;


public interface RestClient {

    /**
     * Creates a HTTP PUT request on the given URL with the given Object
     * @param restUrl URL to Create Object
     * @param obj Object to Create
     * @return Object created
     */
    Object put(String restUrl, Object obj);

    /**
     * Creates a HTTP POST request on the given URL with the given Object
     * @param restUrl URL to Create / Update Object
     * @param obj Object to Create / Update
     * @return Object created / updated
     */
    Object post(String restUrl, Object obj);

    /**
     * Creates a HTTP GET request on the given URL
     * @param restUrl URL for Object to Retrieve
     * @return Object at URL, null if no Object was found
     */
    Object get(String restUrl);

    /**
     * Creates a HTTP DELETE request on the given URL
     * @param restUrl URL for Object to Delete
     * @return Object deleted, null if no Object could be deleted
     */
    boolean delete(String restUrl);




}
