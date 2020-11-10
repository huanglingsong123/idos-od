package com.itheima.topic;

import com.itheima.App;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Date:20202020/6/1415:28
 * Author: huangls
 * Desc:
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes=App.class)
public class Producer {

    @Autowired
    private RabbitMessagingTemplate rabbitTemplate;

    @Test
    public void testSendTopic1(){
        rabbitTemplate.convertAndSend("testtopic","article.aa","主题模式测试");
    }

    @Test
    public void testSendTopic2(){
        rabbitTemplate.convertAndSend("testtopic","article.aa.news","主题模式测试");
    }

    @Test
    public void testSendTopic3(){
        rabbitTemplate.convertAndSend("testtopic","article.news","主题模式测试");
    }
}
