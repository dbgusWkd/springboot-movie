package com.kit.movie.domain.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

//    @Builder
//    public User(Long id, String name, String password, Role role){
//        this.id= id;
//        this.name=name;
//        this.password = password;
//        this.role=role;
//    }
//
//
//
//    public String getRoleKey(){
//        return this.role.getKey();
//    }
}
