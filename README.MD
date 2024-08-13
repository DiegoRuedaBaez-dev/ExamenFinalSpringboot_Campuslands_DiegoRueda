# Examen Final Spring Boot - Gestión de Farmacias

## Descripción del Proyecto

Este proyecto es una aplicación de Spring Boot que implementa un sistema de gestión de farmacias. Está diseñado para manejar la información relacionada con las farmacias, incluyendo su nombre, dirección, ciudad, coordenadas geográficas, y logotipo.

## Tabla Farmacy

La tabla `farmacy` es una de las entidades centrales del sistema. Se encarga de almacenar la información básica sobre las farmacias registradas en el sistema.

### Estructura de la Tabla Farmacy

| Columna         | Tipo     | Descripción                                      |
| --------------- | -------- | ------------------------------------------------ |
| `idfarmacy`     | `int4`   | Identificador único de la farmacia               |
| `namefarmacy`   | `varchar(100)` | Nombre de la farmacia                          |
| `addressfarmacy`| `varchar(100)` | Dirección de la farmacia                       |
| `codecityfarmacy`| `varchar(5)`  | Código de la ciudad donde se ubica la farmacia  |
| `long`          | `float8` | Longitud geográfica de la farmacia               |
| `lat`           | `float8` | Latitud geográfica de la farmacia                |
| `logo`          | `varchar(50)` | Logotipo de la farmacia                         |

## Endpoints Implementados

A continuación se describen los endpoints CRUD (Create, Read, Update, Delete) implementados para la tabla `farmacy`:

### Crear una nueva farmacia

**URL:** `/farmacy`  
**Método:** `POST`  
**Descripción:** Este endpoint permite crear una nueva farmacia.  
**Cuerpo de la solicitud:**
```json
{
  "namefarmacy": "Pharmacy Name",
  "addressfarmacy": "123 Main St",
  "codecityfarmacy": "C001",
  "long": -118.2437,
  "lat": 34.0522,
  "logo": "logo.png"
}
```

### Obtener todas las farmacias

**URL:** `/farmacy`  
**Método:** `GET`  
**Descripción:** Este endpoint permite obtener la lista de todas las farmacias registradas.

### Obtener una farmacia por ID

**URL:** `/farmacy/{idfarmacy}`  
**Método:** `GET`  
**Descripción:** Este endpoint permite obtener la información de una farmacia específica mediante su ID.

### Actualizar una farmacia

**URL:** `/farmacy/{idfarmacy}`  
**Método:** `PUT`  
**Descripción:** Este endpoint permite actualizar la información de una farmacia existente.  
**Cuerpo de la solicitud:**
```json
{
  "namefarmacy": "Updated Pharmacy Name",
  "addressfarmacy": "456 Elm St",
  "codecityfarmacy": "C002",
  "long": -74.0060,
  "lat": 40.7128,
  "logo": "updated_logo.png"
}
```

### Eliminar una farmacia

**URL:** `/farmacy/{idfarmacy}`  
**Método:** `DELETE`  
**Descripción:** Este endpoint permite eliminar una farmacia específica mediante su ID.

## Requisitos del Proyecto

- Java 11 o superior
- Spring Boot 2.5.4 o superior
- Maven 3.6.3 o superior
- PostgreSQL o cualquier otra base de datos compatible con Spring Data JPA

## Configuración del Proyecto

1. Clonar el repositorio en tu máquina local.
2. Configurar la base de datos en el archivo `application.properties`:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   ```
3. Ejecutar el proyecto usando Maven:
   ```bash
   mvn spring-boot:run
   ```

## Pruebas

Puedes probar los endpoints usando herramientas como Postman o cURL.

### Ejemplo de prueba con cURL

**Crear una nueva farmacia:**
```bash
curl -X POST http://localhost:8080/farmacy -H "Content-Type: application/json" -d '{"namefarmacy":"Pharmacy Name","addressfarmacy":"123 Main St","codecityfarmacy":"C001","long":-118.2437,"lat":34.0522,"logo":"logo.png"}'
```

**Obtener todas las farmacias:**
```bash
curl -X GET http://localhost:8080/farmacy
```
