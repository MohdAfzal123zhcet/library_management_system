package com.example.library_management_system.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Author")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class author {
   private String name;
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int aid;
   private String email;

   @OneToMany(mappedBy = "ath",cascade = CascadeType.ALL)
   List<book> b=new ArrayList<>();
}
