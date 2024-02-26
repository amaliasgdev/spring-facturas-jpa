# Spring Facturas JPA

## Descripción

Este proyecto es un ejercicio de Spring Boot MVC que implementa un sistema CRUD (Crear, Leer, Actualizar, Eliminar) para la gestión de facturas. Utiliza Spring Data JPA para interactuar con una base de datos MySQL, Thymeleaf para la renderización de vistas HTML, y Spring Web para manejar las solicitudes HTTP.

## Características

- **Página de Inicio**: Punto de entrada de la aplicación desde donde los usuarios pueden navegar a las diferentes secciones.
- **Registro de Facturas**: Permite a los usuarios agregar nuevas facturas a través de un formulario.
- **Lista de Facturas**: Muestra todas las facturas registradas con opciones para editar o eliminar cada factura.
- **Edición de Facturas**: Los usuarios pueden actualizar los datos de las facturas existentes.
- **Eliminación de Facturas**: Permite a los usuarios eliminar facturas del sistema.

## Configuración del Proyecto

### Requisitos Previos

- JDK 11 o superior.
- Spring Tool Suite 4 o IDE de preferencia con soporte Spring.
- MySQL Server.

### Paso 1: Crear la Base de Datos

En MySQL Workbench, crea una base de datos llamada `facturas` y una tabla `invoices` con las columnas adecuadas según el modelo de datos.

### Paso 2: Crear el Proyecto

Utiliza Spring Tool Suite 4 para crear un nuevo proyecto de Spring Boot con las dependencias:
- Spring Web
- Spring Data JPA
- MySQL Driver
- Thymeleaf
- Spring Boot DevTools

### Paso 3: Configurar `application.properties`

Configura el archivo `src/main/resources/application.properties` para conectar con tu base de datos MySQL, especificando la URL, el nombre de usuario y la contraseña.

### Paso 4: Crear la Clase de Entidad

Define una clase de entidad `Invoice` en `src/main/java/com/tuempresa/facturas/model` para mapear la tabla `invoices`.

### Paso 5: Crear la Interfaz del Repositorio

Crea una interfaz en `src/main/java/com/tuempresa/facturas/repository` que extienda `JpaRepository` para acceder a la base de datos.

### Paso 6: Clases de Servicio

Implementa una interfaz de servicio y su clase de implementación en `src/main/java/com/tuempresa/facturas/service` para la lógica de negocio.

### Paso 7: Crear la Clase Controladora

Desarrolla una clase controladora en `src/main/java/com/tuempresa/facturas/controller` para manejar las solicitudes HTTP.

### Paso 8: Crear las Páginas de Navegación

Utiliza Thymeleaf para desarrollar las páginas HTML en `src/main/resources/templates` para las diferentes vistas y funcionalidades de la aplicación.

## Ejecución

Para ejecutar el proyecto, navega al directorio raíz y ejecuta:

```
./mvnw spring-boot:run
```


Abre un navegador y visita `http://localhost:8080` para acceder a la aplicación.

## Navegación en la Aplicación

- Desde la **página de inicio**, utiliza los enlaces para navegar a "Agregar factura" o "Mostrar todas las facturas".
- En la **página de registro de facturas**, completa el formulario y guarda la factura.
- La **página Lista de facturas** permite editar o eliminar facturas, y navegar de vuelta a la página de inicio o al formulario de registro de facturas.

## Contribución

Si deseas contribuir a este proyecto, por favor haz un fork y envía un pull request con tus cambios.

