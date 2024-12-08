## Docker Image larını eklemek

    PostgreSQL
    userName: postgres
    password: root
    DB: AuthDB
```bash
docker run --name postgresql -e POSTGRES_PASSWORD=root -p 5431:5432 -d postgres
```
    MongoDB
    userName: admin
    password: root
    DB: UserProfileDB
```bash
docker run -d --name mongodb -p 27020:27017 -e MONGO_INITDB_ROOT_USERNAME=admin -e MONGO_INITDB_ROOT_PASSWORD=root mongo
```

    mongod: 
    db.createUser({user: "erdem",pwd: "root",roles: ["readWrite","dbAdmin"]}) 


