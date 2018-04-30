package com.globalmart;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.globalmart.controller.ProductController;
import com.globalmart.domain.Product;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GlobalmartRestApplicationTests {

	@Autowired
	ProductController prodController;

	/*@Autowired
	private TestRestTemplate restTemplate;*/

	@Test
	public void contextLoads() {
		assertThat(prodController).isNotNull();
	}

	@Test
	public void getProducts() throws Exception {

		Product p1 = new Product(1, "Galaxy s", "1000", "Samsung Galaxy");
		prodController.saveProduct(p1);

		Product p2 = new Product(2, "Sony LED", "999", "Sony LED TV");
		prodController.saveProduct(p2);

		Product p3 = new Product(3, "Micoramax Soundbox", "888", "Micromax uhu");
		prodController.saveProduct(p3);

		assertThat(prodController.getProducts()).isNotEmpty();
		
		// assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/",
		// String.class)).contains("Hello World");
	}

}
