public class ExamScoresSorter {
    public static void main(String[] args) {
        int[] scores = {45, 89, 72, 56, 91};
        int n = scores.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) if (scores[j] < scores[minIdx]) minIdx = j;
            int temp = scores[minIdx]; scores[minIdx] = scores[i]; scores[i] = temp;
        }
        for (int s : scores) System.out.print(s + " ");
    }
}