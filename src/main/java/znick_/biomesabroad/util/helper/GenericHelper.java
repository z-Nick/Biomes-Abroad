package znick_.biomesabroad.util.helper;

public class GenericHelper {

	public static <T> boolean isInstance(T t, Class clazz) {
		try {clazz.cast(t); return true;}
		catch(ClassCastException e) {return false;}
	}
}
