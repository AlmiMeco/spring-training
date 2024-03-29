package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name, code;

    @ManyToMany(mappedBy = "itemList") // <- Many items(ForeignKey) in Many carts(PrimaryKey)
    private List<Cart>  cart;


    public Item(String name, String code) {
        this.name = name;
        this.code = code;
    }
}
