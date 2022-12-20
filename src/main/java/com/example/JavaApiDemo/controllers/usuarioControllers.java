package com.example.JavaApiDemo.controllers;

import com.example.JavaApiDemo.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class usuarioControllers {
@RequestMapping(value = "prueva")
    public String prueva(){
        return "esto es un string de prueva";
    }
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(2323);
        usuario.setNombre("Lucas");
        usuario.setApellido("Espinoza");
        usuario.setEmail("ejeemplo@gmail.com");
        usuario.setTelefono("89224421");

        return usuario;
    }

    @RequestMapping(value = "usuario1")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Lucas");
        usuario.setApellido("Espinoza");
        usuario.setEmail("ejeemplo@gmail.com");
        usuario.setTelefono("89224421");

        return usuario;
    }

    @RequestMapping(value = "usuario2")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Lucas");
        usuario.setApellido("Espinoza");
        usuario.setEmail("ejeemplo@gmail.com");
        usuario.setTelefono("89224421");

        return usuario;
    }

    @RequestMapping(value = "usuario3")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Lucas");
        usuario.setApellido("Espinoza");
        usuario.setEmail("ejeemplo@gmail.com");
        usuario.setTelefono("89224421");

        return usuario;
    }
}

