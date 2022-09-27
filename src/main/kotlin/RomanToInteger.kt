// https://leetcode.com/problems/roman-to-integer/

class RomanToInteger {

    /*
     Bir degiskene, asagidaki gibi art arda
     fonksiyon uygulanabilir.
     */
    fun romanToInt(s: String): Int {

        val newValueOfs = s.replace("IV", "IIII")
            .replace("IX", "VIIII")
            .replace("XL", "XXXX")
            .replace("XC", "LXXXX")
            .replace("CD", "CCCC")
            .replace("CM", "DCCCC")

        var totalValue = 0

        for (i in newValueOfs.indices) {

            if (newValueOfs[i] == 'I') {
                totalValue += 1
            }
            if (newValueOfs[i] == 'V') {
                totalValue += 5
            }
            if (newValueOfs[i] == 'X') {
                totalValue += 10
            }
            if (newValueOfs[i] == 'L') {
                totalValue += 50
            }
            if (newValueOfs[i] == 'C') {
                totalValue += 100
            }
            if (newValueOfs[i] == 'D') {
                totalValue += 500
            }
            if (newValueOfs[i] == 'M') {
                totalValue += 1000
            }
        }

        return totalValue
    }

// ---------------------------------------------------------------------------------------------------------------------
    fun romanToIntFromAnotherLeetCodeUser(s: String): Int {
        val map = mutableMapOf(
            'I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000
        )
        var number = 0
        var last = 1000
        s.forEach {
            val value = map[it] ?: 0
            if (value > last) number -= last * 2
            number += value
            last = value
        }

        return number
    }

// ---------------------------------------------------------------------------------------------------------------------

    fun secondRomanToIntFromAnotherLeetCodeUser(s: String): Int {
        var result = 0
        s.replace("IV", "IIII")
            .replace("IX", "VIIII")
            .replace("XL", "XXXX")
            .replace("XC", "LXXXX")
            .replace("CD", "CCCC")
            .replace("CM", "DCCCC")

            .forEachIndexed { index, char ->
                when (char) {
                    'I' -> {
                        result += 1
                    }

                    'V' -> {
                        result += 5
                    }

                    'X' -> {
                        result += 10
                    }

                    'L' -> {
                        result += 50
                    }

                    'C' -> {
                        result += 100
                    }

                    'D' -> {
                        result += 500
                    }

                    'M' -> {
                        result += 1000
                    }
                }
            }

        return result
    }
}