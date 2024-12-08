There are 2 microservices in this project, AuthMicroservice and UserMicroservice. AuthMicroservice uses PostgreSql UserMicroservice uses MongoDB and these databases are initialized with Docker. Dependency management is done with Gradle. 

<p align="center"> <a href="https://www.docker.com/" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/docker/docker-original-wordmark.svg" alt="docker" width="80" height="80"/> </a> <a href="https://www.mongodb.com/" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/mongodb/mongodb-original-wordmark.svg" alt="mongodb" width="80" height="80"/> </a> <a href="https://www.postgresql.org" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/postgresql/postgresql-original-wordmark.svg" alt="postgresql" width="80" height="80"/> </a>  <a href="https://spring.io/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/springio/springio-icon.svg" alt="spring" width="80" height="80"/> </a> </p>

## AuthMicroservice
![auth](https://github.com/user-attachments/assets/64d236dd-788c-4399-861f-70b29e4a1efc)

## UserMicroservice
![user1](https://github.com/user-attachments/assets/dcf0432c-7781-4453-bfee-86915c0fe66e)
![user2](https://github.com/user-attachments/assets/45f9d1a6-c99e-45ac-b84c-15513fa77fd5)


## Docker Images

```bash
docker run --name postgresql -e POSTGRES_PASSWORD=root -p 5431:5432 -d postgres
```
```bash
docker run -d --name mongodb -p 27020:27017 -e MONGO_INITDB_ROOT_USERNAME=admin -e MONGO_INITDB_ROOT_PASSWORD=root mongo
```

    mongod: 
    db.createUser({user: "erdem",pwd: "root",roles: ["readWrite","dbAdmin"]}) 


