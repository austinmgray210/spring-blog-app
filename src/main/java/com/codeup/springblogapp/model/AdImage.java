package com.codeup.springblogapp.model;

import javax.persistence.*;

@Entity
@Table(name = "ad_images")
public class AdImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // each ad_image will have an 'id', 'path', 'ad' that it's attached to

    // path for the image
    @Column(nullable = false)
    private String path;

    // 'ad' the image is attached to
    // many images can be attached to one ad listing (many-to-one)
    @ManyToOne
    @JoinColumn(name ="ad_id")
    private Ad ad;

    public AdImage() {}

    public AdImage(String path, Ad ad) {
        this.path = path;
        this.ad = ad;
    }

    public AdImage(long id, String path, Ad ad) {
        this.id = id;
        this.path = path;
        this.ad = ad;
    }
}
