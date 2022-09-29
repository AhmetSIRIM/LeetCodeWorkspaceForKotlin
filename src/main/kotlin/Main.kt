/*
RunningSum ve PivotIndex sorulari, array ve prefix sum
ile ilgilidir.

Prefix sum:
https://www.cs.cmu.edu/~guyb/papers/Ble93.pdf
https://en.wikipedia.org/wiki/Prefix_sum
 */

/*
IsomorphicStrings sorusu, Hash Table
(Hash map) ile ilgilidir.

Hash Table:
https://en.wikipedia.org/wiki/Hash_table
https://www.geeksforgeeks.org/hashing-data-structure
 */

/*
IsSubsequence sorusu, Two Pointer
ile ilgilidir.

Two Pointer:
https://www.geeksforgeeks.org/two-pointers-technique/
https://www.baeldung.com/java-two-pointer-technique
 */

/*
MergeTwoSortedLists ve ReverseLinkedList sorulari, Linked List ve Recursion
ile ilgilidir.

Linked List:
http://cagataykiziltan.net/veri-yapilari-data-structures/1-linked-list-bagli-listeler/
https://en.wikipedia.org/wiki/Linked_list
https://www.youtube.com/watch?v=DuBm2tWQHJ0&t=940s

Recursion:
https://en.wikipedia.org/wiki/Recursion_(computer_science)
 */

fun main() {

    val necessaryFunctions = NecessaryFunctions()

//    println(RomanToInteger().romanToInt("MCMXCIV"))
//    println(RomanToInteger().romanToIntFromAnotherLeetCodeUser("MCMXCIV"))
//    println(RomanToInteger().secondRomanToIntFromAnotherLeetCodeUser("MCMXCIV"))
//
//    println("---------------------------------------------------------------------------------------------------------")
//
//    println(FizzBuzz().fizzBuzz(15))
//    println(FizzBuzz().fizzBuzzFromAnotherLeetCodeUser(15))
//
//    println("---------------------------------------------------------------------------------------------------------")
//
//    println(NumberOfStepsToReduceANumberToZero().numberOfSteps(34))
//
//    println("---------------------------------------------------------------------------------------------------------")
//
//    println(
//        "${
//            arrayOf(
//                5,
//                34,
//                64,
//                75
//            ).toIntArray().contentToString()
//        }\n${
//            RunningSumOf1dArray().runningSum(
//                arrayOf(
//                    5,
//                    34,
//                    64,
//                    75
//                ).toIntArray()
//            ).contentToString()
//        }    "
//    )
//
//    println("---------------------------------------------------------------------------------------------------------")
//
//    println(FindPivotIndex().pivotIndex((arrayOf(1, 7, 3, 6, 5, 6).toIntArray())))
//    println(FindPivotIndex().pivotIndexFromAnotherLeetCodeUser((arrayOf(1, 7, 3, 6, 5, 6).toIntArray())))
//
//    println("---------------------------------------------------------------------------------------------------------")
//
//    println(IsomorphicStrings().isIsomorphic("paper", "title"))
//
//    println("---------------------------------------------------------------------------------------------------------")
//
//    println(
//        RichestCustomerWealth().maximumWealth(
//            arrayOf(
//                (arrayOf(15, 64, 53, 65).toIntArray()),
//                (arrayOf(15, 54, 67, 63).toIntArray()),
//                (arrayOf(65, 75, 23, 23).toIntArray()),
//            )
//        )
//    )
//
//    println("---------------------------------------------------------------------------------------------------------")
//
//    println(IsSubsequence().isSubsequence("axc", "ahbgdc"))
//    println(IsSubsequence().isSubsequenceFromAnotherLeetCodeUser("axc", "ahbgdc"))
//    println(IsSubsequence().secondIsSubsequenceFromAnotherLeetCodeUser("axc", "ahbgdc"))

//    println("---------------------------------------------------------------------------------------------------------")

//    val firstListNode = ListNode(1)
//    firstListNode.next = ListNode(3)
//    firstListNode.next?.next = ListNode(5)
////    necessaryFunctions.linkedListPrinter(firstListNode)
//    println(necessaryFunctions.linkedListToArrayConverter(firstListNode).contentToString())
//
//    val secondListNode = ListNode(2)
//    secondListNode.next = ListNode(4)
//    secondListNode.next?.next = ListNode(6)
////    necessaryFunctions.linkedListPrinter(secondListNode)
//    println(necessaryFunctions.linkedListToArrayConverter(secondListNode).contentToString())
//
//    val resultListNodeOfMergeTwoSortedLists = MergeTwoSortedLists().mergeTwoLists(
//        firstListNode,
//        secondListNode
//    ) // TODO (Ahmet) ---> Bu satirdaki "resultListNodeOfMergeTwoSortedLists" hesabiyla berbar firstListNode ve secondListNode degerleri de degisiyor. Bu durumu bu satirin altindaki ve ustundeki firstListNode ve secondListNode print islemlerinin farkli sonuc vermesinden gozlemleyebilirsin. Bu durumun nedenini tam anlamadım, arastiracagim.
//
////    necessaryFunctions.linkedListPrinter(firstListNode)
////    necessaryFunctions.linkedListPrinter(secondListNode)
////    necessaryFunctions.linkedListPrinter(resultListNodeOfMergeTwoSortedLists)
//    println(necessaryFunctions.linkedListToArrayConverter(resultListNodeOfMergeTwoSortedLists).contentToString())

    println("---------------------------------------------------------------------------------------------------------")

//    val listNodeForReverseLinkedList = ListNode(1)
//    listNodeForReverseLinkedList.next = ListNode(2)
//    listNodeForReverseLinkedList.next?.next = ListNode(3)
//    listNodeForReverseLinkedList.next?.next?.next = ListNode(4)
//    listNodeForReverseLinkedList.next?.next?.next?.next = ListNode(5)
//
//    val resultListNodeOfReverseLinkedList = ReverseLinkedList().reverseList(listNodeForReverseLinkedList)
//
//    println(necessaryFunctions.linkedListToArrayConverter(listNodeForReverseLinkedList).contentToString())
//    println(
//        necessaryFunctions.linkedListToArrayConverter(resultListNodeOfReverseLinkedList).contentToString()
//    ) // TODO (Ahmet) ---> Bu TODO ile yukardaki ayni konuya deginiyor. Burda da fonksiyon girdisinin degeri, fonksiyona girdikten sonra degisiyor, ayni kalmiyor. Halbuki girdi zaten val ile tanimlanmis bir deger, bu konuyu arastiracagim.

    println("---------------------------------------------------------------------------------------------------------")


}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class NecessaryFunctions {
    fun linkedListPrinter(listNode: ListNode?) {
        println("***")
        var listNodeForFunction = listNode
        while (listNodeForFunction != null) {
            println(listNodeForFunction.`val`)
            listNodeForFunction = listNodeForFunction.next
        }
        println("***")
    }

    fun linkedListToArrayConverter(listNode: ListNode?): IntArray {
        val resultArray: IntArray = IntArray(linkedListLengthFinder(listNode))
        var index: Int = 0
        var listNodeForFunction = listNode
        while (listNodeForFunction != null) {
            resultArray[index] = listNodeForFunction.`val`
            listNodeForFunction = listNodeForFunction.next
            index += 1
        }
        return resultArray
    }

    fun linkedListLengthFinder(listNode: ListNode?): Int {
        var index: Int = 0
        var listNodeForFunction = listNode
        while (listNodeForFunction != null) {
            listNodeForFunction = listNodeForFunction.next
            index += 1
        }
        return (index)
    }
}