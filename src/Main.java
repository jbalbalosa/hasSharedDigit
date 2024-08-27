public class Main {
    public static void main(String[] args) {
        System.out.println("hasSharedDigit Method!");

        System.out.println(hasSharedDigit (12,23));
        System.out.println(hasSharedDigit (9,99));
        System.out.println(hasSharedDigit (15,55));
        System.out.println(hasSharedDigit (12,13));

    }

    public static boolean hasSharedDigit(int num1, int num2){
       if(num1 < 10 || num1 > 99){   //test num1 if within the range.
           return false;               // Invalid input: numbers should be between 10 and 99
       }
       if(num2 < 10 || num2 > 99){   //test num2 if within the range.
           return false;            // Invalid input: numbers should be between 10 and 99
       }

       String num1Str = String.valueOf(num1);
       String num2Str = String.valueOf(num2);

        // Check for shared digits
        for (char digit1 : num1Str.toCharArray()) {
            for (char digit2 : num2Str.toCharArray()) {
                if (digit1 == digit2) {
                    return true; // Shared digit found
                }
            }
        }

        return false;
    }
}
