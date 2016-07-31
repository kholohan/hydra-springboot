package com.damnhandy.hydra.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import de.escalon.hypermedia.sample.springboot.HydraSampleServiceApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={HydraSampleServiceApplication.class})
public class HydraSampleServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

}
