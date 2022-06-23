package com.example.testcasemd4.model.transactionInDay;

import java.util.Date;

public interface    AllTransactionWallet {
    Long getId();

    String getCategory();

    int getAmount();

    String getWallet();

    String getNote();

    Date getDate();
}
