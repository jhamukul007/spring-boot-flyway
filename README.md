## Spring boot Application with Flyway

### Prerequisites
1. Database configurations

   Dependency

```agsl
implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
implementation 'com.h2database:h2'
```
Configurations

```agsl
spring:
  datasource:
    url: jdbc:h2:mem:testdb
    username: admin
    password: password
    driverClassName: org.h2.Driver
  jpa:
    data-platform: org.hibernate.dialect.H2Dialect
  h2:
    console:
      enabled: true
      path: /h2-console
```
### Flyway
Flyway updates a database from one version to the next using migrations. We can write migrations either in SQL with database-specific syntax, or in Java for advanced database transformations.

Flyway uses SQL for defining a change. On the other hand, Liquibase provides flexibility to specify a change in different formats including SQL such as XML, YAML, and JSON. With Liquibase we can work with database-agnostic languages and easily apply schema changes to different database types.

### Dependency
```agsl
implementation 'org.flywaydb:flyway-core'
```
### Configuration
For Log
```agsl
logging:
  level:
    org:
      flywaydb: DEBUG
```

### Database Migration File
```agsl
1. Migration file should be inside resources/db.migration
2. File Format should be 
<Version>__<discription>.sql

<Version> -> V1.0.0
            OR
            V_1_1_1
            
File Name example: V1.0__create_book.sql
```