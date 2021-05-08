package Sinap.Definitions;

import org.openqa.selenium.WebDriver;

import Sinap.Paginas.AmazonRegistroPagina;
import Sinap.Steps.Conexion;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();
	// Se instancia la clase de la que se van a utilizar los métodos.
	private AmazonRegistroPagina amazonRegistroPagina = new AmazonRegistroPagina (driver);

	@Given("^abrir el navegador en página de registro de Amazon$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();
	}

	@When("^haga clic en el botón crear$")
	public void iniciarRegistro() {
		this.amazonRegistroPagina = new AmazonRegistroPagina (driver);
		this.amazonRegistroPagina.registroAmazon();
	}
	
	@Then("^diligenciar campo nombre$")
	public void diligenciarNombre(String nombre) {
		this.amazonRegistroPagina = new AmazonRegistroPagina (driver);
		this.amazonRegistroPagina.diligenciarFormulario(nombre);
	}

}