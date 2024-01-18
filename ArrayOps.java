public class ArrayOps {
    public static void main(String[] args) {
        int[] testCase1 = {2, 8, 3, 7, 8};
        System.out.println(secondMaxValue(testCase1));
    }

    public static int findMissingInt(int[] array) {
        int n = array.length;

        for (int i = 0; i <= n; i++) {
            boolean number = false;
            for (int j = 0; j < n; j++) {
                if (array[j] == i) {
                    number = true;
                    break;
                }
            }
            if (!number) {
                return i;
            }
        }
        return 1;
    }

    public static int secondMaxValue(int[] array) {
        int l = array.length;
        int large = Integer.MIN_VALUE;
        int Slarge = Integer.MIN_VALUE;

        for (int i = 0; i < l; ++i) {
            if (array[i] > large) {
                Slarge = large;
                large = array[i];
            } else if (array[i] > Slarge && array[i] != large) {
                Slarge = array[i];
            }
        }
        return Slarge;
    }

    public static boolean containsTheSameElements(int[] array1, int[] array2) {
        int n = array1.length;
        int m = array2.length;

        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < m; j++) {
                if (array1[i] == array2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }

        for (int j = 0; j < m; j++) {
            boolean found = false;
            for (int i = 0; i < n; i++) {
                if (array2[j] == array1[i]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(int[] array) {
        if (array.length <= 1) {
            return true;
        }

        boolean ascending = array[0] < array[1];

        for (int i = 1; i < array.length; i++) {
            if ((ascending && array[i - 1] > array[i]) || (!ascending && array[i - 1] < array[i])) {
                return false;
            }
        }
        return true;
    }
}
