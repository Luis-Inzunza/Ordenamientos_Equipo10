import java.util.Iterator;
import java.util.Scanner;

import Data.LectorCSV;
import Data.Nodo;

public class Visual {
    
    public Visual(){ }

    public void bienvenida(){
        System.out.println("Bienvenido al programa de ordenamiento, tenemos datos de los pasajeros del Titanic");
        System.out.println("¿Como deseas que ordenemos los datos?");
        System.out.println("0: Mostrar Datos");
        System.out.println("1: Nombres Alfabeticamente");
        System.out.println("2: Nombres Alfabeticamente inverso");
        System.out.println("3: Mayor a menor -> ");
        System.out.println("4: Menor a mayor -> ");
        System.out.println("5: Terminar");
        entrada();
    }

    private void entrada(){
        Scanner scan = new Scanner(System.in);
        Integer _input = scan.nextInt();
        switch (_input) {
            case 0:
                datos();
                break;
            
            case 1:
                Alfabeticamente();
                break;
            
            case 2:
                Alfa_inverso();
                break;
            
            case 3:
                orden(true);
                break;

            case 4:
                orden(false);
                break;

            case 5:
                System.out.println("Programa terminado");
                break;
        
            default:
                System.out.println();
                System.out.println("Por favor ingresa un numero mencionado");
                entrada();
                break;
        }
        scan.close();
    }

    private void datos(){
        LectorCSV datos = new LectorCSV("src/Data/train.csv");
        Iterator<Nodo> i = datos.list.iterator();
        while(i.hasNext()){
            System.out.println(i.next().toString());
        }
    }

    private void orden(boolean mayor){
        if(mayor){
            Mayor_menor();

        }else{
            Menor_mayor();
        }
    }

    private void Alfabeticamente(){
        //BinaryInsertionSortApp binary = new BinaryInsertionSortApp(3, false);
        //binary.display();

        QuickSortApp quicksort = new QuickSortApp(3,false);
        quicksort.print();

        //MergeSortApp merge = new MergeSortApp(3, false);
        //merge.display();

        //RadixSortApp radix = new RadixSortApp(3, false);
        //radix.display();

    }
    private void Alfa_inverso(){
        //BinaryInsertionSortApp binary = new BinaryInsertionSortApp(3, true);
        //binary.display();

        //QuickSortApp quicksort = new QuickSortApp(3,true);
        //quicksort.print();

        //MergeSortApp merge = new MergeSortApp(3, true);
        //merge.display();

        //RadixSortApp radix = new RadixSortApp(3, true);
        //radix.display();
        System.out.println("Aun incompleto");
    }

    private void Mayor_menor(){ 
        System.out.println("1: Clase");
        System.out.println("2: Edad");
        System.out.println("3: <- Regresar");
        Scanner scan = new Scanner(System.in);
        Integer _input = scan.nextInt();

        if(_input == 1){
            //BinaryInsertionSortApp binary = new BinaryInsertionSortApp(1,true);
            //binary.display();

            QuickSortApp quicksort = new QuickSortApp(1,true);
            quicksort.print();

            //MergeSortApp merge = new MergeSortApp(1,true);
            //merge.display();

            //RadixSortApp radix = new RadixSortApp(1,true);
            //radix.display();
        }else{
            if(_input == 2){
                BinaryInsertionSortApp binary = new BinaryInsertionSortApp(2,true);
                binary.print();

                QuickSortApp quicksort = new QuickSortApp(2,true);
                quicksort.print();

                //MergeSortApp merge = new MergeSortApp(2,true);
                //merge.print();

                //RadixSortApp radix = new RadixSortApp(2,true);
                //radix.display();
            }else{
                if(_input == 3){
                    bienvenida();
                }else{
                    System.out.println("Porfavor, una opcion valida");
                    Mayor_menor();
                }
            }
        }
    }

    private void Menor_mayor(){ 
        System.out.println("1: Clase");
        System.out.println("2: Edad");
        System.out.println("3: <- Regresar");
        Scanner scan = new Scanner(System.in);
        Integer _input = scan.nextInt();

        if(_input == 1){
            //BinaryInsertionSortApp binary = new BinaryInsertionSortApp(1,false);
            //binary.print();

            QuickSortApp quicksort = new QuickSortApp(1,false);
            quicksort.print();

            //MergeSortApp merge = new MergeSortApp(1,false);
            //merge.display();

            //RadixSortApp radix = new RadixSortApp(1,false);
            //radix.display();
        }else{
            if(_input == 2){
                BinaryInsertionSortApp binary = new BinaryInsertionSortApp(2,false);
                binary.print();

                QuickSortApp quicksort = new QuickSortApp(2,false);
                quicksort.print();

                //MergeSortApp merge = new MergeSortApp(2,false);
                //merge.display();

                //RadixSortApp radix = new RadixSortApp(2,false);
                //radix.display();
            }else{
                if(_input == 3){
                    bienvenida();
                }else{
                    System.out.println("Porfavor, una opcion valida");
                    Menor_mayor();
                }
            }
        }
    }
}
