package cn.chinaunicom.industrialinternet.mappers;

import cn.chinaunicom.industrialinternet.entitys.notificationanNouncement.NotificationanNouncementVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface NotificationanNouncementMapper {
    public List<NotificationanNouncementVO> getNotificationanNouncement();
}
