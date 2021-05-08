#Flor Toba
#08/05/2021
Feature: Validar el registro en la pagina de Amazon
@Regresion
Scenario Outline: Registro exitoso
	Given abrir el navegador en la página de registro de Amazon
	When haga clic en el botón crear
	Then diligenciar campo nombre <nombre>
	Examples:
				|nombre  |
				|Jhonatan|
