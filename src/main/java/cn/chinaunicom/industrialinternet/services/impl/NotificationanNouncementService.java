package cn.chinaunicom.industrialinternet.services.impl;

import cn.chinaunicom.industrialinternet.entitys.notificationanNouncement.NotificationanNouncementVO;
import cn.chinaunicom.industrialinternet.mappers.NotificationanNouncementMapper;
import cn.chinaunicom.industrialinternet.services.INotificationanNouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationanNouncementService  implements INotificationanNouncementService {
    @Autowired
    NotificationanNouncementMapper notificationanNouncementMapper;
    public List<NotificationanNouncementVO> getNotificationanNouncement(){
        return  notificationanNouncementMapper.getNotificationanNouncement();
    }
}
