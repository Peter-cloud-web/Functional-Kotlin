class ObjectSingletons {


}
//Objects are natural singletons in kotlin
//Every object in kotlin is a singleton
//Object expressions witout a type like the one bellow
//can only be accessed locally inside a method or class


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