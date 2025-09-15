package pe.edu.upc.apisanisidro.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="proveedores")
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProvider;

    @Column(name= "nameProvider", length = 40,nullable = false)
    private String nameProvider;

    @Column(name= "addressProvider", length = 40,nullable = false)
    private String addressProvider;

    @Column(name= "phoneProvider", length = 9,nullable = false)
    private String phoneProvider;

    @Column(name= "statusProvider",nullable = false)
    private boolean statusProvider;

    @Column(name= "typeProvider", length = 30,nullable = false)
    private String typeProvider;

    @Column(name= "dateRegisterProvider",nullable = false)
    private LocalDate dateRegisterProvider;

    @Column(name= "amountWarrantyProvider",nullable = false)
    private double amountWarrantyProvider;

    //generar constructor vacio (select none)
    public Provider() {
    }

    //generar constructor con todas los atributos
    public Provider(int id, String nameProvider, String addressProvider, String phoneProvider, boolean statusProvider, String typeProvider, LocalDate dateRegisterProvider, double amountWarrantyProvider) {
        this.idProvider = id;
        this.nameProvider = nameProvider;
        this.addressProvider = addressProvider;
        this.phoneProvider = phoneProvider;
        this.statusProvider = statusProvider;
        this.typeProvider = typeProvider;
        this.dateRegisterProvider = dateRegisterProvider;
        this.amountWarrantyProvider = amountWarrantyProvider;
    }

    //generar getter and setter de todos los atributos
    public int getIdProvider() {
        return idProvider;
    }

    public void setIdProvider(int idProvider) {
        this.idProvider = idProvider;
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
