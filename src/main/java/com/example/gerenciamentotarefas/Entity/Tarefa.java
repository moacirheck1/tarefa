package com.example.gerenciamentotarefas.Entity;

import com.example.gerenciamentotarefas.Entity.Enum.Prioridade;
import com.example.gerenciamentotarefas.Entity.Enum.Status;
import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Tarefa {
   private int  id; //: Identificador único da tarefa (inteiro).
    private String titulo;// Título ou nome da tarefa (texto).
    private String descricao;// Descrição detalhada da tarefa (texto).
    private LocalDateTime dataDeVencimento;// Data em que a tarefa deve ser concluída (data/hora).
    private Status status;// Estado atual da tarefa, como "concluída", "em andamento" ou "pendente" (Enum).
    private Prioridade prioridade;// Nível de prioridade da tarefa, como "alta", "média" ou "baixa" (Enum).
    private String responsavel;// Nome do responsável pela tarefa (texto).
   private LocalDateTime dataDaCriacao; //Data em que a tarefa foi criada (data/hora).
    private LocalDateTime dataDaConclusao;// Data em que a tarefa foi concluída (data/hora) - pode ser nulo caso a
    //tarefa não tenha sido concluída.
}
