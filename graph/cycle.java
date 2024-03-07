package graph;

import java.util.*;

public class cycle {
    static class Edge {
        int source;
        int destination;
        int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        int vertex = 5;
        // int arr[] = new arr[vertex];
        ArrayList<Edge>[] graph = new ArrayList[vertex];

        for (int i = 0; i < vertex; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 vertex
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        graph[0].add(new Edge(0, 3, 1));

        // 1 vertex
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 2, 1));

        // 2 vertex
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 1, 1));

        // 3 vertex
        graph[3].add(new Edge(3, 0, 1));
        graph[3].add(new Edge(3, 4, 1));

        // 4 vertex
        graph[4].add(new Edge(4, 3, 1));

        System.out.println(detectCycle(graph));
    }

    public static boolean detectCycle(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (dfsUtil(graph, i, vis, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfsUtil(ArrayList<Edge>[] graph, int curr, boolean vis[], int parent) {
        // visit
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.destination]) {
                if (dfsUtil(graph, e.destination, vis, curr)) {
                    return true;
                }
            } else if (vis[e.destination] && e.destination != parent) {
                return true;
            }

        }
        return false;

    }
}
