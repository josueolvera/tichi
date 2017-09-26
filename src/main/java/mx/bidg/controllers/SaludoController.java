/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.bidg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Developer
 */
@Controller
public class SaludoController {
    
    @RequestMapping
    public ModelAndView saluda() {
        return new ModelAndView("saludo");
    }
}
