class Solution {
    public String[] findRelativeRanks(int[] score) 
    {
        PriorityQueue<int[]> minh = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        int n = score.length;
        String[] ans = new String[n];

        for(int i = 0; i < n; i++)
        {
            ans[i] = Integer.toString(score[i]);
            minh.offer(new int[]{score[i], i});
        }

        while(!minh.isEmpty())
        {
            if(minh.size() == 3)
            {
                ans[minh.poll()[1]] = "Bronze Medal";
            }
            else if(minh.size() == 2)
            {
                ans[minh.poll()[1]] = "Silver Medal";
            }
            else if(minh.size() == 1)
            {
                ans[minh.poll()[1]] = "Gold Medal";
            }
            else
            {
                ans[minh.peek()[1]] = Integer.toString(minh.size());
                minh.poll();
            }
        }

        return ans;
    }
}