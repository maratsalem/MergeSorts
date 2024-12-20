class mergeSort2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // First make lengths for arrays, mid1 for num1, mid2 for num2
        int mid1 = m - 1;
        int mid2 = n - 1;
        // Right pointer for the end of nums1
        int right = m + n - 1;

        // While the second array still has an index (still has values)
        while (mid2 >= 0) {
            // If the first array also has values AND nums1[mid1] > nums2[mid2]
            if (mid1 >= 0 && nums1[mid1] > nums2[mid2]) {
                nums1[right] = nums1[mid1];
                mid1--;
            } else {
                nums1[right] = nums2[mid2];
                mid2--;
            }
            right--;
        }
    }

    public static void main(String[] args) {
        // Example input
        int[] nums1 = {1, 2, 3, 0, 0, 0}; // nums1 has extra space for nums2 (m+n)
        int m = 3; // Number of *valid* elements in nums1
        int[] nums2 = {2, 5, 6};
        int n = 3; // Number of elements in nums2

        // Create an instance of mergeSort1
        mergeSort2 sorter = new mergeSort2();

        // Call the merge method
        sorter.merge(nums1, m, nums2, n);

        // Print the merged array
        System.out.println("Merged array:");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
