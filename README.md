# APB-DE-BASE-DATO
#CONTEXTO

En la actualidad, los libros manga se han convertido en una de las formas de lectura más populares entre jóvenes y adolescentes. Sin embargo, muchas bibliotecas escolares y personales no cuentan con un sistema digital organizado que permita registrar, buscar y gestionar correctamente estos libros. Esto provoca pérdida de información, dificultad para encontrar mangas disponibles y desorden en los registros.
Este proyecto propone el desarrollo de una aplicación de gestión de libros manga, que permita registrar, consultar, actualizar y eliminar información relacionada con mangas, facilitando así el control y acceso a los datos de manera rápida, segura y ordenada.

#ANÁLISIS DE REQUERIMIENTOS

La aplicación debe cumplir con las siguientes funcionalidades principales:La aplicación debe cumplir con las siguientes funcionalidades principales:

•	Registrar libros manga (título, autor, género, volumen, editorial, precio y estado).

•	Listar todos los mangas registrados.

•	Buscar mangas por título o género.

•	Actualizar información de un manga existente.

•	Eliminar mangas del sistema.

•	Validar que los campos no estén vacíos y que los datos ingresados sean correctos.

•	Manejar errores mediante excepciones para evitar fallos del programa.

•	Utilizar estructuras de datos para el almacenamiento de la información.


#DISEÑO DE INTERFAZ 
La aplicación contará con una interfaz gráfica desarrollada en Java Swing, compuesta por formularios que permitirán la interacción directa con el usuario.

•	Formulario de registro de manga.

•	Formulario de listado de mangas.

•	Formulario de búsqueda.

•	Formulario de actualización y eliminación.
Los formularios incluirán botones, campos de texto, etiquetas y cuadros de diálogo para una mejor experiencia de usuario.


#Validaciones
La aplicación implementa validaciones para asegurar el correcto ingreso de datos:

•	Campos obligatorios no vacíos.

•	Validación de números en campos como volumen y precio.

•	Mensajes de error cuando los datos son incorrectos.

•	Uso de bloques try-catch para el manejo de excepciones.

#Acceso a datos
Para el almacenamiento de la información se utilizarán estructuras de datos, tales como:

•	Arreglos dinámicos (ArrayList).

•	HashMap para búsquedas rápidas por título.
Estas estructuras permitirán agregar, recorrer, modificar y eliminar mangas de manera eficiente.

#Funcionalidades clave

•	Gestión completa de libros manga.

•	Uso correcto de listas y funciones.

•	Aplicación de funciones de orden superior para optimizar procesos.

•	Acceso eficiente a los datos.

•	Funcionalidades alineadas al diagrama de flujo y a la propuesta inicial.


#CONCLUSIÓN
La aplicación de gestión de libros manga permite organizar y administrar de manera eficiente la información de mangas, facilitando el acceso a los datos y mejorando la experiencia del usuario. Este proyecto cumple con los indicadores de logro establecidos, aplicando correctamente estructuras de datos, validaciones, manejo de excepciones e interfaces gráficas.



