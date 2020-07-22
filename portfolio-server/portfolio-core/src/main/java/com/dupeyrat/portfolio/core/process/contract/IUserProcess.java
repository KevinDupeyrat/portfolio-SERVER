package com.dupeyrat.portfolio.core.process.contract;

import com.dupeyrat.portfolio.core.model.User;

public interface IUserProcess {

    public User updateUser(User user);

    public User getUser(String id);

    public boolean deleteUser(String id);
}
