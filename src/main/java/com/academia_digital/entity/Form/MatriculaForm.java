package com.academia_digital.entity.Form;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class MatriculaForm {

    private Long alunoId;

    public MatriculaForm(Long alunoId) {
        validarAlunoId(alunoId);
        this.alunoId = alunoId;
    }

    public Long getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(Long alunoId) {
        validarAlunoId(alunoId);
        this.alunoId = alunoId;
    }

    private void validarAlunoId(Long alunoId) {
        if (alunoId == null) {
            throw new IllegalArgumentException("Preencha o campo corretamente.");
        }
        if (alunoId <= 0) {
            throw new IllegalArgumentException("O Id do aluno precisa ser positivo.");
        }
    }
}