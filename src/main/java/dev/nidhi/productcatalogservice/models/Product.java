package dev.nidhi.productcatalogservice.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends BaseModel{
    /*
        -> name
        -> description
        -> price
        -> imageUrl
        -> category
     */

    private String name;
    private String description;
    private Double price;
    private String imageUrl;
    private Category category;
}
