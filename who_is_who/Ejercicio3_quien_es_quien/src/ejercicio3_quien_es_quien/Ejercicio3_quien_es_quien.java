/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3_quien_es_quien;

import java.util.Scanner;
        
/**
 *
 * @author Rafae
 */
public class Ejercicio3_quien_es_quien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan= new Scanner(System.in);
       
        boolean sombrero,gafas,bigote;
     
        
        //comprobamos lo que tiene cada uno
        
            System.out.println("Tiene sombrero?(true o false)");
            sombrero= scan.nextBoolean();
    
            System.out.println("Tiene gafas?(true o false)");
            gafas= scan.nextBoolean();
            
            System.out.println("Tiene bigote?(true o false)");
            bigote= scan.nextBoolean();
            
            //vemos quien es quien segun los datos
            
            if(sombrero==true && gafas==true &&bigote==true ){
                System.out.println("Estas hablando de Antonio!");
            }else if(sombrero==false && gafas==true &&bigote==false){
                System.out.println("Estas hablando de Rafa!");
            } else if(sombrero==true && gafas==false &&bigote==false){
                System.out.println("Estas hablando de Marcos!");
            }else if(sombrero==false && gafas==false &&bigote==true){
                 System.out.println("Estas hablando de Daniel!");
            }else if(sombrero==false && gafas==true &&bigote==true){
                    System.out.println("Estas hablando de Paco!");
            }else{
                    System.out.println("No conozco a nadie con esa descripcion!");
            }
                
    }
    
}
