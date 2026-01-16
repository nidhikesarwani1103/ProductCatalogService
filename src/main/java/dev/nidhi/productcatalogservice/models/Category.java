package dev.nidhi.productcatalogservice.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Category extends BaseModel{

    /*
        -> name
        -> description
        -> products (List<Product>) [Not required as of now]
     */

    private String name;
    private String description;
    private List<Product> products;

}
