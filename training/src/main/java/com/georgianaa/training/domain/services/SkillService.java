package com.georgianaa.training.domain.services;

import com.georgianaa.training.domain.models.Skill;
import com.georgianaa.training.domain.ports.RetrieveSkillsPort;
import com.georgianaa.training.domain.usecases.RetrieveSkillsUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService implements RetrieveSkillsUseCase {

    @Autowired
    private RetrieveSkillsPort retrieveSkillsPort;

    @Override
    public List<Skill> getSkills() {
        return retrieveSkillsPort.getSkills();
    }

    @Override
    public void addSkill(Skill skill) {
        retrieveSkillsPort.addSkill(skill);
    }

    @Override
    public void updateSkill(Skill skill) {
        retrieveSkillsPort.updateSkill(skill);
    }
}
