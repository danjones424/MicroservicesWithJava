# Simple CRUD API Backend using Docker, Spring Boot, and Postgres

This project is a simple CRUD API backend developed using Spring Boot, Postgres, and Docker. The project provides endpoints to create, read, update, and delete records from the database. The project is containerized using Docker, making it easy to deploy and run in any environment.
Getting Started

To run the project, follow these steps:
Prerequisites

Make sure you have the following software installed on your machine:

    Java 8 or higher
    Docker


## Installation

1.) Clone the repository:

```bash
git clone https://github.com/your-username/simple-crud-api.git
```

2.) Navigate to the project directory:

```bash
cd  MicroservicesWithJava
```

3.) Build the Docker image


4.) Run the Docker container:

The API will now be available at http://localhost:4080.



The API provides the following endpoints:

## GET /api/members

Returns a list of all members in the database.

## POST /api/members

Creates a new member with the specified details.


## PUT /api/members/{id}

Updates the details of the member with the specified ID.

## DELETE /api/members/{id}

Deletes the member with the specified ID from the database.

Technologies Used

    Java 8
    Spring Boot
    Postgres
    Docker

Contributing

If you would like to contribute to this project, please open a pull request.

