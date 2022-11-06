package com.rh05112.services;

import com.rh05112.domain.Employees;

import java.util.List;

public interface Actions {
    public List<Employees> buscar();
    public Iterable<Employees> buscarPorId(String id);
    public Employees cadastrar(Employees employees);
    public Employees editar(Employees employees);
    public void excluir(String id);

}
