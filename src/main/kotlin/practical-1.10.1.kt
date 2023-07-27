public open class person(firstname:String, lastname: String){
    val firstname=""
    val lastname=""
    var phoneno:String=""

    constructor(firstname: String, lastname: String, phoneno: String, fname: String):this(fname, String())
    var phone:String=phoneno
}

class student( fname: String, lname: String): person(fname,lname) {
    var name:String= fname+" "+lname
    var enno:String="21012011103"

    constructor(name: String, enrollment: String, fname: String,lname: String):this(fname, lname){
        enno=enrollment
        println("secondary constuctor called")
    }


    override fun toString(): String {
        return "$name , $enno"
    }

}


fun main(){
    val obj=student("Rohan", "21012011103", "Patel","Hitendrabhai")
    println(obj)
    println(obj.name)
    println(obj.firstname)


//    println(obj.name)
//    println(obj.enno)
}
