package com.codeup.springblogapp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    // many categories can be mapped to multiple(many) ads, and vice versa
    // ergo, ManyToMany
//    @ManyToMany(mappedBy = "categories")
//    private List<Ad> ads;

    // If we swapped the ManyToMany notation between Ad and Category
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "ads_categories",
            joinColumns = {@JoinColumn(name="category_id")},
            inverseJoinColumns = {@JoinColumn(name="ad_id")}
    )
    private List<Ad> ads;






}
