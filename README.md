## Event Tracker Project

*This project was about performing simple CRUD on a single table database. Plus setting the backend for the application. *

### Lessons Learned

* Creating a SQL database and subsequent tables.  
* Configuring a JPA project.  
* Mapping an entity to a SQL table.  
* Creating JUnit tests to ensure our JPA mapping are correct.  
* Integrating a Spring REST project with a JPA project.
* Performing basic CRUD operations.
* Deploying an application to AWS

#### Purpose and usage of the Application
This application is made for pain management. The purpose is to track pain. Not only location, but intensity, triggers that caused the pain, but also start and end points. This makes it easier to diagnose the recurring issues.

How To Operate
The app is located at http://52.26.41.223:8080/PainTrackerREST/api/

API Routes

* get all pains -> "pains"
* get pains by range of intensit -> "pain/search/intensity/{low}/{high}"
	
* Save pain to the tracker -> "pain"
* Find pain by ID -> "pain/{id}"
* Delete pain	 -> "pain/{id}"	 
* Update pain -> "pain/{id}")