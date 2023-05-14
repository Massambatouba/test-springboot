FROM openjdk:11-jdk

WORKDIR /app

COPY produits-0.0.1-SNAPSHOT.jar /app/produits.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","produits.jar"]

FROM mysql:latest

ENV MYSQL_ROOT_PASSWORD=""

#  COPY script.sql /docker-entrypoint-initdb.d/
# COPY script.sql /docker-entrypoint-initdb.d/