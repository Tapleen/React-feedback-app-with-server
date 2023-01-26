package com.example.demo;

import com.example.demo.model.Feedback;
import com.example.demo.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoAppForReactFeedbackServerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoAppForReactFeedbackServerApplication.class, args);
	}
	@Autowired
	private FeedbackRepository feedbackRepository;

	@Override
	public void run(String... args) throws Exception{
		Feedback feedback1 = new Feedback();
		feedback1.setText("This is first rating");
		feedback1.setRating(2);
		feedbackRepository.save(feedback1);


		Feedback feedback2 = new Feedback();
		feedback2.setText("Lorem ipsum dolor sit amet consectetur adipisicing elit. consequuntur vel vitae commodi alias voluptatem est voluptatum ipsa quae.");
		feedback2.setRating(10);
		feedbackRepository.save(feedback2);
	}
}
