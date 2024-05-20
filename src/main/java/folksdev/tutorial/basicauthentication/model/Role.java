package folksdev.tutorial.basicauthentication.model;

import org.springframework.security.core.GrantedAuthority;

import java.io.Serializable;

public enum Role implements GrantedAuthority {
    ROLE_USER,
    ROLE_ADMIN,
    ROLE_MOD,
    ROLE_AGHA;

    @Override
    public String getAuthority() {
        return name();
    }
}
