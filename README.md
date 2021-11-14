# SpringBootPlayground - To Do:
- [x] setup github & and spring initalizr project
- [x] add get controller / DTO / Service / entity
- [ ] add post/put/patch controller / DTO / Service / mapper / entity
- [x] use JPA for GET database items (mariaDB)
- [x] use logstash for logging to elk stack
- [ ] setup CI/CD pipeline (Jenkins, TC, ..?)
- [ ] setup Docker deployment (prepare Docker File that does mvn clean install inside Docker build process, Travis?, Firebase?, heroku.com?)
- [ ] add authentication to REST endpoints (basic auth, keycloak, firebase)
- [ ] Read user from JWT Token
- [ ] write Unit Test
- [ ] define REST Service via OpenAPI 3.0 (editor.swagger.io)
- [x] call service as consumer (WebClient) - https://www.boredapi.com
- [ ] run helm deployment
- [ ] mvn: run with certain profile
- [ ] use github actions to deploy to DigitalOcean


# Connect to mySQL on GCP
- gcloud sql connect fj-mysql-db --user=root --quiet
- SHOW DATABASES;
- USE messageDB;
- CREATE TABLE msg_message (id int NOT NULL, msg_text varchar(255));
- SHOW TABLES;
- INSERT INTO msg_message values ("1", "First messagge text");
- Select * from msg_message;

