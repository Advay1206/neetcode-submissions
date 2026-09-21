class Solution {
    public int countComponents(int n, int[][] edges) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] pair : edges){
            map.computeIfAbsent(
                pair[0], k-> new ArrayList<>()
            ).add(pair[1]);
            map.computeIfAbsent(
                pair[1], k-> new ArrayList<>()
            ).add(pair[0]);
        }
        int res = 0;
        Set<Integer> visited = new HashSet<>();
        for (int i = 0; i < n; i++){
            if (dfs(map, n, visited, i)){
                res++;
            }
        }
        return res;
    }
    private boolean dfs(Map<Integer, List<Integer>> adj, int n, Set<Integer> visited, int curr){
        if (visited.contains(curr)){
            return false;
        }
        visited.add(curr);
        for (int neigh: adj.getOrDefault(curr, Collections.emptyList())){
            dfs(adj, n, visited, neigh);
        }
        return true;
    }
}