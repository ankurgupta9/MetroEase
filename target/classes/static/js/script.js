// document.getElementById('routeForm').addEventListener('submit', function (event) {
//     event.preventDefault();

//     // Get the selected values
//     const source = document.getElementById('searchBox1').value;
//     const destination = document.getElementById('searchBox2').value;

//     // Calculate the shortest route and fare (dummy data here for demonstration)
//     const shortestRoute = `From ${source} to ${destination}`;
//     const totalFare = `₹50`;

//     // Display the result
//     document.getElementById('shortestRoute').textContent = shortestRoute;
//     document.getElementById('totalFare').textContent = totalFare;
//     document.getElementById('resultSection').classList.add('show');
// });

// document.addEventListener("DOMContentLoaded", function () {
//     const searchBox = document.getElementById("searchBox1");
//     const autocompleteList = document.getElementById("autocompleteList1");

//     const items = ["Apple", "Banana", "Cherry", "Date", "Fig", "Grape", "Kiwi", "Lemon", "Mango", "Orange", "Papaya", "Quince", "Raspberry", "Strawberry", "Tomato", "Ugli fruit", "Vanilla", "Watermelon"];

//     searchBox.addEventListener("input", function () {
//         const value = this.value.toLowerCase();
//         autocompleteList.innerHTML = "";
  
//         var matchFound=false;

//         items.forEach(function (item) {
//             if (item.toLowerCase().includes(value)) {
//                 matchFound=true;
//                 const listItem = document.createElement("div");
//                 listItem.textContent = item;
//                 listItem.addEventListener("click", function () {
//                     searchBox.value = item;
//                     autocompleteList.innerHTML = "";
//                 });
//                 autocompleteList.appendChild(listItem);
//             }
//         });

//         if (!matchFound) {
//             const noMatchItem = document.createElement("div");
//             noMatchItem.textContent = "No station found";
//             autocompleteList.appendChild(noMatchItem);
//         }
//     });

//     document.addEventListener("click", function (e) {
//         if (e.target !== searchBox) {
//             autocompleteList.innerHTML = "";
//         }
//     });
// });

// document.addEventListener("DOMContentLoaded", function () {
//     const searchBox = document.getElementById("searchBox2");
//     const autocompleteList = document.getElementById("autocompleteList2");

//     const items = ["Apple", "Banana", "Cherry", "Date", "Fig", "Grape", "Kiwi", "Lemon", "Mango", "Orange", "Papaya", "Quince", "Raspberry", "Strawberry", "Tomato", "Ugli fruit", "Vanilla", "Watermelon"];

//     searchBox.addEventListener("input", function () {
//         const value = this.value.toLowerCase();
//         autocompleteList.innerHTML = "";
//         // if (!value) {
//         //     return false;
//         // }

//         var matchFound=false;

//         items.forEach(function (item) {
//             if (item.toLowerCase().includes(value)) {
//                 matchFound=true;
//                 const listItem = document.createElement("div");
//                 listItem.textContent = item;
//                 listItem.addEventListener("click", function () {
//                     searchBox.value = item;
//                     autocompleteList.innerHTML = "";
//                 });
//                 autocompleteList.appendChild(listItem);
//             }
//         });

//         if (!matchFound) {
//             const noMatchItem = document.createElement("div");
//             noMatchItem.textContent = "No station found";
//             autocompleteList.appendChild(noMatchItem);
//         }
//     });

//     document.addEventListener("click", function (e) {
//         if (e.target !== searchBox) {
//             autocompleteList.innerHTML = "";
//         }
//     });
// });

// Autocomplete function
const stations = {
    // Red Line
    "Shaheed Sthal": "#ee1111",
    "Hindon River": "#ee1111",
    "Arthala": "#ee1111",
    "Mohan Nagar": "#ee1111",
    "Shyam Park": "#ee1111",
    "Major Mohit Sharma Rajendra Nagar": "#ee1111",
    "Raj Bagh": "#ee1111",
    "Shaheed Nagar": "#ee1111",
    "Dilshad Garden": "#ee1111",
    "Jhilmil": "#ee1111",
    "Mansarovar Park": "#ee1111",
    "Shahdara": "#ee1111",
    "Welcome": "#ee1111",
    "Seelampur": "#ee1111",
    "Shastri Park": "#ee1111",
    "Kashmere Gate": "#ee1111",
    "Tis Hazari": "#ee1111",
    "PulBangash": "#ee1111",
    "Pratap Nagar": "#ee1111",
    "Shastri Nagar": "#ee1111",
    "Inderlok": "#ee1111",
    "Kanhaiya Nagar": "#ee1111",
    "Keshav Puram": "#ee1111",
    "Netaji Subhash Place": "#ee1111",
    "Kohat Enclave": "#ee1111",
    "Pitampura": "#ee1111",
    "Rohini East": "#ee1111",
    "Rohini West": "#ee1111",
    "Rithala": "#ee1111",

    // Blue Line
    "Dwarka Sector 21": "#0072CE",
    "Dwarka Sector 8": "#0072CE",
    "Dwarka Sector 9": "#0072CE",
    "Dwarka Sector 10": "#0072CE",
    "Dwarka Sector 11": "#0072CE",
    "Dwarka Sector 12": "#0072CE",
    "Dwarka Sector 13": "#0072CE",
    "Dwarka Sector 14": "#0072CE",
    "Dwarka": "#0072CE",
    "Dwarka Mor": "#0072CE",
    "Nawada": "#0072CE",
    "Uttam Nagar West": "#0072CE",
    "Uttam Nagar East": "#0072CE",
    "Janakpuri West": "#0072CE",
    "Janakpuri East": "#0072CE",
    "Tilak Nagar": "#0072CE",
    "Subhash Nagar": "#0072CE",
    "Tagore Garden": "#0072CE",
    "Rajouri Garden": "#0072CE",
    "Ramesh Nagar": "#0072CE",
    "Moti Nagar": "#0072CE",
    "Kirti Nagar": "#0072CE",
    "Shadipur": "#0072CE",
    "Patel Nagar": "#0072CE",
    "Rajendra Place": "#0072CE",
    "Karol Bagh": "#0072CE",
    "Jhandewalan": "#0072CE",
    "Ramakrishna Ashram Marg": "#0072CE",
    "Rajiv Chowk": "#0072CE",
    "Barakhamba Road": "#0072CE",
    "Mandi House": "#0072CE",
    "Pragati Maidan": "#0072CE",
    "Indraprastha": "#0072CE",
    "Yamuna Bank": "#0072CE",
    "Akshardham": "#0072CE",
    "Mayur Vihar-1": "#0072CE",
    "Mayur Vihar Extension": "#0072CE",
    "New Ashok Nagar": "#0072CE",
    "Noida Sector 15": "#0072CE",
    "Noida Sector 16": "#0072CE",
    "Noida Sector 18": "#0072CE",
    "Botanical Garden": "#0072CE",
    "Golf Course": "#0072CE",
    "Noida City Centre": "#0072CE",
    "Noida Sector 34": "#0072CE",
    "Noida Sector 52": "#0072CE",
    "Noida Sector 61": "#0072CE",
    "Noida Sector 59": "#0072CE",
    "Noida Sector 62": "#0072CE",
    "Noida Electronic City": "#0072CE",
    "Laxmi Nagar": "#0072CE",
    "Nirman Vihar": "#0072CE",
    "Preet Vihar": "#0072CE",
    "Karkarduma": "#0072CE",
    "Anand Vihar": "#0072CE",
    "Kaushambi": "#0072CE",
    "Vaishali": "#0072CE"
};

// Function to handle autocomplete
function autocomplete(input, stations) {
    input.addEventListener('input', function() {
        let val = this.value;
        let list = this.nextElementSibling;

        // Clear any existing list items
        list.innerHTML = '';

        // Show all stations if input is empty
        if (!val) {
            Object.keys(stations).forEach(station => {
                let item = document.createElement('div');
                item.innerHTML = station;
                item.addEventListener('click', function() {
                    input.value = station;
                    list.innerHTML = '';
                });
                list.appendChild(item);
            });
            return false;
        }

        // Filter stations based on input
        Object.keys(stations).forEach(station => {
            if (station.substr(0, val.length).toUpperCase() === val.toUpperCase()) {
                let item = document.createElement('div');
                item.innerHTML = `<strong>${station.substr(0, val.length)}</strong>${station.substr(val.length)}`;
                item.addEventListener('click', function() {
                    input.value = station;
                    list.innerHTML = '';
                });
                list.appendChild(item);
            }
        });
    });
}

// Apply autocomplete to your search boxes
autocomplete(document.getElementById('searchBox1'), stations);
autocomplete(document.getElementById('searchBox2'), stations);

// Handle form submission
document.getElementById('routeForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent the form from submitting the traditional way

    // Get the input values
    const sourceStation = document.getElementById('searchBox1').value;
    const destinationStation = document.getElementById('searchBox2').value;

    // Send a GET request to the Spring Boot API
    fetch(`/metro/findRoute?source=${encodeURIComponent(sourceStation)}&destination=${encodeURIComponent(destinationStation)}`)
        .then(response => response.text())
        .then(data => {
            // Extract station names from the response
            const stationNames = data.split(' -> ');

            // Apply color to each station name
            const coloredRoute = stationNames.map(name => {
                const color = stations[name] || '#000000'; // Default to black if color not found
                return `<span style="background-color:${color}; margin:5px;" class="text-light station rounded p-1 border">${name}</span>`;
            }).join(' 🢥 ');

            // Update the result section with the colored route
            document.getElementById('shortestRoute').innerHTML = coloredRoute;

            // Extract distance from the response
            const distanceMatch = data.match(/Total Stations: (\d+)/);
            if (distanceMatch) {
                const distance = parseInt(distanceMatch[1], 10);
                const fare = calculateFare(distance);
                document.getElementById('totalFare').innerText = `₹${fare}`;
            } else {
                document.getElementById('totalFare').innerText = 'N/A';
            }

            document.getElementById('resultSection').classList.add('show');
        })
        .catch(error => console.error('Error fetching the route:', error));
});

// Function to calculate fare based on distance
function calculateFare(distance) {
    if (distance == 0) {
        return 0; 
    } else if (distance < 2) {
        return 10;  // Fare for 2-5 KMs
    } else if (distance >= 2 && distance < 5) {
        return 20;  // Fare for 2-5 KMs
    } else if (distance >= 5 && distance < 12) {
        return 30;  // Fare for 5-12 KMs
    } else if (distance >= 12 && distance < 21) {
        return 40;  // Fare for 12-21 KMs
    } else if (distance >= 21 && distance < 32) {
        return 50;  // Fare for 21-32 KMs
    } else {
        return 60;  // Fare for more than 32 KMs
    }
}