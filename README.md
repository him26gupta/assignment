# assignment

Java web application provide a REST API to create a list of ING ATMs in a given Dutch city and return a well formed JSON response The web application should invoke an external service to gather a super set of the data: https://www.ing.nl/api/locator/atms/

#Get All ATMs available in all city
curl -X GET --header 'Accept: application/json' 'http://localhost:8181/atmLocations'

#Get ATM details based on the city name
curl -X GET --header 'Accept: application/json' 'http://localhost:8181/atmLocations/{CITY}'

#Web App URL
http://localhost:8081/

User name: admin
Password : password

