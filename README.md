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

# OPEN API Definition
 - http://localhost:8080/swagger-ui
 - http://localhost:8080/api-docs or http://localhost:8080/api-docs.yaml

# Connect to GCP DataStore/Firestore
- create DataStore Entity in GCP console and define datastore namespace in appl.-properties

  