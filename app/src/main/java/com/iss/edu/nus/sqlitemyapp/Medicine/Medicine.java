package com.iss.edu.nus.sqlitemyapp.Medicine;

import java.util.Date;

public class Medicine {

    private int medicine_id;
    private String medicine;
    private String description;
    private int catId;
    private int reminderId;
    private boolean reminder;
    private int quantity;
    private int dosage;
    private Date dateIssued;
    private int consumeQuantity;
    private int _thresHold;

    public Medicine(String medicine, String description, int catId, int reminderId, boolean reminder, int quantity, int dosage,
                        Date dateIssued, int consumeQuantity, int _thresHold)
    {
        this.medicine = medicine;
        this.description = description;
        this.catId = catId;
        this.reminder = reminder;
        this.reminderId = reminderId;
        this.dosage = dosage;
        this.dateIssued = dateIssued;
        this.consumeQuantity = consumeQuantity;
        this._thresHold = _thresHold;
    }

    public int getId() {
        return medicine_id;
    }

    public void setId(int id) {
        this.medicine_id = id;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public int getReminderId() {
        return reminderId;
    }

    public void setReminderId(int reminderId) {
        this.reminderId = reminderId;
    }

    public boolean isReminder() {
        return reminder;
    }

    public void setReminder(boolean reminder) {
        this.reminder = reminder;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getDosage() {
        return dosage;
    }

    public void setDosage(int dosage) {
        this.dosage = dosage;
    }

    public Date getDateIssued() {
        return dateIssued;
    }

    public void setDateIssued(Date dateIssued) {
        this.dateIssued = dateIssued;
    }

    public int getConsumeQuantity() {
        return consumeQuantity;
    }

    public void setConsumeQuantity(int consumeQuantity) {
        this.consumeQuantity = consumeQuantity;
    }

    public int getThresHold() {
        return _thresHold;
    }

    public void setThresHold(int thresHold) {
        this._thresHold = thresHold;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Medicine)) return false;

        Medicine medicine1 = (Medicine) o;

        if (getCatId() != medicine1.getCatId()) return false;
        if (getReminderId() != medicine1.getReminderId()) return false;
        if (isReminder() != medicine1.isReminder()) return false;
        if (getQuantity() != medicine1.getQuantity()) return false;
        if (getDosage() != medicine1.getDosage()) return false;
        if (getConsumeQuantity() != medicine1.getConsumeQuantity()) return false;
        if (_thresHold != medicine1._thresHold) return false;
        if (getMedicine() != null ? !getMedicine().equals(medicine1.getMedicine()) : medicine1.getMedicine() != null)
            return false;
        if (getDescription() != null ? !getDescription().equals(medicine1.getDescription()) : medicine1.getDescription() != null)
            return false;
        return getDateIssued() != null ? getDateIssued().equals(medicine1.getDateIssued()) : medicine1.getDateIssued() == null;

    }
}
