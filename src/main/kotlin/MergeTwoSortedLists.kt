// https://leetcode.com/problems/merge-two-sorted-lists/?envType=study-plan&id=level-1

class MergeTwoSortedLists {

    // I learned and understood this from: https://leetcode.com/cucerdariancatalin/

    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null && list2 == null) {
            return null
        }
        if (list1 == null) {
            return list2
        }
        if (list2 == null) {
            return list1
        }
        if (list1.`val` < list2.`val`) {
            list1.next = mergeTwoLists(list1.next, list2)
            return list1
        }
        list2.next = mergeTwoLists(list2.next, list1)
        return list2
    }
}

