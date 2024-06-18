package com.ClinicaApi.repository;

import com.ClinicaApi.model.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitaRepository extends JpaRepository<Cita, Long> {
    void deleteByPacienteId(Long id);
}
