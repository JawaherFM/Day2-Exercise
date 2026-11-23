import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner  input = new Scanner(System.in);

        //1. Develop a program that takes the weight (in kilograms) and height (in meters) as input and calculates the BMI, then prints it.
        System.out.println("Question 1: ");
        System.out.println("Please enter your weight (in kilograms): ");
        double weight = input.nextDouble();
        System.out.println("Please enter your height (in meters): ");
        double height = input.nextDouble();
        double squareHeight  =  height * height;
        double bmi = weight / squareHeight ;
        System.out.println("your BMI is: " + bmi);


        //2. Write a program that takes the obtained marks and total marks as input and calculates the percentage, then prints it.
        System.out.println("Question 2: ");
        System.out.println("Please enter the obtained marks: ");
        double obtaindMarks = input.nextDouble();
        System.out.println("Please enter your total marks: ");
        double totalMarks = input.nextDouble();
        double percentage  = (( obtaindMarks * totalMarks)/totalMarks);

        System.out.println("your percentage is: " + percentage+ "%");


        //3.  Create a program that takes an amount in one currency and an exchange rate as input, then converts and prints the amount in another currency.
        System.out.println("Question 3: ");
        System.out.println("Please enter the amount in USD:");
        double amount = input.nextDouble();
        System.out.println("Please enter the exchange rate(USD to EUR):");
        double exchangeRate = input.nextDouble();
        double finalAmount =  amount * exchangeRate ;
        System.out.println("Amount in EUR: "+finalAmount);


        //4. Create a program that takes a string as input, calculates its length, and then reverses the string using the StringBuilder class, finally printing both the length and reversed string.
        System.out.println("Question 4: ");
        System.out.println("Please enter a string:");
        String text = input.nextLine();
        int textLength = text.length();

        StringBuilder newText = new StringBuilder(text);
        newText.reverse();

        System.out.println("Lenght of the String: "+textLength+" And the reverse string: "+newText);


        //5. Develop a program that takes a sentence as input and extracts a substring from it, then prints the extracted substring.
        System.out.println("Question 5: ");
        System.out.println("Please enter the Sentence: ");
        String sentence = input.nextLine();
        System.out.println("Please enter the start index of substring: ");
        int startIndex = input.nextInt();
        System.out.println("Please enter the end index of substring: ");
        int endIndex = input.nextInt();

        System.out.println("the Sentence after substring: "+sentence.substring(startIndex,endIndex));


        // 6. Write a program that takes a sentence and a keyword as input, then check if the keyword is present in the sentence and prints the result.
        System.out.println("Question 6: ");
        System.out.println("Please enter a sentence: ");
        String sentence2 =  input.nextLine();
        System.out.println("Please enter the Keyword");
        String keywordSentence = input.nextLine();
        boolean checkKeyword = sentence2.contains(keywordSentence);
        System.out.printf("Keyword %s is %b in the sentence.",keywordSentence,checkKeyword);


        // 7. Develop a program that takes a sentence and a word to replace as input, then replace all occurrences of the word with another word and prints the modified sentence.
        System.out.println("Question 7: ");
        System.out.println("Please enter a sentence: ");
        String sentence3 =  input.nextLine();
        System.out.println("Please enter the word to replace: ");
        String oldWord =  input.nextLine();
        System.out.println("Please enter a word to replace with it: ");
        String newWord =  input.nextLine();

        String newSentence3 = sentence3.replace(oldWord,newWord);
        System.out.println("thee new Sentence is: "+newSentence3);


        //8. Write a program that takes two strings as input and check if they are equal,ignoring the case, then prints whether they are equal or not.
        System.out.println("Question 8: ");
        System.out.println("Please enter a string: ");
        String firstString = input.nextLine();
        System.out.println("Please enter a string: ");
        String scendString = input.nextLine();
        boolean checkEqual = firstString.equalsIgnoreCase(scendString);
        System.out.printf("Strings are %b (ignoring case).",checkEqual);




    }
}