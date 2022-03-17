package com.vventuri.add.service;

import com.vventuri.add.entity.Turma;
import com.vventuri.add.repository.TurmaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlunoService {

    @Autowired
    TurmaRepository turmaRepository;


    public List<Turma> getTurmaList() {
        Iterable<Turma> turmaIterable = this.turmaRepository.findAll();
        return Streamable.of(turmaIterable).toList();
    }
}
