package cn.chinaunicom.industrialinternet.controllers.notificationAnnouncement;

import cn.chinaunicom.industrialinternet.entitys.ResultVO;
import cn.chinaunicom.industrialinternet.services.INotificationanNouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/notificationAnnouncement")
public class NotificationAnnouncementController {
    @Autowired
    INotificationanNouncementService notificationanNouncementService;
    @PostMapping("/getNotificationanNouncement")
    public ResultVO getNotificationanNouncement(){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("查询成功");
        resultVO.setData(notificationanNouncementService.getNotificationanNouncement());
        return  resultVO;
    }
}
