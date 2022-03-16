package com.vventuri.add.controller;

import com.vventuri.add.entity.Aluno;
import com.vventuri.add.repository.AlunoRepository;
import com.vventuri.add.repository.TurmaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("aluno")
@RequiredArgsConstructor
public class AlunoController {

    private final AlunoRepository alunoRepository;
    private final TurmaRepository turmaRepository;

    @GetMapping
    public List<Aluno> getAll(){
        return alunoRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Aluno> getById(@PathVariable Integer id){
        return alunoRepository.findById(id);
    }

    @PostMapping
    public Aluno Create(@RequestBody Aluno aluno){
       return alunoRepository.save(aluno);


    }
    @PutMapping(path = "/{id}")
    public Aluno update(@PathVariable Integer id, @RequestBody Aluno aluno){
        Aluno tempAluno = alunoRepository.getById(id);
        aluno.setId(tempAluno.getId());
        BeanUtils.copyProperties(aluno, tempAluno, "id");
        return alunoRepository.save(tempAluno);
    }
    @DeleteMapping(path = "/{id}")
    public void remove(@PathVariable Integer id){
        alunoRepository.deleteById(id);
    }


}
