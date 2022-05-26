package edu.mum.cs544;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "edu.mum.cs544")
public class config {

    @Bean
    public IBookSupplier amazon(){
        return new Amazon();
    }

    @Bean
    public IBookSupplier eBooks(){
        return new EBooks();
    }

    @Bean
    public IBookSupplier barnesAndNoble(){
        return new BarnesAndNoble();
    }

    @Bean
    public BookService bookService(){
        return new BookService();
    }
}
