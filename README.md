# ReseñasMix 🎮

ResenasMix es una API REST desarrollada con Spring Boot que funciona como el backend de una página web de reseñas de videojuegos.  
El sistema permite administrar usuarios, videojuegos y reseñas, además de consumir APIs externas para obtener información adicional sobre videojuegos y clima.

---

## Descripción del proyecto

Este proyecto semestral simula el backend de una plataforma de reseñas de videojuegos.  
La aplicación permite:

- Registrar usuarios
- Registrar videojuegos
- Crear reseñas asociadas a un usuario y a un videojuego
- Editar y eliminar registros
- Consultar listados desde la base de datos
- Consumir una API externa de videojuegos
- Consumir una API externa del clima

El proyecto está conectado a MySQL mediante Laragon y utiliza Spring Data JPA / Hibernate para persistir la información.

---

## Objetivo

El objetivo principal es construir un backend funcional, ordenado y conectado a base de datos, aplicando:

- Arquitectura en capas
- CRUD completo
- Relaciones entre entidades
- Validaciones
- Manejo de excepciones
- DTO
- Consumo de APIs externas
- Uso de Postman para pruebas
- Documentación del proyecto

---

## Tecnologías utilizadas

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- Spring Validation
- WebClient
- RestTemplate
- MySQL
- Laragon
- Maven
- Postman
- Lombok

---

## Arquitectura del proyecto

El proyecto está organizado en capas para mantener el código ordenado y fácil de mantener:

### `controller`
Recibe las peticiones HTTP y expone los endpoints REST.

### `service`
Contiene la lógica de negocio.

### `repository`
Permite comunicarse con la base de datos usando JPA.

### `model`
Contiene las entidades mapeadas a la base de datos.

### `dto`
Contiene objetos de transferencia de datos para solicitudes y respuestas.

### `exception`
Contiene el manejo global de errores y excepciones personalizadas.

### `config`
Contiene configuraciones como `WebClient`.

---

## Funcionalidades principales

### CRUD de Usuarios
Permite:

- Crear usuarios
- Listar usuarios
- Buscar usuario por ID
- Actualizar usuario
- Eliminar usuario

### CRUD de Videojuegos
Permite:

- Crear videojuegos
- Listar videojuegos
- Buscar videojuego por ID
- Actualizar videojuego
- Eliminar videojuego

### CRUD de Reseñas
Permite:

- Crear reseñas
- Listar reseñas
- Buscar reseña por ID
- Actualizar reseña
- Eliminar reseña

Cada reseña está relacionada con:

- Un usuario
- Un videojuego

### Consulta de juegos externos
Se consume la API de FreeToGame para obtener videojuegos gratuitos desde una fuente externa.

### Consulta de clima
Se consume la API de Open-Meteo para consultar información climática por coordenadas.

---

## Requisitos del proyecto y cumplimiento

Este proyecto cumple con los requisitos solicitados:

- Conexión a una API externa
- Uso de Hibernate + JPA
- Uso de `findAll()`
- Arquitectura CSR (Controller, Service, Repository)
- Modelos mapeados a la base de datos
- Uso de DTO
- Validaciones
- Manejo de excepciones
- Mensajes en consola con logs debug
- Git con múltiples commits
- Controladores con CRUD completo
- Relaciones entre entidades
- README
- Postman Collection

---

## Entidades del sistema

### Usuario
Campos principales:

- id
- nombre
- email

### Videojuego
Campos principales:

- id
- titulo
- genero
- consola

### Reseña
Campos principales:

- id
- comentario
- calificacion
- usuario
- videojuego

---

## Relaciones entre entidades

### Usuario → Reseña
Un usuario puede tener muchas reseñas.

### Videojuego → Reseña
Un videojuego puede tener muchas reseñas.

### Reseña → Usuario
Cada reseña pertenece a un usuario.

### Reseña → Videojuego
Cada reseña pertenece a un videojuego.

---

## Validaciones implementadas

El proyecto incluye validaciones con Jakarta Validation para evitar datos incorrectos.

### Ejemplos:
- El nombre no puede estar vacío
- El email debe tener formato válido
- El título del videojuego no puede estar vacío
- El comentario de la reseña es obligatorio
- La calificación debe estar entre 1 y 5
- El comentario debe tener un largo mínimo y máximo

---

## Manejo de excepciones

Se implementó un manejador global de excepciones para responder con mensajes claros cuando ocurre un error.

### Errores controlados:
- Recurso no encontrado
- Fallo de validación
- Error interno del servidor

Esto permite que la API devuelva respuestas ordenadas y fáciles de entender.

---

## Logs y depuración

El proyecto muestra mensajes en consola para facilitar el seguimiento de las acciones realizadas.

### Ejemplos de logs:
- Listado de usuarios
- Guardado de videojuegos
- Creación de reseñas
- Eliminación de registros
- Consultas a APIs externas

La configuración de debug está activada en `application.properties`.

---

## Base de datos

La aplicación usa MySQL con Laragon.

### Configuración:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/resenasmix?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
