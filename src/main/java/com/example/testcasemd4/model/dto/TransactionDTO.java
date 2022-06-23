package com.example.testcasemd4.model.dto;

import com.codegym.castudymd6final.model.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TransactionDTO {
    private int amount;

    private String note;

    private Date date;

    private Category category;

    private String moneyType;
}
