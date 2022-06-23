package com.example.testcasemd4.service.shareWallet;

import com.codegym.castudymd6final.model.entity.ShareWallet;
import com.codegym.castudymd6final.service.IGeneralService;

import java.util.List;

public interface IShareWalletService extends IGeneralService<ShareWallet> {
    List<Long> findListWalletShare(Long id);

    List<Long> findWhoWasShared(Long id);

}
