
package Fuentes;

/**
 *
 * @author erick
 */
public class Usuario {
    private String password;
    private String usuario;

    public Usuario(String password, String usuario) {
        this.password = password;
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public boolean validarUsuario(String user,String pass){
       return this.usuario.equals(user) && this.password.equals(pass);
        
    }
    
    
}
