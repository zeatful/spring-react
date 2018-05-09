# Spring React

A quick prototype to build a Spring Boot Reactive Web application leveraging a Reactive Mongo DB database and a React front-end

### Getting Started

This project is configured to leverage docker to easily standup the application and its dependencies

#### Prerequisites
1. You will need docker installed
2. Maven is optional since we are using maven wrapper
3. NodeJs and NPM are optional since they will be installed local to the application during the build

#### To build the image execute the below maven command
```
./mvn package
```

#### Next you should be able start the application with docker-compose
```
docker-compose up
```