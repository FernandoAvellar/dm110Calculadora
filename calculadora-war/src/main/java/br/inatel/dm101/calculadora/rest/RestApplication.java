package br.inatel.dm101.calculadora.rest;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.inatel.dm110.calculadora.core.CalculadoraServiceCore;

@ApplicationPath("/rest")
public class RestApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<>();
		classes.add(CalculadoraServiceCore.class);
		return classes;
	}
}