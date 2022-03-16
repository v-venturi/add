package com.vventuri.add.repository;

import com.vventuri.add.entity.Aluno;
import com.vventuri.add.entity.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Integer> {

}
