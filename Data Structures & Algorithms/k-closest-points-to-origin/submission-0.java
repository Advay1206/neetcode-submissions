class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((p1, p2) -> {
            int dist1 = p1[0] * p1[0] + p1[1] * p1[1]; // x^2 + y^2 for point 1
            int dist2 = p2[0] * p2[0] + p2[1] * p2[1]; // x^2 + y^2 for point 2
            return Integer.compare(dist1, dist2);      // Ascending order
        });
        for (int[] point : points){
            pq.offer(point);
        }
        int [][] res = new int[k][2];
        for (int i = 0; i < k; i++){
            res[i] = pq.poll();
        }
        return res;
    }
}
