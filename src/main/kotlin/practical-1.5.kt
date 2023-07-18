fun main(){
    print("enter the number to get the name of month: ")
    var x = readLine()!!.toInt()
    when(x){
        1->print("January")
        2->print("February")
        3->print("March")
        4->print("April")
        5->print("May")
        6->print("June")
        7->print("July")
        8->print("August")
        9->print("September")
        10->print("october")
        11->print("November")
        12->print("December")
        else-> print("enter number between 1 to 12")

    }

}