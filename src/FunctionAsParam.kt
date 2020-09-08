
fun reverse(str:String):String{
    return str.reversed()
}
fun<T> transform(t:T,fn:(T) ->T):T{
    return fn(t)
}
fun main(args:Array<String>){
    println(transform("kotlin",::reverse))
    println(reverse("Peter"))
}