class Solution {
    public String robotWithString(String s) {
        int[] freq = new int[26];

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        // Current smallest character that is still left in the input
        int smallest = 0;

        for (char c : s.toCharArray()) {
            // Push current char to stack
            stack.push(c);
            freq[c - 'a']--;

            // Update smallest character still in s
            while (smallest < 26 && freq[smallest] == 0) {
                smallest++;
            }

            // Pop from stack if top is <= smallest char remaining
            while (!stack.isEmpty() && stack.peek() - 'a' <= smallest) {
                result.append(stack.pop());
            }
        }

        return result.toString();
    }
}
