/**
 * 
 */
package cl.curso.java.composite_app.composite;

/**
 * @author matia
 *
 */
public class itemMenu extends Menu {

	private String atajoMenu;
	
	public itemMenu() {
		// TODO Auto-generated constructor stub
	}
		
	/**
	 * @param atajoMenu
	 */
	public itemMenu(String nombreMenu, String atajoMenu, Command command) {
		super(nombreMenu, command);
		this.atajoMenu = atajoMenu;
	}


	public String getAtajoMenu() {
		return atajoMenu;
	}


	public void setAtajoMenu(String atajoMenu) {
		this.atajoMenu = atajoMenu;
	}
	
	public void pintarMenu() {
		System.out.println( "---->" + this.getNombreMenu() + " " + this.getAtajoMenu() );

	}


}
