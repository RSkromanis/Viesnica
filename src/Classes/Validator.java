/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.regex.*;

/**
 *
 * @author ITLAT
 */
public class Validator {
    
    public static boolean isName(String str){
//        boolean isName = true;
        Pattern p = Pattern.compile("[a-zA-Z]+"); //. represents single charecter
        Matcher m = p.matcher(str);
//        ----- If un for ir priekš garā pieraksta--------------
//        if(m.matches()){
//            System.out.println("Ir vārds!");
//        }else{
//            System.out.println("Nav vārds!");
//        }
        
//        for(int i = 0; i < str.length(); i++){
//            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
//                System.out.println(str.charAt(i));
//            }
//        }
        //        return isName;
//          ---------------------------------------------
        return m.matches() && str.length() >= 3;
    }
    
    
}
