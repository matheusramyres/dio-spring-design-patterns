package com.dio.design.patterns.service;

import com.dio.design.patterns.model.Cliente;

public interface ClienteService {
    Iterable<Cliente> buscarTodos();

    public Cliente buscarPorId(Long id);

    public void inserir(Cliente cliente);

    public void atualizar(Cliente cliente, Long id);

    public void deletar(Long id);

}
