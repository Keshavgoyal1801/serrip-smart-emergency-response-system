package com.serrip.backend.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.util.Date;

@Service
public class JwtService {

    private static final String SECRET_KEY =
            "mySuperSecretKeyForEmergencyResponseDispatchSystem123456789";

    private static final long EXPIRATION_TIME =
            1000L * 60 * 60 * 24;   // 24 Hours

    private final SecretKey key =
            Keys.hmacShaKeyFor(
                    SECRET_KEY.getBytes());

    public String generateToken(
            String username) {

        return Jwts.builder()

                .subject(username)

                .issuedAt(
                        new Date())

                .expiration(
                        new Date(
                                System.currentTimeMillis()
                                        + EXPIRATION_TIME))

                .signWith(
                        key,
                        SignatureAlgorithm.HS256)

                .compact();
    }

    public String extractUsername(
            String token) {

        return extractClaims(token)
                .getSubject();
    }

    public boolean isTokenValid(
            String token,
            String username) {

        return username.equals(
                extractUsername(token))
                && !isTokenExpired(token);
    }

    private boolean isTokenExpired(
            String token) {

        return extractClaims(token)
                .getExpiration()
                .before(new Date());
    }

    private Claims extractClaims(
            String token) {

        return Jwts.parser()

                .verifyWith(key)

                .build()

                .parseSignedClaims(token)

                .getPayload();
    }
}