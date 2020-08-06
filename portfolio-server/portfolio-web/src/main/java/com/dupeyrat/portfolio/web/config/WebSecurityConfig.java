package com.dupeyrat.portfolio.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.access.channel.ChannelProcessingFilter;

@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.addFilterBefore(new CustomFilter(), ChannelProcessingFilter.class);
        http.csrf().disable()
                .authorizeRequests().antMatchers(HttpMethod.OPTIONS, "*/")
                .permitAll()
                .antMatchers(HttpMethod.GET, "/login").permitAll();
    }
}
