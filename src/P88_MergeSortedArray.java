public class P88_MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = 0;
        int b = 0;
        while (a < m + b && b < n) {
            if (nums2[b] < nums1[a]) {
                for (int i = m + b; i > a; i--)
                    nums1[i] = nums1[i - 1];
                nums1[a] = nums2[b++];
            }
            a++;
        }

        while (b < n)
            nums1[a++] = nums2[b++];
    }

}
