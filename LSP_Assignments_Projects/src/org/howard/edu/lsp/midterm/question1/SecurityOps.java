package org.howard.edu.lsp.midterm.question1;

public class SecurityOps {
   
    public static String encrypt(String text) {
    	StringBuilder evenIndexChars = new StringBuilder();
        StringBuilder oddIndexChars = new StringBuilder();

        // Remove whitespace and punctuation from the text.
        String cleanedText = text.replaceAll("[\\s\\p{Punct}]", "");

        // Iterate over the characters of the cleaned text.
        for (int i = 0; i < cleanedText.length(); i++) {
            if (i % 2 == 0) {
                evenIndexChars.append(cleanedText.charAt(i));
            } else {
                oddIndexChars.append(cleanedText.charAt(i));
            }
        }

        // Combine even and odd indexed characters.
        return evenIndexChars.append(oddIndexChars).toString();
}
    public static void main(String[] args) {
        String result = encrypt("I love CSCI363");
        System.out.println(result); // Expected output: "IoesI6LvCC33"
    }
}
