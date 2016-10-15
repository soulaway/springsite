mysql-server

docker run -it --link mysql1:mysql --rm mysql/mysql-server:4.6 sh -c 'exec mysql accounts << db.sql'

> docker run --name mysql1 -e MYSQL_ROOT_PASSWORD=springsite -e MYSQL_USER=springsite -e MYSQL_PASSWORD=springsite -e MYSQL_DATABASE=accounts -d -p 3306:3306 mysql/mysql-server:5.6

> docker cp src/main/resources/db.sql mysql1:/

> docker run -it --link mysql1:mysql --rm mysql/mysql-server:4.6 sh -c 'exec chcon -Rt /var/lib/mysql/ && mysql -u root -p springsite accounts << db.sql'

* Start new MySql instance with accounts DB 

> docker run --name mysql1 -e MYSQL_ROOT_PASSWORD=springsite -e MYSQL_DATABASE=accounts -d -p 3306:3306 mysql/mysql-server:5.6

MYSQL_USER="coreosuser"
MYSQL_DATABASE="enterpriseregistrydb"
MYSQL_CONTAINER_NAME="mysql"
MYSQL_ROOT_PASSWORD=$(cat /dev/urandom | tr -dc 'a-zA-Z0-9' | fold -w 32 | sed 1q)
MYSQL_PASSWORD=$(cat /dev/urandom | tr -dc 'a-zA-Z0-9' | fold -w 32 | sed 1q)

docker run \
  --detach \
  --env MYSQL_ROOT_PASSWORD=springsite \
  --env MYSQL_USER=springsite \
  --env MYSQL_PASSWORD=springsite \
  --env MYSQL_DATABASE=springsite \
  --name mysql1 \
  --publish 3306:3306 \
  mysql:5.6;
  
for i in `seq 1 10`;
do
  echo "."
  sleep 1
done
echo "Database '${MYSQL_DATABASE}' running."
  
Stopping mysql - service mysqld stop

Optimization of the Flow Control. Tuning group replication performance <http://mysqlhighavailability.com/zooming-in-on-group-replication-performance/>

> flow-control-mode=QUOTA* | DISABLED

> flow-control-certifier-threshold=25000* | 0..n

> flow-control-applier-threshold=25000* | 0..n