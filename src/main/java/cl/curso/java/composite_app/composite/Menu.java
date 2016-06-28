/**
 * 
 */
package cl.curso.java.composite_app.composite;

/**
 * @author matiasF
 *
 */
public abstract class Menu {

	private String nombreMenu;
	private Command command = new ComandoNulo();
	
	public Menu() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombreMenu
	 */
	public Menu(String nombreMenu, Command command) {
		this.nombreMenu = nombreMenu;
		this.command = command;
	}

	/**
	 * @return the nombreMenu
	 */
	public String getNombreMenu() {
		return nombreMenu;
	}

	/**
	 * @param nombreMenu the nombreMenu to set
	 */
	public void setNombreMenu(String nombreMenu) {
		this.nombreMenu = nombreMenu;
	}
	
	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public abstract void pintarMenu();
	
	public void onClick(){
		this.command.ejecutar();
	}

}
