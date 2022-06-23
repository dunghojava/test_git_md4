package com.example.testcasemd4.service.inout;

import com.codegym.castudymd6final.model.entity.InOut;
import com.codegym.castudymd6final.service.IGeneralService;

public interface IInOutSV extends IGeneralService<InOut> {
    Integer getInFlow(Long idWallet, int month, int year);

    Integer getOutFlow(Long idWallet, int month, int year);
}
