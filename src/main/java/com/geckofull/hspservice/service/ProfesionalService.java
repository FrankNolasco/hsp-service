package com.geckofull.hspservice.service;
import com.geckofull.hspservice.entity.Profesional;
import com.geckofull.hspservice.repository.ProfesionalRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProfesionalService {

    private final ProfesionalRepository profesionalRepository;

    public ProfesionalService(ProfesionalRepository profesionalRepository) {
        this.profesionalRepository = profesionalRepository;
    }

    public List<Profesional> listarTodos() {
        return profesionalRepository.findAll();
    }

    public Optional<Profesional> buscarPorNumeroDocumento(String numeroDocumento) {
        return profesionalRepository.findByNumeroDocumento(numeroDocumento);
    }

    public Profesional guardar(Profesional profesional) {
        return profesionalRepository.save(profesional);
    }
}
