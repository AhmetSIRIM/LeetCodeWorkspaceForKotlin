// https://leetcode.com/problems/richest-customer-wealth/

class RichestCustomerWealth {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        var max = 0
        for (account in accounts) {
            var sum = account.sum()
            if (sum > max) {
                max = sum
            }
        }
        return max
    }
}