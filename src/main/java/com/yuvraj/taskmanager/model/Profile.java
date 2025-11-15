package com.yuvraj.taskmanager.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.engine.internal.Cascade;

@Entity
@Table(name = "profile")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @NotBlank
    @Column(nullable = false)
    public String firstName;

    @Column
    public String lastName;

    @NotBlank
    @Column(nullable = false)
    public String phoneNumber;

    @NotBlank
    @Column(nullable = false)
    public String address;

}
