fun main(){
    print("Enter the number:")
    var num = readLine()!!.toInt();
    var factorial = fact(num)
    print("factorial of $num = $factorial")

}

fun fact(num:Int):Long{
    if(num==0 || num ==1){
        return 1;
    }
    else
        return num*fact(num-1)

}