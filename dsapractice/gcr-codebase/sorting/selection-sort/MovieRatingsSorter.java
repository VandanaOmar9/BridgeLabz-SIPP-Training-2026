public class MovieRatingsSorter {
    public static void sortRatings(int[] ratings) {
        int n = ratings.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) if (ratings[j] < ratings[min]) min = j;
            int temp = ratings[min]; ratings[min] = ratings[i]; ratings[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {8, 5, 9, 7, 6, 10};
        sortRatings(arr);
        for (int val : arr) System.out.print(val + " ");
    }
}