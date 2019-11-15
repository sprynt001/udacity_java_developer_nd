import java.lang.reflect.Array;
import java.util.Arrays;
import java.lang.Integer;
import java.lang.Math;

public class BinarySearch {
    private Object value;
    private int length;
    private int nIterations = -1;

    public void setValue(int[] input) {
        this.value = Array.newInstance(Integer.class, input.length);
        for (int i = 0; i < input.length; i++)
            Array.set(this.value, Integer.valueOf(i), input[i]);
        this.length = input.length;
        return;
    }

    public void printValue() {
        System.out.print("Values in object are: ");
        System.out.println(Arrays.toString((Object[]) this.value));
        return;
    }

    public int findTarget(int target) {
        // Use binary search to find target
        int startIndex = 0;
        int endIndex = this.length - 1;
        int index = startIndex + (int) Math.floor((endIndex - startIndex) / 2.0);
        this.nIterations = 0;
        // To prevent being stuck in the loop if value not found
        int lastIndex = -1;

        while (index >= 0 && index < this.length && index != lastIndex) {
            this.nIterations += 1;
            lastIndex = index;
            if ((int) Array.get(this.value, index) == target) {
                return index;
            } else if ((int) Array.get(this.value, index) > target) {
                endIndex = index;
            } else {
                startIndex = index;
            }
            index = startIndex + (int) Math.floor((endIndex - startIndex) / 2.0);
        }

        return -1;
    }

    public int nIterations() {
        return this.nIterations;
    }
}
