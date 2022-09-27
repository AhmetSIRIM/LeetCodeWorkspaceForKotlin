// https://leetcode.com/problems/merge-two-sorted-lists/?envType=study-plan&id=level-1

class MergeTwoSortedLists {

//    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
//
//    }

    fun mergeTwoListsFromAnotherLeetCodeUser(list1: ListNode?, list2: ListNode?): ListNode? {
        var node1: ListNode? = list1
        var node2: ListNode? = list2
        var mergedList: ListNode? = ListNode(-102)
        var head: ListNode? = null

        while (node1 != null || node2 != null) {
            val cur1 = node1?.value ?: 101
            val cur2 = node2?.value ?: 101

            mergedList?.next = if (cur1 <= cur2) {
                node1 = node1?.next
                ListNode(cur1)
            } else {
                node2 = node2?.next
                ListNode(cur2)
            }

            if (head == null) {
                head = mergedList
            }

            mergedList = mergedList?.next
        }

        return head?.next
    }

}

class ListNode(var value: Int) {
    var next: ListNode? = null
}