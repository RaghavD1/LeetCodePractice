
class Solution {
    public int minSetSize(int[] arr) 
    {
        HashMap<Integer,Integer> m = new HashMap<>();

        // Count frequency
        for(int i = 0; i < arr.length; i++)
        {
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
        }

        // Max heap based on frequency
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> b[1] - a[1]
        );

        // Insert elements and their frequencies
        for(Map.Entry<Integer,Integer> entry : m.entrySet())
        {
            pq.offer(new int[]{entry.getKey(), entry.getValue()});
        }

        int removed = 0;
        int count = 0;
        int target = arr.length / 2;

        // Remove highest frequencies first
        while(removed < target)
        {
            int[] curr = pq.poll();

            removed += curr[1];
            count++;
        }

        return count;
    }
}
