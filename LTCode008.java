class LTCode008 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
public static void main(String[] args) {
    LTCode008 solution = new LTCode008();
    int[] nums1 = new int[6]; 
    nums1[0] = 1;
    nums1[1] = 2;
    nums1[2] = 3;
    int m = 3; 
    int[] nums2 = {2, 5, 6};
    int n = 3;
    System.out.println("Before merge:");
    System.out.print("nums1: ");
    for (int num : nums1) System.out.print(num + " ");
    System.out.println();
    System.out.print("nums2: ");
    for (int num : nums2) System.out.print(num + " ");
    System.out.println();
    solution.merge(nums1, m, nums2, n);
    System.out.println("\nAfter merge:");
    System.out.print("nums1: ");
    for (int num : nums1) System.out.print(num + " ");
    System.out.println();
}
}