package strings.task3;

public class Task3 {
    public int lengthOfMaxChars(String s) {
        int maxLength = 0;
        int tempLength = 0;
        char previousChar = s.charAt(0);

        for (char c : s.toCharArray()) {
            if (previousChar != c) {
                if (tempLength > maxLength) maxLength = tempLength;
                previousChar = c;
                tempLength = 1;
                continue;
            }
            tempLength++;
        }

        return maxLength;
    }
}
