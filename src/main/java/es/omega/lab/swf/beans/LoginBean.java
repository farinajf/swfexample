/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es.omega.lab.swf.beans;

/**
 *
 * @author fran
 */
public class LoginBean implements java.io.Serializable {
    private static final long serialVersionUID = -1L;
    private static final String _NAME = LoginBean.class.getSimpleName();

    private String _username;
    private String _password;

    /*------------------------------------------------------------------------*/
    /*                          Metodos Privados                              */
    /*------------------------------------------------------------------------*/

    /*------------------------------------------------------------------------*/
    /*                          Default Access                                */
    /*------------------------------------------------------------------------*/

    /*------------------------------------------------------------------------*/
    /*                          Metodos Protegidos                            */
    /*------------------------------------------------------------------------*/

    /*------------------------------------------------------------------------*/
    /*                            Constructores                               */
    /*------------------------------------------------------------------------*/
    /**
     * Constructor por defecto.
     */
    public LoginBean() {}

    /*------------------------------------------------------------------------*/
    /*                          Metodos Publicos                              */
    /*------------------------------------------------------------------------*/
    public String getUsername() {return _username;}
    public String getPassword() {return _password;}

    public void setUsername(final String x) {this._username = x;}
    public void setPassword(final String x) {this._password = x;}

    @Override
    public String toString() {
        final StringBuilder result = new StringBuilder();

        result.append("username:").append(_username).append("|");
        result.append("password:").append(_password).append("|");

        return result.toString();
    }
}
