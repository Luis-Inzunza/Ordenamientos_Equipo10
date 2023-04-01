# ADA06_E10 (En proceso)

No podimos dedicar bastante tiempo en el margen que se nos marco, sin enbargo el avance es demasiado y no queremos dejar el codigo sin terminar, esta en una forma funcionar con QuickSort y BinarySort, al igual que registras metricas de ejecucion de cada uno.

## Integrantes

* Cruz Inzunza Luis Alejandro

* Rodríguez Coral Samuel David

## Metodologia de trabajo

Al ser un ADA bastante larga, empezamos haciendolo de manera asincrona dando nuetro avance, sin embargo fue dificil el saber realmente que hacer en ciertas situaciones sin la opinion del otro que requerian grandes cambios.

Terminamos sincronizandonos al momento usando Live Share de Visal studio code y estar en llamada, cada quien trabajando en diferentes componentes/unidades con el fin de acelerar y tener un codigo de calidad.

[Opinion Luis]

Actualmente creo que es una de las mejores formas de trabajar, el metodo asincrono en codigo me ahce sentir inconforme, al mismo tiempo de que si uno avanza mucho, el otro no llega a entender con claridad esas parte del codigo, a diferencia del sincrono que termina siendo una manera util de pedir opiniones, consejos y saben entre los programadores que pasa entre el codigo de uno u el otro. Tmabien saben poco a poco que se va logrando y despreocuparse por eso.

## Ejecución

Todos los modos de ordenamiento estan en el mismo empaquetamiento, asi que solo entra al **src** del paquete y tendras acceso a todas las clases de ordenamiento.

La forma de ejecutarlo es:

1. Entrar por terminar a Ordenamiento/src

2. Ejecutar javac App.java

3. Ejecutar java App


Un ejemplo completo de la ejecucion seria lo siguiente:

cd Ordenamiento/src //accedemos a la carpeta src donde estan todas las clases

javac App.java // cargamos la clase principal

java App //ejecutamos la clase principal

## Extras

### Observaciones

* El codigo actual ya tiene los datos hechos en lista enlazada dobles.

* EL codigo actual ya tiene metricas para solo implementarlas cuando este el algoritmo.

* Los algoritmos tiene accesos y funciones muy similares

* Debemos dar las 4 opciones de ordenamiento siguientes para que EL USUARIO ELIGA:
    * Alfabetico
    * contrario al alfabeto
    * mayor a menor
    * menor a mayor

* Actualizacion: Los algoritmos de ordenamiento se encuentran ya adaptados para trabajar con listas doblemente ligadas

* Se tiene ya un metodo para ordenar las columnas con datos alfanumericos, mayor a menor y menor a mayor con QuickSort. Mientras que con BinaryInsertionSort solo mayor a menor y menor a mayor

* Pendientes : 
    * Asegurarse del funcionamiento de los algoritmos para los datos
    * RadixSort
    * Javadoc

### Fuentes de ayuda