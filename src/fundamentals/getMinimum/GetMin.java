package fundamentals.getMinimum;
import java.util.Arrays;

public class GetMin {
    public static int getMin(int a, int b){
        int[] nums = {a, b};
        Arrays.sort(nums);
        int minvalue;
        minvalue = nums[0];
        System.out.println("Minimum value is: " + minvalue);
        return minvalue;
    }

    public static int findMin(int a, int b)
    {
        int minvalue = Math.min(a, b);
        return minvalue;
    }

    public static int findMin2(int a, int b, int c)
    {
        int minvalue =  findMin(findMin(a,b),c);
        return minvalue;
    }

    public static int findMin3(int a, int b, int c,int d)
    {
        int minvalue =  findMin(findMin2(a,b,c),d);
        System.out.println("Minimum value is: " + minvalue);
        return minvalue;
    }

    public static int getMin(int a, int b, int c){
        int[] nums = {a, b, c};
        Arrays.sort(nums);
        int minvalue;
        minvalue = nums[0];
        System.out.println("Minimum value is: " + minvalue);
        return minvalue;
    }

    public static int getMin(int a, int b, int c, int d){
        int[] nums = {a, b, c, d};
        Arrays.sort(nums);
        int minvalue;
        minvalue = nums[0];
        System.out.println("Minimum value is: " + minvalue);
        return minvalue;
    }

}
