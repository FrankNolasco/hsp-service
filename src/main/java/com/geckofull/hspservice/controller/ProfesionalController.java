package com.geckofull.hspservice.controller;
import com.geckofull.hspservice.entity.Profesional;
import com.geckofull.hspservice.service.ProfesionalService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/profesionales")
public class ProfesionalController {

    private final ProfesionalService profesionalService;

    public ProfesionalController(ProfesionalService profesionalService) {
        this.profesionalService = profesionalService;
    }

    @GetMapping
    public List<Profesional> listar() {
        return profesionalService.listarTodos();
    }

    @GetMapping("/{numeroDocumento}")
    public Optional<Profesional> buscarPorNumeroDocumento(@PathVariable String numeroDocumento) {
        return profesionalService.buscarPorNumeroDocumento(numeroDocumento);
    }

    @PostMapping
    public Profesional crear(@RequestBody Profesional profesional) {
        return profesionalService.guardar(profesional);
    }
}
