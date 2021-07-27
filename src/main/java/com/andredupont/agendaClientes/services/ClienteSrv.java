package com.andredupont.agendaClientes.services;

import com.andredupont.agendaClientes.models.Cliente;
import com.andredupont.agendaClientes.repositories.ClienteRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClienteSrv {
    @Autowired
    ClienteRep clienteRep;

    public ArrayList<Cliente> obtenerClientes(){
        return (ArrayList<Cliente>) clienteRep.findAll();
    }

    public Cliente guardarCliente(Cliente cliente){
        return clienteRep.save(cliente);
    }

    public boolean eliminarCliente(Long id){
        try{
            clienteRep.deleteById(id);
            return true;
        } catch(Exception err){
            return false;
        }
    }
}
