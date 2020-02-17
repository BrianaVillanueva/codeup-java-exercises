package shapes;
/*
-An interface allow our code to be better structured and mor flexible.
-It's a special case of an abstract class.
-An interface is an abstract class that follows these rules:
    All methods are public and abstract.
    All PROPERTIES are public static and final.
    No static METHODS.
-Interfaces are used to define the behaviour of our objects
    (thus, typically only used to define methods and occasionally class constants(public static properties))
 -The name of an interface contains info about what an object does.
 -The methods, along w the types of the parameter and return value, convey WHAT the object is doing, but not HOW(the implementation).
 -Interfaces are IMPLEMENTED by classes w the "implements" keyword.
 -Like abstract classes, a class that implements an interface MUST provide an implementation for each method defined on the interface.
 EXAMPLE:
    Class Developer implements WritesCode {
      //implementation goes here
    }
  -The Developer class above MUST provide implementations for ALL of the methods in WritesCode

 */


public interface Measurable {
//  create a Measurable interface with the following methods:
//  These methods are automatically abstract since they're in an interface Class.
//  Abstract methods have no body, only provide info about the method name, return type and parameters.

    public double getPerimeter();

    public double getArea();
}
