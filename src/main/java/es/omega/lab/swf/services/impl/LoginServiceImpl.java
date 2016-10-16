/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es.omega.lab.swf.services.impl;

import es.omega.lab.swf.beans.LoginBean;
import es.omega.lab.swf.services.LoginService;

/**
 *
 * @author fran
 */
public class LoginServiceImpl implements LoginService {
    private static final long serialVersionUID = -1L;
    private static final String _NAME = LoginServiceImpl.class.getSimpleName();

    private final String _USERNAME = "admin";
    private final String _PASSWORD = "admin";

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
    public LoginServiceImpl() {}

    /*------------------------------------------------------------------------*/
    /*                          Metodos Publicos                              */
    /*------------------------------------------------------------------------*/
    @Override
    public String validate(final LoginBean bean) {
        final String userName = bean.getUsername();
        final String password = bean.getPassword();

        if (_USERNAME.equals(userName) && _PASSWORD.equals(password)) return "true";

        return "false";
    }
}
