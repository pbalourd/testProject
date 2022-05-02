import java.util.*

fun main() {
//    The following 4 lines reproduce the "Guess the animal" fault
//    The readln() is used. The same happens with readLine()
    println("First input")
    val a = readln()
    println("Second input")
    val b = readln()

//    If the above code is replaced by the following code
//    then the test is passed. Here, the Java Scanner is used
    /*
    val s = Scanner(System.`in`)
    println("First input")
    val a = s.nextLine()
    println("Second input")
    val b = s.nextLine()
*/

}