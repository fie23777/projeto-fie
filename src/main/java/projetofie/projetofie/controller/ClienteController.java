package projetofie.projetofie.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import projetofie.projetofie.model.ClienteModel;

@RestController
@CrossOrigin(origins = "*")
public class ClienteController {

	@GetMapping("/teste")
	public String getCliente() {
		return "ola fie";
	}
	
	@PostMapping(path="/create")
	@ResponseBody
	public ClienteModel cadastraCliente(@RequestBody ClienteModel product) {
		return product;
	}
}
