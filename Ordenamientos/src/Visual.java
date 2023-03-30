import java.util.Iterator;
import java.util.LinkedList;
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
                System.out.println("elegio 1");
                Alfabeticamente();
                break;
            
            case 2:
                System.out.println("elegio 2");
                Alfa_inverso();
                break;
            
            case 3:
                System.out.println("elegio 3");
                orden(true);
                break;

            case 4:
                System.out.println("elegio 4");
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
            System.out.println(i.next().display());
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
        //LectorCSV datos = new LectorCSV("src/Data/train.csv");
        //Llevarlo a los algoritmos
    }
    private void Alfa_inverso(){
        LectorCSV datos = new LectorCSV("src/Data/train.csv");
        //Llevarlo a los algoritmos
    }

    private void Mayor_menor(){ 
        System.out.println("1: Clase");
        System.out.println("2: Edad");
        System.out.println("3: <- Regresar");
        Scanner scan = new Scanner(System.in);
        Integer _input = scan.nextInt();
        if(_input == 1){
            //Llevarlo a los algoritmos
        }else{
            if(_input == 2){
                //Llevarlo a los algoritmos
            }else{
                if(_input == 3){
                    bienvenida();//Queda de forma recursiva, no es muy viable
                }else{
                    System.out.println("Porfavor, una opcion valida");
                }
            }
        }
    }

    private void Menor_mayor(){ 
        System.out.println("1: Clase");
        System.out.println("2: Edad");
        Scanner scan = new Scanner(System.in);
        Integer _input = scan.nextInt();
        if(_input == 1){
            //Llevarlo a los algoritmos
        }else{
            if(_input == 2){
                //Llevarlo a los algoritmos
            }else{
                if(_input == 3){
                    bienvenida(); //Queda de forma recursiva, no es muy viable
                }else{
                    System.out.println("Porfavor, una opcion valida");
                }
            }
        }
    }
}
