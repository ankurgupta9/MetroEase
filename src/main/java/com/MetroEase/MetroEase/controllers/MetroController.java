// package com.MetroEase.MetroEase.controllers;

// import com.MetroEase.MetroEase.services.MetroServices;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// public class MetroController {

//     @Autowired
//     private MetroServices metroServices;

//     @GetMapping("/metro/findRoute")
//     public String findRoute(@RequestParam int source, @RequestParam int destination) {
//         return metroServices.findShortestRoute(source, destination);
//     }
// }

package com.MetroEase.MetroEase.controllers;

import com.MetroEase.MetroEase.services.MetroServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MetroController {

    @Autowired
    private MetroServices metroServices;

    // Use a HashMap to create a mutable map
    private final Map<String, Integer> stationNameToIndex;

    // Initialize the map in the constructor
    public MetroController() {
        stationNameToIndex = new HashMap<>();
        stationNameToIndex.put("Shaheed Sthal", 0);
        stationNameToIndex.put("Hindon River", 1);
        stationNameToIndex.put("Arthala", 2);
        stationNameToIndex.put("Mohan Nagar", 3);
        stationNameToIndex.put("Shyam Park", 4);
        stationNameToIndex.put("Major Mohit Sharma Rajendra Nagar", 5);
        stationNameToIndex.put("Raj Bagh", 6);
        stationNameToIndex.put("Shaheed Nagar", 7);
        stationNameToIndex.put("Dilshad Garden", 8);
        stationNameToIndex.put("Jhilmil", 9);
        stationNameToIndex.put("Mansarovar Park", 10);
        stationNameToIndex.put("Shahdara", 11);
        stationNameToIndex.put("Welcome", 12);
        stationNameToIndex.put("Seelampur", 13);
        stationNameToIndex.put("Shastri Park", 14);
        stationNameToIndex.put("Kashmere Gate", 15);
        stationNameToIndex.put("Tis Hazari", 16);
        stationNameToIndex.put("PulBangash", 17);
        stationNameToIndex.put("Pratap Nagar", 18);
        stationNameToIndex.put("Shastri Nagar", 19);
        stationNameToIndex.put("Inderlok", 20);
        stationNameToIndex.put("Kanhaiya Nagar", 21);
        stationNameToIndex.put("Keshav Puram", 22);
        stationNameToIndex.put("Netaji Subhash Place", 23);
        stationNameToIndex.put("Kohat Enclave", 24);
        stationNameToIndex.put("Pitampura", 25);
        stationNameToIndex.put("Rohini East", 26);
        stationNameToIndex.put("Rohini West", 27);
        stationNameToIndex.put("Rithala", 28);

        //Blue Line
        stationNameToIndex.put("Dwarka Sector 21", 29);
        stationNameToIndex.put("Dwarka Sector 8", 30);
        stationNameToIndex.put("Dwarka Sector 9", 31);
        stationNameToIndex.put("Dwarka Sector 10", 32);
        stationNameToIndex.put("Dwarka Sector 11", 33);
        stationNameToIndex.put("Dwarka Sector 12", 34);
        stationNameToIndex.put("Dwarka Sector 13", 35);
        stationNameToIndex.put("Dwarka Sector 14", 36);
        stationNameToIndex.put("Dwarka", 37);
        stationNameToIndex.put("Dwarka Mor", 38);
        stationNameToIndex.put("Nawada", 39);
        stationNameToIndex.put("Uttam Nagar West", 40);
        stationNameToIndex.put("Uttam Nagar East", 41);
        stationNameToIndex.put("Janakpuri West", 42);
        stationNameToIndex.put("Janakpuri East", 43);
        stationNameToIndex.put("Tilak Nagar", 44);
        stationNameToIndex.put("Subhash Nagar", 45);
        stationNameToIndex.put("Tagore Garden", 46);
        stationNameToIndex.put("Rajouri Garden", 47);
        stationNameToIndex.put("Ramesh Nagar", 48);
        stationNameToIndex.put("Moti Nagar", 49);
        stationNameToIndex.put("Kirti Nagar", 50);
        stationNameToIndex.put("Shadipur", 51);
        stationNameToIndex.put("Patel Nagar", 52);
        stationNameToIndex.put("Rajendra Place", 53);
        stationNameToIndex.put("Karol Bagh", 54);
        stationNameToIndex.put("Jhandewalan", 55);
        stationNameToIndex.put("Ramakrishna Ashram Marg", 56);
        stationNameToIndex.put("Rajiv Chowk", 57);
        stationNameToIndex.put("Barakhamba Road", 58);
        stationNameToIndex.put("Mandi House", 59);
        stationNameToIndex.put("Supreme Court", 60);
        stationNameToIndex.put("Indraprastha", 61);
        stationNameToIndex.put("Yamuna Bank", 62);
        stationNameToIndex.put("Akshardham", 63);
        stationNameToIndex.put("Mayur Vihar-1", 64);
        stationNameToIndex.put("Mayur Vihar Extension", 65);
        stationNameToIndex.put("New Ashok Nagar", 66);
        stationNameToIndex.put("Noida Sector 15", 67);
        stationNameToIndex.put("Noida Sector 16", 68);
        stationNameToIndex.put("Noida Sector 18", 69);
        stationNameToIndex.put("Botanical Garden", 70);
        stationNameToIndex.put("Golf Course", 71);
        stationNameToIndex.put("Noida City Centre", 72);
        stationNameToIndex.put("Noida Sector 34", 73);
        stationNameToIndex.put("Noida Sector 52", 74);
        stationNameToIndex.put("Noida Sector 61", 75);
        stationNameToIndex.put("Noida Sector 59", 76);
        stationNameToIndex.put("Noida Sector 62", 77);
        stationNameToIndex.put("Noida Electronic City", 78);

        // Branch towards Vaishali
        // stationNameToIndex.put("Yamuna Bank", 79);
        stationNameToIndex.put("Laxmi Nagar", 80);
        stationNameToIndex.put("Nirman Vihar", 81);
        stationNameToIndex.put("Preet Vihar", 82);
        stationNameToIndex.put("Karkarduma", 83);
        stationNameToIndex.put("Anand Vihar", 84);
        stationNameToIndex.put("Kaushambi", 85);
        stationNameToIndex.put("Vaishali", 86);
    }

    @GetMapping("/metro/findRoute")
    public String findRoute(@RequestParam String source, @RequestParam String destination) {
        Integer sourceIndex = stationNameToIndex.get(source);
        Integer destinationIndex = stationNameToIndex.get(destination);

        if (sourceIndex == null || destinationIndex == null) {
            return "Invalid station name.";
        }

        return metroServices.findShortestRoute(sourceIndex, destinationIndex);
        
    }
}
