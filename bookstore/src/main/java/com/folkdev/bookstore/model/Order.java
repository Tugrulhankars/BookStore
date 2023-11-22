package com.folkdev.bookstore.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table
@Data
@Getter
@Setter
@Builder
@Entity(name = "bookOrder")
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String userName;
    @Column
    @ElementCollection(targetClass=Integer.class)
    private List<Integer> bookIdList;
    private Double totalPrice;
}
