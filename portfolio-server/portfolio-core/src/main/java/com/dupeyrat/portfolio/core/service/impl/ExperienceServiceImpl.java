package com.dupeyrat.portfolio.core.service.impl;

import com.dupeyrat.portfolio.core.model.Experience;
import com.dupeyrat.portfolio.core.provider.IExperienceProvider;
import com.dupeyrat.portfolio.core.service.contract.IExperienceService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class ExperienceServiceImpl implements IExperienceService {

    private final IExperienceProvider experienceProvider;

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
