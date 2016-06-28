/**
 * 
 */
package cl.curso.java.composite_app.composite;

/**
 * @author matia
 *
 */
public class LineaSeparadora extends Menu {

	public LineaSeparadora(String nombreMenu, Command command) {
		super(nombreMenu, command);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pintarMenu() {
		System.out.println("-----------------------");
	}

}
