package Sinap.Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import net.thucydides.core.annotations.Step;

public class AmazonRegistroPagina {

	private WebDriver driver;

	// Elemento que se encuentra en la página.
	@FindBy(how = How.ID, using = "createAccountSubmit")
	// Variable que se utiliza en los métodos.
	private WebElement btnCrear;

	@FindBy(how = How.XPATH, using = "//input[@name=\"customerName\"]")
	private WebElement txtNombre;

	public AmazonRegistroPagina(WebDriver driver) {
		PageFactory.initElements(driver, this); // llamado a libreria para utilizar la sentencia de localizadores

	}

	// El step es para identificar los paso que va a hacer.
	@Step
	public void registroAmazon() {
		txtNombre.sendKeys();
	}

	@Step
	public void diligenciarFormulario(String nombre) {
		txtNombre.sendKeys(nombre);
	}

}
