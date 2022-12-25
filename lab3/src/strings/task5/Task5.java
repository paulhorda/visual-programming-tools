package strings.task5;

public class Task5 {
    public String convertStrings(String a, String b) {
        StringBuilder result = new StringBuilder();
        String maxString = a.length() > b.length() ? a : b;
        int lengthFor = Math.min(a.length(), b.length());

        for (int i = 0; i < lengthFor; i++) {
            result.append(a.charAt(i));
            result.append(b.charAt(i));
        }

        for (int i = lengthFor; i < Math.max(a.length(), b.length()); i++)
            result.append(maxString.charAt(i));

        return result.toString();
    }
}
