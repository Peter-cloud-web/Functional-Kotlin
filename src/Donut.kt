import java.nio.channels.FileLock
//extending from a subclass
//calling eat method from Cupcake subclass
open class Donut (flavour:String, val topping:String) : BakeryGood(flavour){
    override fun name(): String {
        return "donut with toppings"
    }
}
fun main(args:Array<String>){
    val myDonut = Donut("Custard","Powdered sugar")
    print(myDonut.eat())
}