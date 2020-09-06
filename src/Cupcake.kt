//Extending/Inheritance a class in kotlin
class Cupcake(flavour: String) : BakeryGood(flavour) {
    override fun eat(): String {
        return "very sweet $flavour cupcake"

    }

    fun eating(cupcake: Cupcake?){
       print("munch")
    }
//override open method in parent class Bakery good
    override fun name(): String {
        return "\n\n\nCupcake"
    }
   //Objects declared inside a class/interface can be marked as companion objects
    //Companion objects can have name or not name = Bake
    companion object Bake{
        fun almond():Cupcake{
            return Cupcake("almond")
        }
    }
}

    fun main(cakes: Array<String>) {
        val myBlueBerry:Cupcake? = null
        val myAlmond = Cupcake("Almond")
        val myCheese = Cupcake("Cheese")
        val myCaramel = Cupcake("Caramel")

        val r = myAlmond.eating(myAlmond);
        val c = myAlmond.eating(null);

        print("c : $c\n")
        print("r : $r\n")


        print(
            "My favourite flavours are \n${myAlmond}" +
                    "\n$myBlueBerry" +
                    "\n${myCheese}" +
                    "\n${myCaramel}" +
                    "\n${myBlueBerry}" +
                    "use of companion objects :${Cupcake.Bake}"
        )

        //calling the eat method using the myAlmond instance of Cupcake class
        print(myAlmond.eat())
        print(myAlmond.name())
    }

