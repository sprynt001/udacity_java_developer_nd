// Class to test binary search implementation for exercise in section 5 lesson 1

//import java.util.ArrayList;

public class Section5TestBinarySearch {
    public static void main(String[] argv) {
        //ArrayList<Integer> target1 = new ArrayList<Integer>({
        //                         1,5,7,8,9,11,18,19,20,25
        //                         });
        int[] target1 = {1, 5, 7, 8, 9, 11, 18, 19, 20, 25};
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.setValue(target1);
        binarySearch.printValue();
        System.out.println("Index for target 10 is : " + binarySearch.findTarget(10));
        System.out.println("Number of iterations: " + binarySearch.nIterations());
        System.out.println("Index for target 1 is : " + binarySearch.findTarget(1));
        System.out.println("Number of iterations: " + binarySearch.nIterations());
        System.out.println("Index for target 19 is : " + binarySearch.findTarget(19));
        System.out.println("Number of iterations: " + binarySearch.nIterations());
        return;
    }
}
