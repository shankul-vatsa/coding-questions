package ArraysAndStrings.CheckIfStringHasAllUniqueCharacters;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

/**
 * @author Shankul Vatsa
 * on 27-06-2021
 */
//O(N) implementation, can be even regarded as O(1) as the loop
//goes through at most 128/256 iterations.

//Takes almost constant space (boolean[128] or boolean[256])
public class NearToBestSolution {
    public static void main(String[] args) {
        final String testStr = "qwertqyuio";

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

        //assuming only ASCII characters, can be 256 also for extended ASCII or Unicode
        final boolean[] dupTestArr = new boolean[128];

        for(int i = 0; i < testStr.length(); ++i) {
            char ithChar = testStr.charAt(i);
            if (dupTestArr[ithChar]) {
                return false;
            }
            dupTestArr[ithChar] = true;
        }

        return true;
    }

}
