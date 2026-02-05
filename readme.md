http://localhost:8087/pop/dancers/swagger-ui/index.html

## HOW TO RUN DB:

```
docker run -d -e MYSQL_PASSWORD=<haslo>  -e MYSQL_ROOT_PASSWORD=<haslo>  \
-e MYSQL_USER=<login> \
-i --name pop-dancers-mysql \
-p 5546:3306 \
pop-dancers-mysql
```

POSTGRES
docker build -t find-bugs-image -f findBugsSolution/database/Dockerfile findBugsSolution/database
docker run -d -i --name find-bugs-database-container -p 5432:5432 -e POSTGRES_USER=asia -e POSTGRES_PASSWORD=kopernik find-bugs-image

docker build -t find-bugs-app -f findBugsSolution/application/Dockerfile ../
docker run -d -i --name find-bugs-app-container -e USERNAME=postgres -e PASSWORD=bWxNWgMtxfswbtdivJFYCNapJnYaNNff -e ENCRYPTOR_PASSWORD=pASSword123 -p 8080:8080 find-bugs-app

MYSQL
docker build -t find-bugs-image -f findBugsSolution/database/Dockerfile findBugsSolution/database
docker run -d -i --name find-bugs-database-container -p 3306:3306 -e MYSQL_USER=asia -e MYSQL_PASSWORD=kopernik -e MYSQL_ROOT_PASSWORD=kopernik find-bugs-image

docker build -t find-bugs-app -f findBugsSolution/application/Dockerfile ../
docker run -d -i --name find-bugs-app-container -e ENCRYPTOR_PASSWORD=pASSword123 -p 8080:8080 find-bugs-app

DZIALAJACE (z infrastucture)
docker build -t find-bugs-app -f findBugsSolution/application/Dockerfile ../
docker run -d -i --name find-bugs-app-container -e USERNAME=postgres -e PASSWORD=bWxNWgMtxfswbtdivJFYCNapJnYaNNff -e ENCRYPTOR_PASSWORD=pASSword123 -p 8080:8080 find-bugs-app
