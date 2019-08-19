package com.example.app.watch.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * @author root
 * @Date 2019/8/19
 * @Version 1.0.0
 * @Description
 * @Company www.newtouch.cn
 **/
@Configuration
@EnableWebSecurity
public class WebSecurityConfig  extends WebSecurityConfigurerAdapter{

    @Override
    protected void configure(HttpSecurity http) throws Exception {
       http.authorizeRequests()
               .antMatchers("/")
               .permitAll().anyRequest().authenticated()
               .and()
               .formLogin()
               .loginPage("/login")
               .defaultSuccessUrl("/hello")
               .permitAll()
               .and()
               .logout()
               .permitAll();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        super.configure(auth);
    }

    @Bean
    @Override
    public UserDetailsService userDetailsService(){
        UserDetails userDetail= User.withDefaultPasswordEncoder().username("root").password("123456").roles("user").build();
        return  new InMemoryUserDetailsManager(userDetail);
    }
}
