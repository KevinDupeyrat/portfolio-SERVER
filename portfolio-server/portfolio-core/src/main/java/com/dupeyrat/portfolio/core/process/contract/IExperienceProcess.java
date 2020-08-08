package com.dupeyrat.portfolio.core.process.contract;

import com.dupeyrat.portfolio.core.model.Experience;

import java.util.List;

public interface IExperienceProcess {

    public Experience updateExperience(Experience experience);

    public Experience getExperience(String id) throws Throwable;

    public List<Experience> getAll();

    public void deleteExperience(String id);
}
