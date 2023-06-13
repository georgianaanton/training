package com.georgianaa.training.adapters.out;

import com.georgianaa.training.domain.models.Skill;
import com.georgianaa.training.domain.ports.RetrieveSkillsPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SkillsClient implements RetrieveSkillsPort {

    @Autowired
    private SkillsRepository skillsRepository;

    @Override
    public List<Skill> getSkills(){
        return skillsRepository.findAll();
    }

    @Override
    public void addSkill(Skill skill) {
        skillsRepository.save(skill);
    }

    @Override
    public void updateSkill(Skill skill) {
        skillsRepository.save(skill);
    }

}
