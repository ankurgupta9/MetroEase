package com.MetroEase.MetroEase.services;

import java.util.HashMap;
import java.util.Map;

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
        //Blue Line
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
        //blue line branch
        // stationIndexMap.put(79, "Yamuna Bank");
        stationIndexMap.put(80, "Laxmi Nagar");
        stationIndexMap.put(81, "Nirman Vihar");
        stationIndexMap.put(82, "Preet Vihar");
        stationIndexMap.put(83, "Karkarduma");
        stationIndexMap.put(84, "Anand Vihar");
        stationIndexMap.put(85, "Kaushambi");
        stationIndexMap.put(86, "Vaishali");

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
    
}
