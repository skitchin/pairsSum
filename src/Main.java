/**
 * The Main class provides a method to find a pair of numbers from a given array
 * whose sum equals a specified target value.
 */
public class Main {

    /**
     * The array of integers used for finding the pair.
     */
    private static int[] nums = new int[]{1, 2, 3, 4, 5, 6};

    /**
     * The target sum that the pair of numbers should achieve.
     */
    private static int target = 9;

    /**
     * Finds a pair of integers from the given array whose sum equals the target.
     *
     * @param num    The array of integers to search for a pair.
     * @param target The target sum to achieve with the pair.
     * @return An array containing the pair of integers if found; otherwise, null.
     */
    public static int[] getSum(int[] num, int target) {
        for (int i : num) {
            for (int j : num) {
                if (i + j == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    /**
     * The main method of the program. Invokes the getSum method and prints the result.
     *
     * @param args Command-line arguments (unused in this implementation).
     */
    public static void main(String[] args) {
        int[] result = getSum(nums, target);

        if (result != null) {
            System.out.println("Found: " + result[0] + " + " + result[1] + " = " + target);
        } else {
            System.out.println("Not found!");
        }
    }
}
