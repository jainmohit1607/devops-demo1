package com.example.devopsDemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class DevopsDemoApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testMainMethod() {
		try {
			DevopsDemoApplication.main(new String[] {});
		} catch (Exception ex) {
			// If an exception occurs during startup, fail the test
			// and print the stack trace for debugging purposes
			ex.printStackTrace();
			throw new RuntimeException("Application failed to start", ex);
		}
	}
	@Test
	public void testArEndpoint() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/start"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("Started the application"));
	}
}
