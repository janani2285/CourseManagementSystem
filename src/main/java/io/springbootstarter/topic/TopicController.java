package io.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getTopics() {
		return Arrays.asList(
				new Topic("Spring", "Spring Framework", "Spring Description"),
				new Topic("Java", "Java", "Java Description"),
				new Topic("JavaScript", "JavaScript", "JavaScript Description")
				);
	}
}
