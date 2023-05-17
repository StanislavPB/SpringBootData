package springdata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class Application {

    private final VegetableService service;

    public Application(VegetableService service) {
        this.service = service;
    }


    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        Application application = context.getBean(Application.class);
        application.startApp();
    }

    public void startApp() {
        // создадим несколько сущностей фруктов и через сеттеры заполним поля

        Vegetable vegetable1 = new Vegetable();
        vegetable1.setVegetableName("vegetable1");
        vegetable1.setProviderCode(1);

        Vegetable vegetable2 = new Vegetable();
        vegetable2.setVegetableName("vegetable2");
        vegetable2.setProviderCode(2);

        Vegetable vegetable3 = new Vegetable();
        vegetable3.setVegetableName("vegetable3");
        vegetable3.setProviderCode(3);


        // с помощью переменной сервиса вызываем методы сохранения в базу
        service.save(vegetable1);
        service.save(vegetable2);
        service.save(vegetable3);


        // здесь попытаемся вытащить базу обратно

        List<Vegetable> allFruits = service.getAll();

        // выведем то что получили

        for (Vegetable entity : allFruits) {
            System.out.println(entity);
        }

    }

}
