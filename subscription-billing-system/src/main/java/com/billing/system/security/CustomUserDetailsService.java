package com.billing.system.security;
 
import com.billing.system.entity.User;
import com.billing.system.repository.UserRepository;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;
 
@Service
public class CustomUserDetailsService
        implements UserDetailsService {
 
    @Autowired
    private UserRepository userRepository;
 
    @Override
    public UserDetails loadUserByUsername(
            String email)
 
            throws UsernameNotFoundException {
 
        User user = userRepository
                .findByEmail(email)
 
                .orElseThrow(() ->
                        new UsernameNotFoundException(
                                "User Not Found"
                        )
                );
 
        return org.springframework.security.core.userdetails.User
 
                .withUsername(user.getEmail())
 
                .password(user.getPassword())
 
                .roles(user.getRole())
 
                .build();
    }
}
 