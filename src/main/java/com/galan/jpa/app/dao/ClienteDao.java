package com.galan.jpa.app.dao;

import com.galan.jpa.app.entities.Cliente;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ClienteDao implements IClienteDaoImpl{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @SuppressWarnings("unchecked")
    public List<Cliente> listar() {
        return entityManager.createQuery("from Cliente").getResultList();
    }
}
