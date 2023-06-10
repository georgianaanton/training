package com.georgianaa.training;

import com.georgianaa.training.domain.models.Skill;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SkillTest {

    @Test
    void should_properly_create_skill() {
        Skill skill = Skill.builder().name("test").level(20).build();

        assertNotNull(skill);
        assertEquals("test", skill.getName());

    }
}
