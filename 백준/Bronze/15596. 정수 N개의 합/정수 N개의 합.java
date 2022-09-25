import java.io.*;
import java.util.Arrays;

public class Test {
    long sum(int[] a) {
        long ans = Arrays.stream(a).mapToLong(i->i).sum();
        return ans;
    }
}
