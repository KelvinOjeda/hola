
package Fuentes;

import java.util.ArrayList;

/**
 *
 * @author erick
 */
public class Factura {
    
    private String id_Cliente;
    private String fechaAlquiler="GETDATE()";
    private int dias;
    private float subtotal;
    private float impuesto;
    private float valorTotal;
    private String garantia;
    private Conexion conexion;
    private String numeroFactura;
    private ArrayList<Maquina> maquinas;

    public Factura() {
    }

    
    public void setFactura( String id_Cliente, String garantia,int dias) {
        this.dias=dias;
        this.id_Cliente = id_Cliente;
        this.garantia = garantia;
        
    }
    

    public ArrayList<Maquina> getMaquinas() {
        return maquinas;
    }

    public void setMaquinas(ArrayList<Maquina> maquinas) {
        this.maquinas = maquinas;
    }

   

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public Conexion getConexion() {
        return conexion;
    }

    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
        this.numeroFactura=(conexion.contarRegistros("Factura")+1) +"";
        System.out.println(this.numeroFactura);
    }
    

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(String id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public String getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(String fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public float getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(float impuesto) {
        this.impuesto = impuesto;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }
    public void insertarFactura(){
        String valores1=this.numeroFactura+","+"'"+this.id_Cliente+"'"+",GETDATE(),"+"(select dbo.F_devolucion("+this.dias+",GETDATE()))"+","+this.subtotal+","+this.impuesto+","+this.valorTotal+","+"'"+this.garantia+"'";
        conexion.insertarRegistro("Factura ",valores1);

    }
    public void insertarFacturaDetalles(){
        for (Maquina maquina : maquinas) {
            String valores1=(conexion.contarRegistros("DETALLE_FACTURA")+1)+","+"'"+this.numeroFactura+"'"+","+"'"+maquina.getCodigo()+"'"+","+this.valorTotal;
            conexion.insertarRegistro("DETALLE_FACTURA",valores1);
    }
        

    }
    public void obtenerNumeroFactura(){
        this.numeroFactura= conexion.contarRegistros("Factura")+"";
    }
    //metodo para generar factura
     public String generarFactura(){
         //variable de cliente factura
        String direccion = conexion.obtenerRegistro("Cliente", "ID_CLIENTE="+this.id_Cliente, "Direccion");
        String telefono  = conexion.obtenerRegistro("Cliente", "ID_CLIENTE="+this.id_Cliente, "telefono_cliente");
        String nombre = conexion.obtenerRegistro("Cliente", "ID_CLIENTE="+this.id_Cliente, "Nombre");
        String salida = "Número De Factura: "+this.numeroFactura +"\nNombre del Cliente: "  + nombre + "\n" + "Direccion del Cliente: " + direccion + "\n" + "Telefono del Cliente : " + telefono + "\n" + "Cedula: " + this.id_Cliente + "\n" + "Valor total: "+ this.valorTotal ;
        return salida;
    
    }
     public void calcularSubTotal(){
         this.subtotal=0;
         maquinas.forEach(aux -> {
                this.subtotal += aux.getPrecio();
            });
     }
     public void calcularImpuesto(){
         this.impuesto=(float)(this.subtotal*0.12);
     }
     public void calcularTotal(){
         this.valorTotal=(float)(this.subtotal+this.impuesto);
     }
    
}
