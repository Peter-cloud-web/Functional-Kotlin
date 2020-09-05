//Extending/Inheritance a class in kotlin
class Biscuit(flavour: String) : BakeryGood(flavour) {
    override fun eat(): String {
        return "very sweet $flavour biscuit"
    }

    override fun name(): String {
        return "Biscuit"
    }
}