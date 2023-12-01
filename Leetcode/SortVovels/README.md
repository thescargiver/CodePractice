# Simplest and Clean Interview Styled
Checkout Simplest and clean interview styled solution of the problem with usage of data structure knowledge and understanding. Along with tips to nail the interview just within a short span of the below video.

[![VideoSolution](https://i9.ytimg.com/vi_webp/q3UKGw43zXs/mqdefault.webp?v=6569f2d4&sqp=CPC0qKsG&rs=AOn4CLBzs9YXh6KWkYC81j5Jr_vtvoGvMQ)](https://youtu.be/q3UKGw43zXs)

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

Additional improvements based upon keeping it clean and useful are always welcome.

If you find this useful atleast a bit, hit that upvote button.

