package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "reliance_customer")
@Data
@NoArgsConstructor
public class Customer {

    @Id
    private Long customerId;
    private String firstName;

    private String lastName;

    private String phone;

}
