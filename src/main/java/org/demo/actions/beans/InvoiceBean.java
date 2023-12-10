package org.demo.actions.beans;

import java.util.Date;

public class InvoiceBean {

    private String subject;
    private Date dateFrom;
    private Date dateTo;
    private Double price;
    private Double taxes;
    private Double priceWithTaxes;

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    private void setTaxes() {
        taxes = price * 0.21;
    }

    public Double getTaxes() {
        setTaxes();
        return taxes;
    }

    private void setPriceWithTaxes() {
        priceWithTaxes = price * 1.21;
    }

    public Double getPriceWithTaxes() {
        setPriceWithTaxes();
        return priceWithTaxes;
    }
}
