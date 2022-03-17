package com.vventuri.add.controller;

import com.vventuri.add.entity.Aluno;
import com.vventuri.add.entity.Turma;
import com.vventuri.add.repository.AlunoRepository;
import com.vventuri.add.service.AlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequiredArgsConstructor

public class MvcController {

    private final AlunoRepository alunoRepository;
    @Autowired
    private final AlunoService alunoService;

    @GetMapping("/")
    public ModelAndView getList() {
        List<Aluno> alunos = alunoRepository.findAll();
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("alunos", alunos);

        return mv;
    }
    @GetMapping("/aluno/form/add")
    public ModelAndView getFormAdd() {
        ModelAndView mv = new ModelAndView("cadastrar-aluno");
        List<Turma> turmaList = this.alunoService.getTurmaList(); // criar lista de turmas
        mv.addObject("turmaList", turmaList);
        return mv;
    }

    @PostMapping("/aluno/form/save")
    public String CadastrarAluno(Aluno aluno, BindingResult result,
                                 RedirectAttributes redirect) {
        if (result.hasErrors()) {
            redirect.addFlashAttribute("mensagem",
                    "Verifique os campos obrigatórios");
            return "redirect:/aluno/form/add";
        }
        this.alunoRepository.save(aluno);

        return "redirect:/";
    }

}
