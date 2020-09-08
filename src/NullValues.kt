class NullValues{

}

fun main(args:Array<String>){
    var anInteger:Int? = null
    var aString:String? = "Hello"
    val length = aString?.length
    println(length)
    aString = null
    val length2 = aString?.length
    println(length2)
}