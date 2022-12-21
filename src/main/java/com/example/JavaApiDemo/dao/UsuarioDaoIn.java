package com.example.JavaApiDemo.dao;

import com.example.JavaApiDemo.models.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class UsuarioDaoIn implements UsuarioDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Usuario> getUsuario() {
    String query = "FROM Usuario";
    List<Usuario> resultado = entityManager.createQuery(query).getResultList();
    return resultado;

    }
}
