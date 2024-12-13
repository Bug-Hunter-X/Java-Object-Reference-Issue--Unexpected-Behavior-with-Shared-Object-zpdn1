# Java Object Reference Issue
This example demonstrates a subtle issue related to object references in Java.  Modifying an object through one reference affects all references to that object.

## Bug Description
The code intends to create two independent objects, but due to a simple assignment (`obj2 = obj1`), both variables refer to the same object instance.  Therefore, modifications made through `obj2` are reflected when accessing the object via `obj1`.

## Solution
To achieve independent objects, you must create a new object instance using the `new` keyword for each variable. 