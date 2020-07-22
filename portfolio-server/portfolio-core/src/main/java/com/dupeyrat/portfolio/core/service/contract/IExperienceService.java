package com.dupeyrat.portfolio.core.service.contract;

import com.dupeyrat.portfolio.core.model.Experience;

public interface IExperienceService {

    public Experience updateExperience(Experience experience);

    public Experience getExperience(String id);

    public boolean deleteExperience(String id);
}
