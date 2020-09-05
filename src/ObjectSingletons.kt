class ObjectSingletons {


}

fun main(args:Array<String>){
    val expression = object {
        val  property= "learning objects"

        fun method():Int{
            println("from an object expression")
            return 42
        }
    }
    val i = "${expression.property}" + "${expression.method()}"
    print(i)
}