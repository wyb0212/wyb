import cn.itcast.controller.HellpController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.context.annotation.ComponentScan;

import java.sql.DatabaseMetaData;


@SpringBootApplication
@ComponentScan(basePackageClasses = HellpController.class)
public class SpringbootDemo1Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemo1Application.class,args);
    }
}
