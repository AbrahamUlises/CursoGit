/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cursogit;

/**
 *
 * @author abrah
 */
public class CursoGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int j = 0;
        double arr[] = {20.2, 28.6, 11.8, 3.1};
        double sum = 0;
        double media;
        PrbClase obj =new PrbClase("Matematicas", 1258);
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.println("num: "+j);
        }
        media = sum /arr.length;
        System.out.println("La media es: "+media);
        
    }
    
}
