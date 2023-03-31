package Data;

public class Nodo {

    private Integer passengerId;
    private Integer survive;
    private Integer clase;
    private String nombre;
    private String sex;
    private Double age;
    private Double fare;
    
    public Nodo(String[] datos) {
        this.passengerId = insertar(datos, 0);
        this.survive = insertar(datos, 1);
        this.clase = insertar(datos, 2);
        this.nombre = datos[4];
        this.sex = datos[5];
        this.age = insertarD(datos, 6);
        this.fare = insertarD(datos, 10);
    }

    public Double getAge() {
        return age;
    }

    public Integer getClase() {
        return clase;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getFare() {
        return fare;
    }

    public Integer getPassengerId() {
        return passengerId;
    }

    public String getSex() {
        return sex;
    }
    
    public Integer getSurvive() {
        return survive;
    }
    

    public String display(){
        return passengerId+" "+survive+" "+clase+" "+nombre+" "+sex+" "+age+" "+fare+";" ;
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