package com.cursoapi.cursoapi.repositorio;

import com.cursoapi.cursoapi.model.Estudiante;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstudianteRepositorio {
    private final List<Estudiante> estudiantes = new ArrayList<>(
            List.of(
                    new Estudiante("Max", "Perez", 19, "12345"),
                    new Estudiante("Maunel", "Perez", 19,"12344"),
                    new Estudiante("Groot", "Grutino", 95, "12333")
            )
    );
    public List<Estudiante> buscarTodos() {
        return estudiantes;
    }

}
