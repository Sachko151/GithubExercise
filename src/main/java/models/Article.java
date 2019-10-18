package models;

import models.enums.Category;
import models.enums.EngineType;
import models.enums.TransmissionType;
import org.hibernate.annotations.Table;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(appliesTo = "articles")
public class Article {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;
    @Column(name = "title")
    private String title;
    @Column(name = "imageLink")
    private String imageLink;
    @Column(name = "price")
    private BigDecimal price;
    @ManyToOne(targetEntity = User.class)
    private Long userId;
    @Column(name = "power")
    private int power;
    @Column(name = "eurostandard")
    private String eurostandard;
    @Column(name = "mileage")
    private int mileage;
    @Column(name = "color")
    private String color;
    @Column(name = "brand")
    private String brand;
    @Column(name = "model")
    private String model;
    @Column(name = "region")
    private String region;
    @Column(name = "category")
    @Enumerated(EnumType.STRING)
    private Category category;
    @Column(name = "transmission")
    @Enumerated(EnumType.STRING)
    private TransmissionType transmission;
    @Column(name = "engine")
    @Enumerated(EnumType.STRING)
    private EngineType engine;




    public Article(long id, String title, String imageLink, BigDecimal price, int power, Long userId, String eurostandard,
                   int mileage, String color, String brand, String model, String region, Category category,
                   TransmissionType transmission, EngineType engine) {
        this.id = id;
        this.title = title;
        this.imageLink = imageLink;
        this.price = price;
        this.power = power;
        this.userId = userId;
        this.eurostandard = eurostandard;
        this.mileage = mileage;
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.region = region;
        this.category = category;
        this.transmission = transmission;
        this.engine = engine;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getimageLink() {
        return imageLink;
    }

    public void setimageLink(String image) {
        this.imageLink = image;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getPoster() {
        return power;
    }

    public void setPoster(int poster) {
        this.power = poster;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getEurostandard() {
        return eurostandard;
    }

    public void setEurostandard(String eurostandard) {
        this.eurostandard = eurostandard;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public TransmissionType getTransmission() {
        return transmission;
    }

    public void setTransmission(TransmissionType transmission) {
        this.transmission = transmission;
    }

    public EngineType getEngine() {
        return engine;
    }

    public void setEngine(EngineType engine) {
        this.engine = engine;
    }
}