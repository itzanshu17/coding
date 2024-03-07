package graph;

import java.util.*;

public class allPath {
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
        int vertex = 6;
        // int arr[] = new arr[vertex];
        ArrayList<Edge>[] graph = new ArrayList[vertex];

        for (int i = 0; i < vertex; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 3, 1));
        // 2 vertex
        graph[2].add(new Edge(2, 3, 1));

        // 3 vertex

        graph[3].add(new Edge(3, 1, 1));

        graph[4].add(new Edge(4, 0, 1));
        graph[4].add(new Edge(4, 1, 1));

        graph[5].add(new Edge(5, 0, 1));
        graph[5].add(new Edge(5, 2, 1));

        allPathSD(graph, 5, 1, "");
    }

    private static void allPathSD(ArrayList<Edge>[] graph, int source, int destination, String path) {
        if (source == destination) {
            System.out.println(path + destination);
            return;
        }

        for (int i = 0; i < graph[source].size(); i++) {
            Edge e = graph[source].get(i);
            allPathSD(graph, e.destination, destination, path + source);
        }
    }
}
