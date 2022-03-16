package com.vventuri.add.controller;

import com.vventuri.add.entity.Turma;
import com.vventuri.add.repository.TurmaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("turma")
@RequiredArgsConstructor
public class TurmaController {

    private final TurmaRepository turmaRepository;

    @GetMapping
    public List<Turma> getAll(){
        return turmaRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Turma> getById(@PathVariable Integer id){
        return turmaRepository.findById(id);
    }
    @PostMapping
    public Turma Create(Turma turma){
        return turmaRepository.save(turma);

    }
    @PutMapping(path = "/{id}")
    public Turma update(@PathVariable Integer id, @RequestBody Turma turma){
        Turma tempTurma = turmaRepository.getById(id);
        turma.setId(tempTurma.getId());
        BeanUtils.copyProperties(turma, tempTurma, "id");
        return turmaRepository.save(tempTurma);
    }
    @DeleteMapping(path = "/{id}")
    public void remove(@PathVariable Integer id){
        turmaRepository.deleteById(id);
    }


}
