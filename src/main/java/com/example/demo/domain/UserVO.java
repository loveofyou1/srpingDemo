package com.example.demo.domain;

import lombok.Data;

/**
 * @author sunlei19
 */
@Data
public class UserVO {//implements UserDetails

    private Integer id;

    private String userName;

    private String password;

    private Integer age;


    /* @Override
     public Collection<? extends GrantedAuthority> getAuthorities() {
         return null;
     }


     @Override
     public String getPassword() {
         return password;
     }


     @Override
     public String getUsername() {
         return userName;
     }


     @Override
     public boolean isAccountNonExpired() {
         return true;
     }


     @Override
     public boolean isAccountNonLocked() {
         return true;
     }


     @Override
     public boolean isCredentialsNonExpired() {
         return true;
     }


     @Override
     public boolean isEnabled() {
         return true;
     }

 */
    @Override
    public String toString() {
        return "UserVO{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
