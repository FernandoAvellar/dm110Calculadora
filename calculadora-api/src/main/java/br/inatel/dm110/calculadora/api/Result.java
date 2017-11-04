package br.inatel.dm110.calculadora.api;

public class Result {
	private int first;
	private int second;
	private String message;

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public String getResult() {
		return message;
	}

	public void setResult(String result) {
		this.message = result;
	}
}
