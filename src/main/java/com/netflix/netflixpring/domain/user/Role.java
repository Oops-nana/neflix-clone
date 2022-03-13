package com.netflix.netflixpring.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {

    USER("ROLE_USER", "유저"), ADMIN("ROLE_ADMIN", "관리자"), GUEST("ROLE_GUEST", "게스트");

    private final String key;
    private final String title;
}
