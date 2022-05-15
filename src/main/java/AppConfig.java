import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = "helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(name = "Kesha")
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Cat getCat() {
        Cat cat = new Cat();
        cat.setVoise("Meowe");
        return cat;
    }
}