package com.dupeyrat.portfolio.core.process.impl;

import com.dupeyrat.portfolio.core.model.User;
import com.dupeyrat.portfolio.core.process.contract.IUserProcess;
import com.dupeyrat.portfolio.core.service.contract.IUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class UserProcessImpl implements IUserProcess {

    private final IUserService userService;

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
