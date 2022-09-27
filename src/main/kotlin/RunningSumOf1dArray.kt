// https://leetcode.com/problems/running-sum-of-1d-array/

class RunningSumOf1dArray {

    fun runningSum(nums: IntArray): IntArray {

        for (i in 1 until nums.size) {
            nums[i] += nums[i - 1]
        }

        return nums

    }
}