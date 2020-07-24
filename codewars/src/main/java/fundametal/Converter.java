package fundametal;

import com.sun.javafx.image.IntPixelGetter;

/**
 * @Author hxchen
 * @Date 2020/7/25
 */
public class Converter {
    public static String numberToString(int num) {
        // Return a string of the number here!
        return num + "";
    }
    public static String numberToString2(int num) {
        // Return a string of the number here!
        return String.valueOf(num);
    }
    public static String numberToString3(int num) {
        // Return a string of the number here!
        return Integer.valueOf(num).toString();
    }
}
