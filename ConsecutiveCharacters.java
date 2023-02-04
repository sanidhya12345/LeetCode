import java.util.ArrayList;
import java.util.List;

public class ConsecutiveCharacters {
    public static void main(String[] args) {
        String s="leetcode";
        int max = 1, count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                if (++count > max) {
                    max = count;
                }
                count = 0;
            }
        }
        if (++count > max) {
            max = count;
    }
    }
}
