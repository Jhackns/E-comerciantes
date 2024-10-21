package com.example.msdescuento.Service.Impl;

import com.example.msdescuento.Entity.Descuento;
import com.example.msdescuento.Repository.DescuentoRepository;
import com.example.msdescuento.Service.DescuentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DescuentoSericeImpl implements DescuentoService {
   @Autowired
   private DescuentoRepository descuentoRepository;

    @Override
    public List<Descuento> list() {
        return descuentoRepository.findAll();
    }

    @Override
    public Descuento save(Descuento descuento) {
        return descuentoRepository.save(descuento);
    }


    @Override
    public Descuento update(Descuento descuento) {
        return descuentoRepository.save(descuento);
    }


    @Override
    public Optional<Descuento> findById(Integer id) {
        return descuentoRepository.findById(id);
    }


    @Override
    public void deleteById(Integer id) {
        descuentoRepository.deleteById(id);
    }
}
