class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] n = new int[nums1.length + nums2.length];
        int x = 0;

        // Merging the two arrays
        for (int i = 0; i < nums1.length; i++) {
            n[x] = nums1[i];
            x++;
        }
        for (int i = 0; i < nums2.length; i++) {
            n[x] = nums2[i];
            x++;
        }

        // Sorting the merged array
        java.util.Arrays.sort(n);

        // Calculating the median
        if (n.length % 2 == 1) {
            // Odd length, return the middle element
            return n[n.length / 2];
        } else {
            // Even length, return the average of the two middle elements
            int mid1 = n.length / 2 - 1;
            int mid2 = n.length / 2;
            return (n[mid1] + n[mid2]) / 2.0;
        }
    }
}

