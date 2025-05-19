package com.example.bar.repository;

import com.example.bar.model.HorarioCliente;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HorarioClienteRepository extends CrudRepository<HorarioCliente, Long> {
    @Query("SELECT cliente_id FROM horario_cliente WHERE horario_id = :horarioId")
    List<Long> findClienteIdsByHorarioId(@Param("horarioId") Long horarioId);
}
