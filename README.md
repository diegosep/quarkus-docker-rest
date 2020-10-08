# quarkus-docker-rest project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

## Build
```
mvn package
```

### Build Docker Image
```
docker build -f src/main/docker/Dockerfile -t quarkus/quarkus-docker-rest .
```

### Run Docker Image
```
docker run -i -p 8080:8080 quarkus/quarkus-docker-rest
```

### Run it with cloud profile
´´´
docker run --env DATABASE_USERNAME=my_username --env DATABASE_PASSWORD=my_password  --env DATABASE_URL=jdbc:postgresql://localhost:5432/some-database  --env QUARKUS_PROFILE=aws -i -p 8080:8080 quarkus/quarkus-docker-rest
´´´

## Endpoints

### Get all Plants
```
GET /plant
```

### Persist a Plant
```
POST /plant
```
**Request Body**
```
{
    "name":"Aromo",
    "type": "Arbol"
}
```

