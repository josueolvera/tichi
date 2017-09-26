/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.bidg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Developer
 */
@Controller
@RequestMapping("/saludos")
public class SaludosGeneralesController {
    
    @RequestMapping("/saludoGeneral")
    String saluda(Model model) {
        model.addAttribute("sitio", "JavaTutoriales.com");
        model.addAttribute("tutorial", "Spring MVC");

        return "saludoGeneral";
    }
}
