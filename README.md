
# Spring Facturas JPA

## Descripción

Spring Facturas JPA es un proyecto basado en Spring Boot MVC diseñado para la gestión de facturas mediante operaciones CRUD (Crear, Leer, Actualizar, Eliminar). Se apoya en Spring Data JPA para la interacción con MySQL, Thymeleaf para la renderización de vistas HTML, y Spring Web para el manejo de solicitudes HTTP.

## Funcionalidades

- **Página de Inicio**: Acceso principal para la navegación entre secciones.
- **Registro de Facturas**: Formulario para la adición de nuevas facturas.
- **Lista de Facturas**: Visualización y gestión (edición/eliminación) de facturas registradas.
- **Edición y Eliminación de Facturas**: Interfaces para actualizar o remover facturas.

## Configuración e Instalación

### Requisitos

- JDK 11 o superior.
- IDE con soporte Spring (recomendado: Spring Tool Suite 4).
- MySQL Server (preferiblemente a través de XAMPP, configurado en el puerto 3307).

### Instalación y Configuración

1. **Base de Datos**:
   - Utiliza MySQL Workbench o XAMPP para crear una base de datos llamada `facturas`.
   - Configura el puerto 3307 en XAMPP para MySQL si es necesario.
   - La aplicación está configurada para auto-crear la tabla `invoices` al arrancar, basándose en la clase de entidad.

2. **Proyecto**:
   - Crea un nuevo proyecto Spring Boot con las dependencias necesarias (Spring Web, Spring Data JPA, MySQL Driver, Thymeleaf, Spring Boot DevTools) usando Spring Tool Suite 4 o tu IDE de preferencia.

3. **Archivo de Propiedades**:
   - En `src/main/resources/application.properties`, configura la conexión a tu base de datos MySQL, incluyendo URL, nombre de usuario, y contraseña, asegurándote de especificar el puerto 3307 para la conexión.

4. **Desarrollo**:
   - **Clase de Entidad**: Define `Invoice` en `src/main/java/com/tuempresa/facturas/model`.
   - **Interfaz de Repositorio**: Crea una en `src/main/java/com/tuempresa/facturas/repository`.
   - **Servicios y Controladores**: Implementa la lógica de negocio y el manejo de solicitudes HTTP respectivamente.

5. **Vistas**:
   - Desarrolla las páginas HTML con Thymeleaf en `src/main/resources/templates` para las diferentes funcionalidades.

### Ejecución

Para arrancar el proyecto, navega al directorio raíz y ejecuta:

```
./mvnw spring-boot:run
```

Visita `http://localhost:8080` en tu navegador para acceder a la aplicación.

## Navegación en la Aplicación

- **Página de Inicio**: Enlaces para agregar o mostrar todas las facturas.
- **Registro de Facturas**: Completa el formulario para guardar una nueva factura.
- **Lista de Facturas**: Edita o elimina facturas, con opciones para volver a la página de inicio o al formulario de registro.

## Contribución

Si deseas contribuir al proyecto, por favor haz un fork, aplica tus cambios, y envía un pull request.
