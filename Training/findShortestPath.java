import java.util.*;

public class findShortestPath {
    private int V, E, colorNumber;
    private int[][] paths, pairs;

    findShortestPath(int V, int E, int[][] paths, int[][] pairs, int colorNumber) {
        this.V = V;
        this.E = E;
        this.paths = paths;
        this.pairs = pairs;
        this.colorNumber = colorNumber;
    }

    int[] processData() {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        int[] prev = new int[V];
        Arrays.fill(prev, -1);
        boolean[] visited = new boolean[V];

        int src = pairs[colorNumber - 1][0];
        int dst = pairs[colorNumber - 1][1];
        dist[src] = 0;

        for (int i = 0; i < V; i++) {
            int u = -1, min = Integer.MAX_VALUE;
            for (int j = 0; j < V; j++) {
                if (!visited[j] && dist[j] < min) {
                    min = dist[j];
                    u = j;
                }
            }
            if (u == -1) break;
            visited[u] = true;

            for (int[] edge : paths) {
                if (edge[0] == u || edge[1] == u) {
                    int v = (edge[0] == u) ? edge[1] : edge[0];
                    if (!visited[v] && dist[u] + edge[2] < dist[v]) {
                        dist[v] = dist[u] + edge[2];
                        prev[v] = u;
                    }
                }
            }
        }

        List<Integer> path = new ArrayList<>();
        for (int at = dst; at != -1; at = prev[at]) {
            path.add(at);
            if (at == src) break;
        }

        if (path.get(path.size() - 1) != src) return new int[0]; // No path found

        Collections.reverse(path);
        int[] result = path.stream().mapToInt(i -> i).toArray();
        return result;
    }

    public void printResult() {
        int[] result = this.processData();
        if (result.length == 0) {
            System.out.println("No path found");
        } else {
            for (int i : result) System.out.print(i);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();

        int[][] paths = new int[E][3];
        for (int i = 0; i < E; i++)
            for (int j = 0; j < 3; j++)
                paths[i][j] = sc.nextInt();

        List<Integer> flatList = new ArrayList<>();
        while (sc.hasNextInt()) flatList.add(sc.nextInt());

        int colorNumber = flatList.remove(flatList.size() - 1);
        int[][] pairs = new int[flatList.size() / 2][2];
        for (int i = 0; i < pairs.length; i++) {
            pairs[i][0] = flatList.get(2 * i);
            pairs[i][1] = flatList.get(2 * i + 1);
        }

        new findShortestPath(V, E, paths, pairs, colorNumber).printResult();
    }
}
