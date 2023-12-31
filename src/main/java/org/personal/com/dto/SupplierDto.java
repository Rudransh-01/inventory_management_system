package org.personal.com.dto;

public class SupplierDto {
    private int supplier_id;
    private String supplier_name;
    private String supplier_address;
    private int supplier_phone;
    private String supplier_email;

    public int getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(int supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getSupplier_name() {
        return supplier_name;
    }

    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name;
    }

    public String getSupplier_address() {
        return supplier_address;
    }

    public void setSupplier_address(String supplier_address) {
        this.supplier_address = supplier_address;
    }

    public int getSupplier_phone() {
        return supplier_phone;
    }

    public void setSupplier_phone(int supplier_phone) {
        this.supplier_phone = supplier_phone;
    }

    public String getSupplier_email() {
        return supplier_email;
    }

    public void setSupplier_email(String supplier_email) {
        this.supplier_email = supplier_email;
    }

    public SupplierDto(int supplier_id, String supplier_name, String supplier_address, int supplier_phone, String supplier_email) {
        this.supplier_id = supplier_id;
        this.supplier_name = supplier_name;
        this.supplier_address = supplier_address;
        this.supplier_phone = supplier_phone;
        this.supplier_email = supplier_email;
    }
}
