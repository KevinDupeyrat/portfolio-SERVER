package com.dupeyrat.portfolio.web.rest.v1.experience;

import com.dupeyrat.portfolio.core.model.Experience;
import com.dupeyrat.portfolio.core.process.contract.IExperienceProcess;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("experience")
@Slf4j
public class ExperienceResource {

    @Autowired
    private IExperienceProcess experienceProcess;


    @PutMapping(consumes = "application/json", produces = "application/json")
    public ResponseEntity<Experience> putExperience(@RequestBody Experience experience) {
        return ResponseEntity
                .accepted()
                .body(experienceProcess.updateExperience(experience));
    }

    @GetMapping()
    public ResponseEntity<List<Experience>> getAll() {
        return ResponseEntity
                .ok()
                .body(experienceProcess.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Experience> getById(@PathVariable("id") String id) throws Throwable {
        return ResponseEntity
                .ok()
                .body(experienceProcess.getExperience(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Experience> deleteById(@PathVariable("id") String id) {

        experienceProcess.deleteExperience(id);

        return ResponseEntity.accepted().build();
    }
}
