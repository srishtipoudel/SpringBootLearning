package com.springdatajpa.springboot.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

/**
 * @author Srishti
 * @created 2/3/2023: 6:36 PM
 */

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="products",
        schema ="task",
        uniqueConstraints = {
                @UniqueConstraint(
                        name="c_unique",
                        columnNames="category"
                )
        }
)
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "product_generator"
    )

    @SequenceGenerator(
            name="product_generator",
            sequenceName = "product_sequence_name",
            allocationSize = 1
    )
    private Long id;

    @Column(name="category", nullable = false)
    private String c;

    @Column(nullable = false)
    private String name;


    private String description;
    private boolean status;

    @CreationTimestamp
    private LocalDateTime dateCreated;


    @UpdateTimestamp
    private LocalDateTime deadline;



}
