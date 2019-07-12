
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.bw.mapper")
@ComponentScan("com.bw")
//在同一个包下@ComponentScan("指定路径")可以不加
		//以下为@ComponentScan注解的解释
//@ComponentScan告诉Spring 哪个packages 的用注解标识的类 会被spring自动扫描并且装入bean容器。
//例如，如果你有个类用@Controller注解标识了，那么，如果不加上@ComponentScan，自动扫描该controller，
//那么该Controller就不会被spring扫描到，更不会装入spring容器中，因此你配置的这个Controller也没有意义。
public class MyApp {
	public static void main(String[] args) {
		SpringApplication.run(MyApp.class, args);
	}
	//1111
}
