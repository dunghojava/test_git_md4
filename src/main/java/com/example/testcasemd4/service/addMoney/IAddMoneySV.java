package com.example.testcasemd4.service.addMoney;

import com.codegym.castudymd6final.model.entity.AddMoney;
import com.codegym.castudymd6final.service.IGeneralService;

import java.util.Date;
import java.util.List;

public interface IAddMoneySV extends IGeneralService<AddMoney> {
    List<AddMoney> getAddMoneyByWallet(Long idWallet);

    Iterable<AddMoney> getListAddMoneyInTimeByIdWallet(Date date1, Date date2, Long idWallet);
    Iterable<AddMoney> getAllAddMoneyByIdUser(Long idUser);
}
