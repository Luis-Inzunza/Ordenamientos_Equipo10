package Data;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class LectorCSV {
    public LinkedList<Nodo> list = new LinkedList<>();

    public LectorCSV(String _direccion){
        LeerArchivo(_direccion);
    }

    public void LeerArchivo(String _direccion){
        String linea = "";
        int x = 0;
        try  {
            BufferedReader br = new BufferedReader(new FileReader(_direccion));
            while ((linea = br.readLine()) != null) {
                if(x>=1){
                    String[] datos = linea.split(",");
                    Nodo temp = new Nodo(datos);
    
                    if (list.peekFirst() == null) {
                        list.add(temp);
                    } else {
                        // Si la lista no está vacía, establece el nuevo elemento como el último elemento de la lista
                        // y actualiza las referencias al elemento anterior y al siguiente
                        list.add(temp);
                    }

                }
                x++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
