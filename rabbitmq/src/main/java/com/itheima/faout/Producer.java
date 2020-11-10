package com.itheima.faout;

import com.itheima.App;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Date:20202020/6/1415:56
 * Author: huangls
 * Desc:
 */


@RunWith(SpringRunner.class)
@SpringBootTest(classes=App.class)
public class Producer {

    @Autowired
    private RabbitMessagingTemplate rabbitTemplate;

    @Test
    public void testSend(){
        rabbitTemplate.convertAndSend("chuanzhi","","分裂模式走起。。。");
    }
}
