##Overview - Finding Hospital
This project aims to automate the testing process of a Hospital Finding website using Selenium WebDriver.
It uses practo.com portal to test all the mentioned requirements. 
***
##Requirements
1. Search Doctors (any one speciality like Dentist, Cardiologist, etc) for any City (like Chennai, Bangalore, Pune, etc). Apply filters for Patient Stories, Experience, Fees, Availability and any one Sorting; Fetch & display the first 5 Doctor details
2. Go to "Surgeries". Extract & store all the surgeries in a List & display them in console output.
3. Under "For Corporate -> Health and Wellness Plan", fill the form with invalid email id & valid details for other fields, validate if "Taking a demo" button is disabled. Print the observation in console output. Then provide email in valid format & click the button and validate "Thank You" message is displayed

***

##Libraries and Dependencies
Maven Repository: Maven 3.11.0
Apache POI: 5.2.3
TestNG: 7.9.0
Extent Report: 5.1.1
Selenium WebDriver: 4.15.0
Github: 5.6.2
Cucumber: 7.14.1
Log4j: 2.20.0
***
##Automation Flow
1. Navigate to practo.com Website and enter the location and specialist textfields.
2. Navigate to Specialist Page and apply all the mentioned Filters and Sorts.
3. Capture the specialist information.
4. Navigate back to practo.com Website and click on Surgeries Icon.
5. Validate the title of the Webpage and capture all the surgeries displayed.
6. Navigate back to practo.com Website and select 'Health and Wellness plans' under 'For Corporates' dropdown.
7. Perform Negative Testing with the given form by filling invalid email and all other details as valid.
8. Perform Positive Testing with the given form by fill all valid details.

***
###Challenges
Overcame issues related to dynamic content and page structure.​Implemented error handling mechanisms for robust automation.
***
###Benefits
Increased efficiency through Automation. Reduced manual effort and minimized the chance of human errors.
***
###Contributors
Phaneendra, Nadadoor - 2332926