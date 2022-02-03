/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_1_primer_semestre2022;
import herraminetas.*;
import java.io.IOException;
import java.util.Scanner;
public class Practica_1_primer_semestre2022 {
    private static herraminetas.menu herramineta = new herraminetas.menu();
    private static herraminetas.procesos herramineta2 = new herraminetas.procesos();
    
    public static void main(String[] args) throws IOException {
        //incicio de la practica
        herramineta.menu_principal();
        Scanner entrada = new Scanner(System.in);
        int opcion_menu_principal;
        System.out.print("Opcion a elejir :");
        opcion_menu_principal = entrada.nextInt();
        herramineta2.ver_puntuaciones();
    }
    
}
