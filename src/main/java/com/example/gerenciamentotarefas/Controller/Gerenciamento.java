package com.example.gerenciamentotarefas.Controller;

import com.example.gerenciamentotarefas.Entity.Tarefa;
import com.example.gerenciamentotarefas.Service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gerenciamento")
public class Gerenciamento {
    @Autowired
    TarefaService tarefaService;

    @PostMapping("/tarefa/salvar")
    public Tarefa salvaTarefa(@RequestBody Tarefa tarefa) {
        return tarefaService.salvaTarefa(tarefa);
    }

    @GetMapping("/buscar/{id}")
    public Tarefa buscarTarefaId(@PathVariable int id) {
        return tarefaService.tarefaPorId(id);
    }
    @PutMapping("/salvar/{id}")
    public Tarefa atualizaTarefa(@PathVariable int id, @RequestBody Tarefa tarefa){
        return tarefaService.atualizarTarefa(tarefa,id);
    }
    @GetMapping("/todasTarefas")
    public List<Tarefa> listaTarefas(){
        return tarefaService.listaTarefas();
    }


}
