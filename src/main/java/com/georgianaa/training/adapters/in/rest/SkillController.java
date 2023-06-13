package com.georgianaa.training.adapters.in.rest;

import com.georgianaa.training.domain.models.Skill;
import com.georgianaa.training.domain.usecases.RetrieveSkillsUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SkillController {

    @Autowired
    private RetrieveSkillsUseCase retrieveSkillsUseCase;

    @GetMapping("/skills")
    public List<Skill> getSkills() {
        return retrieveSkillsUseCase.getSkills();
    }

    @PostMapping("/skill")
    public void addSkills(@RequestBody Skill skill) {
        retrieveSkillsUseCase.addSkill(skill);
    }

    @PutMapping("/skill/{name}")
    public void updateSkill(@RequestBody Skill skill, @PathVariable String name) {
        retrieveSkillsUseCase.updateSkill(skill);
    }
}
