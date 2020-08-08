package com.dupeyrat.portfolio.core.service.impl;

import com.dupeyrat.portfolio.core.exception.ApplicationException;
import com.dupeyrat.portfolio.core.exception.ExceptionMessage;
import com.dupeyrat.portfolio.core.model.Experience;
import com.dupeyrat.portfolio.core.provider.IExperienceProvider;
import com.dupeyrat.portfolio.core.service.contract.IExperienceService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Supplier;

@Service
@AllArgsConstructor
@Slf4j
public class ExperienceServiceImpl implements IExperienceService {

    private final IExperienceProvider experienceProvider;


    @Override
    public Experience updateExperience(Experience experience) {
        return experienceProvider.save(experience);
    }

    @Override
    public Experience getExperience(String id) throws Throwable {
        return experienceProvider.findById(id)
                .orElseThrow((Supplier<Throwable>) () ->
                        new ApplicationException(ExceptionMessage.EXPERIENCE_NOT_FOUND.formatErrorMessage(id)));
    }

    @Override
    public List<Experience> getAll() {
        return experienceProvider.findAll();
    }

    @Override
    public void deleteExperience(String id) {
        experienceProvider.findById(id).ifPresentOrElse(
                (value) -> experienceProvider.deleteById(value.getId()),
                () -> { throw new ApplicationException(ExceptionMessage.EXPERIENCE_NOT_FOUND.formatErrorMessage(id));});
    }
}
