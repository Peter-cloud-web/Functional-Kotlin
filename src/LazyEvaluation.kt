fun main(args:Array<String>){
    val i by lazy {
        println("Lazy Evaluation")
        1
    }

    println("Before using i")
    println(i)
}