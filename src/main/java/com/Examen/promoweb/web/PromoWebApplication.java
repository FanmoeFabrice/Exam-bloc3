package com.Examen.promoweb.web;

import com.Examen.promoweb.model.Category;
import com.Examen.promoweb.model.Product;
import com.Examen.promoweb.model.Promotion;
import com.Examen.promoweb.repository.CategoryRepository;
import com.Examen.promoweb.repository.ProductRepository;
import com.Examen.promoweb.repository.PromotionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PromoWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(PromoWebApplication.class, args);
	}

	 CommandLineRunner commandLineRunner () {
		return commandLineRunner(null, null, null);
	}

	CommandLineRunner commandLineRunner (ProductRepository productRepository, CategoryRepository categoryRepository, PromotionRepository promotionRepository){
		return args -> {
			productRepository.save(
					new Product(null, "Ordinateur", "Ordinateur ASUS iCore7", 900.111, true));
			productRepository.save(
					new Product(null, "Ordinateur", "Ordinateur MacBook Air 13", 1300.000, true));
			productRepository.save(
					new Product(null, "Telephone", "Apple Iphone15", 1200.222, true));
			productRepository.save(
					new Product(null, "Television", "Television Samsung", 400, true));
			productRepository.save(
					new Product(null, "Climatiseur", "Climatiseur ", 79.555, true));

			productRepository.findAll().forEach(p->{
				System.out.println(p.toString());
			});


			categoryRepository.save(
					new Category(null, "Odinateurs"));
			categoryRepository.save(
					new Category(null, "Telephone"));

			categoryRepository.findAll().forEach(p->{
				System.out.println(p.getLabel());
			});


			promotionRepository.save(
					new Promotion());


		};

	}
}