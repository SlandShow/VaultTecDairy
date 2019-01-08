package com.slandshow.vtdairy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

//    @Bean
//    CommandLineRunner runner(EntryRepository entryRepository, ContentRepository contentRepository) {
//        return args -> {
//            Content content = new Content();
//            Entry entry = new Entry();
//
//            content.setId(1L);
//            content.setContent_text("Suka bluat");
//            //content.setEntry(entry);
//
//            contentRepository.save(content);
//
//
//            entry.setId(1L);
//            entry.setDate(new Date());
//            entry.setTitle("Hmmm...");
//            entry.setContent(content);
//
//            entryRepository.save(
//                    entry
//            );
//        };
//    }
}

