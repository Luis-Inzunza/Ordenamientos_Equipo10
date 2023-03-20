package Data;

class Nodo {
    public Nodo next; 

    private Integer passengerId;
    private Integer survive;
    private Integer clase;
    private String nombre;
    private String sex;
    private Double age;
    private Double fare;

    public Nodo previous; 
    
    public Nodo(String[] datos) {
        this.passengerId = insertar(datos, 0);
        this.survive = insertar(datos, 1);
        this.clase = insertar(datos, 2);
        this.nombre = datos[3] + datos[4];
        this.sex = datos[5];
        this.age = insertarD(datos, 6);
        this.fare = insertarD(datos, 10);
    }

    public Double getAge() {
        return age;
    }

    public Double getFare() {
        return fare;
    }

    public void display(){
        System.out.println(passengerId+" "+survive+" "+clase+" "+nombre+" "+sex+" a: "+age+"  T: "+fare+";");
    }
 
    private Integer insertar(String[] data, int x){
        if(data[x] == ""){
            return 0;
        }else{
            return Integer.parseInt(data[x]);
        }
    }

    private Double insertarD(String[] data, int x){
        if(data[x] == ""){
            return 0.0;
        }else{
            return Double.parseDouble(data[x]);
        }
    }
}