class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {

        int n = arr1.length;
        int m = arr2.length;

        int[] arr3 = new int[n + m];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }

        while (i < n) arr3[k++] = arr1[i++];
        while (j < m) arr3[k++] = arr2[j++];


        int len = n + m;

        if (len % 2 == 0) {
            int mid1 = len/2 - 1;
            int mid2 = len/2;
            return (arr3[mid1] + arr3[mid2]) / 2.0;
        } else {
            int mid = len/2;
            return arr3[mid];
        }
    }
}