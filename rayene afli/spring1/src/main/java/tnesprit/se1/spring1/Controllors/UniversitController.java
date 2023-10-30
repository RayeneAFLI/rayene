package tnesprit.se1.spring1.Controllors;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tnesprit.se1.spring1.Entities.faculte;
import tnesprit.se1.spring1.Services.IfaculteService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/universit")
public class UniversitController {
    IfaculteService ifaculteService;

    @GetMapping("/allUniversit")
    public List<faculte> getUniversit() {
        List<faculte> listFaculte = ifaculteService.retrieveAllUniversits();
        return listFaculte;
    }

    @GetMapping("/Universit/{id}")
    public faculte retrieveUniversit(@PathVariable("id") Long id) {
        return ifaculteService.retrieveUniversit(id);
    }

    @PostMapping("/addUniversit")
    public faculte addUniversit(@RequestBody faculte u) {
        faculte faculte = ifaculteService.addUniversit(u);
        return faculte;
    }

    @DeleteMapping("/RemoveUniversit/{id}")
    public void removeUniversit(@PathVariable("id") Long id) {
        ifaculteService.removeUniversit(id);
    }

    @PutMapping("/UpdateUniversit")
    public faculte updateUniversit(@RequestBody faculte f) {
        faculte faculte = ifaculteService.updateUniversit(f);
        return faculte;
    }
}
