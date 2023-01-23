package com.example.interfaces3;

import java.util.Objects;

public class BankAccount {

    private Long id;
    private Double amount;
    private BankAccountType type;
    private Double cost;
    private String nif;
    private Integer openingYear;

    public BankAccount() {
    }

    public BankAccount(Long id, Double amount, BankAccountType type, Double cost, String nif, Integer openingYear) {
        this.id = id;
        this.amount = amount;
        this.type = type;
        this.cost = cost;
        this.nif = nif;
        this.openingYear = openingYear;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public BankAccountType getType() {
        return type;
    }

    public void setType(BankAccountType type) {
        this.type = type;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public Integer getOpeningYear() {
        return openingYear;
    }

    public void setOpeningYear(Integer openingYear) {
        this.openingYear = openingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankAccount that)) return false;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", amount=" + amount +
                ", type=" + type +
                ", cost=" + cost +
                ", nif='" + nif + '\'' +
                ", openingYear=" + openingYear +
                '}';
    }
}
