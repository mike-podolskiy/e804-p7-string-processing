//CHECKSTYLE:OFF
package kz.mix.e804.stringProcessing.split;

public class ParseString1 {
    public static void main(String[] args) {
        String quote = "Never lend books-nobody ever returns them!";
        String[] words = quote.split(" "); // split strings based on the delimiter " " (space)
        for (String word : words) {
            System.out.println(word);
        }
    }
}
