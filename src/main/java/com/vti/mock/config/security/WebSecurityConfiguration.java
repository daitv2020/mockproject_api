//package com.vti.mock.config.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Component;
//
//import com.vti.mock.service.CityService;
//
//
///**
// * This class is config of secutity.
// * 
// * @Description: .
// * @author: NNDuy
// * @create_date: Apr 2, 2020
// * @version: 1.0
// * @modifer: NNDuy
// * @modifer_date: Apr 2, 2020
// */
//@Component
//@EnableWebSecurity
//public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
//
////	@Autowired
////	private CityService service;
//
////	@Override
////	protected void configure(HttpSecurity http) throws Exception {
////		http.cors().and()
////			.authorizeRequests()
//////				.antMatchers("/api/v1/users").hasAnyAuthority("Admin","Manager")
//////				.antMatchers(HttpMethod.DELETE, "api/v1/departments/*").hasAnyAuthority("Admin","Manager")
//////				.antMatchers(HttpMethod.PUT, "api/v1/departments").hasAnyAuthority("Admin","Manager")
//////				.antMatchers(HttpMethod.POST, "api/v1/departments").hasAnyAuthority("Admin","Manager")
//////				.antMatchers(HttpMethod.GET, "api/v1/departments").hasAnyAuthority("Admin","Manager", "Employee")
//////				.anyRequest().authenticated()
////				.anyRequest().permitAll()
////			.and()
////			.httpBasic()
////			.and()
////			.csrf().disable();
////	}
//	@Override
//    protected void configure(HttpSecurity http) throws Exception{
//        http.authorizeRequests().antMatchers("/").permitAll();
//    }
//}