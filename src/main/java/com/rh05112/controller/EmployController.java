package com.rh05112.controller;

import com.rh05112.domain.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.rh05112.services.Actions;

import java.util.List;
@RestController
@RequestMapping(path = "/employee")
public class EmployController  {
    @Autowired
    private Actions actions;

    @GetMapping
    public ResponseEntity<List<Employees>> buscarTodos(){
        return ResponseEntity.ok(this.actions.buscar());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Iterable<Employees>> buscarPorId(@PathVariable(name = "id") String id){
        return ResponseEntity.ok(this.actions.buscarPorId(id)) ;
    }

    @PostMapping(path = "cadastrar")
    public ResponseEntity<Employees> cadastrar(@RequestBody Employees employees){
        return ResponseEntity.ok(this.actions.cadastrar(employees));
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Employees> atualizar(@PathVariable(name = "id") String id, Employees employees){
        return ResponseEntity.ok(this.actions.editar(employees));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Integer> excluir(@PathVariable(name = "id") String id){
        this.actions.excluir(id);
        return ResponseEntity.ok(1);
    }
}
