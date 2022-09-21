package main.Reflaction;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TesteReflection {

	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("main.Reflaction.Cliente");
		
		Constructor<?> constr = clazz.getConstructor();
		Object cliente1 = constr.newInstance();
		System.out.println(cliente1);
		
		Method setNome = clazz.getMethod("setNome", String.class);
		setNome.invoke(cliente1, "UM NOME");
		
		Method getNome = clazz.getMethod("getNome");
		System.out.println(getNome.invoke(cliente1));
		
		Constructor<?> constr2 = clazz.getConstructor(String.class);
		Object cliente2 = constr2.newInstance("OUTRO NOME");
		
		System.out.println(getNome.invoke(cliente2));
		
	}

}
