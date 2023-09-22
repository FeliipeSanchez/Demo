package com.ucundi.spring;

import static org.springframework.security.config.Customizer.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // @formatter:off
        http
                .authorizeHttpRequests((authorize) -> authorize
                        //Control access privileges
                        
                        .requestMatchers("/camas").authenticated()
                        .requestMatchers("/comida").authenticated()
                        .requestMatchers("/ropa").authenticated()
                        .requestMatchers("/servicios").authenticated()
                        .requestMatchers("/index").authenticated()
                        .requestMatchers("/api/createCams", "/api/updateCams", "/api/deleteCams" ).authenticated()
                        .requestMatchers("/api/createComida", "/api/updateComida", "/api/deleteComida" ).authenticated()
                        .requestMatchers("/api/createRopa", "/api/updateRopa", "/api/deleteRopa" ).authenticated()
                        .requestMatchers("/api/createServices", "/api/updateServices", "/api/deleteServices" ).authenticated()
                        .anyRequest().permitAll()
                )
                .formLogin(withDefaults());
        // @formatter:on
        return http.build();
    }
@Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
@Bean
    public InMemoryUserDetailsManager userDetailsService() {
        PasswordEncoder passwordEncoder = passwordEncoder();

        UserDetails user = User.builder()
                .username("user")
                .password(passwordEncoder.encode("bU2&52Z<eKfsV2"))
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(user);
}

}