package com.dupeyrat.portfolio.core.process.impl;

import com.dupeyrat.portfolio.core.model.Experience;
import com.dupeyrat.portfolio.core.process.contract.IExperienceProcess;
import com.dupeyrat.portfolio.core.service.contract.IExperienceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class ExperienceProcessImpl implements IExperienceProcess {

    private final IExperienceService experienceService;

    @Override
    public Experience updateExperience(Experience experience) {
        return experienceService.updateExperience(experience);
    }

    @Override
    public Experience getExperience(String id) throws Throwable {
        return experienceService.getExperience(id);
    }

    @Override
    public List<Experience> getAll() {
        return experienceService.getAll();
    }

    @Override
    public void deleteExperience(String id) {
        experienceService.deleteExperience(id);
    }
}
