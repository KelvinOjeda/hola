
package Fuentes;

import java.util.regex.Pattern;

/**
 *
 * @author erick
 */
public class Maquina {
    private String codigo;
    private String nombre_maquina;
    private String estado;
    private float precio;
    private String dimesiones;
    private float peso;
    private String id_empleadoresponsable;
    private Conexion conexion;

    public Maquina() {
    }


    
    public Maquina(String codigo) {
        this.codigo = codigo;
    }


    public Conexion getConexion() {
        return conexion;
    }

    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre_maquina() {
        return nombre_maquina;
    }

    public void setNombre_maquina(String nombre_maquina) {
        this.nombre_maquina = nombre_maquina;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDimesiones() {
        return dimesiones;
    }

    public void setDimesiones(String dimesiones) {
        this.dimesiones = dimesiones;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getId_empleadoresponsable() {
        return id_empleadoresponsable;
    }

    public void setId_empleadoresponsable(String id_empleadoresponsable) {
        this.id_empleadoresponsable = id_empleadoresponsable;
    }
    public void obtenerMaquinaCompleto(){
        this.nombre_maquina = conexion.obtenerRegistro("Maquina", "Codigo="+this.codigo, "NOMBRE__MAQUINA");
        this.precio= Float.parseFloat(conexion.obtenerRegistro("Maquina", "Codigo="+this.codigo,"PRECIODEALQUILER"));
    }
    public boolean validarDimesiones(){
        String patronDimensiones  = "^\\d{1,4}(x\\d{1,4}){1,2}$";
        
        if(Pattern.matches(patronDimensiones, this.dimesiones)){
            return true;
        }else{
            return false;
        }
    }

    public boolean validarCodigo(){
        String patron  = "^[0-9]{10}$";

        if(Pattern.matches(patron, this.codigo)){
            return false;
        }else{
            return true;
        }
    }
    public boolean isFloat(String cadena){
	try {
		Float.parseFloat(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
    }
    public void insertarMaquina (){
        String valores ="'"+ this.codigo+"'"+",'"+ this.nombre_maquina+"'"+",'"+ this.estado+"'"+",'"+ this.precio+"'"+",'"+ this.dimesiones+"'"+",'"+ this.peso+"'"+",'"+ this.id_empleadoresponsable+"'";
        System.out.println(valores);
        conexion.insertarRegistro("Maquina", valores);
    }
    
    
}
