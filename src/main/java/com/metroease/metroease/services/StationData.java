package com.metroease.metroease.services;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class StationData {

    private static final Map<Integer, String> stationIndexMap = new HashMap<>();
    private static final Map<Integer, String> stationIndexColor = new HashMap<>();

    static {
        // Red Line
        stationIndexMap.put(0, "Shaheed Sthal");
        stationIndexMap.put(1, "Hindon River");
        stationIndexMap.put(2, "Arthala");
        stationIndexMap.put(3, "Mohan Nagar");
        stationIndexMap.put(4, "Shyam Park");
        stationIndexMap.put(5, "Major Mohit Sharma Rajendra Nagar");
        stationIndexMap.put(6, "Raj Bagh");
        stationIndexMap.put(7, "Shaheed Nagar");
        stationIndexMap.put(8, "Dilshad Garden");
        stationIndexMap.put(9, "Jhilmil");
        stationIndexMap.put(10, "Mansarovar Park");
        stationIndexMap.put(11, "Shahdara");
        stationIndexMap.put(12, "Welcome");
        stationIndexMap.put(13, "Seelampur");
        stationIndexMap.put(14, "Shastri Park");
        stationIndexMap.put(15, "Kashmere Gate");
        stationIndexMap.put(16, "Tis Hazari");
        stationIndexMap.put(17, "PulBangash");
        stationIndexMap.put(18, "Pratap Nagar");
        stationIndexMap.put(19, "Shastri Nagar");
        stationIndexMap.put(20, "Inderlok");
        stationIndexMap.put(21, "Kanhaiya Nagar");
        stationIndexMap.put(22, "Keshav Puram");
        stationIndexMap.put(23, "Netaji Subhash Place");
        stationIndexMap.put(24, "Kohat Enclave");
        stationIndexMap.put(25, "Pitampura");
        stationIndexMap.put(26, "Rohini East");
        stationIndexMap.put(27, "Rohini West");
        stationIndexMap.put(28, "Rithala");
        // Blue Line
        stationIndexMap.put(29, "Dwarka Sector 21");
        stationIndexMap.put(30, "Dwarka Sector 8");
        stationIndexMap.put(31, "Dwarka Sector 9");
        stationIndexMap.put(32, "Dwarka Sector 10");
        stationIndexMap.put(33, "Dwarka Sector 11");
        stationIndexMap.put(34, "Dwarka Sector 12");
        stationIndexMap.put(35, "Dwarka Sector 13");
        stationIndexMap.put(36, "Dwarka Sector 14");
        stationIndexMap.put(37, "Dwarka");
        stationIndexMap.put(38, "Dwarka Mor");
        stationIndexMap.put(39, "Nawada");
        stationIndexMap.put(40, "Uttam Nagar West");
        stationIndexMap.put(41, "Uttam Nagar East");
        stationIndexMap.put(42, "Janakpuri West");
        stationIndexMap.put(43, "Janakpuri East");
        stationIndexMap.put(44, "Tilak Nagar");
        stationIndexMap.put(45, "Subhash Nagar");
        stationIndexMap.put(46, "Tagore Garden");
        stationIndexMap.put(47, "Rajouri Garden");
        stationIndexMap.put(48, "Ramesh Nagar");
        stationIndexMap.put(49, "Moti Nagar");
        stationIndexMap.put(50, "Kirti Nagar");
        stationIndexMap.put(51, "Shadipur");
        stationIndexMap.put(52, "Patel Nagar");
        stationIndexMap.put(53, "Rajendra Place");
        stationIndexMap.put(54, "Karol Bagh");
        stationIndexMap.put(55, "Jhandewalan");
        stationIndexMap.put(56, "Ramakrishna Ashram Marg");
        stationIndexMap.put(57, "Rajiv Chowk");
        stationIndexMap.put(58, "Barakhamba Road");
        stationIndexMap.put(59, "Mandi House");
        stationIndexMap.put(60, "Pragati Maidan");
        stationIndexMap.put(61, "Indraprastha");
        stationIndexMap.put(62, "Yamuna Bank");
        stationIndexMap.put(63, "Akshardham");
        stationIndexMap.put(64, "Mayur Vihar-1");
        stationIndexMap.put(65, "Mayur Vihar Extension");
        stationIndexMap.put(66, "New Ashok Nagar");
        stationIndexMap.put(67, "Noida Sector 15");
        stationIndexMap.put(68, "Noida Sector 16");
        stationIndexMap.put(69, "Noida Sector 18");
        stationIndexMap.put(70, "Botanical Garden");
        stationIndexMap.put(71, "Golf Course");
        stationIndexMap.put(72, "Noida City Centre");
        stationIndexMap.put(73, "Noida Sector 34");
        stationIndexMap.put(74, "Noida Sector 52");
        stationIndexMap.put(75, "Noida Sector 61");
        stationIndexMap.put(76, "Noida Sector 59");
        stationIndexMap.put(77, "Noida Sector 62");
        stationIndexMap.put(78, "Noida Electronic City");
        // blue line branch
        // stationIndexMap.put(79, "Yamuna Bank");
        stationIndexMap.put(80, "Laxmi Nagar");
        stationIndexMap.put(81, "Nirman Vihar");
        stationIndexMap.put(82, "Preet Vihar");
        stationIndexMap.put(83, "Karkarduma");
        stationIndexMap.put(84, "Anand Vihar");
        stationIndexMap.put(85, "Kaushambi");
        stationIndexMap.put(86, "Vaishali");

        // Pink Line
        stationIndexMap.put(87, "Majlis Park");
        stationIndexMap.put(88, "Azadpur");
        stationIndexMap.put(89, "Shalimar Bagh");
        // stationIndexMap.put(90, "Netaji Subhash Place");
        stationIndexMap.put(91, "Shakurpur");
        stationIndexMap.put(92, "Punjabi Bagh West");
        stationIndexMap.put(93, "ESI Hospital");
        // stationIndexMap.put(94, "Rajouri Garden");
        stationIndexMap.put(95, "Mayapuri");
        stationIndexMap.put(96, "Naraina Vihar");
        stationIndexMap.put(97, "Delhi Cantt");
        stationIndexMap.put(98, "Durgabai Deshmukh South Campus");
        stationIndexMap.put(99, "Sir M. Vishweshwaraiah Moti Bagh");
        stationIndexMap.put(100, "Bhikaji Cama Place");
        stationIndexMap.put(101, "Sarojini Nagar");
        stationIndexMap.put(102, "INA");
        stationIndexMap.put(103, "South Extension");
        stationIndexMap.put(104, "Lajpat Nagar");
        stationIndexMap.put(105, "Vinobapuri");
        stationIndexMap.put(106, "Ashram");
        stationIndexMap.put(107, "Sarai Kale Khan Nizamuddin");
        // Mayur vihar already in blue line
        stationIndexMap.put(108, "Mayur Vihar Pocket 1");
        stationIndexMap.put(109, "Trilokpuri-Sanjay Lake");
        stationIndexMap.put(110, "East Vinod Nagar");
        stationIndexMap.put(111, "Mandawali-West Vinod Nagar");
        stationIndexMap.put(112, "IP Extension");
        // stationIndexMap.put(113, "Anand Vihar ISBT");
        // stationIndexMap.put(114, "Karkarduma");
        stationIndexMap.put(115, "Karkarduma Court");
        stationIndexMap.put(116, "Krishna Nagar");
        stationIndexMap.put(117, "East Azad Nagar");
        // stationIndexMap.put(118, "Welcome");
        stationIndexMap.put(119, "Jaffrabad");
        stationIndexMap.put(120, "Maujpur-Babarpur");
        stationIndexMap.put(121, "Gokulpuri");
        stationIndexMap.put(122, "Johri Enclave");
        stationIndexMap.put(123, "Shiv Vihar");

        // magenta line
        // stationIndexMap.put(124, "Botanical Garden"); // Interchange with Blue Line
        stationIndexMap.put(125, "Okhla Bird Sanctuary");
        stationIndexMap.put(126, "Kalindi Kunj");
        stationIndexMap.put(127, "Jasola Vihar Shaheen Bagh");
        stationIndexMap.put(128, "Okhla Vihar");
        stationIndexMap.put(129, "Jamia Millia Islamia");
        stationIndexMap.put(130, "Sukhdev Vihar");
        stationIndexMap.put(131, "Okhla NSIC");
        // stationIndexMap.put(132, "Govind Puri");
        stationIndexMap.put(133, "Kalkaji Mandir"); // Interchange with Violet Line
        stationIndexMap.put(134, "Nehru Enclave");
        stationIndexMap.put(135, "Greater Kailash");
        stationIndexMap.put(136, "Chirag Delhi");
        stationIndexMap.put(137, "Panchsheel Park");
        stationIndexMap.put(138, "Hauz Khas"); // Interchange with Yellow Line
        stationIndexMap.put(139, "IIT Delhi");
        stationIndexMap.put(140, "R K Puram");
        stationIndexMap.put(141, "Munirka");
        stationIndexMap.put(142, "Vasant Vihar");
        stationIndexMap.put(143, "Shankar Vihar");
        stationIndexMap.put(144, "Terminal 1 IGI Airport");
        stationIndexMap.put(145, "Sadar Bazar Cantonment");
        stationIndexMap.put(146, "Palam");
        stationIndexMap.put(147, "Dashrath Puri");
        stationIndexMap.put(148, "Dabri Mor - Janakpuri South");
        // stationIndexMap.put(149, "Janakpuri West"); // Interchange with Blue Line

        // voilet line
        // stationIndexMap.put(150, "Kashmere Gate"); // Interchange with Red Line and
        stationIndexMap.put(151, "Red Fort");
        stationIndexMap.put(152, "Jama Masjid");
        stationIndexMap.put(153, "Delhi Gate");
        stationIndexMap.put(154, "ITO");
        // stationIndexMap.put(155, "Mandi House"); // Interchange with Blue Line
        stationIndexMap.put(156, "Janpath");
        stationIndexMap.put(157, "Central Secretariat"); // Interchange with Yellow Line
        stationIndexMap.put(158, "Khan Market");
        stationIndexMap.put(159, "Jawaharlal Nehru Stadium");
        stationIndexMap.put(160, "Jangpura");
        // stationIndexMap.put(161, "Lajpat Nagar"); // Interchange with Pink Line
        stationIndexMap.put(162, "Moolchand");
        stationIndexMap.put(163, "Kailash Colony");
        stationIndexMap.put(164, "Nehru Place");
        // stationIndexMap.put(165, "Kalkaji Mandir"); // Interchange with Magenta Line
        stationIndexMap.put(166, "Govind Puri");
        stationIndexMap.put(167, "Harkesh nagar Okhla");
        stationIndexMap.put(168, "Jasola Apollo");
        stationIndexMap.put(169, "Sarita Vihar");
        stationIndexMap.put(170, "Mohan Estate");
        stationIndexMap.put(171, "Tughlakabad");
        stationIndexMap.put(172, "Badarpur Border");
        stationIndexMap.put(173, "NHPC Chowk");
        stationIndexMap.put(174, "Mewala Maharajpur");
        stationIndexMap.put(175, "Sector 28");
        stationIndexMap.put(176, "Badkal Mor");
        stationIndexMap.put(177, "Old Faridabad");
        stationIndexMap.put(178, "Neelam Chowk Ajronda");
        stationIndexMap.put(179, "Bata Chowk");
        stationIndexMap.put(180, "Escorts Mujesar");
        stationIndexMap.put(181, "Raja Nahar Singh (Ballabhgarh)");

        // green line
        // stationIndexMap.put(182, "Inderlok"); // Interchange with Red Line
        stationIndexMap.put(183, "Ashok Park Main");
        // stationIndexMap.put(184, "Punjabi Bagh"); // Interchange with Pink Line
        stationIndexMap.put(185, "Shivaji Park");
        stationIndexMap.put(186, "Madipur");
        stationIndexMap.put(187, "Paschim Vihar East");
        stationIndexMap.put(188, "Paschim Vihar West");
        stationIndexMap.put(189, "Peeragarhi");
        stationIndexMap.put(190, "Udyog Nagar");
        stationIndexMap.put(191, "Surajmal Stadium");
        stationIndexMap.put(192, "Nangloi");
        stationIndexMap.put(193, "Nangloi Railway Station");
        stationIndexMap.put(194, "Rajdhani Park");
        stationIndexMap.put(195, "Mundka");
        stationIndexMap.put(196, "Mundka Industrial Area");
        stationIndexMap.put(197, "Ghevra");
        stationIndexMap.put(198, "Tikri Kalan");
        stationIndexMap.put(199, "Tikri Border");
        stationIndexMap.put(200, "Pandit Shree Ram Sharma");
        stationIndexMap.put(201, "Bahadurgarh City");
        stationIndexMap.put(202, "Brigadier Hoshiar Singh");

        // yellow line
        stationIndexMap.put(203, "Samaypur Badli");
        stationIndexMap.put(204, "Rohini Sector 18, 19");
        stationIndexMap.put(205, "Haiderpur Badli Mor");
        stationIndexMap.put(206, "Jahangirpuri");
        stationIndexMap.put(207, "Adarsh Nagar");
        // stationIndexMap.put(208, "Azadpur"); // Interchange with Pink Line
        stationIndexMap.put(209, "Model Town");
        stationIndexMap.put(210, "GTB Nagar");
        stationIndexMap.put(211, "Vishwavidyalaya");
        stationIndexMap.put(212, "Vidhan Sabha");
        stationIndexMap.put(213, "Civil Lines");
        // stationIndexMap.put(214, "Kashmere Gate"); // Interchange with Red Line and
        // Violet Line
        stationIndexMap.put(215, "Chandni Chowk");
        stationIndexMap.put(216, "Chawri Bazar");
        stationIndexMap.put(217, "New Delhi"); // Interchange with Airport Express Line
        // stationIndexMap.put(218, "Rajiv Chowk"); // Interchange with Blue Line
        stationIndexMap.put(219, "Patel Chowk");
        // stationIndexMap.put(220, "Central Secretariat"); // Interchange with Violet
        // Line
        stationIndexMap.put(221, "Udyog Bhawan");
        stationIndexMap.put(222, "Lok Kalyan Marg");
        stationIndexMap.put(223, "Jorbagh");
        // stationIndexMap.put(224, "Dilli Haat INA"); // Interchange with Pink Line
        stationIndexMap.put(225, "AIIMS");
        stationIndexMap.put(226, "Green Park");
        // stationIndexMap.put(227, "Hauz Khas"); // Interchange with Magenta Line
        stationIndexMap.put(228, "Malviya Nagar");
        stationIndexMap.put(229, "Saket");
        stationIndexMap.put(230, "Qutab Minar");
        stationIndexMap.put(231, "Chhattarpur");
        stationIndexMap.put(232, "Sultanpur");
        stationIndexMap.put(233, "Ghitorni");
        stationIndexMap.put(234, "Arjan Garh");
        stationIndexMap.put(235, "Guru Dronacharya");
        stationIndexMap.put(236, "Sikandarpur"); // Interchange with Rapid Metro Gurgaon
        stationIndexMap.put(237, "MG Road");
        stationIndexMap.put(238, "IFFCO Chowk");
        stationIndexMap.put(239, "HUDA City Centre");

        // grey line
        // stationIndexMap.put(240, "Dwarka"); // Interchange with Blue Line
        stationIndexMap.put(241, "Nangli");
        stationIndexMap.put(242, "Najafgarh");
        stationIndexMap.put(243, "Dhansa Bus Stand");

        // aqua line
        stationIndexMap.put(244, "Noida Sector 51"); // Interchange with Blue Line
        stationIndexMap.put(245, "Noida Sector 50");
        stationIndexMap.put(246, "Noida Sector 76");
        stationIndexMap.put(247, "Noida Sector 101");
        stationIndexMap.put(248, "Noida Sector 81");
        stationIndexMap.put(249, "Noida Sector 83");
        stationIndexMap.put(250, "Noida Sector 137");
        stationIndexMap.put(251, "Noida Sector 142");
        stationIndexMap.put(252, "Noida Sector 143");
        stationIndexMap.put(253, "Noida Sector 144");
        stationIndexMap.put(254, "Noida Sector 145");
        stationIndexMap.put(255, "Noida Sector 146");
        stationIndexMap.put(256, "Noida Sector 147");
        stationIndexMap.put(257, "Noida Sector 148");
        stationIndexMap.put(258, "Knowledge Park II");
        stationIndexMap.put(259, "Pari Chowk");
        stationIndexMap.put(260, "Alpha 1");
        stationIndexMap.put(261, "Alpha 2");
        stationIndexMap.put(262, "Delta 1");
        stationIndexMap.put(263, "GNIDA Office");
        stationIndexMap.put(264, "Depot Station");

        for (int i = 87; i <= 123; i++) {
            stationIndexColor.put(i, "#E91E63"); // Pink Line color code
        }

        for (int i = 0; i <= 28; i++) {
            stationIndexColor.put(i, "#ee1111"); // Red Line color code
        }

        for (int i = 29; i <= 86; i++) {
            stationIndexColor.put(i, "#0072CE"); // Blue Line color code
        }
    }

    // Getter method to access the stationIndexMap
    public static String getStationName(int index) {
        return stationIndexMap.get(index);
    }

    public static String getStationColor(int index) {
        return stationIndexColor.get(index);
    }

    public Integer getStationIndex(String stationName) {
        for (Map.Entry<Integer, String> entry : stationIndexMap.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(stationName)) {
                return entry.getKey();
            }
        }
        return null; // Return null if station name is not found
    }

}
