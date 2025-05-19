package com.example.bar.controller;


import com.example.bar.model.PedidoBar;
import com.example.bar.repository.PedidoBarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/pedidos")
public class PedidoBarController {

    @Autowired
    private PedidoBarRepository pedidoRepository;

    @GetMapping
    public String listarPedidos(Model model) {
        model.addAttribute("pedidos", pedidoRepository.findAll());
        return "pedidos/lista";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevo(Model model) {
        model.addAttribute("pedido", new PedidoBar());
        return "pedidos/formulario";
    }

    @PostMapping("/guardar")
    public String guardarPedido(@ModelAttribute PedidoBar pedido) {
        pedidoRepository.save(pedido);
        return "redirect:/pedidos";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarPedido(@PathVariable Long id) {
        pedidoRepository.deleteById(id);
        return "redirect:/pedidos";
    }
}