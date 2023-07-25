open class person(firstname:String,lastname:String){
    val firstname=""
    val lastname=""
    var phoneno:String=""

    constructor(firstname: String,lastname: String,phoneno:String):this(firstname,lastname)
    var phone:String=phoneno
}

class student(fname:String,lname: String): person(firstname,lastname) {
    var name:String= fname+" "+lname
    var enno:String="21012011103"

    constructor(name: String,enrollment:String):this(fname,lname){
        enno=enrollment
        println("secondary constuctor called")
    }


//    override fun toString(): String {
//        return "$name , $enno"
//    }

}
fun main(){
    val obj=student("rohan","21012011103")
    println(obj)
    println(obj.)
    println(obj.name)
    println(obj.lname)

//    println(obj.name)
//    println(obj.enno)
}