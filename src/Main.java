// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int []nums1={-1,0,3,5,9,12};
        int target1=9;
        int []nums2={-1,0,3,5,9,12};
        int target2=2;
        Solution sol=new Solution();
        System.out.println(sol.search(nums1,target1));
        System.out.println(sol.search(nums2,target2));
    }
}