# Assignment
#Create a Java web application based on the standard servlet spec.
The Web application should provide a REST API to create a list of ING ATMs in a given Dutch city and return a well formed JSON response.
The web application should invoke an external service to gather a super set of the data: https://www.ing.nl/api/locator/atms/



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

#Development Tools
JAVA: 1.8.0_275-b01 Editor: Spring Tool Suite(STS) Version: 3.9.1.RELEASE Maven: apache-maven-3.5.3

