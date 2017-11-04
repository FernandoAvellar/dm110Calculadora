package br.inatel.dm110.calculadora.core;

import br.inatel.dm110.calculadora.api.CalculadoraService;
import br.inatel.dm110.calculadora.api.Result;

public class CalculadoraServiceCore implements CalculadoraService {

	@Override
	public Result sum(int first, int second) {
		Result result = new Result();
		result.setFirst(first);
		result.setSecond(second);
		String message = String.format("First: %s ,Second: %s, Result: %s", first, second, first+second);
		result.setResult(message);
		return result;
	}

	@Override
	public Result subtract(int first, int second) {
		Result result = new Result();
		result.setFirst(first);
		result.setSecond(second);
		String message = String.format("First: %s ,Second: %s, Result: %s", first, second, first-second);
		result.setResult(message);
		return result;
	}
}
