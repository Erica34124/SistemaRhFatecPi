package com.rh05112.implementation;

import com.rh05112.domain.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rh05112.repository.EmployRepository;
import com.rh05112.services.Actions;

import java.util.Collections;
import java.util.List;

@Service
public class EmployServiceImpl implements Actions {
    @Autowired
    private EmployRepository repository;

    @Override
    public Employees cadastrar(Employees employees) {
        return this.repository.save(employees);
    }

    @Override
    public Employees editar(Employees employees) {
        return this.repository.save(employees);
    }

    @Override
    public void excluir(String id) {
        this.repository.deleteById(id);
    }

    @Override
    public List<Employees> buscar() {
        return this.repository.findAll();
    }

    @Override
    public Iterable<Employees> buscarPorId(String id) {
        return this.repository.findAllById(Collections.singleton(id));
    }
}
