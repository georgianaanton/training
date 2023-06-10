package com.georgianaa.training.domain.ports;

import com.georgianaa.training.domain.models.Skill;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface RetrieveSkillsPort {

    List<Skill> getSkills();

    void addSkill(Skill skill);

    void updateSkill(Skill skill);
}
