# Spring Site

Test web-app with Spring Security authorization by *user@pass* stored in MySql.

**Stack summary:**
* Servlets:

> javax.servlet:javax.servlet-api:3.0.1

> javax.servlet:jstl:1.2

* MVC:

> org.springframework:spring-web:4.2.0.RELEASE

> org.springframework:spring-webmvc:4.2.0.RELEASE

* Security:

> org.springframework:spring-security-web:4.0.2.RELEASE

> org.springframework:spring-security-config:4.0.2.RELEASE

* ORM:

> org.springframework:spring-data-jpa.version:1.8.2.RELEASE

> org.hibernate:hibernate-entitymanager:4.3.11.Final

> org.hibernate:hibernate-validator:5.2.1.Final

* Pooled data source:

> mysql:mysql-connector-java:5.1.36

> commons-dbcp:commons-dbcp:1.4

* Logging:

> ch.qos.logback:logback-classic:1.1.3

* Testing

> junit:junit:4.11

> org.mockito:mockito-core:1.9.5

> org.springframework:spring-test:3.2.3.RELEASE

# 
**3 steps to setup and run using Maven and Docker**

* Download mysql docker image 

> docker pull mysql-server:5.6

* Run mysql single instance

> docker run --name mysql1 -e MYSQL_ONETIME_PASSWORD=yes -e MYSQL_ROOT_PASSWORD=springsite -e MYSQL_USER=springsite -e MYSQL_PASSWORD=springsite -e MYSQL_DATABASE=accounts -d -p 3306:3306 mysql/mysql-server:5.6

* Run application

> mvn clean package jetty:run

Optimization of the Flow Control. Tuning group replication performance <http://mysqlhighavailability.com/zooming-in-on-group-replication-performance/>

> flow-control-mode=QUOTA* | DISABLED

> flow-control-certifier-threshold=25000* | 0..n

> flow-control-applier-threshold=25000* | 0..n