class student(val name:String){
    var enno:String="21012011103"

    constructor(name: String,enrollment:String):this(name){
        enno=enrollment
        println("secondary constuctor called")
    }

    init {
        println("init block called")
    }

}
fun main(){
    val obj=student("rohan","21012011103")
    println(obj.name)
    println(obj.enno)
}