/**
 * 
 */
package cl.curso.java.composite_app.composite;

import java.util.ArrayList;

/**
 * @author matia
 *
 */
public class subMenu extends Menu {
	
	private ArrayList<Menu> menus;

	public subMenu() {
		// TODO Auto-generated constructor stub
	}
		
	/**
	 * @param menus
	 */
	public subMenu(String nombreMenu, ArrayList<Menu> menus, Command command) {
		super(nombreMenu, command);
		this.menus = menus;
	}

	public ArrayList<Menu> getMenus() {
		return menus;
	}
	public void setMenus(ArrayList<Menu> menus) {
		this.menus = menus;
	}

	public void pintarMenu() {
		System.out.println( this.getNombreMenu() );
		for(Menu menu: this.getMenus())
		{
			menu.pintarMenu();
		}

	}
}
