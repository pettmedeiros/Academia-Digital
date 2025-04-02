package com.academia_digital.service;

import com.academia_digital.entity.Form.MatriculaForm;
import com.academia_digital.entity.Matricula;

import java.util.List;

public interface IMatriculaService {
    //Cria uma Matrícula e salva no banco de dados.

    Matricula create(MatriculaForm form);

    //Retorna uma Matrícula que está no banco de dados de acordo com seu Id.

    Matricula get(Long id);

    //Retorna todas as Matrículas que estão no banco de dados.
    List<Matricula> getAll(String bairro);

    // Deleta uma Matrícula específica.
    void delete(Long id);

}

