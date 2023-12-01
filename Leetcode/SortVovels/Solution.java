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
