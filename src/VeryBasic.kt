class VeryBasic{
    var name = "Peter" //class state or properties

}
//In java we declare the type then variable name but in kotlin its variable name then the type
// main method in java is public static void main(String[] args)
//main method in Kotlin fun main(args:Array<String>)
//basic is an instance of VeryBasic class the same as Val basic = VeryBasic()
//VeryBasic is the type
fun main(args:Array<String>){
    //same as val basic = VeryBasic() without the type reference
val basic:VeryBasic = VeryBasic()
    var userName = basic.name
    userName = "David" //change variable at runtime
    print(userName)
}