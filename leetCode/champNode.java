package leetCode;

public class champNode {
    public int findChampion(int n, int[][] edges) {
        int[] inDegree = new int[n];

        // Calculate in-degrees for each node
        for (int[] edge : edges) {
            inDegree[edge[1]]++; // Increment in-degree for destination node
        }

        int champion = -1;  // Start with no champion
        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0) { // If in-degree is 0, it could be the champion
                if (champion != -1) {
                    return -1; // More than one team has in-degree 0, so no unique champion
                }
                champion = i; // Assign current team as champion
            }
        }
        return champion; 
    }

    public static void main(String[] args) {
        champNode cn = new champNode();
        
        
        int[][] edges1 = {{0, 1}, {1, 2}};
        System.out.println(cn.findChampion(3, edges1)); 
        
        
    }
}
