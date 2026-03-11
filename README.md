# 📚 Literalura

Literalura es una aplicación desarrollada en **Java con Spring Boot** que permite consultar información de libros utilizando la API pública de **Gutendex** (Project Gutenberg).
La aplicación permite buscar libros por título, registrar información en una base de datos y consultar autores y libros mediante diferentes filtros.

Este proyecto fue desarrollado como práctica para reforzar conceptos de **consumo de APIs, persistencia de datos y arquitectura de aplicaciones backend con Spring Boot**.

---

## 🚀 Tecnologías utilizadas

* Java 17
* Spring Boot
* Maven
* Spring Data JPA
* PostgreSQL
* API Gutendex (Project Gutenberg)

---

## ⚙️ Funcionalidades

La aplicación permite:

* 🔎 Buscar libros por título desde una API externa
* 📖 Registrar libros en la base de datos
* ✍️ Listar autores registrados
* 📚 Listar libros almacenados
* 📅 Consultar autores vivos en un año determinado
* 🌎 Filtrar libros por idioma

---

## 🏗️ Arquitectura del proyecto

El proyecto sigue una estructura típica de aplicaciones desarrolladas con Spring Boot:

```
src/main/java/in.Nayeli.literalura
│
├── dto
│   └── Clases para mapear la respuesta JSON de la API
│
├── model
│   └── Entidades de base de datos (Book, Author)
│
├── repository
│   └── Interfaces de acceso a datos con JPA
│
├── service
│   └── Lógica de negocio de la aplicación
│
├── principal
│   └── Clase que gestiona el menú y la interacción con el usuario
│
└── LiteraluraApplication
    └── Clase principal que inicia la aplicación
```

---

## 🖥️ Ejecución de la aplicación

Al ejecutar el proyecto se muestra un menú en consola con las siguientes opciones:

```
=== LITERALURA ===
1 - Buscar libro por título
2 - Listar libros registrados
3 - Listar autores registrados
4 - Listar autores vivos en un año
5 - Listar libros por idioma
0 - Salir
```

Cada opción permite interactuar con la base de datos y consultar información obtenida desde la API.

---

## 🌐 API utilizada

Este proyecto consume la API pública:

Gutendex – Project Gutenberg API

Permite acceder a un catálogo abierto de libros clásicos disponibles en dominio público.

---

## 🎯 Objetivo del proyecto

Este proyecto tiene como objetivo practicar y demostrar conocimientos en:

* Consumo de APIs REST
* Procesamiento de datos en formato JSON
* Persistencia de datos con JPA
* Arquitectura de aplicaciones con Spring Boot
* Integración entre backend y servicios externos

---

## 👩‍💻 Autor

Proyecto desarrollado por **Nayeli Darel** como parte de su formación en desarrollo backend con Java y Spring Boot.
