package com.vventuri.add.controller;

import com.vventuri.add.entity.Escola;
import com.vventuri.add.repository.EscolaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("escola")
@RequiredArgsConstructor
public class EscolaController {

    private final EscolaRepository escolaRepository;

    @GetMapping
    public List<Escola> getAll(){
        return escolaRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Escola> getById(@PathVariable Integer id){
        return escolaRepository.findById(id);
    }
    @PostMapping
    public Escola Create(@RequestBody Escola escola){
        return escolaRepository.save(escola);

    }
    @PutMapping(path = "/{id}")
    public Escola update(@PathVariable Integer id, @RequestBody Escola escola){
        Escola tempEscola = escolaRepository.getById(id);
        escola.setId(tempEscola.getId());
        BeanUtils.copyProperties(escola, tempEscola, "id");
        return escolaRepository.save(tempEscola);
    }
    @DeleteMapping(path = "/{id}")
    public void remove(@PathVariable Integer id){
        escolaRepository.deleteById(id);
    }


}
