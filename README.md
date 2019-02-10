# ⚡ VaultTecDairy ⚡
REST service for Vault-Tec-Dairy (backend)

[![Build Status](https://travis-ci.com/SlandShow/VaultTecDairy.svg?branch=master)](https://travis-ci.com/SlandShow/VaultTecDairy)
[![License](https://img.shields.io/badge/license-MIT%20License-brightgreen.svg)](https://en.wikipedia.org/wiki/MIT_License)

### Stack (current): 
  1. Spring Boot 2
  2. Hibernate
  3. Maven
  4. H2 Database
  5. Swagger 2
  6. Liquibase
  
## Build & Run   

Build app via maven:
```
mvn clean install
```

Run it via mvn plugin ([documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/using-boot-running-your-application.html "Spring Boot plugin")):
```
mvn spring-boot:run
```
### What next?  
Use Swagger 2.0 to view API, if you run this service locally:

[http://localhost:8080/VaultDairy/swagger-ui.html](http://localhost:8080/VaultDairy/swagger-ui.html "Swagger 2.0")

You can also check h2 console:

[http://localhost:8080/VaultDairy/h2-console/](http://localhost:8080/VaultDairy/h2-console/ "h2")

Use default JDBC URL (`jdbc:h2:mem:testdb`)
  
  
## Dev 🛠️

### Reference:
1. [Maven](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html "Maven") 🍭
2. [Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started-installing-spring-boot.html "Spring Boot") 🎮
3. [Hibernate](http://hibernate.org/ "Hibernate ORM") 🔨
4. [H2](http://www.h2database.com/html/main.html "H2") 👽
5. [Liquibase](https://www.liquibase.org/7 "Liquibase") 👑
6. [Swagger](https://swagger.io/docs/specification/2-0/basic-structure/ "OpenAPI") 🎨
7. [Travis CI](https://docs.travis-ci.com/user/tutorial/ "Pipiline") ⏳
