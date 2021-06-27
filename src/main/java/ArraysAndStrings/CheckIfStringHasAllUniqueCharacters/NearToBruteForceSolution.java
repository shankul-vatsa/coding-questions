package ArraysAndStrings.CheckIfStringHasAllUniqueCharacters;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

/**
 * @author Shankul Vatsa
 * on 27-06-2021
 */
//O(N*logN) implementation where we sort the given string characters first
//and then check if any of the consecutive chars are same.
public class NearToBruteForceSolution {
    public static void main(String[] args) {
        final String testStr = "abcdb";

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

        char[] arr = testStr.toCharArray();
        Arrays.sort(arr);

        for(int i = 0; i < arr.length-1; ++i) {
            if (arr[i] == arr[i+1]) {
                return false;
            }
        }

        return true;
    }
}
