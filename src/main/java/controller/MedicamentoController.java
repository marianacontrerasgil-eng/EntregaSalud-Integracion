package controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class MedicamentoController {

    @GetMapping("/proyecto/medicamentos")
    public List<Map<String, Object>> listarMedicamentos() {
        List<Map<String, Object>> medicamentos = new ArrayList<>();

        Map<String, Object> med1 = new HashMap<>();
        med1.put("id", 1);
        med1.put("nombre", "Acetaminofén 500mg");
        med1.put("stock", 120);
        med1.put("laboratorio", "Genfar");

        Map<String, Object> med2 = new HashMap<>();
        med2.put("id", 2);
        med2.put("nombre", "Ibuprofeno 400mg");
        med2.put("stock", 85);
        med2.put("laboratorio", "Lafrancol");

        Map<String, Object> med3 = new HashMap<>();
        med3.put("id", 3);
        med3.put("nombre", "Amoxicilina 500mg");
        med3.put("stock", 50);
        med3.put("laboratorio", "Tecnoquímicas");

        medicamentos.add(med1);
        medicamentos.add(med2);
        medicamentos.add(med3);

        return medicamentos;
    }
}


