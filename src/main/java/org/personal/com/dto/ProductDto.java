package org.personal.com.dto;

public class ProductDto {
    int product_id;
    String product_name;
    String product_desc;
    private float cost_per_unit;
    private int product_quantity;
    private int product_status;
    private int supplier_id;
    private int category_id;

    public ProductDto(int product_id, String product_name, String product_desc, float cost_per_unit, int product_quantity, int product_status, int supplier_id, int category_id) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_desc = product_desc;
        this.cost_per_unit = cost_per_unit;
        this.product_quantity = product_quantity;
        this.product_status = product_status;
        this.supplier_id = supplier_id;
        this.category_id = category_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_desc() {
        return product_desc;
    }

    public void setProduct_desc(String product_desc) {
        this.product_desc = product_desc;
    }

    public float getCost_per_unit() {
        return cost_per_unit;
    }

    public void setCost_per_unit(float cost_per_unit) {
        this.cost_per_unit = cost_per_unit;
    }

    public int getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(int product_quantity) {
        this.product_quantity = product_quantity;
    }

    public int getProduct_status() {
        return product_status;
    }

    public void setProduct_status(int product_status) {
        this.product_status = product_status;
    }

    public int getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(int supplier_id) {
        this.supplier_id = supplier_id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }
}
