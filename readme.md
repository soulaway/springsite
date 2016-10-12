* Start new MySql instance with accounts DB 

> docker run --name mysql1 -e MYSQL_ROOT_PASSWORD=springsite -e MYSQL_DATABASE=accounts -d -p 3306:3306 mysql/mysql-server:5.6
 
Stopping mysql - service mysqld stop

Optimization of the Flow Control. Tuning group replication performance <http://mysqlhighavailability.com/zooming-in-on-group-replication-performance/>

> flow-control-mode=QUOTA* | DISABLED

> flow-control-certifier-threshold=25000* | 0..n

> flow-control-applier-threshold=25000* | 0..n