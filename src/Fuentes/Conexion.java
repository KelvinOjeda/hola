package Fuentes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Conexion {
    
    /*Atributos:*/
    private String usuario;
    private String claveUsuario;
    private Connection conexion;
    
    /*Constructor de la clase:*/
    public Conexion(String usuario, String claveUsuario) {
        this.usuario = usuario;
        this.claveUsuario = claveUsuario;
        this.conexion = null;
    }
    
    /*Método para crear la conexión con la base de datos:*/
    public Connection crearConexion() {        
        /*Instrucción con la que se iniciará sesión en la base de datos:*/
        String enlaceConexion = "jdbc:sqlserver://;"
                + "database=EQUIM;"
                + "user=" + "sa" + ";"
                + "password=" + "P@ssw0rd" + ";"
                + "loginTimeout=100;";
        
        /*Se intenta crear la conexión con la base de datos:*/
        try{
            this.conexion = DriverManager.getConnection(enlaceConexion);
            return conexion;
        }
        catch(SQLException ex) {
            System.out.println("Error al crear la conexión:\n" + ex);
            return null;
        }        
    }
    /*Método para contar el número de registros de una tabla cualquiera:*/
    public int contarRegistrosCondicion(String nombreTabla,String condicion) {
        String consulta = "SELECT COUNT(*) FROM " + nombreTabla+ " where "+condicion;
        
        try{
            /*Se realiza la consulta:*/
            Statement auxiliar = this.conexion.createStatement();
            ResultSet resultadoConsulta = auxiliar.executeQuery(consulta);
            
            /*Se retorna el número de registros:*/
            resultadoConsulta.next();
            return Integer.parseInt(resultadoConsulta.getString(1));
        }
        catch(SQLException ex) {
            System.out.println("Error al contar el número de registros:\n" + ex);
            return -1;
        }
    }
    
    /*Método para contar el número de registros de una tabla cualquiera:*/
    public int contarRegistros(String nombreTabla) {
        String consulta = "SELECT COUNT(*) FROM " + nombreTabla;
        
        try{
            /*Se realiza la consulta:*/
            Statement auxiliar = this.conexion.createStatement();
            ResultSet resultadoConsulta = auxiliar.executeQuery(consulta);
            
            /*Se retorna el número de registros:*/
            resultadoConsulta.next();
            return Integer.parseInt(resultadoConsulta.getString(1));
        }
        catch(SQLException ex) {
            System.out.println("Error al contar el número de registros:\n" + ex);
            return -1;
        }
    }
    
    
    /*Método para contar el número de campos de una tabla cualquiera:*/
    public int contarCampos(String nombreTabla) {
        String consulta = "SELECT COUNT(*) FROM Information_Schema.Columns "
                + "WHERE Table_name = '" + nombreTabla + "'"
                + "GROUP BY Table_name";
        
        try{
            /*Se realiza la consulta:*/
            Statement auxiliar = this.conexion.createStatement();
            ResultSet resultadoConsulta = auxiliar.executeQuery(consulta);
            
            /*Se retorna el número de campos:*/
            resultadoConsulta.next();
            return Integer.parseInt(resultadoConsulta.getString(1));
        }
        catch(SQLException ex) {
            System.out.println("Error al contar el número de campos:\n" + ex);
            return -1;
        }        
    }
    
    
    /*Método para obtener toda la información de una tabla cualquiera:*/
    public DefaultTableModel consultarTabla(String nombreTabla, String campoOrden, String[] cabecera) {
        String consulta = "SELECT * FROM " + nombreTabla + " ORDER BY " + campoOrden+";";
        
        /*Se determina el número de registros y campos de la tabla:*/
        int filas = contarRegistros(nombreTabla);
        int columnas = contarCampos(nombreTabla);
        int i, j;
        i = j = 0;
        
        /*Se crea un objeto tabla y se le añade los títulos a las columnas:*/
        DefaultTableModel tabla = new DefaultTableModel(filas, columnas);
        tabla.setColumnIdentifiers(cabecera);
        
        try{
            /*Se realiza la consulta:*/
            Statement auxiliar = this.conexion.createStatement();            
            ResultSet resultadoConsulta = auxiliar.executeQuery(consulta);
            
            /*Se recopila la información de la tabla un campo a la vez:*/
            resultadoConsulta.next();
            while(i < filas && j < columnas) {
                tabla.setValueAt(resultadoConsulta.getString(j + 1), i, j++);
                
                if(j >= columnas) {
                    resultadoConsulta.next();
                    i++;
                    j = 0;
                }                    
            }
            
            return tabla;
        }
        catch(SQLException ex) {
            System.out.println("Error al obtener la tabla:\n" + ex);
            return null;
        }
    }
     /*Método para obtener toda la información de una tabla cualquiera:*/
    public DefaultTableModel consultarTablaCondicion(String nombreTabla, String[] cabecera,String condicion) {
        String consulta = "SELECT * FROM " + nombreTabla + " WHERE " + condicion;
        
        /*Se determina el número de registros y campos de la tabla:*/
        int filas = contarRegistrosCondicion(nombreTabla,condicion);
        int columnas = contarCampos(nombreTabla);
        int i, j;
        i = j = 0;
        
        /*Se crea un objeto tabla y se le añade los títulos a las columnas:*/
        DefaultTableModel tabla = new DefaultTableModel(filas, columnas);
        tabla.setColumnIdentifiers(cabecera);
        
        try{
            /*Se realiza la consulta:*/
            Statement auxiliar = this.conexion.createStatement();    
            ResultSet resultadoConsulta = auxiliar.executeQuery(consulta);
            
            /*Se recopila la información de la tabla un campo a la vez:*/
            resultadoConsulta.next();
            while(i < filas && j < columnas) {
                tabla.setValueAt(resultadoConsulta.getString(j + 1), i, j++);
                
                if(j >= columnas) {
                    resultadoConsulta.next();
                    i++;
                    j = 0;
                }                    
            }
            
            return tabla;
        }
        catch(SQLException ex) {
            System.out.println("Error al obtener la tabla:\n" + ex);
            return null;
        }
    }
    
    
    /*Método para obtener los items de relleno para un ComboBox:*/
    public ArrayList<String> obtenerItems(String nombreTabla, String campo) {
        ArrayList<String> items = new ArrayList<>();        
        String consulta = "SELECT " + campo + " FROM " + nombreTabla + " ORDER BY " + campo;
        
        try{
            /*Se realiza la consulta:*/
            Statement auxiliar = this.conexion.createStatement();            
            ResultSet resultadoConsulta = auxiliar.executeQuery(consulta);
                        
            while(resultadoConsulta.next()) {
                items.add(resultadoConsulta.getString(1));
            }
            
            return items;
        }
        catch(SQLException ex) {
            System.out.println("Error al rellenar ComboBox:\n" + ex);
            return null;
        }        
    }
    /*Método para obtener los items de relleno para un ComboBox:*/
    public ArrayList<String> obtenerItemsCondicon(String nombreTabla ,String campo,String condicon) {
        ArrayList<String> items = new ArrayList<>();        
        String consulta = "SELECT " + campo + " FROM " + nombreTabla + " WHERE " + condicon;
        
        try{
            /*Se realiza la consulta:*/
            Statement auxiliar = this.conexion.createStatement();            
            ResultSet resultadoConsulta = auxiliar.executeQuery(consulta);
                        
            while(resultadoConsulta.next()) {
                items.add(resultadoConsulta.getString(1));
            }
            
            return items;
        }
        catch(SQLException ex) {
            System.out.println("Error al rellenar ComboBox:\n" + ex);
            return null;
        }        
    }
    
    /*Método para comprobar si un registro existe en una tabla cualquiera:*/
    public boolean existeRegistro(String nombreTabla, String condicion) {
        String consulta = "SELECT COUNT(*) FROM " + nombreTabla + " WHERE " + condicion;
        try{
            /*Se realiza la consulta:*/
            Statement auxiliar = this.conexion.createStatement();            
            ResultSet resultadoConsulta = auxiliar.executeQuery(consulta);
            
            /*Se comprueba si el registro existe:*/
            resultadoConsulta.next();
            if(!resultadoConsulta.getString(1).equals("0"))                
                return true;
        }
        catch(SQLException ex) {
            System.out.println("Error al comprobar existencia:"+ consulta+"\n" + ex);
        }
        
        return false;
    }
    /* Metodo para encontrar un regsitro de una tabla cualquiera*/
    public String obtenerRegistro(String nombreTabla, String condicion,String campo) {
        String consulta = "SELECT " + campo + " FROM " + nombreTabla + " WHERE " + condicion + " ORDER BY " + campo ;
        
        try{
            /*Se realiza la consulta:*/
            Statement auxiliar = this.conexion.createStatement();            
            ResultSet resultadoConsulta = auxiliar.executeQuery(consulta);
            /*Se comprueba si el registro existe:*/
            resultadoConsulta.next();               
                return resultadoConsulta.getString(1);
        }
        catch(SQLException ex) {
            System.out.println("Error al comprobar existencia:\n"+consulta + ex);
        }
        return null;
        

    }
    public String sumaFecha(String numero) {
        String consulta = "SELECT dbo.f_devolucion("+numero+","+"GETDATE())" ;
        
        try{
            /*Se realiza la consulta:*/
            Statement auxiliar = this.conexion.createStatement();            
            ResultSet resultadoConsulta = auxiliar.executeQuery(consulta);
            /*Se comprueba si el registro existe:*/
            resultadoConsulta.next();               
            return resultadoConsulta.getString(1);
        }
        catch(SQLException ex) {
            System.out.println("Error al comprobar existencia:\n"+consulta + ex);
        }
        return null;
        

    }
    
    /*Método para insertar registros en una tabla cualquiera:*/
    public void insertarRegistro(String nombreTabla, String valores) {
        String consulta = "INSERT INTO " + nombreTabla + " VALUES (" + valores + ")";
        
        try{
            /*Se realiza la inserción del registro:*/
            Statement auxiliar = this.conexion.createStatement();
            auxiliar.executeUpdate(consulta);
        }
        catch(SQLException ex) {
            System.out.println("Error al insertar:\n" + ex);
        }  
    }
    
    /*Método para eliminar registros de una tabla cualquiera:*/
    public void eliminarRegistros(String nombreTabla, String condicion) {
        String consulta = "DELETE FROM " + nombreTabla + " WHERE " + condicion;
        
        try{
            /*Se realiza la eliminación del registro:*/
            Statement auxiliar = this.conexion.createStatement();
            auxiliar.executeUpdate(consulta);
        }
        catch(SQLException ex) {
            System.out.println("Error al eliminar:\n" + ex);
        } 
    }
    
    /*Método para modificar un registro de una tabla cualquiera:*/
    public void modificarRegistro(String nombreTabla, String cambios, String condicion) {
        String consulta = "UPDATE " + nombreTabla + " SET " +  cambios + " WHERE " + condicion;
        
        try{
            /*Se realiza la modificación del registro:*/
            Statement auxiliar = this.conexion.createStatement();
            auxiliar.executeUpdate(consulta);
        }
        catch(SQLException ex) {
            System.out.println("Error al modificar:\n" + ex);
        } 
    }
    public DefaultTableModel consultarTablaCondicionClienteJuridico(String nombreTabla, String[] cabecera,String condicion, String campos) {
        String consulta = "SELECT "+ campos +" FROM " + nombreTabla + " WHERE " + condicion;
        
        /*Se determina el número de registros y campos de la tabla:*/
        int filas = contarRegistrosCondicion(nombreTabla,condicion);
        int columnas = contarCampos(nombreTabla)-1;
        int i, j;
        i = j = 0;
        
        /*Se crea un objeto tabla y se le añade los títulos a las columnas:*/
        DefaultTableModel tabla = new DefaultTableModel(filas, columnas);
        tabla.setColumnIdentifiers(cabecera);
        
        try{
            /*Se realiza la consulta:*/
            Statement auxiliar = this.conexion.createStatement();    
            ResultSet resultadoConsulta = auxiliar.executeQuery(consulta);
            
            /*Se recopila la información de la tabla un campo a la vez:*/
            resultadoConsulta.next();
            while(i < filas && j < columnas) {
                tabla.setValueAt(resultadoConsulta.getString(j + 1), i, j++);
                
                if(j >= columnas) {
                    resultadoConsulta.next();
                    i++;
                    j = 0;
                }                    
            }
            
            return tabla;
        }
        catch(SQLException ex) {
            System.out.println("Error al obtener la tabla:\n" + ex);
            return null;
        }
    }
    public DefaultTableModel consultarTablaCondicionClienteNatural(String nombreTabla, String[] cabecera,String condicion, String campos) {
        String consulta = "SELECT "+ campos +" FROM " + nombreTabla + " WHERE " + condicion;
        
        /*Se determina el número de registros y campos de la tabla:*/
        int filas = contarRegistrosCondicion(nombreTabla,condicion);
        int columnas = contarCampos(nombreTabla)-2;
        int i, j;
        i = j = 0;
        
        /*Se crea un objeto tabla y se le añade los títulos a las columnas:*/
        DefaultTableModel tabla = new DefaultTableModel(filas, columnas);
        tabla.setColumnIdentifiers(cabecera);
        
        try{
            /*Se realiza la consulta:*/
            Statement auxiliar = this.conexion.createStatement();    
            ResultSet resultadoConsulta = auxiliar.executeQuery(consulta);
            
            /*Se recopila la información de la tabla un campo a la vez:*/
            resultadoConsulta.next();
            while(i < filas && j < columnas) {
                tabla.setValueAt(resultadoConsulta.getString(j + 1), i, j++);
                
                if(j >= columnas) {
                    resultadoConsulta.next();
                    i++;
                    j = 0;
                }                    
            }
            
            return tabla;
        }
        catch(SQLException ex) {
            System.out.println("Error al obtener la tabla:\n" + ex);
            return null;
        }
    }
    public DefaultTableModel consultarTablaCondicionCliente(String nombreTabla, String[] cabecera,String condicion, String campos) {
        String consulta = "SELECT "+ campos +" FROM " + nombreTabla + " WHERE " + condicion;
        
        /*Se determina el número de registros y campos de la tabla:*/
        int filas = contarRegistrosCondicion(nombreTabla,condicion);
        int columnas = contarCampos(nombreTabla)-1;
        int i, j;
        i = j = 0;
        
        /*Se crea un objeto tabla y se le añade los títulos a las columnas:*/
        DefaultTableModel tabla = new DefaultTableModel(filas, columnas);
        tabla.setColumnIdentifiers(cabecera);
        
        try{
            /*Se realiza la consulta:*/
            Statement auxiliar = this.conexion.createStatement();    
            ResultSet resultadoConsulta = auxiliar.executeQuery(consulta);
            
            /*Se recopila la información de la tabla un campo a la vez:*/
            resultadoConsulta.next();
            while(i < filas && j < columnas) {
                tabla.setValueAt(resultadoConsulta.getString(j + 1), i, j++);
                
                if(j >= columnas) {
                    resultadoConsulta.next();
                    i++;
                    j = 0;
                }                    
            }
            
            return tabla;
        }
        catch(SQLException ex) {
            System.out.println("Error al obtener la tabla:\n" + ex);
            return null;
        }
    }
    
}
