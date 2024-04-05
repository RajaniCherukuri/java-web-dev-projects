package org.launchcode;
import java.util.HashMap;
import java.util.Scanner;

public class countingcharacters {
    public static void main(String[] args) {
        HashMap<Character,Integer> characterCount = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string");
        String userInputString = input.nextLine();
        String testString = userInputString.toLowerCase();

        /*String replacedNonAlpha = testString.replaceAll(regex: "^.[^a-zA-Z0-9].$",replacement: "");
        boolean hasNonAlpha = testString.matches(regex: "^.[^a-zA-Z0-9].$")
        if (hasNonAlpha){
//            do something*/
        }
        String testString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there."
                char[] characterInString = testString.toCharArray();

                for(char character : charactersInString){
                    if (characterCounts.containsKey(character)){
                        characterCounts.put(character,characterCounts.get(character) + 1);
                    }
                    else{
                        characterCounts.put(character,1);
                    }
                    for (Map.Entry < Character , Integer> oneChar : characterCounts.entrySet()){
                        System.out.println(oneChar.getKey() + ":" + oneChar.getValue());
                    }
                }
    }

}
