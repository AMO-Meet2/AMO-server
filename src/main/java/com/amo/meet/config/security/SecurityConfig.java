package com.amo.meet.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.httpBasic().disable()
            .csrf().disable()
            .cors().and()
            .headers().frameOptions().disable().and()
            .authorizeRequests()
//            .antMatchers("/login").permitAll()
//            .antMatchers("/api/**").authenticated()
            .antMatchers("/api/**").permitAll()
            .anyRequest().authenticated().and().build();

    }

//    @EnableWebSecurity: SpringSecurityFilterChain자동 생성
//    permitAll: 무조건 접근을 허용
//    authenticated: 인증된 사용자의 접근을 허용
//    참고 : https://velog.io/@tjdals9638/Spring-Boot-2.7.0-Security-Jwt-%EA%B5%AC%ED%98%84-1
//    참고 : https://spring.io/blog/2022/02/21/spring-security-without-the-websecurityconfigureradapter
}
