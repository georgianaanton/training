package com.georgianaa.training.domain.usecases;

import com.georgianaa.training.domain.models.Skill;

import java.util.List;

public interface RetrieveSkillsUseCase {
    List<Skill> getSkills();

    void addSkill(Skill skill);

    void updateSkill(Skill skill);
}
