public class ArrayOps {
    public static void main(String[] args) {
    }
    
    public static int findMissingInt (int [] array) {
        int n = array.length;
        int sum  = n * (n + 1) / 2;
        for (int i = 0; i < n; i++) {
            sum-= array[i];
        }
        return sum;
    }

    public static int secondMaxValue(int [] array) {
        int n = array.length;
        int max = 0;
        int max2 = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] >= max) {
                max2 = max;
                max = array[i];
            }
        }
        return max2;
    }
    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        int n = array1.length;
        int m = array2.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array1[i] == array2[j]) {
                    break;
                }
                else if (j == m - 1) {
                    return false;
                }
            }
        }
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                if (array2[j] == array1[i]) {
                    break;
                }
                else if (i == n - 1) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isSorted(int [] array) {
        int n = array.length;
        boolean increasing = array[0] < array[1];

        for (int i = 0; i < n - 1; i++) {
            if (array[i] > array[i + 1] && increasing == true) {
                return false;
            } else if (array[i] < array[i + 1] && increasing == false) {
                return false;
            }
        }
        return true;
    }

}
