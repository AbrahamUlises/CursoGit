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
        int arr[] = {20, 28, 11, 3};
        int sum = 0;
        double media;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        media = ((double)(sum))/arr.length;
        System.out.println("La media es: "+media);
    }
    
}
