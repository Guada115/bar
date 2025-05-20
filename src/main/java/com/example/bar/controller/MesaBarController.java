package com.example.bar.controller;


import com.example.bar.model.HorarioBar;
import com.example.bar.model.MesaBar;
import com.example.bar.repository.MesaBarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/mesas")
public class MesaBarController {

    @Autowired
    private MesaBarRepository mesaBarRepository;

    @GetMapping
    public String listarMesas(Model model) {
        List<MesaBar> mesas = (List<MesaBar>) mesaBarRepository.findAll();
        model.addAttribute("mesas", mesas);
        return "mesas/mesalista";
    }
    //formulario para crear una nueva mesa
    @GetMapping("/nueva")
    public String mostrarFormularioNuevaMesa(Model model) {
        model.addAttribute("mesa", new MesaBar());
        return "mesas/mesaform";
    }

    @PostMapping("/guardar")
    public String guardarMesa(@ModelAttribute MesaBar mesa) {
        mesaBarRepository.save(mesa);
        return "redirect:/mesas";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarMesa(@PathVariable Long id) {
        mesaBarRepository.deleteById(id);
        return "redirect:/mesas";
    }

}