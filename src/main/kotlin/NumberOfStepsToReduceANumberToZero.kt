// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

class NumberOfStepsToReduceANumberToZero {

    fun numberOfSteps(num: Int): Int {

        var number = num
        var count = 0

        if (number == 0) {
            return 0
        }

        while (number != 0) {
            count++
            if (number % 2 != 0) {
                number -= 1
            } else {
                number /= 2
            }
        }
        return count
    }
}
