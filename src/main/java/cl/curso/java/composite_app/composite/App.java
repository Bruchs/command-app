package cl.curso.java.composite_app.composite;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	LineaSeparadora nuevaLinea = new LineaSeparadora(null, new ComandoNulo());
    	subMenu menuNuevo = new subMenu("New", new ArrayList<Menu>(), new ComandoNulo());
    	menuNuevo.getMenus().add( new itemMenu("Java Project", "", new ComandoCrearProyectoJava()) );
    	menuNuevo.getMenus().add( new itemMenu("Project....", "", new Command() {
			
			public void ejecutar() {
				System.out.println("Proyecto Creado");
			}
		}));
    	
    	subMenu menu = new subMenu("File", new ArrayList<Menu>(), new ComandoNulo());
    	menu.getMenus().add( menuNuevo );
    	menu.getMenus().add( new itemMenu("Open File", "", new ComandoNulo()) );
    	menu.getMenus().add(nuevaLinea);
    	menu.getMenus().add( new itemMenu("Close", "cmd + w", new ComandoNulo()) );
    	menu.getMenus().add( new itemMenu("Close All", "shift + f", new ComandoNulo()) );
    	menu.pintarMenu();
    	
    	menu.getMenus().get(2).onClick();
    }
}
