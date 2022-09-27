// https://leetcode.com/problems/isomorphic-strings/?envType=study-plan&id=level-1

class IsomorphicStrings {
    fun isIsomorphic(s: String, t: String): Boolean {
        val sourceToTarget = HashMap<Char, Char>()
        val targetToSource = HashMap<Char, Char>()

        for (i in s.indices) {
            val charFromSource = s[i]
            val charFromTarget = t[i]

            if (!sourceToTarget.contains(charFromSource)) {
                sourceToTarget[charFromSource] = charFromTarget
            } else {
                if (sourceToTarget[charFromSource] != charFromTarget)
                    return false
            }

            if (!targetToSource.contains(charFromTarget)) {
                targetToSource[charFromTarget] = charFromSource
            } else {
                if (targetToSource[charFromTarget] != charFromSource)
                    return false
            }
        }
        return true
    }
}