package String;

public class toUpper {
    public static void main(String[] args) {
        String    str = "hello world";
        StringBuilder result = new StringBuilder();
        result.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1;i<str.length();i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                result.append(str.charAt(i));
                i++;
                result.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                result.append(str.charAt(i));
            }
        }
        System.out.println(result.toString());
    }
}
