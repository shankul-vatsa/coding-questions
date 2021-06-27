package ArraysAndStrings.CheckIfStringHasAllUniqueCharacters;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Shankul Vatsa
 * on 27-06-2021
 */
//This improves on the space complexity of the NearToBestSolution.
//Space complexity reduces to exactly constant time O(1), time complexity same as O(N).
public class BestSolution {
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

        for(int i = 0; i < testStr.length()-1; ++i) {

        }

        return true;
    }
}
