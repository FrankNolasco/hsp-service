package com.geckofull.hspservice.repository;
import com.geckofull.hspservice.entity.Profesional;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ProfesionalRepository extends JpaRepository<Profesional, Integer> {
    Optional<Profesional> findByNumeroDocumento(String numeroDocumento);
}
