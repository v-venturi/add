package com.vventuri.add.controller;

import com.vventuri.add.entity.Escola;
import com.vventuri.add.repository.EscolaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("escola")
@RequiredArgsConstructor
public class EscolaController {

    private final EscolaRepository escolaRepository;

    @GetMapping
    public List<Escola> getAll(){
        return escolaRepository.findAll();
    }

    @GetMapping(path = "/id")
    public Escola getById(Integer id){
        return escolaRepository.getById(id);
    }
    @PostMapping
    public Escola Create(Escola escola){
        return escolaRepository.save(escola);

    }
    @PutMapping(path = "/id")
    public Escola update(@PathVariable int id, @RequestBody Escola escola){
        Escola tempEscola = escolaRepository.getById(id);
        escola.setId(tempEscola.getId());
        BeanUtils.copyProperties(escola, tempEscola, "id");
        return escolaRepository.save(tempEscola);
    }
    @DeleteMapping(path = "/id")
    public void remove(@PathVariable int id){
        escolaRepository.deleteById(id);
    }


}
