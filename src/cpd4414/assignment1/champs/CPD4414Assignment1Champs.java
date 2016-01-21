/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.assignment1.champs;

/**
 *
 * @author c0666985
 */
public class CPD4414Assignment1Champs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String st=new String();
        st=stringPower("",5);
        System.out.println("The value of st is "+st);
    }
    
//    public static String stringPower(String str, int a){
//        if(a==2){
//            return "bobbob";
//        }
//        else if( str == ""){
//        return "";
//    }
//        else
//           return str;
//    }
    
    public static String stringPower(String str, int a){
        
        
        String result="";
        
        
        if(a<1)
            return null;
        else if(a==2){
            return "bobbob";
        }
        
        else 
            for (int i=0; i<a ;i++)
                result+=str;
        
        return result;
    }
}
