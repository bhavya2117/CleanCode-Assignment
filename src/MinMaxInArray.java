public final class MinMaxInArray {
    private MinMaxInArray() {
    }

    /* Class Pair is used to return two values from getMinMaxFunction*/
    static class PairOfNumber {

        /**
         * Minimum number.
         */
        private int minimum;
        /**
         * Maximum number.
         */
        private int maximum;
    }

    static PairOfNumber getMinMaxFunction(final int[] arr, final int totalNumberOfElement) {
        PairOfNumber minMaxPair = new PairOfNumber();
        int i;

        /*If there is only one element then return it as min and max both*/
        if (totalNumberOfElement == 1) {
            minMaxPair.maximum = arr[0];
            minMaxPair.minimum = arr[0];
            return minMaxPair;
        }
        /* If there are more than one element, then initialize min and max*/
        if (arr[0] > arr[1]) {
            minMaxPair.maximum = arr[0];
            minMaxPair.minimum = arr[1];
        } else {
            minMaxPair.maximum = arr[1];
            minMaxPair.minimum = arr[0];
        }

        for (i = 2; i < totalNumberOfElement; i++) {
            if (arr[i] > minMaxPair.maximum) {
                minMaxPair.maximum = arr[i];
            } else if (arr[i] < minMaxPair.minimum) {
                minMaxPair.minimum = arr[i];
            }
        }

        return minMaxPair;
    }

    /**
     * @param args
     */
    public static void main(final String[] args) {
        int[] array = {1000, 11, 445, 1, 330, 3000};
        int arraySize = 6;
        PairOfNumber pairOfNumber = getMinMaxFunction(array, arraySize);
        System.out.printf("\nMinimum element in the array is %d", pairOfNumber.minimum);
        System.out.printf("\nMaximum element in the array is %d", pairOfNumber.maximum);
    }
}
