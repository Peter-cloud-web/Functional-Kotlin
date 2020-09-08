//Kotlin function without Lambda

//fun capitalize(str:String):String{
//    return str.toUpperCase();
//}

//Kotlin function with Lambda
//using lambda expressions in kotlin
//start with function name
//pass parameter and type then the operation to be performed

val capitalize = { str: String -> str.toUpperCase() }
val caseChange = { str: String -> str.toLowerCase() }
val multiply = { num: Int -> num * num }

fun main(args: Array<String>) {
    print(capitalize("hello peter\n"))
    print(caseChange("HELLO MIKE\n"))
    print(multiply(4))
}