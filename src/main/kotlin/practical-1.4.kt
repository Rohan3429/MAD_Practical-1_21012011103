fun main(){
    print("enter the number to check whether number is odd or even: ")
    var x = readLine()!!.toInt()
    if (x%2==0){
        print("even")
    }else {
        print("odd")
    }
}