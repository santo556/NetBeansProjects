/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetipos;

/**
 *
 * @author y17ad
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int idade = 40;
        *String valor = Integer.toString(idade);
        *System.out.println(valor);
        */
        String valor = "40.5";
        float idade = Float.parseFloat(valor);
        System.out.printf("%.3f \n", idade);
        
    }
    
}
