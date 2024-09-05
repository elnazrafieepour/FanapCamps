package ExceptionHandling.VowelLetter7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VowelLetter {
    public static List<Character> vowelList = new ArrayList<>();

    static {
        vowelList.add('a');
        vowelList.add('e');
        vowelList.add('i');
        vowelList.add('o');
        vowelList.add('u');
    }


    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String name= input.nextLine();
        name = name.toLowerCase();
        validateNameNew(name);

    }

    public static void validateNameNew(String name) {
        for(char ch : name.toCharArray()) {
            if (vowelList.contains(ch))
                return;
        }

        throw new IllegalArgumentException();
    }

    public static boolean validateName(String name) {
        boolean hasVowel = false;
        for (int i = 0; i < name.length(); i++) {

            if (name.charAt(i) == 'o' || name.charAt(i) == 'a') {
                hasVowel = true;
                break;
            }
        }
        if (!hasVowel)
            throw new IllegalArgumentException();

        return hasVowel;
    }

}

