import Data.LectorCSV;

public class App {
    public static void main(String[] args) throws Exception {
        LectorCSV datos = new LectorCSV("src/Data/train.csv");
        System.out.println("paso la lectura del archivo");
        datos.list.display();

    }
}
