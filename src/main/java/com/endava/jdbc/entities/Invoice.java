package com.endava.jdbc.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long invoiceId;

    @Column(nullable = false, unique = true)
    private String invoiceNumber;

    @ManyToOne
    private Employee employee;

}
