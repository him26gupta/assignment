# Assignment

#Get All ATMs available in all city
curl -X GET --header 'Accept: application/json' 'http://localhost:8181/atmLocations'

#Get ATM details based on the city name
curl -X GET --header 'Accept: application/json' 'http://localhost:8181/atmLocations/{CITY}'

#Web App URL
http://localhost:8081/

#User name: admin

#Password : password

#Deployable war is present inside target folder as : atm-locator-0.0.1-SNAPSHOT.war

#Approached solution:

1.Get city name from rest call http://localhost:8181/atmLocations/{CITY} ,or fetching for all cities.

2.Calling third party service for ATM details via Resttemplate.

3.Formatting the response according to client requirement.

4.Convert response to list.

5.Using streams API filter returned list based on city name, or sending the full list.

6.Sending back the response to user in List collection.

