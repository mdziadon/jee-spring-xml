package pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.beans.HelloWorld;
import pl.coderslab.beans.MessageSender;
import pl.coderslab.beans.MessageService;

public class SpringDiApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        System.out.println(helloWorld.getMessage());

        MessageService messageService = (MessageService) context.getBean("messageService");
        messageService.send();

        MessageSender messageSender = (MessageSender) context.getBean("messageSender");
        messageSender.sendMessage();
        messageSender.sendMessageFromProperty();
    }
}
