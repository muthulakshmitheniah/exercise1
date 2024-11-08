public class exercise1 {
    public static void main(String[] args) {
        String str = "madam";
        String reverseStr = "";

        int strLength = str.length();

        for (int i = (strLength - 1); i >= 0; --i) {
            reverseStr += str.charAt(i);
        }

        if (str.equals(reverseStr)) {
            System.out.println(str + " is a Palindrome.");
        } else {
            System.out.println(str + " is not a Palindrome.");
        }
    }
}
