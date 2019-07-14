# prova-offermanager

Una API backend RESTful per la per la gestione delle offerte di prodotti.

## Toolset
- Spring Boot
- Spring MVC
- Spring Data JPA
  - out-of-the-box DAO-generation at runtime via method-naming conventions

- Hibernate
- Jackson Annotations
  - custom serialization of references (@JsonIdentityInfo, @JsonIdentityReference)
- H2 Database

- Maven
- Git
- Mockito

## Requirements

- product are grouped in different categories (books, bikes, food) 
- ATTENTION: for now only book categories have been created
