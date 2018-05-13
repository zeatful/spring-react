# Spring React
A quick prototype to build a Spring Boot Reactive Web application leveraging a Reactive Mongo DB database and a React front-end

### Getting Started
This project is configured to leverage docker to easily standup the application and its dependencies

#### Prerequisites
1. A Mongo database instance (I recommend using Docker to easily standone up)
```docker run -d -p 27017:27017 mongo```
2. Maven is optional since we are using maven wrapper
3. NodeJs and NPM are optional since they will be installed local to the application during the build

### Start up the application
```./mvnw spring-boot:run```

### Start the webpack server for quicker feedback
```webpack-dev-server```

### Optional package the application into a docker image
```./mvnw package -DskipTest```

### Optional run the application and mongo using docker compose
```docker-compose up```
