package com.deviro.maven.config;

import com.deviro.maven.services.BluePrinter;
import com.deviro.maven.services.ColourPrinter;
import com.deviro.maven.services.GreenPrinter;
import com.deviro.maven.services.RedPrinter;
import com.deviro.maven.services.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

    @Bean
    public BluePrinter bluePrinter() {
        return new GermanBluePrinter();
    }

    @Bean
    public RedPrinter redPrinter() {
        return new GermanRedPrinter();
    }

    @Bean
    public GreenPrinter greenPrinter() {
        return new GermanGreenPrinter();
    }

    @Bean
    public ColourPrinter colourPrinter(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter) {
        return new ColourPrinterImpl(redPrinter, bluePrinter, greenPrinter);
    }
}
