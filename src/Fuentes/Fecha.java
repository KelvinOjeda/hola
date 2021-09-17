package Fuentes;





import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class Fecha {
    private String fecha;
    private int dia,mes,anio;
    public Fecha(DateTimeFormatter fecha){
        this.fecha=fecha.toString();
    }
    public Fecha(String fecha){
        this.fecha=fecha;
    }
    public boolean validaExpresionRegular(){
        String patron  = "^\\d{4}\\-(0[1-9]|1[012])\\-(0[1-9]|[12][0-9]|3[01])$";
        if(Pattern.matches(patron, this.fecha)){
            setFecha(this.fecha);
            return true;
        }else{
            return false;
        }
    }
    public void setFecha(String fecha){
    
   StringTokenizer token= new StringTokenizer(fecha,"-");
   this.anio = Integer.parseInt(token.nextToken());
   this.mes = Integer.parseInt(token.nextToken());
   this.dia = Integer.parseInt(token.nextToken());
}    

    public Fecha(){
     this.dia=0;
     this.mes=0;
     this.anio=0;
    }
    
    


    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }
    public boolean validarFecha() {
    boolean correcto = false;

    try {
        //Formato de fecha (día/mes/año)
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
        formatoFecha.setLenient(false);
        //Comprobación de la fecha
        formatoFecha.parse(this.anio + "/" + this.mes + "/" + this.dia);
        correcto = true;
    } catch (ParseException e) {
        //Si la fecha no es correcta, pasará por aquí
        JOptionPane.showMessageDialog(null, "Formato de Fecha incorrecto \n Formato de Fecha yyyy-MM-dd", null, JOptionPane.ERROR_MESSAGE);
        correcto = false;
    }

    return correcto;
}
    public boolean validadFecha(){
        boolean validoFecha=false;

        if (dia>1 && dia<31) {
            validoFecha=true;
        }

        if (mes>1 && mes<12) {
            validoFecha=true;
        }

        if (mes==2 && dia==29 && anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0) ) {
            validoFecha=true;
            }



        return validoFecha;
        }

    @Override
    public String toString() {
        return  dia + "/" + mes + "/" + anio ;
    }
    


}