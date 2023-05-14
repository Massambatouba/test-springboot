# Installation manual



## Foreword

This project is the backend part of the QuizGame application. It was not meant to be installed with each component separately, but rather via Docker Compose solution of our app, the project of which is available here: https://github.com/realraec/quizgame-docker-compose . We strongly encourage you to follow the installation manual there instead of this one.

All the commands thereafter will have to be typed in Windows Terminal, in the WSL environment you can install following the tutorial to be found here : https://learn.microsoft.com/en-us/windows/wsl/install



## Prerequisites

The first five steps might be skippable -- depending on whether you have already installed the necessary tools for other projects -- but the last two are needed: the app needs a user, a database, for that user to have enough rights on this database, and a running PostgreSQL DBMS to work properly.

* Install git:

* Install wampserver64 :


* Install Java 11:


* Install Maven:


* Configure the database mysql:
  ```
  username: root
  password: 
  ```

* Start the database:

  ```
  create database: spring_DB_produits
  ```

With all this done, you should be able to follow the next steps to get a functional backend application running.



## The app itself

* Clone this repository:

  ```
  git clone https://github.com/Massambatouba/test-springboot.git.
  ```

* Navigate your way to the root of the application:

  ```
  cd ./produits
  ```

* Package the application into a runnable .JAR file:

  ```
  mvn package
  ```

* Start the application:

  ```
  java -jar ./target/produits-0.0.1-SNAPSHOT.jar
  ```
  
* Populate the database:

 
## Known bugs and workarounds

* If one or several of the installations do not work, after the `npm install` commands, try:



* If you encounter a problem and all else fails, please consider opting for the Docker Compose solution of our app, available here:

  https://github.com/realraec/packages-docker-compose

