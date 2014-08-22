package introspeccionexemple;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Testintrospecion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creo el objeto
		Objeto a = new Objeto(100, 222, 333);

		System.out.println("Metal:" + a.getMetal() + " Cristal:" + a.getCristal() + " Deuterio:" + a.getDeuterio());

		// aqui buscamos el campo directamente
		Field field;
		int valor = 0;
		try {
			field = Objeto.class.getDeclaredField("publica");
			field.setAccessible(true);
			System.out.println(field.getName() + " " + field.getGenericType());
		} catch (Exception e) {
			e.printStackTrace();
		}

		// MEtodos
		try {
			Method m = Objeto.class.getMethod("GetMetal", null);
			System.out.println(m);
			//System.out.println(m.invoke(null, null));
		} catch (NoSuchMethodException  e) {
			e.printStackTrace();
		}

		// realizamos una introspeccion en busca del valor del metal.
		Field[] fields = Objeto.class.getDeclaredFields();

		// Esto te devuelve
		// las propiedades
		// privadas de la clase
		// Otra forma pero obteniendo todos los campos
		// for (Field f : fields) {
		// // realizamos un test por nombre de variable
		// if (f.getName().equals("Metal")) {
		// System.out.println("Introspeccion del metal:" + f);
		// break;
		// }
		// }

	}
}
