package com.billing.system.security;
 
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
 
import java.util.Date;
 
public class JwtUtil {
 
    private final String SECRET_KEY = "mysecretkey";
 
    // Generate JWT Token
 
    public String generateToken(String username) {
 
        return Jwts.builder()
 
                .setSubject(username)
 
                .setIssuedAt(new Date())
 
                .setExpiration(
                        new Date(System.currentTimeMillis()
                                + 1000 * 60 * 60)
                )
 
                .signWith(
                        SignatureAlgorithm.HS256,
                        SECRET_KEY
                )
 
                .compact();
    }
 
    // Extract Username
 
    public String extractUsername(String token) {
 
        return extractClaims(token).getSubject();
    }
 
    // Extract Claims
 
    public Claims extractClaims(String token) {
 
        return Jwts.parser()
 
                .setSigningKey(SECRET_KEY)
 
                .parseClaimsJws(token)
 
                .getBody();
    }
 
    // Validate Token
 
    public boolean validateToken(
            String token,
            String username) {
 
        String extractedUsername =
                extractUsername(token);
 
        return extractedUsername.equals(username);
    }
}
 