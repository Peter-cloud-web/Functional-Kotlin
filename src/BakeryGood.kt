//parent class
//To extend a class in kotlin or to override a method they have to be open
//changing from open to abstract class
//open classes can be instantiated but abstract cant
//open class BakeryGood(val flavour: String) changes to...
abstract class BakeryGood(val flavour: String) {
    //class must be open to be overridden from parent class to child class
    //use open if the method will altered in the subclasses
    open fun eat(): String {
        return "delicious $flavour bakery good"
    }

    //abstract methods in kotlin are bodyless with only
    //methods name,numbers,parameter type and return type
    abstract fun name():String

}

