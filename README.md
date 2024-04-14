## Primer Examen Parcial

### Integrantes del Equipo:

Carlos Alberto Ávila González(AG22029)

José Franklin Ángel Guevara (AG19030)

Salvador Enrique Quezada Campos (QC07003)


### Instrucciones de instalación<hr>

- Clonar el repositorio.
- Accede al directorio del proyecto.

**Docker:**
- Elimina las imágenes previamente creadas y borra la caché: `docker-compose down --rmi all --volumes --remove-orphans`
- Abrir una ventana de terminal y ejecutar: `docker-compose up -d`.
Al verificar la consola de docker no se estará ejecutando ya que fallará, la causa es que primero se ejecuta el contenedor de la aplicación de Spring y después el contenedor de MariaDB, pero ¿Como solucionarlo?:
- Abrir una nueva ventana de terminal y ejecutar nuevamente: `docker-compose up -d` para Windows y `sudo docker compose up ` para SO Linux.

**Local:**
-  Abrir una ventana de terminal para compilar y ejecutar el proyecto con Maven:  `mvn clean package -DskipTests`
- Ejecutar la aplicacion con: `java -jar target/crud-0.0.1-SNAPSHOT.jar`
