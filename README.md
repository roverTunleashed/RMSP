# Rate my SFU professor
![image](https://github.com/user-attachments/assets/d0b18ae1-8712-4190-b9a1-9aaf9bf7dade)
 
## Purpose
Created a quick and easy way for students rank their favorite (or least favorite) professors at Simon Fraser University\
Applying knowledge learnt from Node.js to a new framework (Spring) 

## Backend Technologies
Using Java with the Spring Framework, Spring Boot to quickly bootstrap production-level appliciation that is simple to run

- Layered (3 tier) architecture with Controller, Service and Repository classes

  - Controller handles HTTP request
  - Services handles business logic
  - Repository handles database interactions with MongoDB database

Within the MongoDB database, images of professors are stored as a String with their corresponding S3 uri.
This was done to make use of Amazon S3s infinite scalability, while reducing the databases size, for quicker querying. 

## Frontend Technologies 
Using TypeScript with React for the front end
Link to frontend project: https://github.com/roverTunleashed/RMSP_frontend

