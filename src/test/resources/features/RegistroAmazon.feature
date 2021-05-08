#Flor Toba
#08/05/2021
Feature: Validar el registro en la pagina de Amazon
@Regresion
Scenario: Registro exitoso
	Given abrir el navegador en página de registro de Amazon
	When haga clic en el botón crear

@Regresion
Scenario: Error al abrir por nombre de escenario fallido
	Given abrir navegador
	When haga clic en el boton crear

	
@Regresion	
	Scenario Outline: registro exitoso con nombre 
				
				When haga clic en el boton Crear
				Then diligenciar campo nombre <nombres>
				
				Examples:
				|nombres |
				|Jhonatan|