# RestAPI CRUD Project 
In this project, contains a simple CRUD project using Java with Spring boot. Basically, for practice purpose, and going through all CRUD methods

## Contents

- [Installation](#installation)
- [Configuration](#configuration)
- [Endpoints](#endpoints)
- [Database](#database)

## Installation

1. Clone the repository:

```bash
git clone https://github.com/monteirobiel/java.crud-ecomerce.git
```

2. Check the dependencies with Maven

## Usage

1. Start the application
2. The API will be accessible at http://localhost:8080

## Endpoints
You can access the following endpoints

```markdown
GET /product - Receive the list of all products registered.

POST /product - Register a new product.

PUT /product - Alter some product.

DELETE /product/{id} - Delete any selected product.
```
## Database
The project uses MySQL as the database. The necessary database migrations are managed using Flyway.