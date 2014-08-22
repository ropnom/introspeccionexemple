package introspeccionexemple;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Testintrospecion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creo el objeto
		Objeto a = new Objeto(100, 222, 333);
		// recordamso que el objeto tiene una variable publica y tres protected

		System.out.println("Variable publica" + a.publica);
		System.out.println("Metal:" + a.getMetal() + " Cristal:" + a.getCristal() + " Deuterio:" + a.getDeuterio());

		// Iniciamos la introspeccion
		System.out.println(" Iniciamos la introspeccion en busca de la variable publica...");
		// aqui buscamos el campo directamente
		Field field;
		int valor = 0;
		try {
			field = Objeto.class.getDeclaredField("publica");
			System.out.println("Nombre de la variable: " + field.getName() + " Tipo:" + field.getGenericType() + " Valor:" + field.get(a));
			System.out.println("------------------------------------------------------------------");
			System.out.println(" Iniciamos la introspeccion en busca de la variable protected...");
			field = Objeto.class.getDeclaredField("Metal");
			field.setAccessible(true);// indicamos qeu se pueda acceder
			System.out.println("Nombre de la variable: " + field.getName() + " Tipo:" + field.getGenericType() + " Valor:" + field.get(a));
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println();
		System.out.println("Ahroa printamos todas las variables del objeto:");
		System.out.println();
		// realizamos una introspeccion en busca del valor del metal.
		Field[] fields = Objeto.class.getDeclaredFields();
		System.out.println("Se han encontrado " + fields.length + " variables:");
		// otra manera es obtener todas la variables
		try {
			for (Field f : fields) {
				System.out.println("Nombre de la variable:  '" + f.getName() + "'  Tipo:" + f.getGenericType() + " Valor:" + f.get(a));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// // MEtodos

		try {
			Method[] metodos = Objeto.class.getMethods();
			for (Method f : metodos) {
				System.out.println(f.getName() + " Types" + f.getTypeParameters());
			}
			// System.out.println(m.invoke(null, null));
		} catch (Exception e) {
			e.printStackTrace();
		}

//		try {
//			Method m = Objeto.class.getMethod("GetMetal", null);
//			System.out.println(m.i);
//			// System.out.println(m.invoke(null, null));
//		} catch (NoSuchMethodException e) {
//			e.printStackTrace();
//		}

	}
}
