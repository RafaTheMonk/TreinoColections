package oo.composicao;

public class Carro {
	final Motor motor;

	Carro() {
		this.motor = new Motor(this);
	}
	
	void acelerar() {
		if (motor.fatorInjecao < 2.6) {
			motor.fatorInjecao += 0.4;
		}else {
			System.out.println("O motor já está na maior capacidade possível");
		}
		
	}

	void frear() {
		if (motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;
		} else {
			System.out.println("O motor já está na menor capacidade possível");
		}

	}

	void ligar() {
		motor.ligado = true;
	}

	void desligar() {
		motor.ligado = false;
	}

	boolean estaLigado() {
		return motor.ligado;
	}
}
