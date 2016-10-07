package exception;

import java.io.*;

public class fundsException extends Exception {
	private double amount;

	public fundsException(double amount) {
		this.amount=amount;

	}

	public double getAmount(){
		return amount;
	}
}
