package com.devinhouse.folhasalarial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
public class Teste {

    @GetMapping("/teste")
    public String teste(Model model){
        model.addAttribute("nome", "Carlos");

        return "teste";
    }

    @GetMapping("/teste-model")
    public ModelAndView teste(){
        ModelAndView mv = new ModelAndView("teste");
        mv.addObject("nome", "Luiz");
        return mv;
    }
}
