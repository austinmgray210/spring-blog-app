package com.codeup.springblogapp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ads")
public class Ad {

    // create a primary key for the "ads" table in our dB
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    String title;

    @Column
    String description;

    // many ads can only have one author/owner
    // @Many[ads]toOne[user]
    @ManyToOne
    private User user;

    // each ad can have many images
    // one ad can have many images
    // here(ad) --> there(images)
    // @One[ad]toMany[images]

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ad")
    private List<AdImage> images;

    // many ads can have many categories, ergo @ManyToMany
//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(
//            // name of the intermediate table
//            name = "ads_categories",
//            // name for the id of this model joinColumns
//            joinColumns = {@JoinColumn(name="ad_id")},
//            // name for the id of the related(other) model inverseJoinColumns
//            inverseJoinColumns = {@JoinColumn(name="category_id")}
//    )

    @ManyToMany(mappedBy = "ads")
    private List<Category> categories;

    public Ad() {}

    public Ad(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<AdImage> getImages() {
        return images;
    }

    public void setImages(List<AdImage> images) {
        this.images = images;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
