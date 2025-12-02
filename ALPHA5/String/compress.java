package String;

public class compress {
    public static void main(String[] args) {
        String str = "aaabbbccca";
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1));
                compressed.append(count);
                count = 1;
            }
        }
        // Append the last set of characters
        compressed.append(str.charAt(str.length() - 1));
        if(count>1){
            compressed.append(count);
        }

        System.out.println(compressed.toString());
    }
}
