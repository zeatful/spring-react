# Spring React
A quick prototype to build a Spring Boot Reactive Web application leveraging a Reactive Mongo DB database and a React front-end

## Getting Started
This project is configured to leverage docker to easily standup the application and its dependencies

### Prerequisites
1. A Mongo database instance (I recommend using Docker to easily stand one up)
```docker run -d -p 27017:27017 mongo```
2. Maven is optional since we are using maven wrapper
3. NodeJs and NPM are optional since they will be installed local to the application during the build

### Start up the application
```./mvnw spring-boot:run```

### Start the webpack server for quicker feedback / hot reloads
from webapp run ```npm start```
View your changes live on 9090 as you edit!

### Alternative Option Using Docker:
#### Package the application into a docker image
```./mvnw package -DskipTest```

#### Run the application and mongo using docker compose
```docker-compose up```

## About SoapBox
Getting ideas heard by politicians and leaders and getting true change is currently a slow process.  Change takes too long even when the majority of concerned parties are on board.

SoapBox is a locale based platform to anonymously voice your ideas and concerns to be voted on in a public forum with visibility to concerned parties, including leaders.  

By crowdsourcing support for change, it should alleviate a lot of the struggle in getting traction for ideas.  You can also pose opposition or counter arguments which can be answered to get a well-rounded scope of the issue at hand.

## Getting started using SoapBox
1. Create a user and enter a locale
    * a locale helps in displaying which topics should be available to you
    * it's important to uniquely confirm who you are to ensure unique voting 
1. View topics for various locales in which you belong
1. Vote on topics for a locale
1. Post a topic for a locale
1. Post questions, counter points, evidence for a topic
1. Answer questions or respond to counter points

## Rules to using SoapBox
1. No inappropriate language or profanity
1. No hateful comments
1. Topics for a locale should uniquely concern that locale
1. Be productive, only provide useful comments, this is not a place to troll
1. Do your due diligence to prevent duplicate topics