# SEP3_Middle_Server
### This is the Java parts of the project

<p>
  This solution contains projects for Tier 2 in the 3rd SEP
  <br>
  The overall solution was a 3 Tier Architecture, with C# and Java being used as the programming languages. And using gRPC and REST as networking technologies.
  <br>
 	The project itself was a Warehouse Management System. Allowing users to create Internal Locations in a warehouse, and store Objects / Items on those locations. This also has a partial Order system added. With Orders being possible to create and fulfill to some extent.
  <br>
  <br>
  <i>Here is a link to the <a href="">C# Projects</a>.</i>
</p>

## Tier 2

<p>
  This is Tier 2 of the SEP 3 Project. The Server Communication was created with <a href="https://grpc.io/">gRPC</a>. This allowed us to define Protocol Buffers, which is a seperate file being used to auto-generate the necessary Objects / Code Files for communication between processes.
</p>

### gRPC Protocol Buffer

```proto
package Protos;

message gLocation {
  int32 Id = 1;
  string Description = 2;
}
  
message gLocationList {
  repeated gLocation location = 1;
}

service Location {
  rpc RegisterLocation(gLocation) returns (gLocation);
  rpc GetLocation(gLocation) returns (gLocation);
  rpc GetAllLocation(gLocation) returns (gLocationList);
  rpc UpdateLocation(gLocation) returns (gLocation);
  rpc RemoveLocation(gLocation) returns (gLocation);
}
```

This is an example of one such Protocol Buffer.

* The `message` can be interpreted, as being very similar to a Object in Java.

* The `service` is a definitive list of the different possible Methods / Functions one can call.

These `rpc` "objects" and "functions" can, using a Maven Plugin for Java, be converted into Objects with the functionality described in the Protocol Buffer File.
