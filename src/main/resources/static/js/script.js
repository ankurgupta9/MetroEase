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
    "Rajouri Garden": "#000000",
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
    "Karkarduma": "#000000",
    "Anand Vihar": "#000000",
    "Kaushambi": "#0072CE",
    "Vaishali": "#0072CE",

    //pink line
    "Majlis Park": "#ff1493",
    "Azadpur": "#ff1493",
    "Shalimar Bagh": "#ff1493",
    // "Netaji Subhash Place": "#ff1493",
    "Shakurpur": "#ff1493",
    "Punjabi Bagh West": "#ff1493",
    "ESI Hospital": "#ff1493",
    // "Rajouri Garden": "#ff1493",
    "Mayapuri": "#ff1493",
    "Naraina Vihar": "#ff1493",
    "Delhi Cantt": "#ff1493",
    "Durgabai Deshmukh South Campus": "#ff1493",
    "Sir M. Vishweshwaraiah Moti Bagh": "#ff1493",
    "Bhikaji Cama Place": "#ff1493",
    "Sarojini Nagar": "#ff1493",
    "INA": "#ff1493",
    "South Extension": "#ff1493",
    "Lajpat Nagar": "#ff1493",
    "Vinobapuri": "#ff1493",
    "Ashram": "#ff1493",
    "Sarai Kale Khan Nizamuddin": "#ff1493",
    // "Mayur Vihar-I": "#ff1493",
    "Mayur Vihar Pocket 1": "#ff1493",
    "Trilokpuri-Sanjay Lake": "#ff1493",
    "East Vinod Nagar-Mayur Vihar-II": "#ff1493",
    "Mandawali-West Vinod Nagar": "#ff1493",
    "IP Extension": "#ff1493",
    // "Anand Vihar ISBT": "#ff1493",
    // "Karkarduma": "#ff1493",
    "Karkarduma Court": "#ff1493",
    "Krishna Nagar": "#ff1493",
    "East Azad Nagar": "#ff1493",
    // "Welcome": "#ff1493",
    "Jafrabad": "#ff1493",
    "Maujpur-Babarpur": "#ff1493",
    "Gokulpuri": "#ff1493",
    "Johri Enclave": "#ff1493",
    "Shiv Vihar": "#ff1493",

    //yellow line
    "Samaypur Badli": "#FFFF00",
    "Rohini Sector 18, 19": "#FFFF00",
    "Haiderpur Badli Mor": "#FFFF00",
    "Jahangirpuri": "#FFFF00",
    "Adarsh Nagar": "#FFFF00",
    "Model Town": "#FFFF00",
    "GTB Nagar": "#FFFF00",
    "Vishwavidyalaya": "#FFFF00",
    "Vidhan Sabha": "#FFFF00",
    "Civil Lines": "#FFFF00",
    "Chandni Chowk": "#FFFF00",
    "Chawri Bazar": "#FFFF00",
    "New Delhi": "#FFFF00",
    "Patel Chowk": "#FFFF00",
    "Udyog Bhawan": "#FFFF00",
    "Lok Kalyan Marg": "#FFFF00",
    "Jorbagh": "#FFFF00",
    "AIIMS": "#FFFF00",
    "Green Park": "#FFFF00",
    "Malviya Nagar": "#FFFF00",
    "Saket": "#FFFF00",
    "Qutab Minar": "#FFFF00",
    "Chhattarpur": "#FFFF00",
    "Sultanpur": "#FFFF00",
    "Ghitorni": "#FFFF00",
    "Arjan Garh": "#FFFF00",
    "Guru Dronacharya": "#FFFF00",
    "Sikandarpur": "#FFFF00",
    "MG Road": "#FFFF00",
    "IFFCO Chowk": "#FFFF00",
    "HUDA City Centre": "#FFFF00",

    //green line
    "Ashok Park Main": "#228B22",
    "Shivaji Park": "#228B22",
    "Madipur": "#228B22",
    "Paschim Vihar East": "#228B22",
    "Paschim Vihar West": "#228B22",
    "Peeragarhi": "#228B22",
    "Udyog Nagar": "#228B22",
    "Surajmal Stadium": "#228B22",
    "Nangloi": "#228B22",
    "Nangloi Railway Station": "#228B22",
    "Rajdhani Park": "#228B22",
    "Mundka": "#228B22",
    "Mundka Industrial Area": "#228B22",
    "Ghevra": "#228B22",
    "Tikri Kalan": "#228B22",
    "Tikri Border": "#228B22",
    "Pandit Shree Ram Sharma": "#228B22",
    "Bahadurgarh City": "#228B22",
    "Brigadier Hoshiar Singh": "#228B22",

    //magenta line
    "Botanical Garden": "#8B008B",
    "Okhla Bird Sanctuary": "#8B008B",
    "Kalindi Kunj": "#8B008B",
    "Jasola Vihar Shaheen Bagh": "#8B008B",
    "Okhla Vihar": "#8B008B",
    "Jamia Millia Islamia": "#8B008B",
    "Sukhdev Vihar": "#8B008B",
    "Okhla NSIC": "#8B008B",
    "Govind Puri": "#8B008B",
    "Kalkaji Mandir": "#8B008B",
    "Nehru Enclave": "#8B008B",
    "Greater Kailash": "#8B008B",
    "Chirag Delhi": "#8B008B",
    "Panchsheel Park": "#8B008B",
    "Hauz Khas": "#8B008B",
    "IIT Delhi": "#8B008B",
    "R K Puram": "#8B008B",
    "Munirka": "#8B008B",
    "Vasant Vihar": "#8B008B",
    "Shankar Vihar": "#8B008B",
    "Terminal 1 IGI Airport": "#8B008B",
    "Sadar Bazar Cantonment": "#8B008B",
    "Palam": "#8B008B",
    "Dashrath Puri": "#8B008B",
    "Dabri Mor - Janakpuri South": "#8B008B",
    //"Janakpuri West": "#8B008B",

    //voitel line
    //"Kashmere Gate": "#9400D3",
    "Red Fort": "#9400D3",
    "Jama Masjid": "#9400D3",
    "Delhi Gate": "#9400D3",
    "ITO": "#9400D3",
    "Janpath": "#9400D3",
    "Central Secretariat": "#9400D3",
    "Khan Market": "#9400D3",
    "Jawaharlal Nehru Stadium": "#9400D3",
    "Jangpura": "#9400D3",
    "Lajpat Nagar": "#9400D3",
    "Moolchand": "#9400D3",
    "Kailash Colony": "#9400D3",
    "Nehru Place": "#9400D3",
    //"Kalkaji Mandir": "#9400D3",
    "Govind Puri": "#9400D3",
    "Okhla": "#9400D3",
    "Jasola Apollo": "#9400D3",
    "Sarita Vihar": "#9400D3",
    "Mohan Estate": "#9400D3",
    "Tughlakabad": "#9400D3",
    "Badarpur Border": "#9400D3",
    "NHPC Chowk": "#9400D3",
    "Mewala Maharajpur": "#9400D3",
    "Sector 28": "#9400D3",
    "Badkal Mor": "#9400D3",
    "Old Faridabad": "#9400D3",
    "Neelam Chowk Ajronda": "#9400D3",
    "Bata Chowk": "#9400D3",
    "Escorts Mujesar": "#9400D3",
    "Raja Nahar Singh (Ballabhgarh)": "#9400D3",

    //grey line
    //"Dwarka": "#808080",
    "Nangli": "#808080",
    "Najafgarh": "#808080",
    "Dhansa Bus Stand": "#808080",

    //aqua line
    "Noida Sector 51": "#00FFFF",
    "Noida Sector 50": "#00FFFF",
    "Noida Sector 76": "#00FFFF",
    "Noida Sector 101": "#00FFFF",
    "Noida Sector 81": "#00FFFF",
    "Noida Sector 83": "#00FFFF",
    "Noida Sector 137": "#00FFFF",
    "Noida Sector 142": "#00FFFF",
    "Noida Sector 143": "#00FFFF",
    "Noida Sector 144": "#00FFFF",
    "Noida Sector 145": "#00FFFF",
    "Noida Sector 146": "#00FFFF",
    "Noida Sector 147": "#00FFFF",
    "Noida Sector 148": "#00FFFF",
    "Knowledge Park II": "#00FFFF",
    "Pari Chowk": "#00FFFF",
    "Alpha 1": "#00FFFF",
    "Alpha 2": "#00FFFF",
    "Delta 1": "#00FFFF",
    "GNIDA Office": "#00FFFF",
    "Depot Station": "#00FFFF",

    //interchange station lists
    "Kashmere Gate": "#000000",         // Red, Yellow, Violet Lines
    "Rajiv Chowk": "#000000",           // Yellow, Blue Lines
    "Central Secretariat": "#000000",    // Yellow, Violet Lines
    "Inderlok": "#000000",              // Red, Green Lines
    "Netaji Subhash Place": "#000000",   // Red, Pink Lines
    "Azadpur": "#000000",               // Yellow, Pink Lines
    "Hauz Khas": "#000000",             // Yellow, Magenta Lines
    "Yamuna Bank": "#000000",           // Blue Line split
    "Kirti Nagar": "#000000",           // Blue, Green Lines
    "Dwarka Sector 21": "#000000",      // Blue, Airport Express Lines
    "Botanical Garden": "#000000",      // Blue, Magenta Lines
    "Mayur Vihar-1": "#000000",   // Blue, Pink Lines
    // "Anand Vihar ISBT": "#000000",      // Blue, Pink Lines
    "Lajpat Nagar": "#000000",          // Pink, Violet Lines
    "Kalkaji Mandir": "#000000",        // Violet, Magenta Lines
    "Mandi House": "#000000",           // Blue, Violet Lines
    "Janakpuri West": "#000000",        // Blue, Magenta Lines
    "Welcome": "#000000",               // Red, Pink Lines
    "Ashok Park Main": "#000000"       // Green Line split

};

// Function to handle autocomplete
function autocomplete(input, stations) {
    input.addEventListener('input', function () {
        let val = this.value;
        let list = this.nextElementSibling;

        // Clear any existing list items
        list.innerHTML = '';

        // Show all stations if input is empty
        if (!val) {
            Object.keys(stations).forEach(station => {
                let item = document.createElement('div');
                item.innerHTML = station;
                item.addEventListener('click', function () {
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
                item.addEventListener('click', function () {
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
document.getElementById('routeForm').addEventListener('submit', function (event) {
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
            const isMobile = window.innerWidth < 800;

           // Define the arrow for desktop and mobile
            const desktopArrow = '🢥';
            const mobileArrow = '➡';

           // Choose the appropriate arrow based on the device
            const arrow = isMobile ? mobileArrow : desktopArrow;
            const coloredRoute = stationNames.map(name => {
                const color = stations[name] || '#000000'; // Default to black if color not found
                return `<span style="margin:5px; background-color:${color}" class="text-light station rounded p-1 border border-light">${name}</span>`;
            }).join(arrow);

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

document.addEventListener('click', function (event) {
    const dropdownMenu = document.getElementById('searchBox1');
    const inputBox = document.getElementById('searchBox1');
  
    if (!inputBox.contains(event.target) && !dropdownMenu.contains(event.target)) {
      dropdownMenu.classList.remove('show'); // This closes the dropdown
    }
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
