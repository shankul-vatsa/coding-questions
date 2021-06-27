package ArraysAndStrings.CheckTwoStringsArePermutationOfEachOther;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Shankul Vatsa
 * on 27-06-2021
 */
//O(N) time and space complexity
public class BruteForceSolution {
    public static void main(String[] args) {
        final String firstStr = "abcd";
        final String secondStr = "dbca";

        if (checkIfPermutation(firstStr, secondStr)) {
            System.out.println(firstStr + " and " + secondStr + " are permutation of each other");
        } else {
            System.out.println(firstStr + " and " + secondStr + " are not permutation of each other");
        }
    }

    private static boolean checkIfPermutation(String firstStr, String secondStr) {
        // assuming first and second strings have been validated for NULL beforehand
       if (firstStr.length() != secondStr.length()) {
           return false;
       }
       final Set<Character> dupCheckSet = new HashSet<>();

       for (int i = 0; i < firstStr.length(); ++i) {
           dupCheckSet.add(firstStr.charAt(i));
       }

        for (int i = 0; i < secondStr.length(); ++i) {
            //If we could add any char to the set, it means this char is extra in 2nd string
            //and hence not a permutation.
            if (dupCheckSet.add(secondStr.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
