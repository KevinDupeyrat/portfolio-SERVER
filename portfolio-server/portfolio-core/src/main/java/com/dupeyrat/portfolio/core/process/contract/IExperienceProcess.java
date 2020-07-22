package com.dupeyrat.portfolio.core.process.contract;

import com.dupeyrat.portfolio.core.model.Experience;

public interface IExperienceProcess {

    public Experience updateExperience(Experience experience);

    public Experience getExperience(String id);

    public boolean deleteExperience(String id);
}
