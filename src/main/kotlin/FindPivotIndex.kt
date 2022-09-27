// https://leetcode.com/problems/find-pivot-index/?envType=study-plan&id=level-1

class FindPivotIndex {
    fun pivotIndex(nums: IntArray): Int {
        var result: Int = -1

        for (i in nums.indices) {
            if (leftFinder(nums, i) == rightFinder(nums, i)) {
                return i
            }
        }
        return result
    }

    fun leftFinder(nums: IntArray, index: Int): Int {
        var left: Int = 0

        if (index == 0) {
            return left
        }

        for (i in (index - 1).downTo(0)) {
            left += nums[i]
        }
        return left
    }

    fun rightFinder(nums: IntArray, index: Int): Int {
        var rigth: Int = 0

        if (index == nums.lastIndex) {
            return 0
        }

        for (i in (index + 1) until nums.size) {
            rigth += nums[i]
        }
        return rigth
    }

// ---------------------------------------------------------------------------------------------------------------------

    fun pivotIndexFromAnotherLeetCodeUser(nums: IntArray): Int {

        var total = 0
        for (num in nums) {
            total += num
        }

        var sum = 0
        var i = 0
        while (i < nums.size) {
            if (sum * 2 == total - nums[i]) return i
            sum += nums[i]
            i++
        }
        return -1

    }
}