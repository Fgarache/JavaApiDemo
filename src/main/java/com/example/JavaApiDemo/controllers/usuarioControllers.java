package com.example.JavaApiDemo.controllers;

import com.example.JavaApiDemo.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping(value = "usuarios")
    public List<Usuario>  getUsuarios(){
    List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario = new Usuario();
        usuario.setId(2323);
        usuario.setNombre("Lucas");
        usuario.setApellido("Espinoza");
        usuario.setEmail("ejeemplo@gmail.com");
        usuario.setTelefono("89224421");

        Usuario usuario2 = new Usuario();

        usuario2.setId(1);
        usuario2.setNombre("lUCAS");
        usuario2.setApellido("Espinoza");
        usuario2.setEmail("ejeemplo@gmail.com");
        usuario2.setTelefono("89224421");

        Usuario usuario3 = new Usuario();

        usuario3.setId(2);
        usuario3.setNombre("fRANK");
        usuario3.setApellido("Espinoza");
        usuario3.setEmail("ejeemplo@gmail.com");
        usuario3.setTelefono("89224421");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        return usuarios;
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

