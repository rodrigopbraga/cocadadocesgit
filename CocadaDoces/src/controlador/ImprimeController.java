package controlador;

import java.sql.Date;

public class ImprimeController {
    
    public static String tirarTudoExcetoDigitos(String text) {
       if (text == null || text.length() == 0) {
           return "";
       }
       return text.replaceAll("\\D+", "");
    }
    
    public String limpaEspacoPorPonto(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                sb.setCharAt(i, '.');
            }
        }return sb.toString();
    }
    
    public Date getCurrentDate(){
        long millis=System.currentTimeMillis();  
        Date date=new Date(millis);
        return date;
    }
}