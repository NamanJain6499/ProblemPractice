package InterviewBitPractice.Hashing;

import java.util.HashMap;

public class ColorfulNumber {
    public static void main(String args[]) {
        ColorfulNumber number = new ColorfulNumber();
        int A = 3245;
        int answer = number.colorful(A);
        System.out.println(answer);
    }

    private int colorful(int A) {
        if (A < 10) {
            return 1;
        }
        //here convert integer to string
        String colorString = String.valueOf(A);
        //convert to string as there is no length of integer variable but length of string is correct expression
        int len = colorString.length();
        HashMap<String, Integer> colormap = new HashMap<>();
        for (int i = 1; i <= len; i++) {
            //As we want contingous substring hence here i represent length of substring and
            for (int j = 0; i + j <= len; j++) {
                String sub = colorString.substring(j, j + i);
                int product = getProduct(Integer.parseInt(sub));
                if (colormap.containsValue(product)) {
                    return 0;
                } else
                    colormap.put(sub, product);
            }
        }
        return 1;
    }

    private int getProduct(int number) {
        int product = 1;
        if (number < 10) {
            return number;
        }
        while (number > 0) {
            product *= number % 10;
            number /= 10;
        }
        return product;
    }
}
