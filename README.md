# Spring boot call REST API

## Overview
This project is designed to interface with a third-party API to retrieve data, store it in a local database, and then forward the data to another API. It's built with automation and efficiency in mind, ensuring seamless data flow between services.

## Features
- **Data Retrieval**: Connects to a third-party API to fetch data.
- **Data Storage**: Saves the retrieved data into a structured database.
- **Data Transmission**: Sends the stored data to another specified API.

## Technologies Used

- **Spring Boot**: An open-source Java-based framework used to create a micro Service. It is developed by Pivotal Team and is used to build stand-alone and production-ready spring applications.

- **Maven**: A powerful project management tool that is based on POM (project object model). It is used for projects build, dependency, and documentation. It simplifies the build process like ANT.

- **H2 Database**: An open-source lightweight Java database that can be embedded in Java applications or run in the client-server mode. Mainly, H2 database can be configured to run as in-memory database, which means that data will not persist on the disk.

- **Spring Data JDBC**: Part of the larger Spring Data family, this framework makes it easy to implement JDBC operations with less boilerplate code required. It aims to improve database access while providing a strong separation between the domain model and the database.
