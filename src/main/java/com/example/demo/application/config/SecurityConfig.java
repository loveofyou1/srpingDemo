package com.example.demo.application.config;

/**
 * @author sunlei19
 */
//@Configuration

/**
 * @EnableWebSecurity
 */
public class SecurityConfig {//extends WebSecurityConfigurerAdapter

 /*   @Autowired
    private IUserService iUserService;


    @Override
    protected void configure(HttpSecurity http) throws Exception {

        *//**要求用户有reader权限*//*
        http.authorizeRequests().antMatchers("/").access("hasRole('READER')").antMatchers("/**")
                .permitAll().and().formLogin().loginPage("/login").failureUrl("/login?error=true");
    }


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.userDetailsService(new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
                return iUserService.queryUserInfoByName(s);
            }
        });
        super.configure(auth);
    }*/
}
