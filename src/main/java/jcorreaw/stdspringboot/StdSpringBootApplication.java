package jcorreaw.stdspringboot;

import jcorreaw.stdspringboot.beansXComponents.ConversonJson;
import jcorreaw.stdspringboot.beansXComponents.ViaCepResponse;
import jcorreaw.stdspringboot.scopesSingletonPrototype.SistemaMensagem;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StdSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(StdSpringBootApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner run(ConversonJson conversor) throws Exception {
//		return args -> {
//			String json = "{\"cep\": \"27525-680\",\"logradouro\": \"Rua goias\",\"localidade\": \"Rio de Janeiro\"}";
//			ViaCepResponse response = conversor.converter(json);
//			System.out.println("Dados do CEP: " + response);
//		};
//	}

//	@Bean
//	public CommandLineRunner run(SistemaMensagem sistema) throws Exception {
//		return args -> {
//			sistema.enviarConfirmacaoCadastro();
//			sistema.enviarMensagemBoasVindas();
//			sistema.enviarConfirmacaoCadastro();
//		};
//	}

}
