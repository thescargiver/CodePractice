# Simplest and Clean Interview Styled
Checkout Simplest and clean interview styled solution of the problem with usage of data structure knowledge and understanding. Along with tips to nail the interview just within a short span of the below video.

[![thumbnail](./res/thumbnail.jpg)](https://youtu.be/q3UKGw43zXs)


# Problem statement
Given a 0-indexed string s, permute s to get a new string t such that:

All consonants remain in their original places. More formally, if there is an index i with 0 <= i < s.length such that s[i] is a consonant, then t[i] = s[i].
The vowels must be sorted in the nondecreasing order of their ASCII values. More formally, for pairs of indices i, j with 0 <= i < j < s.length such that s[i] and s[j] are vowels, then t[i] must not have a higher ASCII value than t[j].
Return the resulting string.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in lowercase or uppercase. Consonants comprise all letters that are not vowels.

```
Example 1:
Input: s = "lEetcOde"
Output: "lEOtcede"
Explanation: 'E', 'O', and 'e' are the vowels in s; 'l', 't', 'c', and 'd' are all consonants. The vowels are sorted according to their ASCII values, and the consonants remain in the same places.
```

```
Example 2:

Input: s = "lYmpH"
Output: "lYmpH"
Explanation: There are no vowels in s (all characters in s are consonants), so we return "lYmpH".
```


# Intution
We here are eager to categorize the vovels and non vovels. Post which we create a string based upon the upper case to upper case and then lower to lower, where while putting the characters we put those within an ordered manner.

# Code
```
class Solution {
    public String sortVowels(String s) {
        // source of sorted vovels
        final PriorityQueue<Character> queue = new PriorityQueue<>();
        final Set<Character> vovels = Set.of('a', 'e', 'i', 'o', 'u');

        // populate the queue
        for (char ch : s.toCharArray()) {
            if (vovels.contains(Character.toLowerCase(ch))) {
                queue.offer(ch);
            }
        }

        // create a result string
        StringBuilder res = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (vovels.contains(Character.toLowerCase(ch))) {
                // taking out a char from the queue
                res.append(queue.poll() + "");
                continue;
            }
            res.append(ch);
        }

        return res.toString();
    }
}
```

Additional improvements based upon keeping it clean and useful are always welcome. You can always come to [GitLab](https://gitlab.com/OBrutus/kode-practice-with-obrutus).

If you find this useful atleast a bit, hit that upvote button.

