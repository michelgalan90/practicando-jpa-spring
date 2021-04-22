package com.galan.jpa.app.controllers;

import com.galan.jpa.app.dao.IClienteDaoImpl;
import com.galan.jpa.app.entities.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController {

    @Autowired
    @Qualifier("clienteDao")
    private IClienteDaoImpl clienteDao;

    @GetMapping("/listar")
    public String listar(Model model){

        model.addAttribute("titulo", "Aca vemos la lista de clientes");
        model.addAttribute("clientes", clienteDao.listar());
        return "listar";
    }

    @GetMapping("/form")
    public String form(Model model){
        Cliente cliente = new Cliente();
        model.addAttribute("titulo", "Anadiendo clientes a la base de datos");
        model.addAttribute("cliente", cliente);

        return "form";
    }
}
