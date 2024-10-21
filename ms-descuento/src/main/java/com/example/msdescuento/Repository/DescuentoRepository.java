package com.example.msdescuento.Repository;

import com.example.msdescuento.Entity.Descuento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DescuentoRepository extends JpaRepository<Descuento, Integer> {
}
