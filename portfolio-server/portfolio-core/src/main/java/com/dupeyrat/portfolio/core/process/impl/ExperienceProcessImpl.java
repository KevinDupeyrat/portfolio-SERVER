package com.dupeyrat.portfolio.core.process.impl;

import com.dupeyrat.portfolio.core.model.Experience;
import com.dupeyrat.portfolio.core.process.contract.IExperienceProcess;
import com.dupeyrat.portfolio.core.service.contract.IExperienceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class ExperienceProcessImpl implements IExperienceProcess {

    private final IExperienceService experienceService;

    @Override
    public Experience updateExperience(Experience experience) {
        return null;
    }

    @Override
    public Experience getExperience(String id) {
        return null;
    }

    @Override
    public boolean deleteExperience(String id) {
        return false;
    }
}
