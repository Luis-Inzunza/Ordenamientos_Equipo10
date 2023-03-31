# ADA06_E10

## Integrantes

* Cruz Inzunza Luis Alejandro

* Rodríguez Coral Samuel David

## Ejecución

[POR EL MOMENTO EJECUTA PRUEBAS]

Todos los modos de ordenamiento estan en el mismo empaquetamiento, asi que solo entra al **src** del paquete y tendras acceso a todas las clases de ordenamiento.

La forma de ejecutarlo es:

1. Nombrar la clase App.java

2. Proporcionar la direccion del archivo donde se conseguiran los datos. Donde nuestro archivo de datos es la siguiente direccion: "Data/train.csv"

3. Proporcionar el nombre del archivo + terminacion CSV. Un ejemplo seria: "Ejemplo.csv"

Un ejemplo completo de la ejecucion seria lo siguiente:

java App.java // Se ejecuta

Data: *Insertar direccion* //Dar enter para que salga la linea de abajo

Nueva Data ordenada: *Insertar nombre con terminacion .csv*

## Extras

### Observaciones

* El codigo actual ya tiene los datos hechos en lista enlazada dobles.

* La idea de hacer metricas puede contabilizarse con contadores (investigar lo de como medir el tiempo de ejecucion como variable)

* Debemos dar las 4 opciones de ordenamiento siguientes para que EL USUARIO ELIGA:
    * Alfabetico
    * contrario al alfabeto
    * mayor a menor
    * menor a mayor

* Actualizacion: Los algoritmos de ordenamiento se encuentran ya adaptados para trabajar con listas doblemente ligadas
sin embargo en el caso de los algoritmos BinaryInsertionSort y MergeSort se trabaja todavia con el dato solicitado.
Ya sea una LinkedList de datos String o Int, pero no de tipo nodo, esto debe cambiar a futuro, sea las 2 clases mencionadas
o la clase quickSort, a discusion

* Se tiene ya un metodo para ordenar las columnas con datos alfanumericos, el ejemplo esta en la clase StringQuickSort
con la clase esMayor(cambiar luego el nombre) siendo la encargada de comparar 2 cadenas y luego siendo usada para ordenar
en orden alfabetico normal o inverso una lista de datos String

* Pendientes : 
    * Asegurarse del funcionamiento de los algoritmos para los datos
    * RadixSort
    * Metricas
    * Creacion de los doc CSV
    * Javadoc
* pd: algunas partes del codigo que mande estan haciendo saltar errores, pero desconozco el motivo ya que en mi lap funcionan bien, revisar en local si te funcionan

### Fuentes de ayuda