package com.example.bar.controller;



import com.example.bar.model.HorarioBar;
import com.example.bar.repository.HorarioBarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/horarios")
public class HorarioBarController {

    @Autowired
    private HorarioBarRepository horarioRepository;

    @GetMapping
    public String listarHorarios(Model model) {
        model.addAttribute("horarios", horarioRepository.findAll());
        return "horarios/lista";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevo(Model model) {
        model.addAttribute("horario", new HorarioBar());
        return "horarios/formulario";
    }

    @PostMapping("/guardar")
    public String guardarHorario(@ModelAttribute HorarioBar horario) {
        horarioRepository.save(horario);
        return "redirect:/horarios";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        horarioRepository.deleteById(id);
        return "redirect:/horarios";
    }
}
