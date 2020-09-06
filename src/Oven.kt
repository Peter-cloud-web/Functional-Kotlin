//declaring a class as object means you dont have to create an instance of to access its properties or methods
object Oven {
    fun process(product:String){
        print("$product")
    }
}

fun main(args:Array<String>){
    //objects are singletons so you dont need to instantiate oven to use it
    val menu1 = Oven.process("Tea")
    val menu2 = Oven.process("Coffee")
    val menu3 = Oven.process("Milk")

    println("Our menu consists of $menu1\n" +
            "$menu2\n" +
            "$menu3\n")
}