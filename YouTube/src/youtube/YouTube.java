/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youtube;

/**
 *
 * @author supun
 */
public class YouTube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Runtime.getRuntime() .exec("cmd /c start https://youtube.com");
        } catch(Exception e){
            System.err.println(e);
        }
    }
    
}
