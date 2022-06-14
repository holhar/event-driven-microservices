package de.holhar.edm.twitter2kafka.config;

import java.util.List;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "app")
public class Twitter2KafkaConfigData {

  private List<String> twitterKeywords;
}
