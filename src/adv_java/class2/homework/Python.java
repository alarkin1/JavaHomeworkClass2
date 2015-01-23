/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adv_java.class2.homework;

/**
 *
 * @author Alex
 */
public class Python extends ProgrammingLanguage implements ObjectOrientedAttributes {

    //Python inherits attributes from ProgrammingLanguage but it has ObjectOrientedAttributes.    
    //After doing some research I have come to the conclusion that a coder should use Interfaces for defining unique properties or behaviors such as ObjectOrientedAttributes .     
    //Abstract classes should be used to create default or general properties and methods for other classes to build upon such as the Duck class in the book Head First Design.
    //The book used Interfaces to define certain behaviors such as flyingBehavior and quackingBehavior for different types of ducks.
    //Concrete classes are the only classes that can be instantiated.
    //Concrete classes are used to create objects.  A Concrete class should extend an Abstract classe and implement Interfaces to instantiate a unique object.
    public Python() {

    }
}
