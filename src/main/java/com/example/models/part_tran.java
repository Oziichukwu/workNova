package com.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class part_tran {

    @JsonProperty
    private String acct_no;

    @JsonProperty
    private double amount;

    @JsonProperty
    private String rmks;

    @JsonProperty
    private type type;

    @Override
    public String toString() {
        return "part_tran{" +
                "acct_no='" + acct_no + '\'' +
                ", amount=" + amount +
                ", rmks='" + rmks + '\'' +
                ", type=" + type +
                ", narration='" + narration + '\'' +
                '}';
    }

    public String getAcct_no() {
        return acct_no;
    }

    public void setAcct_no(String acct_no) {
        this.acct_no = acct_no;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getRmks() {
        return rmks;
    }

    public void setRmks(String rmks) {
        this.rmks = rmks;
    }

    public com.example.models.type getType() {
        return type;
    }

    public void setType(com.example.models.type type) {
        this.type = type;
    }

    public String getNarration() {
        return narration;
    }

    public void setNarration(String narration) {
        this.narration = narration;
    }

    private String narration;
}
