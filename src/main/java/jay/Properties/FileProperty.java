package jay.Properties;



import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "myfile")
public class FileProperty {
    private String baseFile;

    private String filename;

}
