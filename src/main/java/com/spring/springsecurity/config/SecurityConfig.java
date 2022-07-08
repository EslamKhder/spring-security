package com.spring.springsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        /*http.authorizeRequests((requests) -> {
            (requests.anyRequest()).authenticated();
        });
        http.formLogin();
        http.httpBasic();*/
        /*http.authorizeRequests().anyRequest().permitAll()
                .and().formLogin().and().httpBasic();*/

        http.authorizeRequests().anyRequest().denyAll()
                .and().formLogin().and().httpBasic();
        /*http.authorizeRequests()
                .antMatchers("/football/*").authenticated()
                .antMatchers("/basketball/*").authenticated()
                .antMatchers("/swimming/*").authenticated()
                .antMatchers("/subscribers/*").authenticated()
                .antMatchers("/about/*").permitAll()
                .antMatchers("/connect/*").permitAll()
                .and().formLogin().and().httpBasic();*/
    }
}
