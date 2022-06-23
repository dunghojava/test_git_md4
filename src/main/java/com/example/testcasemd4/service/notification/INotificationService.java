package com.example.testcasemd4.service.notification;

import com.codegym.castudymd6final.model.entity.Notification;
import com.codegym.castudymd6final.service.IGeneralService;

import java.util.List;

public interface INotificationService extends IGeneralService<Notification> {
    List<Notification> findAllNotification(Long id);
}
