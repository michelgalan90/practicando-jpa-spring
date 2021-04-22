package com.galan.jpa.app.dao;

import com.galan.jpa.app.entities.Cliente;

import java.util.List;

public interface IClienteDaoImpl {
    List<Cliente> listar();
}
