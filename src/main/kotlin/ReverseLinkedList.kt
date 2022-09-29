class ReverseLinkedList {
    fun reverseList(head: ListNode?): ListNode? {

        var listNodeForFunction = head
        val array: IntArray = linkedListToArrayConverter(head)
        array.reverse()
        var index = 0

        while (listNodeForFunction != null) {
            listNodeForFunction.`val` = array[index]
            listNodeForFunction = listNodeForFunction.next
            index += 1
        }

        return head
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


// ---------------------------------------------------------------------------------------------------------------------

    fun reverseListFromAnotherLeetCodeUser(head: ListNode?): ListNode? { // TODO (Ahmet) ---> Bu cozumu inceleyecegim.
        var node = head
        var prev: ListNode? = null
        while (node != null) {
            val temp = node.next
            node.next = prev
            prev = node
            node = temp
        }
        return prev
    }

    // ---------------------------------------------------------------------------------------------------------------------

    fun secondReverseListFromAnotherLeetCodeUser(head: ListNode?): ListNode? { // TODO (Ahmet) ---> Bu cozumu inceleyecegim.

        var headNode = head

        while (head?.next != null) {
            val a = head
            val b = head.next
            val c = head.next?.next

            b?.next = headNode // 2 -> 1
            a.next = c //       1 -> 3

            headNode = b
        }

        return headNode
    }
}
