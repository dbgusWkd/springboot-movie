package com.kit.movie.web.dto;

import com.kit.movie.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserSaveRequestDto {
    private Long id;
    private String name;
    private String password;

    @Builder
    public UserSaveRequestDto(Long id, String name, String password){
        this.id=id;
        this.name=name;
        this.password = password;
    }
    public User toEntity(String password){
        return User.builder()
                .id(id)
                .name(name)
                .password(password)
                .build();
    };
}
