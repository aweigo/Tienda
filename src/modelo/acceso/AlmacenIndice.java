package modelo.acceso;

import java.io.File;
import java.util.TreeMap;
import modelo.Indexable;

public class AlmacenIndice<T, K> {
	private String pathIndice;
	private String pathDatos;
	private TreeMap<K, Integer> indice;
	private DAO<Object> dao;

	public AlmacenIndice(String pathIndice, String pathDatos) {
		super();
		this.pathIndice = pathIndice;
		this.pathDatos = pathDatos;
		assert validate();
		this.indice = new TreeMap<>();
		this.dao = new DAO<>();
		comprobarPath();
	}

	private boolean validate() {
		return this.pathIndice != null && this.pathDatos != null;
	}

	public boolean borrar(K k) {
		leerIndice();
		boolean retorno = false;
		if (indice.containsKey(k)) {
			Integer posicion = indice.remove(k);
			if (posicion != null) {
				retorno = dao.borrarElemento(pathDatos, posicion);
				if (!retorno) {
					leerIndice();
				} else {
					recargaIndice();
					indice.toString();
					dao.grabar(pathIndice, indice);
				}

			}
		}
		return retorno;
	}

	private void recargaIndice() {
		indice = new TreeMap<>();
		int posicion = 0;
		T t = (T) dao.leer(pathDatos, posicion);
		while (t != null) {
			Indexable<K> elemento = (Indexable<K>) t;
			K k = elemento.getKey();
			indice.put(k, posicion);
			posicion++;
			t = (T) dao.leer(pathDatos, posicion);
		}

	}

	private void leerIndice() {
		indice = (TreeMap<K, Integer>) dao.leer(pathIndice);
	}

	public T obtener(K k) {
		comprobarPath();
		leerIndice();
		if (indice == null) {
			indice = new TreeMap<>();
			dao.grabar(pathIndice, indice);
		}
		T retorno = null;
		Integer posicion = indice.get(k);
		if (posicion != null) {
			retorno = (T) dao.leer(pathDatos, posicion);
		}
		return retorno;
	}

	/**
	 * Almacen el elemnto de clase T con Clave K, hay que pasarla
	 * 
	 * @param t
	 *            el objeto a grabar
	 * @param k
	 *            la propiedad clave o indice del objeto t
	 * @return true si ha almacenado y false en caso contrario
	 */
	public boolean grabar(T t, K k) {
		comprobarPath();

		boolean retorno = false;
		// miro el ultimo indice. siempre hay un mapa aqui
		Integer value = indice.size();
		// si es el primer elemento lastentry sera null
		// si al meterlo el valor es null es que NO esta repetido
		if (indice.put(k, value) == null) {
			// si se almacena bien en el archivo de datos
			if (dao.grabar(pathDatos, t, true)) {
				retorno = true;
				dao.grabar(pathIndice, indice);
			} else {
				leerIndice();
			}
		}
		return retorno;
	}

	private void comprobarPath() {
		StringBuilder path = new StringBuilder(this.pathDatos);

		for (int i = path.length() - 1; i > 0; i--) {
			if (path.charAt(i) == '/') {
				path.deleteCharAt(i);
				break;
			} else {
				path.deleteCharAt(i);
			}
		}

		crearPath(path.toString());
	}

	private void crearPath(String path) {
		File file = new File(path.toString());

		if (!file.exists()) {
			file.mkdirs();
		}
	}

}
