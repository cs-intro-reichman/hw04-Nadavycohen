public class StringOps {
    
    public static void main(String[] args) {
    }
    public static String capVowelsLowRest (String string) {
        int n = string.length();
        for (int i = 0; i < n; i++) {
            if (string.charAt(i) != 'A' && string.charAt(i) != 'E' && string.charAt(i) != 'I' && string.charAt(i) != 'O' && string.charAt(i) != 'U') {
                if (string.charAt(i) != 'a' && string.charAt(i) != 'e' && string.charAt(i) != 'i' && string.charAt(i) != 'o' && string.charAt(i) != 'u' && string.charAt(i) != ' ') {
                    if ( string.charAt(i) >= 65 && string.charAt(i) <= 90) {
                        string = string.substring(0, i) + (char) (string.charAt(i) + 32) + string.substring(i + 1);
                    }
                } else if (string.charAt(i) != ' ') {
                    string = string.substring(0, i) + (char) (string.charAt(i) - 32) + string.substring(i + 1);
                }
            }
        }
        return string;
    }
    public static String camelCase (String string) {
        int n = string.length();
        boolean nword = false;
        boolean first = true;
        for (int i = 0; i < n; i++) {
            if (nword == true && string.charAt(i) != ' ') {
                if (string.charAt(i) >= 97 && string.charAt(i) <= 122) {
                    string = string.substring(0, i) + (char) (string.charAt(i) - 32) + string.substring(i + 1);
                }
                nword = false;
            } else if (string.charAt(i) >= 65 && string.charAt(i) <= 90) {
                    string = string.substring(0, i) + (char) (string.charAt(i) + 32) + string.substring(i + 1);
                    first = false;
            } else if (string.charAt(i) == ' ' && first == false) {
                string = string.substring(0, i) + string.substring(i + 1);
                n--; // necessary to prevent out of bounds
                i--; //
                nword = true;
            } else if (string.charAt(i) == ' ') {
                string = string.substring(0, i) + string.substring(i + 1);
                n--;
                i--;
            }
        }
        return string;
    }

    public static int[] allIndexOf (String string, char chr) {
        int n = string.length();
        int size = 0;

        for (int i = 0; i < n; i++) {
            if (string.charAt(i) == chr) {
                size++;
            }
        }
        int[] array = new int[size];
        for (int i = 0, j = 0; i < n; i++) {
            if (string.charAt(i) == chr) {
                array[j++] = i;
            }
        }

        return array;
    }
}
