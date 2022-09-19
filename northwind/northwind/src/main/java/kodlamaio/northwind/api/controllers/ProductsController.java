package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;

@RestController
@RequestMapping("api/products")
//kodlama.io/api/products böyle bir istekde bulunursa bu controller karşılıyacak
public class ProductsController {
	private ProductService productservice;
	@Autowired
public ProductsController(ProductService productservice) {
		super();
		this.productservice = productservice;
	}
	//ProductManager p=new ProductManage() yapıyo arka planda

@GetMapping("/getall")
//kodlama.io/api/products/getall isteği geldiği zaman bu fonksiyon çalışıcak
	public List<Product> getAll(){
	
		
		
		
		return this.productservice.getAll();
	}
	

}
