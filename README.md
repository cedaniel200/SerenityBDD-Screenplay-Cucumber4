# SerenityBDD + Screenplay + Cucumber4 

Proyecto base para proyectos de automatización web con serenityBDD, screenplay y cucumber4.

# Migración Cucumber2 a Cucumber4 (Gradle)

Se debe:
* Asegurarse de que la versión **4.x** de **cucumber-core** se utiliza con el elemento **resolutionStrategy**
* Agregar la dependencias de **cucumber-java** y **cucumber-junit** usando la versión **4.x**
* Usar la dependencia **net.serenity-bdd:serenity-cucumber4** en vez de **net.serenity-bdd:serenity-cucumber**

        configurations.all {
            resolutionStrategy {
                force "io.cucumber:cucumber-core:4.2.0"
            }
        }
        
        dependencies {
            testImplementation "net.serenity-bdd:serenity-core:2.0.43"
            testImplementation "net.serenity-bdd:serenity-cucumber4:1.0.5"
            testImplementation "io.cucumber:cucumber-core:4.2.0"
            testImplementation "io.cucumber:cucumber-junit:4.2.0"
        }


más información

https://cucumber.io/blog/open-source/announcing-cucumber-jvm-4-2-0/


## Detalles Arquitectura Propuesta

Con este proyecto ya puedes empezar a construir tus test usando el patrón screenplay, solo debes:
 * Cambiar el nombre del paquete base **com.cedaniel200** por el de tu organización, por ejemplo **co.com.organizacion**
 * Crear los paquetes que hacen falta en el módulo main dentro del paquete base, según la arquitectura propuesta a continuación:

````
----- Módulo main
+ exceptions
    Clases que controlan las posibles excepciones técnicas y de negocios que se presentan durante la ejecución de pruebas
+ model
    Clases relacionadas con el modelo de dominio y sus respectivos builder cuando es necesario
+ tasks
    Clases que representan tareas que realiza el actor a nivel de proceso de negocio
+ interactions
    Clases que representan las interacciones directas con la interfaz de usuario
+ userinterface
    Page Objects y Page Elements. Mapean los objetos de la interfaz de usuario
+ questions
    Objetos usados para consultar acerca del estado de la aplicación
+ util
    Clases de utilidad
----- Módulo test
+ runners
    Clases que permiten correr los tests
+ step definitions
    Clases que mapean las líneas Gherkin a código java
+ features
    La representación de las historias en archivos cucumber
````

## Requerimientos

Para correr el proyecto se necesita Java JDK 1.8 y Gradle preferiblemente con la versión 5.2.1.

## Para correr el proyecto

Ejecutar el comando:

    gradle clean build test -i

Donde se podra ver en consola los diferentes mensajes que demuestran que se esta haciendo uso de algunas de las nuevas 
caracteristicas de Cucumber4

 ### Si tiene alguna pregunta, puede escribirme a cdanielmg200@gmail.com