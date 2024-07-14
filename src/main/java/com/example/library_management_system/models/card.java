package com.example.library_management_system.models;

import com.example.library_management_system.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "Card")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cid;
    @CreationTimestamp
    private Date issuedate;
    @UpdateTimestamp
    private Date updateOn;
    @Enumerated(EnumType.STRING)
    private Status status;
    private String validtill;

    @OneToOne
    @JoinColumn
    student st;

}
