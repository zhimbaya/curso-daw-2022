# CURSO DE BASE DE DATOS - DAM

([MySQL :: MySQL 8.0 Reference Manual](https://dev.mysql.com/doc/refman/8.0/en/))

[01.Programación Didáctica BBDDArchivo](./DOCUMENTACION/01.Programación Didáctica BBDDArchivo.pdf)

# UT1.- Almacenamiento de información

**Resultado de aprendizaje.** 

Reconoce los elementos de las bases de datos analizando sus funciones y valorando la utilidad de los sistemas gestores de Bases de Datos

**Contenidos**

- Ficheros (planos, indexados y acceso directo, de marcas, entre otros)
- Bases de datos (BD). Conceptos, usos y tipos según el modelo de datos, la ubicación de la información. 
- Sistemas gestores de bases de datos (SGBD): funciones, componentes y tipos.     
- SGBD comerciales vs. SGBD libres.
- Bases de datos centralizadas y bases de datos distribuidas.

**Temporalización.**

8 sesiones  

**Recursos:**

# UT2.-Bases de Datos Relacionales

- **RESULTADO DE APRENDIZAJE.**
  
  Crea bases de datos definiendo su estructura y las características de sus elementos
  
  según el modelo relacional.
  
  **CONTENIDOS.**

- Modelo de datos.

- Terminología del modelo relacional. Relaciones, atributos, tuplas.  

- Tipos de datos.  

- Claves primarias.  

- Índices. Características. Tipos.  

- El valor NULL.  

- Claves ajenas.  

- Vistas.  

- Gestión de seguridad:  

- Usuarios.  

- Roles.  

- Privilegios.

- Límites en el uso del SGBD (perfiles).

- Lenguaje de definición de datos (DDL Data Definition Language).  

- Lenguaje de manipulación de datos (DML Data Manipulation Language).  

- Lenguaje de control de datos (DCL Data Control Language).  

**RECURSOS.**

**Taller UT2**

Este taller servirá para la coevaluación entre pares siguiendo las instrucciones que se indican.  

Se solicita la entrega de tres ficheros, correspondientes a las actividades realizadas de la UT2:

- Fichero en formato .pdf (con nombre UT2diagrama_<InicialesAlumno> con el diagrama lógico de la Base de datos nombrada <InicialesAlumno>jardineria (réplica de la base de datos jardineria) con las modificaciones indicadas en el documento de Actividad UT2.
- Script .sql (con nombre UT2script_<inicialesAlumno>),  que contendrá todos las sentencias de creación de la base de datos, tablas, índices, vistas y modificaciones.
- Fichero con extensión .txt (UT2log_<inicialesAlumno>) que contendrá los comandos del script y el resultado de su ejecución. Para ello, se utilizará el comando tee-notee del intérprete de comandos mysql, haciendo un copy/paste del script.

# UT3.- Realización de consultas.

**RESULTADO DE APRENDIZAJE.**

Consulta la información almacenada en una base de datos empleando asistentes,

herramientas gráficas y el lenguaje de manipulación de datos.

**CONTENIDOS.**

Consultas para extraer información: **la sentencia SELECT.**

-  Selección, filtrado y ordenación de registros.  

-  Operadores (combinación, precedencia):  
1. De comparación.  

2.  Lógicos.  

3.  Aritméticos.  
- Consultas de resumen. Funciones de agregado.  

- Agrupaciones de registros. Filtrado de las agrupaciones.  

- Composiciones internas.  

- Composiciones externas.  

- Subconsultas:  
1. Devolución de valores individuales.  

2. Devolución de listas de valores.  

3. Devolución de tuplas de valores.  

4. Correlacionadas.  
- Consultas jerárquicas.  

- Consultas de operaciones de conjuntos: unión, intersección, diferencia.

# UT4.- Tratamiento de Datos.

**RESULTADO DE APRENDIZAJE.**

Modifica la información almacenada en la base de datos utilizando asistentes,

herramientas gráficas y el lenguaje de manipulación de datos.

**CONTENIDOS.**

- Inserción de registros.  

- Borrado de registros. Modificación de registros.  

- Borrados y modificaciones e integridad referencial. Subconsultas y composiciones  

- en órdenes de edición.  

- Transacciones.  

-  Políticas de bloqueo.

Recursos

# UT5.-Programación de Bases de Datos.

**RESULTADO DE APRENDIZAJE.**

Desarrolla procedimientos almacenados evaluando y utilizando las sentencias del

lenguaje incorporado en el sistema gestor de bases de datos.

**CONTENIDOS.**

- Introducción. Lenguaje de programación.
- Sintaxis. Palabras reservadas. Comentarios.
- Variables del sistema y variables de usuario.
- Tipos de datos compuestos: registros, listas.
-  Funciones.
- Estructuras de control de flujo (disyunción, iteración).
- Procedimientos almacenados. Funciones de usuario.
-  Subrutinas. Ámbito de variables.
- Eventos y disparadores.
- Excepciones: tipos y tratamiento.
- Cursores.

**RECURSOS.**

# UT6.-Interpretación de diagramas Entidad-Relación

**RESULTADO DE APRENDIZAJE.**

Diseña modelos relacionales normalizados interpretando diagramas entidad/relación.  

**CONTENIDOS.**

- Entidades y relaciones. Atributos. Cardinalidad.  

- Entidades fuertes vs. entidades débiles. Relaciones de dependencia en existencia y en  

- identificación.  

- El modelo E/R ampliado. Generalizaciones.  

- Paso del modelo E/R al modelo relacional.  

- Normalización de modelos relacionales. Formas normales. Desnormalización.  

**RECURSOS.**

# UT7.-Uso de bases de datos objeto-relacionales

**RESULTADO DE APRENDIZAJE.**

Gestiona la información almacenada en bases de datos objeto-relacionales, evaluando

y utilizando las posibilidades que proporciona el sistema gestor.

**CONTENIDOS.**

- Características de las bases de datos objeto-relacionales.  

- Tipos de datos objeto.  

- Definición de tipos de objeto.  

- Herencia.  

- Identificadores; referencias. Navegabilidad.

- Tipos de datos colección.

- Declaración e inicialización de objetos.  

- Uso de la sentencia SELECT.  

- Inserción de objetos.  

- Modificación y borrado de objetos.  

**RECURSOS.**
