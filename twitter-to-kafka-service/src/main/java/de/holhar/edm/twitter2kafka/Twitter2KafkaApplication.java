package de.holhar.edm.twitter2kafka;

import de.holhar.edm.twitter2kafka.config.Twitter2KafkaConfigData;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Twitter2KafkaApplication implements CommandLineRunner {

  private static final Logger logger = LoggerFactory.getLogger(Twitter2KafkaApplication.class);

  private final Twitter2KafkaConfigData twitter2KafkaConfigData;

  public Twitter2KafkaApplication(Twitter2KafkaConfigData twitter2KafkaConfigData) {
    this.twitter2KafkaConfigData = twitter2KafkaConfigData;
  }

  public static void main(String[] args) {
    SpringApplication.run(Twitter2KafkaApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    logger.info("App starts...");
    logger.info(Arrays.toString(twitter2KafkaConfigData.getTwitterKeywords().toArray(new String[] {})));
  }
}
