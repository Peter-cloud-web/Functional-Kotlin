//parent class
//To extend a class in kotlin or to override a method they have to be open
open class BakeryGood(val flavour: String) {
    //class must be open to be overridden from parent class to child class
    //use open if the method will altered in the subclasses
    open fun eat(): String {
        return "delicious $flavour bakery good"
    }
    open fun name():String{
        return "Bakery Good"
    }
}

