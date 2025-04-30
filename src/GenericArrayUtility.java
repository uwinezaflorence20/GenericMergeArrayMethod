import java.util.Arrays;

public class GenericArrayUtility {
    public static <T> T[] mergeArrays(T[] a, T[] b) {
        if (a == null && b == null) {
            return null;
        }
        if (a == null) {
            return Arrays.copyOf(b, b.length);
        }
        if (b == null) {
            return Arrays.copyOf(a, a.length);
        }


        T[] result = Arrays.copyOf(a, a.length + b.length);
        for (int i = 0; i < b.length; i++) {
            result[a.length + i] = b[i];
        }
        return result;
    }
}
