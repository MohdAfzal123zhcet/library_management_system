package com.example.library_management_system.models;

import com.example.library_management_system.enums.Genres;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="BOOK")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bid;
    private String title;
    @Enumerated(EnumType.STRING)
    private Genres genres;
    private int price;
    private int noOfPages;

    @ManyToOne
    @JoinColumn
    author ath;
}
