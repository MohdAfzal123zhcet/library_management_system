package com.example.library_management_system.models;


import com.example.library_management_system.enums.Department;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Student")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private    int id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Department dep;
    private String mob;

    @OneToOne(mappedBy = "st",cascade =CascadeType.ALL)
    card crd;
}
