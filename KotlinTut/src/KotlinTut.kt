/**
 * Created by Kev on 02/09/2017.
 */

fun main(args : Array<String>) {
    println("Hello World!")

    val bigInt: Int = Int.MAX_VALUE
    val smallInt: Int = Int.MIN_VALUE

    println("Biggest Int : " + bigInt)
    println("Smallest Int : $smallInt")

    if (true is Boolean) {
        print("true is boolean\n")
    }

    println("3.14 to Int: " + (3.14.toInt()))
    println("A to Int: " + ('A'.toInt()))
    println("65 to Char: " + 65.toChar())

    val myName = "Kevin"
    val longStr = """This is a
                    long string"""

    var fName = "Kevin"
    val lName = "Queeney"

    fName = "Kev"

    val fullName = fName + " " + lName

    println("Name: $fullName")

    val str1 = "A random String"
    val str2 = "a random String"

    println("Strings Equal: ${str1 == str2}")
    println("Compare A to B: ${"A".compareTo("B")}")

    println("2nd index: ${str1[2]}")

    println("Index 2-7: ${str1.subSequence(2,8)}")

    println("Contains random: ${str1.contains("random")}")


    var myArray = arrayOf(1, 1.23, "Kev")
    println(myArray[2])
    myArray[1] = 3.14
    println("Array Length: ${myArray.size}")
    println("Kev in array: ${myArray.contains("Kev")}")

    var anotherArray = Array(5, { x -> x*x })
    println(anotherArray[2])


}