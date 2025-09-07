package pe.edu.upc.apisanisidro.dtos;

import java.time.LocalDate;

public class ProviderDTO {
    private int id;
    private String nameProvider;
    private String addressProvider;
    private String phoneProvider;
    private boolean statusProvider;
    private String typeProvider;
    private LocalDate dateRegisterProvider;
    private double amountWarrantyProvider;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProvider() {
        return nameProvider;
    }

    public void setNameProvider(String nameProvider) {
        this.nameProvider = nameProvider;
    }

    public String getAddressProvider() {
        return addressProvider;
    }

    public void setAddressProvider(String addressProvider) {
        this.addressProvider = addressProvider;
    }

    public String getPhoneProvider() {
        return phoneProvider;
    }

    public void setPhoneProvider(String phoneProvider) {
        this.phoneProvider = phoneProvider;
    }

    public boolean isStatusProvider() {
        return statusProvider;
    }

    public void setStatusProvider(boolean statusProvider) {
        this.statusProvider = statusProvider;
    }

    public String getTypeProvider() {
        return typeProvider;
    }

    public void setTypeProvider(String typeProvider) {
        this.typeProvider = typeProvider;
    }

    public LocalDate getDateRegisterProvider() {
        return dateRegisterProvider;
    }

    public void setDateRegisterProvider(LocalDate dateRegisterProvider) {
        this.dateRegisterProvider = dateRegisterProvider;
    }

    public double getAmountWarrantyProvider() {
        return amountWarrantyProvider;
    }

    public void setAmountWarrantyProvider(double amountWarrantyProvider) {
        this.amountWarrantyProvider = amountWarrantyProvider;
    }
}
