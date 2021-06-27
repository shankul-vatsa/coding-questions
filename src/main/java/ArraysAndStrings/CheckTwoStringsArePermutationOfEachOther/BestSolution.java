package ArraysAndStrings.CheckTwoStringsArePermutationOfEachOther;

/**
 * @author Shankul Vatsa
 * on 27-06-2021
 */
//O(N) time and O(1) space complexity
public class BestSolution {
    public static void main(String[] args) {
        final String firstStr = "abbcd";
        final String secondStr = "dbbca";

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

        boolean[] dupTestArr = new boolean[128];

        for (int i = 0; i < firstStr.length(); ++i) {
            dupTestArr[firstStr.charAt(i)] = true;
        }

        for (int i = 0; i < secondStr.length(); ++i) {
            //If we see ith index of the boolean array set to false,
            //it means this char is extra in 2nd string and hence not a permutation.
            if (!dupTestArr[secondStr.charAt(i)]) {
                return false;
            }
        }
        return true;
    }
}
