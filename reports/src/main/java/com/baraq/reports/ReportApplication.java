package com.baraq.reports;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.baraq.reports.query"})
public class ReportApplication {
	public static void main(String[] args) {
		SpringApplication.run(ReportApplication.class, args);
	}
}
