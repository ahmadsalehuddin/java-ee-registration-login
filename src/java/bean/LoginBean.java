/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;
import java.io.Serializable;
/**
 *
 * @author ahmad
 */
public class LoginBean implements Serializable {
    private String username, password;
    
    public LoginBean() {
        username = null;
        password = null;
    }
    
    public String getUsername() {return username;}
    public String getPassword() {return password;}
    
    public void setUsername(String username) {this.username = username;}
    public void setPassword(String password) {this.password = password;}
}
