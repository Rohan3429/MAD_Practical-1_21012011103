import java.util.Arrays
fun main(){
    println("create Array-1 using arrayOf() method")
    var a1 = arrayOf(3,9,26,29,36,56)
    println(a1.contentDeepToString())

    println("create Array-2 using Array<>():")
    var a2 =Array<Int>(5){0}
    println(Arrays.deepToString(a2))

    println("create Array-3 using Array<>() and lambda function")
    var a3 = Array<Int>(5){i:Int->i}
    println(a3.contentToString())

    println("create Array-4 using IntArray():")
    var a4 = IntArray(5){0}
    for(item in a4){
        print(item)
        print(", ")
    }

    println("\n create Array-4 using IntArrayOf():")
    var a5 = intArrayOf(10,13,15,26,47)
    println(a5.joinToString(", "))

    println("create 2D array-6 using ArrayOf() and intArrayOf() :")
    var a6 = arrayOf(intArrayOf(3,5), intArrayOf(6,9), intArrayOf(12,16), intArrayOf(20,24))
    println(a6.contentDeepToString())

    println("enter the Array value")
    var a7 = Array<Int>(5){0}
    for (i in 0..4){
        print("Arr[$i]" )
        a7[i]= readLine()!!.toInt()
    }
    println(a7.contentToString())

    a7.sort()
    println(a7.contentToString())

}