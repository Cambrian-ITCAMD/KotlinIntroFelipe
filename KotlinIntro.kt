fun main() {
    print("Hello World!\n")

    // this is a comment
    /* This is also a comment */

    // int myInt = 5;
    // Kotlin has datatype, but defines cariables with var and val
    var myInt = 5
    // val == constant
    val myChar = 's'
    var myDouble : Double = 3.14

    // println, not print 1n or printIn
    // print LINE
    println(myInt)
    println(myDouble)
    println(myChar)

    // this won't work because Kotlin needs to know the data type
    // var myNewInt
    var myNewInt : Int
    myNewInt = readln().toInt()
    println("My int is: " + myNewInt)
    println("My int is $myNewInt")

    var myBool = true
    if(myBool){
        println("Must be heads")
    } else if (!myBool){
        println("Guess it's tails")
    } else{
        println("The coin landed on its side")
    }

    // when is the new switch
    // else is the new default
    // breaks are so passe (don't need them)
    when(myNewInt % 2){
        0 -> {
            println("Even")
        }
        1 -> println("Odd")
        else -> println("Quantum")
    }

    // 
    for (i in 0..9){
        println(i)
    }

    for (i in 0..9){
        for (j in 0..9){
            if(j == 5){
                break
            }
            println(i.toString() + " / " + j)
        }
    }

    var myCounter = 0
    while (myCounter < 10){
        println("My counter: " + myCounter)
        ++myCounter
        // muyCounter++ and myCounter.inc() also work
        // -- and .dec() also exist
    }
    // don't do these
    // while(true){}
    // val truth = true
    // while(truth){}
    // while(0 == 0){}

    val array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    for(item in array){
        // this won't work because item is secretly val
        // item *= 5
        println(item)
    }

    // for(int i = 0; i <= array.length()-1; i++)
    for(index in 0..array.count()-1){
        array[index] *= 5
        println(array[index])
    }

    var myList = listOf(8, 100, 88, 11)
    for(item in myList){
        println(item)
    }
}