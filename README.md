# CargaAcademicaJavaImpresionMVC
programa en Java Swing y MySQL MVC para gestionar: la carga académica de una institución educativa (hora,etc) docente, materia, ciclo, aulas, parametros)
Este programa sigue el patron arquitectonico MVC y el paradigma de orientada a objetos, con variedad de patrones de diseño

el programa no lo termine, pero en si cumple su funcion, falto la parte de testeo, debido a que me cancelaron el proyecto, por si alguien lo quiere testear.

el programa es para llevar la administracion academica de un centro educativo, trabaja con cilos I y II

modulos: docente, materia, aula, carrera, distribucion de carga, impresion de carga, parametros (donde se agrega usuario, se define el ciclo, se puede reiniciar todo),
         usuario, disponibilidad de horas por aula, 

agrega materias segun los parametros. Tamaño aula, carrera, año.

tiene filtros: 
No permite asignar carga en la misma aula y hora
No permite agregar carga a docente si ya completo sus horas/clase
No permite agregar mismo docente en diferentes aulas el mismo dia y hora
No permite chocar materias del mismo año y carrera en la misma aula y hora
Etc.

Permite imprimir las aulas con su carga academica o guardar en pdf

-Permite agregar grupos a una materia
-Cuando un grupo se ha completado sus horas clases ya no aparece en el repertorio de materias
-Cuando el docente a completado sus horas/clases ya no aparece en el repertorio de docente.

ES FLEXIBLE, YA QUE PERMITE TRABAJAR CON VARIAS AULAS A LA MISMA VEZ


esta bastante completo, solo me falto hacer las pruebas exhaustivas (testear)




al final esta el scrip de la base de datos.

trabaje con las siguientes tecnologias: Lenguaje de programacion Java, Gestor de base de dsatos XAMMP MySQL, y Framework Java Swing (para la interfaz grafica).

