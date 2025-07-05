# 🛠️ Spring Data JPA - Hands-on

## Hands-on 1: 
Spring Data JPA- Quick Example

### Objective
Create a Spring Boot project using Spring Data JPA and connect it to a MySQL database. This example demonstrates use of `@Entity`, `@Repository`, and `@Service` layers using Hibernate.

---

## Project Name: `orm-learn`

### What’s Included

The folder contains:
- `orm-learn/` — Full Spring Boot Maven project with working code
- `Codes/` — Just the Java files mentioned in the exercise instructions
- `Output/` — Output screenshot of console log
- `MySQL/` — SQL schema, table, and insert statements with output image

---

## Key Features

- **Entity Class:** `Country.java`
- **Repository Interface:** `CountryRepository.java` (extends `JpaRepository`)
- **Service Class:** `CountryService.java`
- **Main Class:** `OrmLearnApplication.java`

### Configuration
- Database config in `application.properties`
- Logs include Spring, Hibernate SQL, and app logs
- Connected to schema `ormlearn` in MySQL

---

## Output
Expected log seen on successful execution:

Inside main
Start
List of countries (from DB)
End


Screenshot included in `Output/Spring Data JPA Output.png`

---

## Database (MySQL)

Schema creation and data insertion used:

```sql
create schema ormlearn;
create table country (
    co_code varchar(2) primary key,
    co_name varchar(50)
);
insert into country values ('IN', 'India');
insert into country values ('US', 'United States of America');

Output result screenshot: MySQL/Query Output.png
