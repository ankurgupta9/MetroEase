// package com.MetroEase.MetroEase.services;
// import org.springframework.stereotype.Service;

// import java.util.*;

// @Service
// public class MetroServices {

//     static class Edge {
//         int dest;
//         int weight;

//         Edge(int dest, int weight) {
//             this.dest = dest;
//             this.weight = weight;
//         }
//     }

//     static class Node implements Comparable<Node> {
//         int vertex, key;

//         Node(int vertex, int key) {
//             this.vertex = vertex;
//             this.key = key;
//         }

//         @Override
//         public int compareTo(Node other) {
//             return Integer.compare(this.key, other.key);
//         }
//     }

//     private final List<List<Edge>> graph;
//     private final int v = 5;  // Number of vertices

//     public MetroServices() {
//         // Initialize the graph
//         graph = new ArrayList<>();
//         for (int i = 0; i < v; i++) {
//             graph.add(new ArrayList<>());
//         }

//         // Add edges (this should represent your metro stations)
//         graph.get(0).add(new Edge(1, 1));
//         graph.get(0).add(new Edge(2, 1));
//         graph.get(1).add(new Edge(0, 1));
//         graph.get(1).add(new Edge(3, 1));
//         graph.get(1).add(new Edge(2, 1));
//         graph.get(1).add(new Edge(4, 1));
//         graph.get(2).add(new Edge(0, 1));
//         graph.get(2).add(new Edge(1, 1));
//         graph.get(2).add(new Edge(3, 1));
//         graph.get(3).add(new Edge(1, 1));
//         graph.get(3).add(new Edge(2, 1));
//         graph.get(3).add(new Edge(4, 1));
//         graph.get(4).add(new Edge(1, 1));
//         graph.get(4).add(new Edge(3, 1));
//     }

//     public String findShortestRoute(int source, int destination) {
//         return dijkstraAlgorithm(source, destination);
//     }

//     private String dijkstraAlgorithm(int source, int destination) {
//         PriorityQueue<Node> dj = new PriorityQueue<>();
//         int dist[] = new int[v];
//         int parent[] = new int[v];
//         boolean visited[] = new boolean[v];

//         Arrays.fill(dist, Integer.MAX_VALUE);
//         dist[source] = 0;
//         parent[source] = -1;

//         dj.add(new Node(source, dist[source]));

//         while (!dj.isEmpty()) {
//             Node node = dj.poll();
//             int u = node.vertex;
//             visited[u] = true;

//             if (u == destination) {
//                 break;
//             }

//             for (Edge edge : graph.get(u)) {
//                 int V = edge.dest;
//                 int weight = edge.weight;

//                 if (!visited[V] && dist[u] + weight < dist[V]) {
//                     dist[V] = dist[u] + weight;
//                     dj.add(new Node(V, dist[V]));
//                     parent[V] = u;
//                 }
//             }
//         }

//         return formatPath(parent, destination, dist[destination]);
//     }

//     private String formatPath(int[] parent, int destination, int totalDistance) {
//         StringBuilder path = new StringBuilder();
//         printPaths(parent, destination, path);
//         return path.append(" | Total distance: ").append(totalDistance).toString();
//     }

//     private void printPaths(int[] parent, int destination, StringBuilder path){
//         if(destination == -1){
//             return;
//         }
//         printPaths(parent, parent[destination], path);
//         path.append(destination).append("-> ");
//     }
// }

package com.MetroEase.MetroEase.services;

// import com.MetroEase.MetroEase.services.StationData;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MetroServices {

    static class Edge {
        int dest;
        int weight;

        Edge(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }

    static class Node implements Comparable<Node> {
        int vertex; // represents station index
        int key; // current shortest distance from source

        Node(int vertex, int key) {
            this.vertex = vertex;
            this.key = key;
        }

        @Override
        public int compareTo(Node other) { // sort nodes by their key value
            return Integer.compare(this.key, other.key);
        }
    }

    private final List<List<Edge>> graph;
    private final int v = 87; // Number of stations +1 (because index stating from 0)

    public MetroServices() {
        // Initialize the graph
        graph = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges (Red Line connections)
        addEdge(0, 1, 1);
        addEdge(1, 2, 1);
        addEdge(2, 3, 1);
        addEdge(3, 4, 1);
        addEdge(4, 5, 1);
        addEdge(5, 6, 1);
        addEdge(6, 7, 1);
        addEdge(7, 8, 1);
        addEdge(8, 9, 1);
        addEdge(9, 10, 1);
        addEdge(10, 11, 1);
        addEdge(11, 12, 1);
        addEdge(12, 13, 1);
        addEdge(13, 14, 1);
        addEdge(14, 15, 1);
        addEdge(15, 16, 1);
        addEdge(16, 17, 1);
        addEdge(17, 18, 1);
        addEdge(18, 19, 1);
        addEdge(19, 20, 1);
        addEdge(20, 21, 1);
        addEdge(21, 22, 1);
        addEdge(22, 23, 1);
        addEdge(23, 24, 1);
        addEdge(24, 25, 1);
        addEdge(25, 26, 1);
        addEdge(26, 27, 1);
        addEdge(27, 28, 1);

        // Add edges (Blue Line connections)
        addEdge(29, 30, 1); // Dwarka Sector 21 to Dwarka Sector 8
        addEdge(30, 31, 1); // Dwarka Sector 8 to Dwarka Sector 9
        addEdge(31, 32, 1); // Dwarka Sector 9 to Dwarka Sector 10
        addEdge(32, 33, 1); // Dwarka Sector 10 to Dwarka Sector 11
        addEdge(33, 34, 1); // Dwarka Sector 11 to Dwarka Sector 12
        addEdge(34, 35, 1); // Dwarka Sector 12 to Dwarka Sector 13
        addEdge(35, 36, 1); // Dwarka Sector 13 to Dwarka Sector 14
        addEdge(36, 37, 1); // Dwarka Sector 14 to Dwarka
        addEdge(37, 38, 1); // Dwarka to Dwarka Mor
        addEdge(38, 39, 1); // Dwarka Mor to Nawada
        addEdge(39, 40, 1); // Nawada to Uttam Nagar West
        addEdge(40, 41, 1); // Uttam Nagar West to Uttam Nagar East
        addEdge(41, 42, 1); // Uttam Nagar East to Janakpuri West (Interchange with Magenta Line)
        addEdge(42, 43, 1); // Janakpuri West to Janakpuri East
        addEdge(43, 44, 1); // Janakpuri East to Tilak Nagar
        addEdge(44, 45, 1); // Tilak Nagar to Subhash Nagar
        addEdge(45, 46, 1); // Subhash Nagar to Tagore Garden
        addEdge(46, 47, 1); // Tagore Garden to Rajouri Garden (Interchange with Pink Line)
        addEdge(47, 48, 1); // Rajouri Garden to Ramesh Nagar
        addEdge(48, 49, 1); // Ramesh Nagar to Moti Nagar
        addEdge(49, 50, 1); // Moti Nagar to Kirti Nagar
        addEdge(50, 51, 1); // Kirti Nagar to Shadipur
        addEdge(51, 52, 1); // Shadipur to Patel Nagar
        addEdge(52, 53, 1); // Patel Nagar to Rajendra Place
        addEdge(53, 54, 1); // Rajendra Place to Karol Bagh
        addEdge(54, 55, 1); // Karol Bagh to Jhandewalan
        addEdge(55, 56, 1); // Jhandewalan to R. K. Ashram Marg
        addEdge(56, 57, 1); // R. K. Ashram Marg to Rajiv Chowk (Interchange with Yellow Line)
        addEdge(57, 58, 1); // Rajiv Chowk to Barakhamba
        addEdge(58, 59, 1); // Barakhamba to Mandi House
        addEdge(59, 60, 1); // Mandi House to Pragati Maidan
        addEdge(60, 61, 1); // Pragati Maidan to Indraprastha
        addEdge(61, 62, 1); // Indraprastha to Yamuna Bank
        addEdge(62, 63, 1); // Yamuna Bank to Akshardham (Branch towards Noida electronic city )
        addEdge(63, 64, 1); 
        addEdge(64, 65, 1); 
        addEdge(65, 66, 1); 
        addEdge(66, 67, 1); 
        addEdge(67, 68, 1); 
        addEdge(68, 69, 1);
        addEdge(69, 70, 1); 
        addEdge(70, 71, 1);
        addEdge(71, 72, 1);
        addEdge(72, 73, 1);
        addEdge(73, 74, 1);
        addEdge(74, 75, 1);
        addEdge(75, 76, 1);
        addEdge(76, 77, 1);
        addEdge(77, 78, 1);
        addEdge(62, 80, 1); // Yamuna Bank to Laxmi Nagar (Branch towards Vaishali)
        addEdge(80, 81, 1); // Laxmi Nagar to Nirman Vihar
        addEdge(81, 82, 1); // Nirman Vihar to Preet Vihar
        addEdge(82, 83, 1); // Preet Vihar to Karkarduma
        addEdge(83, 84, 1); // Karkarduma to Anand Vihar (Interchange with Pink Line)
        addEdge(84, 85, 1); // Anand Vihar to Kaushambi
        addEdge(85, 86, 1); // Kaushambi to Vaishali
    }

    // Method to add an edge to the graph
    private void addEdge(int src, int dest, int weight) {
        graph.get(src).add(new Edge(dest, weight));
        graph.get(dest).add(new Edge(src, weight)); // Since this is an undirected graph
    }

    public String findShortestRoute(int source, int destination) {
        return dijkstraAlgorithm(source, destination);
    }

    private String dijkstraAlgorithm(int source, int destination) {
        PriorityQueue<Node> dj = new PriorityQueue<>();
        int dist[] = new int[v];
        int parent[] = new int[v];
        boolean visited[] = new boolean[v];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;
        parent[source] = -1;

        dj.add(new Node(source, dist[source]));

        while (!dj.isEmpty()) {
            Node node = dj.poll();
            int u = node.vertex;
            visited[u] = true;

            if (u == destination) {
                break;
            }

            for (Edge edge : graph.get(u)) {
                int V = edge.dest;
                int weight = edge.weight;

                if (!visited[V] && dist[u] + weight < dist[V]) {
                    dist[V] = dist[u] + weight;
                    dj.add(new Node(V, dist[V]));
                    parent[V] = u;
                }
            }
        }

        return formatPath(parent, destination, dist[destination]);
    }

    private String formatPath(int[] parent, int destination, int totalDistance) {
        StringBuilder path = new StringBuilder();
        printPaths(parent, destination, path);
        return path.append("  Total Stations: ").append(totalDistance).toString();
    }

    private void printPaths(int[] parent, int destination, StringBuilder path) {
        if (destination == -1) {
            return;
        }
        printPaths(parent, parent[destination], path);
        // Use the StationData class to get station names
        path.append(StationData.getStationName(destination)).append(" -> ");
    }
}
