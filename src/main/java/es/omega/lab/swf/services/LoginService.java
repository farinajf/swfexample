/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es.omega.lab.swf.services;

import es.omega.lab.swf.beans.LoginBean;

/**
 *
 * @author fran
 */
public interface LoginService {

    /*------------------------------------------------------------------------*/
    /*                          Metodos Publicos                              */
    /*------------------------------------------------------------------------*/
    public String validate(final LoginBean bean);
}
