public class HospitalEmergency {
    public static int findKthHighestPriority(int[] arr, int k) {
        // Converting k-th highest into index placement for ascending ranking logic
        return quickSelect(arr, 0, arr.length - 1, arr.length - k);
    }

    private static int quickSelect(int[] arr, int low, int high, int targetIdx) {
        if (low == high) return arr[low];
        int pivotIdx = partition(arr, low, high);
        
        if (pivotIdx == targetIdx) return arr[pivotIdx];
        else if (pivotIdx < targetIdx) return quickSelect(arr, pivotIdx + 1, high, targetIdx);
        else return quickSelect(arr, low, pivotIdx - 1, targetIdx);
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
            }
        }
        int temp = arr[i + 1]; arr[i + 1] = arr[high]; arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] priorities = {10, 30, 15, 50, 40};
        int k = 2;
        System.out.println("K-th highest emergency tracking rank: " + findKthHighestPriority(priorities, k));
    }
}