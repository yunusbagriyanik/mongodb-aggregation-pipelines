## __MongoDB Aggregation Pipelines__

###### Requirements

* JDK 17(openjdk-17)
* Maven 3.6.3 or newer
* Spring Boot 3.0.12
* MongoDB 4.0.4
* Docker

---

###### 1. Run MongoDB on Docker

    $ docker run -d -p 27017:27017 --name test-mongo mongo:4.0.4

###### 2. Build Project

    $ mvn clean install