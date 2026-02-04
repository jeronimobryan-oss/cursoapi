package com.cursoapi.cursoapi.controlador;

import com.cursoapi.cursoapi.model.Estudiante;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteControlador {
    @GetMapping
    public String getEstudiante() {
        return "Hola Estudiantes";
    }
    @PostMapping
    public ResponseEntity<String> postEstudiante(@RequestBody Estudiante estudiante) {
        //return "Hola Estudiantes" + estudiante.getNombre();
        return new ResponseEntity<>("Hola nuevo estudiante: " + estudiante.getNombre(), HttpStatus.CREATED);
    }
    @DeleteMapping("{matricula}")
    public String deleteEstudiante(@PathVariable String matricula) {
        return "Hola Estudiantes eliminado";
    }
}