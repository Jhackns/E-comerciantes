package com.example.msdescuento.Service;

import com.example.msdescuento.Entity.Descuento;


import java.util.List;
import java.util.Optional;

public interface DescuentoService {
    public List<Descuento> list();
    public Descuento save(Descuento descuento);
    public Descuento update(Descuento descuento);
    public Optional<Descuento> findById(Integer id);
    public void deleteById(Integer id);
}
