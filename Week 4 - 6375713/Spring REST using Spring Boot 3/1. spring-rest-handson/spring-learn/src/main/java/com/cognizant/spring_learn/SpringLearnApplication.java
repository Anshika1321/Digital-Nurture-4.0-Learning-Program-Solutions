package com.cognizant.spring_learn;

// HANDS-ON 1: Import for Logger and Spring Boot
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// HANDS-ON 2: Import for XML configuration and date formatting
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

@SpringBootApplication  // HANDS-ON 1: Enables Spring Boot auto-configuration and component scanning
public class SpringLearnApplication {

    // HANDS-ON 1: Logger instance
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
        // HANDS-ON 1: Run Spring Boot app
        SpringApplication.run(SpringLearnApplication.class, args);
        LOGGER.info("Inside main");  // HANDS-ON 1: Logging main method execution

        displayDate(); // HANDS-ON 2: Call the method that loads SimpleDateFormat from XML
    }

    // HANDS-ON 2: Method to load and use SimpleDateFormat bean from Spring XML configuration
    public static void displayDate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
        SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);

        try {
            Date date = format.parse("31/12/2018");
            LOGGER.info("Parsed Date: {}", date);  // HANDS-ON 2: Logging parsed date
        } catch (ParseException e) {
            LOGGER.error("Error parsing date", e);  // HANDS-ON 2: Log error if parsing fails
        }
    }
}
