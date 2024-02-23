
//        4. Median of Two Sorted Arrays
//        Solved
//        Hard
//        Topics
//        Companies
//        Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//
//        The overall run time complexity should be O(log (m+n)).
//
//
//
//        Example 1:
//
//        Input: nums1 = [1,3], nums2 = [2]
//        Output: 2.00000
//        Explanation: merged array = [1,2,3] and median is 2.
//        Example 2:
//
//        Input: nums1 = [1,2], nums2 = [3,4]
//        Output: 2.50000
//        Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
//
//

import java.util.ArrayList;
import java.util.Collections;


public class findMedianSortedArrays {


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> mergedArray = new ArrayList<>();

        for (int i : nums1) {
            mergedArray.add(i);
        }

        for (int j : nums2) {
            mergedArray.add(j);
        }

        Collections.sort(mergedArray);
        int position;
        int middle = (mergedArray.size() / 2);
        if (mergedArray.size() % 2 != 0) {
            position = middle;
            return mergedArray.get(position);
        } else {
            double median = ((double) mergedArray.get(middle) + (double) mergedArray.get(middle - 1)) / 2;
            return median;
        }

    }

    public static void main(String[] args) {
        int[] firstArray = {1, 3};
        int[] secondArray = {2};
        System.out.println(findMedianSortedArrays(firstArray, secondArray));
    }

}
