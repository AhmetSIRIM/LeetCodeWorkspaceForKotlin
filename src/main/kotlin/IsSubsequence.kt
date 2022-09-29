// https://leetcode.com/problems/is-subsequence/?envType=study-plan&id=level-1

class IsSubsequence { // TODO (Ahmet) ---> Buradaki cozumleri tekrar inceleyecegim ve duzenleyeceğim.

    // I learned and understood this from: https://leetcode.com/masoomyf/

    fun isSubsequence(s: String, t: String): Boolean {

        if (s == t) {
            return true
        }

        if (s.isEmpty()) {
            return true
        }

        if (t.isEmpty()) {
            return false
        }

        var p = 0

        for (i in t) {
            if (i == s[p]) {
                p++
            }
            if (p == s.length) {
                return true
            }
        }
        return false
    }

// ---------------------------------------------------------------------------------------------------------------------

    fun isSubsequenceFromAnotherLeetCodeUser(s: String, t: String): Boolean {
        var i = 0
        var j = 0
        while (j < t.length && i < s.length) {
            if (t[j] == s[i]) {
                i++
            }
            j++
        }
        if (i == s.length) {
            return true
        }
        return false
    }

// ---------------------------------------------------------------------------------------------------------------------

    fun secondIsSubsequenceFromAnotherLeetCodeUser(s: String, t: String) =
        t.fold(s, { str, c -> if (str.firstOrNull() == c) str.drop(1) else str })
            .isBlank()  // TODO (Ahmet) ---> Buradaki fold fonksiyonunu ogrenecegim, arastiracagim.
}

