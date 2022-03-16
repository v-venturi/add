package com.vventuri.add.controller;

import com.vventuri.add.entity.Aluno;
import com.vventuri.add.repository.AlunoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("aluno")
@RequiredArgsConstructor
public class AlunoController {

    private final AlunoRepository alunoRepository;

    @GetMapping
    public List<Aluno> getAll(){
        return alunoRepository.findAll();
    }

    @GetMapping(path = "/id")
    public Aluno getById(Integer id){
        return alunoRepository.getById(id);
    }
    @PostMapping
    public Aluno Create(Aluno aluno){
        return alunoRepository.save(aluno);

    }
    @PutMapping(path = "/id")
    public Aluno update(@PathVariable int id, @RequestBody Aluno aluno){
        Aluno tempAluno = alunoRepository.getById(id);
        aluno.setId(tempAluno.getId());
        BeanUtils.copyProperties(aluno, tempAluno, "id");
        return alunoRepository.save(tempAluno);
    }
    @DeleteMapping(path = "/id")
    public void remove(@PathVariable int id){
        alunoRepository.deleteById(id);
    }


}
