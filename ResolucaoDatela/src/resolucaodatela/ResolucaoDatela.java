/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucaodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author y17ad
 */
public class ResolucaoDatela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A largura dá sua tela é: " + d.width);
        System.out.println("A altura de sua tela é: " + d.height);
    }
    
}
