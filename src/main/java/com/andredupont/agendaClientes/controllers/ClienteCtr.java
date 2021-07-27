package com.andredupont.agendaClientes.controllers;

import com.andredupont.agendaClientes.models.Cliente;
import com.andredupont.agendaClientes.services.ClienteSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/cliente")
public class ClienteCtr {
    @Autowired
    ClienteSrv clienteSrv;

    @GetMapping
    public ArrayList<Cliente> obtenerClientes(){
        return clienteSrv.obtenerClientes();
    }

    @PostMapping
    public Cliente guardarCliente(@RequestBody Cliente cliente){
        return clienteSrv.guardarCliente(cliente);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = clienteSrv.eliminarCliente(id);
        if(ok){
            return "Se eliminó el cliente con el ID " + id;
        } else{
            return "No pudo eliminar el usaurio con ID " + id;
        }
    }
}
