package com.example.restpractica.Controller;

import com.example.restpractica.Entity.Cantante;
import com.example.restpractica.Service.ICantanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/productora")
public class CantanteController {

    @Autowired
    private ICantanteService service;

    @RequestMapping(path ="/listar/cantante", method = RequestMethod.GET)
    public ResponseEntity<List<Cantante>> listar(){
        return new ResponseEntity<List<Cantante>>(service.list(), HttpStatus.OK);
    }
    @RequestMapping(path="/guardar", method = RequestMethod.POST)
    public ResponseEntity<Void> guardar(@RequestBody Cantante cantante ){
        service.guardar(cantante);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
    public ResponseEntity<Cantante> obtenerPorId(@PathVariable Integer id){

        Cantante cantante = service.obtener(id);

        if( cantante != null) {
            return new ResponseEntity<Cantante>(cantante, HttpStatus.OK);
        }else {
            return new ResponseEntity<Cantante>(HttpStatus.NOT_FOUND);
        }

    }

    @RequestMapping(path = "/editar", method = RequestMethod.PUT)
    public ResponseEntity<Void> editar(@RequestBody Cantante cantante){

        Cantante c = service.obtener(cantante.getIdCantante());

        if( c != null) {
            service.actualizar(cantante);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }

    }

    @RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void>eliminar(@PathVariable Integer id){

        Cantante cantante = service.obtener(id);

        if(cantante != null) {
            service.eliminar(id);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }
}
