http://localhost:8087/pop/dancers/swagger-ui/index.html

## HOW TO RUN DB:

```
docker run -d -e MYSQL_PASSWORD=<haslo>  -e MYSQL_ROOT_PASSWORD=<haslo>  \
-e MYSQL_USER=<login> \
-i --name pop-dancers-mysql \
-p 5546:3306 \
pop-dancers-mysql
```