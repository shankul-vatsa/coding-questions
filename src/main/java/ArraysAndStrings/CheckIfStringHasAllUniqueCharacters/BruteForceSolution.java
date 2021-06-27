package ArraysAndStrings.CheckIfStringHasAllUniqueCharacters;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Shankul Vatsa
 * on 27-06-2021
 */
//O(N^2) implementation where for each of the characters in the string,
//we will check rest of the characters to see if there is any repeating char.
public class BruteForceSolution {
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

        for(int i = 0; i < testStr.length()-1; ++i) {
            final char ithChar = testStr.charAt(i);
            for (int j = i+1; j < testStr.length(); ++j) {
                if (ithChar == testStr.charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }
}
