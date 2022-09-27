// https://leetcode.com/problems/fizz-buzz/

class FizzBuzz {

    fun fizzBuzz(n: Int): List<String> {

        val output = ArrayList<String>()

        for (i in 1..n) {

            if ((i % 3 != 0) && (i % 5 != 0)) {
                output.add("$i")
            }
            if ((i % 3 == 0) && (i % 5 == 0)) {
                output.add("FizzBuzz")
                continue
            }
            if (i % 3 == 0) {
                output.add("Fizz")
            }
            if (i % 5 == 0) {
                output.add("Buzz")
            }
        }
        return output
    }

// ---------------------------------------------------------------------------------------------------------------------

    fun fizzBuzzFromAnotherLeetCodeUser(n: Int): List<String> {
        return (1..n).map { it ->
            when {
                it % 15 == 0 -> "FizzBuzz"
                it % 3 == 0 -> "Fizz"
                it % 5 == 0 -> "Buzz"
                else -> it.toString()
            }
        }
    }
}