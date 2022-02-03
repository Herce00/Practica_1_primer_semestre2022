
package herraminetas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class procesos {
    
    
    public void nuevo_juego(){
        
    }
    
    public void ver_puntuaciones() throws IOException{
        File archivo;
        FileWriter escribir = null;
        try{
            archivo = new File("reporte.html");
            escribir = new FileWriter(archivo);
            String datos="<table style=\\\"border-collapse: collapse; width: 100%;\\\" border=\\\"1\">\n" +
                         "<tbody>\n" +
                         "<tr>\n" +
                         "<td style=\\\"width: 5.40434%;\\\">No.</td>\n" +
                         "<td style=\\\"width: 26.1144%;\\\">Nombre</td>\n" +
                         "<td style=\\\"width: 11.1243%;\\\">Punteo</td>\n" +
                         "<td style=\\\"width: 29.073%;\\\">No. de Movimientos</td>\n" +
                         "<td style=\\\"width: 28.284%;\\\">Marca de Tiempo</td>\n" +
                         "</tr>\n" +
                         "<tr>\n" +
                         "<td style=\\\"width: 5.40434%;\\\">1</td>\n" +
                         "<td style=\\\"width: 26.1144%;\\\">cesar hernandez</td>\n" +
                         "<td style=\\\"width: 11.1243%;\\\">30</td>\n" +
                         "<td style=\\\"width: 29.073%;\\\">30 movimientos</td>\n" +
                         "<td style=\\\"width: 28.284%;\\\">08:00pm-08:30pm</td>\n" +
                         "</tr>\n" +
                         "</tbody>\n" +
                         "</table>";
            
            escribir.write(datos);
        }catch(Exception e){
            
        }finally{
            escribir.close();
        }
    }
    
    
    
    public void llenar_tablero(){
        String [][] tablero = new String[42][15];
        for (int i = 0; tablero.length < 10; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (j<=42) {
                    tablero[0][j] = "=";
                }
            }
        }
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.println(tablero[i][j]);
            }
        }
    }
}
