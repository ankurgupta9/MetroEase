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

package com.metroease.metroease.services;

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
        int vertex;  // represents station index
        int key;     // current shortest distance from source

        Node(int vertex, int key) {
            this.vertex = vertex;
            this.key = key;
        }

        @Override
        public int compareTo(Node other) { 
            return Integer.compare(this.key, other.key);
        }
    }

    private final List<List<Edge>> graph;
    private final int v = 265; // Number of stations +1 (because index stating from 0)

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

        // Add edges (Pink Line connections)
        addEdge(87, 88, 1); // Majlis Park to Azadpur (Interchange with Yellow Line)
        addEdge(88, 89, 1); // Azadpur to Shalimar Bagh
        addEdge(89, 23, 1); // Shalimar Bagh to Netaji Subhash Place (Interchange with Red Line)
        addEdge(23, 91, 1); // Netaji Subhash Place to Shakurpur
        addEdge(91, 92, 1); // Shakurpur to Punjabi Bagh West
        addEdge(92, 93, 1); // Punjabi Bagh West to ESI Hospital
        addEdge(93, 47, 1); // ESI Hospital to Rajouri Garden (Interchange with Blue Line)
        addEdge(47, 95, 1); // Rajouri Garden to Mayapuri
        addEdge(95, 96, 1); // Mayapuri to Naraina Vihar
        addEdge(96, 97, 1); // Naraina Vihar to Delhi Cantt.
        addEdge(97, 98, 1); // Delhi Cantt. to Durgabai Deshmukh South Campus (Interchange with Orange Line)
        addEdge(98, 99, 1); // Durgabai Deshmukh South Campus to Sir Vishweshwaraiah Moti Bagh
        addEdge(99, 100, 1); // Sir Vishweshwaraiah Moti Bagh to Bhikaji Cama Place
        addEdge(100, 101, 1); // Bhikaji Cama Place to Sarojini Nagar
        addEdge(101, 102, 1); // Sarojini Nagar to INA (Interchange with Yellow Line)
        addEdge(102, 103, 1); // INA to South Extension
        addEdge(103, 104, 1); // South Extension to Lajpat Nagar (Interchange with Violet Line)
        addEdge(104, 105, 1); // Lajpat Nagar to Vinobapuri
        addEdge(105, 106, 1); // Vinobapuri to Ashram
        addEdge(106, 107, 1); // Ashram to Sarai Kale Khan Nizamuddin
        addEdge(107, 64, 1); // Sarai Kale Khan Nizamuddin to Mayur Vihar I (Interchange with Blue Line)
        addEdge(64, 108, 1); // Mayur Vihar I to Mayur Vihar pocket
        addEdge(108, 109, 1); // Mayur Vihar I pocket to Trilokpuri Sanjay Lake
        addEdge(109, 110, 1); // Trilokpuri Sanjay Lake to Vinod Nagar East
        addEdge(110, 111, 1); // Vinod Nagar East to Mandawali West Vinod Nagar
        addEdge(111, 112, 1); // Mandawali West Vinod Nagar to IP Extension
        addEdge(112, 84, 1); // IP Extension to Anand Vihar (Interchange with Blue Line)
        addEdge(84, 83, 1); // Anand Vihar to Karkarduma (Interchange with Blue Line)
        addEdge(83, 115, 1); // Karkarduma to karkarduma court
        addEdge(115, 116, 1); // Karkarduma court to Krishna Nagar
        addEdge(116, 117, 1); // Krishna Nagar to East Azad Nagar
        addEdge(117, 12, 1); // East Azad Nagar to Welcome (Interchange with Red Line)
        addEdge(12, 119, 1); // Welcome to Jaffrabad
        addEdge(119, 120, 1); // Jaffrabad to Maujpur-Babarpur
        addEdge(120, 121, 1);
        addEdge(121, 122, 1);
        addEdge(122, 123, 1);
        // megenta line
        addEdge(70, 125, 1); // Botanical Garden to Okhla Bird Sanctuary
        addEdge(125, 126, 1); // Okhla Bird Sanctuary to Kalindi Kunj
        addEdge(126, 127, 1); // Kalindi Kunj to Jasola Vihar Shaheen Bagh
        addEdge(127, 128, 1); // Jasola Vihar Shaheen Bagh to Okhla Vihar
        addEdge(128, 129, 1); // Okhla Vihar to Jamia Millia Islamia
        addEdge(129, 130, 1); // Jamia Millia Islamia to Sukhdev Vihar
        addEdge(130, 131, 1); // Sukhdev Vihar to Okhla NSIC
        addEdge(131, 133, 1); // Okhla NSIC to kalkaji mandir
        // addEdge(133, 166, 1); // Kalkaji Mandir to govindpuri (Interchange with Violet Line)
        addEdge(133, 134, 1); // Kalkaji Mandir to Nehru Enclave
        addEdge(134, 135, 1); // Nehru Enclave to Greater Kailash
        addEdge(135, 136, 1); // Greater Kailash to Chirag Delhi
        addEdge(136, 137, 1); // Chirag Delhi to Panchsheel Park
        addEdge(137, 138, 1); // Panchsheel Park to Hauz Khas (Interchange with Yellow Line)
        addEdge(138, 139, 1); // Hauz Khas to IIT Delhi
        addEdge(139, 140, 1); // IIT Delhi to R K Puram
        addEdge(140, 141, 1); // R K Puram to Munirka
        addEdge(141, 142, 1); // Munirka to Vasant Vihar
        addEdge(142, 143, 1); // Vasant Vihar to Shankar Vihar
        addEdge(143, 144, 1); // Shankar Vihar to Terminal 1 IGI Airport
        addEdge(144, 145, 1); // Terminal 1 IGI Airport to Sadar Bazar Cantonment
        addEdge(145, 146, 1); // Sadar Bazar Cantonment to Palam
        addEdge(146, 147, 1); // Palam to Dashrath Puri
        addEdge(147, 148, 1); // Dashrath Puri to Dabri Mor - Janakpuri South
        addEdge(148, 42, 1); // Dabri Mor - Janakpuri South to Janakpuri West (Interchange with Blue Line)

        // voilet line
        addEdge(15, 151, 1); // Kashmere Gate to Red Fort (Interchange with Red and Yellow Line)
        addEdge(151, 152, 1); // Red Fort to Jama Masjid
        addEdge(152, 153, 1); // Jama Masjid to Delhi Gate
        addEdge(153, 154, 1); // Delhi Gate to ITO
        addEdge(154, 59, 1); // ITO to Mandi House (Interchange with Blue Line)
        addEdge(59, 156, 1); // Mandi House to Janpath
        addEdge(156, 157, 1); // Janpath to Central Secretariat (Interchange with Yellow Line)
        addEdge(157, 158, 1); // Central Secretariat to Khan Market
        addEdge(158, 159, 1); // Khan Market to Jawaharlal Nehru Stadium
        addEdge(159, 160, 1); // Jawaharlal Nehru Stadium to Jangpura
        addEdge(160, 104, 1); // Jangpura to Lajpat Nagar (Interchange with Pink Line)
        addEdge(104, 162, 1); // Lajpat Nagar to Moolchand
        addEdge(162, 163, 1); // Moolchand to Kailash Colony
        addEdge(163, 164, 1); // Kailash Colony to Nehru Place
        addEdge(164, 133, 1); // Nehru Place to Kalkaji Mandir (Interchange with Magenta Line)
        addEdge(133, 166, 1); // Kalkaji Mandir to Govind Puri
        addEdge(166, 167, 1); // Govind Puri to Harkesh nagar Okhla
        addEdge(167, 168, 1); // Harkesh nagar Okhla to Jasola Apollo
        addEdge(168, 169, 1); // Jasola Apollo to Sarita Vihar
        addEdge(169, 170, 1); // Sarita Vihar to Mohan Estate
        addEdge(170, 171, 1); // Mohan Estate to Tughlakabad
        addEdge(171, 172, 1); // Tughlakabad to Badarpur Border
        addEdge(172, 173, 1); // Badarpur Border to NHPC Chowk
        addEdge(173, 174, 1); // NHPC Chowk to Mewala Maharajpur
        addEdge(174, 175, 1); // Mewala Maharajpur to Sector 28
        addEdge(175, 176, 1); // Sector 28 to Badkal Mor
        addEdge(176, 177, 1); // Badkal Mor to Old Faridabad
        addEdge(177, 178, 1); // Old Faridabad to Neelam Chowk Ajronda
        addEdge(178, 179, 1); // Neelam Chowk Ajronda to Bata Chowk
        addEdge(179, 180, 1); // Bata Chowk to Escorts Mujesar
        addEdge(180, 181, 1); // Escorts Mujesar to Raja Nahar Singh (Ballabhgarh)

        // yellow line
        addEdge(203, 204, 1); // Samaypur Badli to Rohini Sector 18, 19
        addEdge(204, 205, 1); // Rohini Sector 18, 19 to Haiderpur Badli Mor
        addEdge(205, 206, 1); // Haiderpur Badli Mor to Jahangirpuri
        addEdge(206, 207, 1); // Jahangirpuri to Adarsh Nagar
        addEdge(207, 88, 1); // Adarsh Nagar to Azadpur (Interchange with Pink Line)
        addEdge(88, 209, 1); // Azadpur to Model Town
        addEdge(209, 210, 1); // Model Town to GTB Nagar
        addEdge(210, 211, 1); // GTB Nagar to Vishwavidyalaya
        addEdge(211, 212, 1); // Vishwavidyalaya to Vidhan Sabha
        addEdge(212, 213, 1); // Vidhan Sabha to Civil Lines
        addEdge(213, 15, 1); // Civil Lines to Kashmere Gate (Interchange with Red and Violet Line)
        addEdge(15, 215, 1); // Kashmere Gate to Chandni Chowk
        addEdge(215, 216, 1); // Chandni Chowk to Chawri Bazar
        addEdge(216, 217, 1); // Chawri Bazar to New Delhi (Interchange with Airport Express Line)
        addEdge(217, 57, 1); // New Delhi to Rajiv Chowk (Interchange with Blue Line)
        addEdge(57, 219, 1); // Rajiv Chowk to Patel Chowk
        addEdge(219, 157, 1); // Patel Chowk to Central Secretariat (Interchange with Violet Line)
        addEdge(157, 221, 1); // Central Secretariat to Udyog Bhawan
        addEdge(221, 222, 1); // Udyog Bhawan to Lok Kalyan Marg
        addEdge(222, 223, 1); // Lok Kalyan Marg to Jorbagh
        addEdge(223, 102, 1); // Jorbagh to Dilli Haat INA (Interchange with Pink Line)
        addEdge(102, 225, 1); // Dilli Haat INA to AIIMS
        addEdge(225, 226, 1); // AIIMS to Green Park
        addEdge(226, 138, 1); // Green Park to Hauz Khas (Interchange with Magenta Line)
        addEdge(138, 228, 1); // Hauz Khas to Malviya Nagar
        addEdge(228, 229, 1); // Malviya Nagar to Saket
        addEdge(229, 230, 1); // Saket to Qutab Minar
        addEdge(230, 231, 1); // Qutab Minar to Chhattarpur
        addEdge(231, 232, 1); // Chhattarpur to Sultanpur
        addEdge(232, 233, 1); // Sultanpur to Ghitorni
        addEdge(233, 234, 1); // Ghitorni to Arjan Garh
        addEdge(234, 235, 1); // Arjan Garh to Guru Dronacharya
        addEdge(235, 236, 1); // Guru Dronacharya to Sikandarpur (Interchange with Rapid Metro Gurgaon)
        addEdge(236, 237, 1); // Sikandarpur to MG Road
        addEdge(237, 238, 1); // MG Road to IFFCO Chowk
        addEdge(238, 239, 1); // IFFCO Chowk to HUDA City Centre

        // green line
        addEdge(20, 183, 1); // Inderlok to Ashok Park Main (Interchange with Red Line)
        addEdge(183, 92, 1); // Ashok Park Main to Punjabi Bagh (Interchange with Pink Line)
        addEdge(92, 185, 1); // Punjabi Bagh to Shivaji Park
        addEdge(185, 186, 1); // Shivaji Park to Madipur
        addEdge(186, 187, 1); // Madipur to Paschim Vihar East
        addEdge(187, 188, 1); // Paschim Vihar East to Paschim Vihar West
        addEdge(188, 189, 1); // Paschim Vihar West to Peeragarhi
        addEdge(189, 190, 1); // Peeragarhi to Udyog Nagar
        addEdge(190, 191, 1); // Udyog Nagar to Surajmal Stadium
        addEdge(191, 192, 1); // Surajmal Stadium to Nangloi
        addEdge(192, 193, 1); // Nangloi to Nangloi Railway Station
        addEdge(193, 194, 1); // Nangloi Railway Station to Rajdhani Park
        addEdge(194, 195, 1); // Rajdhani Park to Mundka
        addEdge(195, 196, 1); // Mundka to Mundka Industrial Area
        addEdge(196, 197, 1); // Mundka Industrial Area to Ghevra
        addEdge(197, 198, 1); // Ghevra to Tikri Kalan
        addEdge(198, 199, 1); // Tikri Kalan to Tikri Border
        addEdge(199, 200, 1); // Tikri Border to Pandit Shree Ram Sharma
        addEdge(200, 201, 1); // Pandit Shree Ram Sharma to Bahadurgarh City
        addEdge(201, 202, 1); // Bahadurgarh City to Brigadier Hoshiar Singh

        // grey line
        addEdge(37, 241, 1); // Dwarka to Nangli (Interchange with Blue Line)
        addEdge(241, 242, 1); // Nangli to Najafgarh
        addEdge(242, 243, 1); // Najafgarh to Dhansa Bus Stand

        // aqua line
        addEdge(74, 244, 1); // Noida Sector 52 to Noida Sector 51(Interchange with Blue Line)
        addEdge(244, 245, 1); // Noida Sector 51 to Noida Sector 50
        addEdge(245, 246, 1); // Noida Sector 50 to Noida Sector 76
        addEdge(246, 247, 1); // Noida Sector 76 to Noida Sector 101
        addEdge(247, 248, 1); // Noida Sector 101 to Noida Sector 81
        addEdge(248, 249, 1); // Noida Sector 81 to Noida Sector 83
        addEdge(249, 250, 1); // Noida Sector 83 to Noida Sector 137
        addEdge(250, 251, 1); // Noida Sector 137 to Noida Sector 142
        addEdge(251, 252, 1); // Noida Sector 142 to Noida Sector 143
        addEdge(252, 253, 1); // Noida Sector 143 to Noida Sector 144
        addEdge(253, 254, 1); // Noida Sector 144 to Noida Sector 145
        addEdge(254, 255, 1); // Noida Sector 145 to Noida Sector 146
        addEdge(255, 256, 1); // Noida Sector 146 to Noida Sector 147
        addEdge(256, 257, 1); // Noida Sector 147 to Noida Sector 148
        addEdge(257, 258, 1); // Noida Sector 148 to Knowledge Park II
        addEdge(258, 259, 1); // Knowledge Park II to Pari Chowk
        addEdge(259, 260, 1); // Pari Chowk to Alpha 1
        addEdge(260, 261, 1); // Alpha 1 to Alpha 2
        addEdge(261, 262, 1); // Alpha 2 to Delta 1
        addEdge(262, 263, 1); // Delta 1 to GNIDA Office
        addEdge(263, 264, 1); // GNIDA Office to Depot Station

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
