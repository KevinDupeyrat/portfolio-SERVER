package com.dupeyrat.portfolio.core.service.impl;

import com.dupeyrat.portfolio.core.model.User;
import com.dupeyrat.portfolio.core.provider.IUserProvider;
import com.dupeyrat.portfolio.core.service.contract.IUserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class UserServiceImpl implements IUserService {

    // private final IUserProvider userProvider;

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public User getUser(String id) {
        return null;
    }

    @Override
    public boolean deleteUser(String id) {
        return false;
    }
}
