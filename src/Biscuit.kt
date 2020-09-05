//Extending/Inheritance a class in kotlin
class Biscuit(flavour: String) : BakeryGood(flavour) {

    //The process of extending classes and overriding behavior in a hierarchy is called specialisation.
    override fun eat(): String {
        return "very sweet $flavour biscuit"
    }

    override fun name(): String {
        return "Biscuit"
    }
}