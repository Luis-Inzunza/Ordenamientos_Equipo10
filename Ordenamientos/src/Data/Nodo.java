package Data;

public class Nodo {

    private Integer passengerId;
    private Integer survive;
    private Integer clase;
    private String nombre;
    private String sex;
    private Integer age;
    
    public Nodo(String[] datos) {
        this.passengerId = insertar(datos, 0);
        this.survive = insertar(datos, 1);
        this.clase = insertar(datos, 2);
        this.nombre = datos[3];
        this.sex = datos[4];
        this.age = insertar(datos, 5);
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

    public Integer getAge() {
        return age;
    }
    
    @Override
    public String toString(){
        return passengerId+", "+survive+","+clase+","+nombre+","+sex+","+age;
    }
 
    private Integer insertar(String[] data, int x){
        if(data[x] == ""){
            return 0;
        }else{
            return Integer.parseInt(data[x]);
        }
    }
}