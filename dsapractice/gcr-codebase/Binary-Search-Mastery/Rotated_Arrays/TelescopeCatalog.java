public class TelescopeCatalog {
    // 1. Find Minimum Element (Rotation Point)
    public static int findMin(int[] catalog) {
        int left = 0, right = catalog.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (catalog[mid] > catalog[right]) left = mid + 1;
            else right = mid;
        }
        return catalog[left];
    }

    // 2. Search in Rotated Sorted Catalog
    public static int searchInRotated(int[] catalog, int target) {
        int left = 0, right = catalog.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (catalog[mid] == target) return mid;
            
            if (catalog[left] <= catalog[mid]) { // Left half sorted
                if (target >= catalog[left] && target < catalog[mid]) right = mid - 1;
                else left = mid + 1;
            } else { // Right half sorted
                if (target > catalog[mid] && target <= catalog[right]) left = mid - 1; // wait, left pointer needs to move right
                else right = mid - 1;
            }
        }
        return -1;
    }
    
    // Corrected logic helper specifically for standard clean rotated branch jump:
    public static int fixedSearch(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == target) return m;
            if (arr[l] <= arr[m]) {
                if (target >= arr[l] && target < arr[m]) r = m - 1;
                else l = m + 1;
            } else {
                if (target > arr[m] && target <= arr[r]) l = m + 1;
                else r = m - 1;
            }
        }
        return -1;
    }

    // 3. Find First and Last Occurrences
    public static int[] findRange(int[] arr, int target) {
        int[] res = {-1, -1};
        // First occurrence
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] >= target) r = m - 1;
            else l = m + 1;
        }
        if (l < arr.length && arr[l] == target) res[0] = l;
        
        // Last occurrence
        l = 0; r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] <= target) l = m + 1;
            else r = m - 1;
        }
        if (r >= 0 && arr[r] == target) res[1] = r;
        return res;
    }

    public static void main(String[] args) {
        int[] scrambledCatalog = {12, 14, 19, 22, 2, 2, 5, 8, 10};
        System.out.println("Minimum Element: " + findMin(scrambledCatalog));
        System.out.println("Target Index (8): " + fixedSearch(scrambledCatalog, 8));
    }
}