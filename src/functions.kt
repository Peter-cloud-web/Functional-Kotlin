fun fooBar(x:Long):Long{
    return x * x
}
fun main(args:Array<String>){
    var i = 1
    print("${fooBar(5) * i}\n")
    i++
    print("${fooBar(5) * i}\n")
    i++
    print("${fooBar(5) * i}\n")
}