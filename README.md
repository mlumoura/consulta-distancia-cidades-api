# Digital Innovation One

## Bootcamp TQI Java Developer

### Construindo uma API Rest de consulta de cidades do Brasil do zero até a produção

Neste projeto foi desenvolvida uma API REST para a consulta de países, cidades e estados brasileiros, além de um *endpoint* para o cálculo de distância entre duas cidades. 

O projeto foi desenvolvido utilizando **Java** com **Spring Boot** e o banco de dados **PostgreSQL**, além do deploy na nuvem do Heroku.

---

### 📝 Instruções

Para executar o projeto são necessários os seguintes pré-requisitos:

- Java 8
- Docker

1 — Crie o banco de dados *PostgreSQL* no **docker**, digitando seguinte comando no terminal:

```shell
docker run --name dio-cities-db -d -p 5432:5432 -e POSTGRES_USER=postgres_user_city -e POSTGRES_PASSWORD=super_password -e POSTGRES_DB=cities postgres
```

2 — Execute os comando abaixo para se conectar ao terminal do container **docker**, mapeando a pasta **sql** do projeto para a pasta **/tmp** do container:`

> Linux:
>
> ```shell
> docker run -it --rm --net=host -v $PWD/sql:/tmp postgres /bin/bash
> ```

3 — Para popular a base de dados e ativar as extensões necessárias, execute todos os comandos abaixo:

```shell
psql -h localhost -U postgres_user_city cities -f /tmp/pais.sql
psql -h localhost -U postgres_user_city cities -f /tmp/estado.sql
psql -h localhost -U postgres_user_city cities -f /tmp/cidade.sql

psql -h localhost -U postgres_user_city cities

CREATE EXTENSION cube; 
CREATE EXTENSION earthdistance;
```

    Postgres Earth distance
    earthdistance--1.0--1.1.sql
    OPERATOR <@>
    postgrescheatsheet
    datatype-geometric

---
4 — Acesso

```shell
docker exec -it cities-db /bin/bash

psql -U postgres_user_city cities
```

5 - Spring Boot

    https://start.spring.io/

    Java 8
    Gradle Project
    Jar
    Spring Web
    Spring Data JPA
    PostgreSQL Driver

6 - Query Earth Distance

Point
```shell
select ((select lat_lon from cidade where id = 4929) <@> (select lat_lon from cidade where id=5254)) as distance;
```
Cube
```shell
select earth_distance(
    ll_to_earth(-21.95840072631836,-47.98820114135742), 
    ll_to_earth(-22.01740074157715,-47.88600158691406)
) as distance;
```

### ⚙ Endpoints 

- /countries - Países
- /states - Estados
- /cities - Cidades

- /distance/by-points - Distância entre pontos (milhas)
- /distance/by-cube - Distância entre pontos (metros)

---

### 📚 Referências
 
- [Java JDK 8](https://www.oracle.com/br/java/technologies)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Initializr](https://start.spring.io/)
- [PostgreSQL](https://www.postgresql.org/)

- [SQL data files - chinnonsantos GitHub](https://github.com/chinnonsantos/sql-paises-estados-cidades)


