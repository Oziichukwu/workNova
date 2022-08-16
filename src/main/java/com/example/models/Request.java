package com.example.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Request {

    private String tran_ref;

    @Override
    public String toString() {
        return "Request{" +
                "tran_ref='" + tran_ref + '\'' +
                ", tran_date=" + tran_date +
                ", tran_ccy='" + tran_ccy + '\'' +
                ", tran_sub_type=" + tran_sub_type +
                ", part_tran=" + Arrays.toString(part_tran) +
                '}';
    }

    public String getTran_ref() {
        return tran_ref;
    }

    public void setTran_ref(String tran_ref) {
        this.tran_ref = tran_ref;
    }

    public LocalDateTime getTran_date() {
        return tran_date;
    }

    public void setTran_date(LocalDateTime tran_date) {
        this.tran_date = tran_date;
    }

    public String getTran_ccy() {
        return tran_ccy;
    }

    public void setTran_ccy(String tran_ccy) {
        this.tran_ccy = tran_ccy;
    }

    public com.example.models.tran_sub_type getTran_sub_type() {
        return tran_sub_type;
    }

    public void setTran_sub_type(com.example.models.tran_sub_type tran_sub_type) {
        this.tran_sub_type = tran_sub_type;
    }

    public com.example.models.part_tran[] getPart_tran() {
        return part_tran;
    }

    public void setPart_tran(com.example.models.part_tran[] part_tran) {
        this.part_tran = part_tran;
    }

    @JsonProperty
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime tran_date;

    @JsonProperty
    private String tran_ccy;

    @JsonProperty
    private tran_sub_type tran_sub_type;

    @JsonProperty
    private part_tran[] part_tran;

}
