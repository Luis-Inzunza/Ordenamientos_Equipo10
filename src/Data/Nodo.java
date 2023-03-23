package Data;

public class Nodo {
    public Nodo next; 

    private Integer passengerId;
    private Integer survive;
    private Integer clase;
    private String nombre;
    private String sex;
    private Integer age;
    private Double fare;

    public Nodo previous; 
    
    public Nodo(String[] datos) {
        this.passengerId = insertar(datos, 0);
        this.survive = insertar(datos, 1);
        this.clase = insertar(datos, 2);
        this.nombre = datos[3];
        this.sex = datos[5];
        this.age = insertar(datos, 6);
        this.fare = insertarD(datos, 10);
    }

    public Integer getAge() {
        return age;
    }

    public Double getFare() {
        return fare;
    }

    public Integer getPassengerId() {
        return passengerId;
    }

    public Integer getSurvive() {
        return survive;
    }

    public Integer getClase() {
        return clase;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSex() {
        return sex;
    }

    public void display(){
        System.out.println(passengerId+" "+survive+" "+clase+" "+nombre+" "+sex+" a: "+age+"  T: "+fare+";");
    }

    public void displaya(){
        System.out.println(passengerId+" "+age);
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