# Walmart Backend

Backend in Java to Walmart Test.

## Getting Started

### Requirements

- [Docker](https://www.docker.com/)
- [Docker Compose](https://docs.docker.com/compose/install/)
- Java 11

### Run with Docker

To use with docker compose you can run this command (inside the folder of project):

```bash
docker-compose up -d
```

After running docker compose, run the following command to docker to raise product database

```bash
docker exec mongodb-products bash -c './database/import.sh localhost'
```

> Remenber to install dependencies maven and create jar file before run docker compose.
> ``` mvn clean install ``` -> install dependencies
> ``` java -jar target/Product-0.0.1-SNAPSHOT.jar ``` -> create jar file

### Consumer API

```curl
curl -H "Content-Type: application/json" http://localhost:8080/api/product/saas
```

## License
[MIT](https://choosealicense.com/licenses/mit/)
