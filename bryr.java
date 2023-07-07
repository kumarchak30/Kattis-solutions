package Kattis_solves;
import java.util.*;

public class bryr {
    public static int minSingleLaneBridges(int n, int m, int[][] roads) {
        // Create a graph with n nodes
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges to the graph
        for (int[] road : roads) {
            int u = road[0] - 1;
            int v = road[1] - 1;
            int w = road[2];
            graph.get(u).add(new int[]{v, w});
            graph.get(v).add(new int[]{u, w});
        }

        // Use Dijkstra's algorithm to find the shortest path from the Westman Islands (node 0) to Egilsstaðir (node n-1)
        int[] distances = new int[n];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[0] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[]{0, 0});
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int u = curr[0];
            int d = curr[1];
            if (d > distances[u]) {
                continue;
            }
            for (int[] edge : graph.get(u)) {
                int v = edge[0];
                int w = edge[1];
                if (distances[v] > distances[u] + w) {
                    distances[v] = distances[u] + w;
                    pq.offer(new int[]{v, distances[v]});
                }
            }
        }

        // Return the shortest distance from the Westman Islands to Egilsstaðir
        return distances[n - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] roads = new int[m][3];
        for (int i = 0; i < m; i++) {
            roads[i][0] = scanner.nextInt();
            roads[i][1] = scanner.nextInt();
            roads[i][2] = scanner.nextInt();
        }
        System.out.println(minSingleLaneBridges(n, m, roads));
    }
}
