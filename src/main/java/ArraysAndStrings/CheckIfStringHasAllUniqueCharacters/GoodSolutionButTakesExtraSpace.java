package ArraysAndStrings.CheckIfStringHasAllUniqueCharacters;

import org.apache.commons.lang3.StringUtils;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Shankul Vatsa
 * on 27-06-2021
 */
//Put the string characters into a Set, if the set size != string length, there is
//repeating character in the string. OR, keep adding all the characters into set,
//if at some point, we cannot add to set a particular character, its not a unique string.

//O(N) space and time complexity
public class GoodSolutionButTakesExtraSpace {
    public static void main(String[] args) {
        final String testStr = "qwertyuio";

        if (checkIfUnique(testStr)) {
            System.out.println(testStr + " is an unique string");
        } else {
            System.out.println(testStr + " is not an unique string");
        }
    }

    private static boolean checkIfUnique(final String testStr) {
        if(StringUtils.isEmpty(testStr)) {
            return true;
        }
        final Set<Character> characterSet = new HashSet<>();

        for(int i = 0; i < testStr.length(); ++i) {
            if (!characterSet.add(testStr.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}