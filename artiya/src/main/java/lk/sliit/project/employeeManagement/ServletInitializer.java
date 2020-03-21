package lk.sliit.project.employeeManagement;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
/**
 * @author: Rivindu-Wijayarathna
 * Date: 08-Mar-20
 */
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources ( AppInitializer.class );
    }

}
