package com.dupeyrat.portfolio.core.service.contract;

import com.dupeyrat.portfolio.core.model.User;

public interface IUserService {

    public User updateUser(User user);

    public User getUser(String id);

    public boolean deleteUser(String id);
}
