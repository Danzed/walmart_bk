# Walmart Backend

Backend in Java to Walmart Test.

## Getting Started

### Requirements

- [Docker](https://www.docker.com/)
- [Docker Compose](https://docs.docker.com/compose/install/)
- Java 11

## Run with Docker

To use and test with docker compose you can run this command (inside the folder of project):

```bash
docker-compose up -d
```

After running docker compose, run the following command to docker to raise product database

```bash
docker exec mongodb-local bash -c './database/import.sh localhost'
```

## Usage

```python
import foobar

foobar.pluralize('word') # returns 'words'
foobar.pluralize('goose') # returns 'geese'
foobar.singularize('phenomena') # returns 'phenomenon'
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)