package com.yuvraj.taskmanager;

import com.yuvraj.taskmanager.model.Task;
import com.yuvraj.taskmanager.model.enums.Priority;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class TaskmanagerApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testTaskBuilder(){
		Task task = Task.builder().title("Learn Spring boot")
				.priority(Priority.HIGH)
				.build();
		assertThat(task.getTitle()).isEqualTo("Learn Spring boot");
		assertThat(task.getPriority()).isEqualTo(Priority.HIGH);
	}

}
