fun main(){
    print("enter the number 1: ")
    var a = readLine()!!.toInt()
    print("\n enter the number 2: ")
    var b = readLine()!!.toInt()
    fun add(a:Int,b:Int):Int{
        var sum=a+b
        print("\naddition of $a and $b is :$sum")
        return a+b

    }
    fun sub(a:Int,b:Int):Int{
        var sub=a-b
        print("\nsubtraction of $a and $b is :$sub")
        return a-b
    }
    fun mul(a:Int,b:Int):Int{
        var mul=a*b
        print("\nmultiplication of $a and $b is :$mul")
        return a*b
    }
    fun div(a:Int,b:Int):Int{
        var div=a/b
        print("\ndivision of $a and $b is :$div")
        return a/b
    }
    add(a,b)
    sub(a,b)
    mul(a,b)
    div(a,b)
}
