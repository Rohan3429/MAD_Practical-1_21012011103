import java.util.Arrays

fun main(){
    var arr= arrayOf(51,65,23,48,95,55)
    for (i in 0..arr.size-1){
        println("arr["+i+"]="+arr[i])
    }
    var max=arr[0]
    for (i in 1..arr.size-1){
        if(arr[i]>max)
            max=arr[i]
    }
    print("Largest number in arraylist is:"+max)
}