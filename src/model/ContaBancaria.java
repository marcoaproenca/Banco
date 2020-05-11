package model;

public class ContaBancaria {
    private String  cpf;
    private int     numero;
    private int     dv;
    private double  saldo;

    public ContaBancaria(String nCpf, int nConta, int nDv){
        cpf     = nCpf;
        numero  = nConta;
        dv      = nDv;
    }


    public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public int getDv() {
		return dv;
	}


	public void setDv(int dv) {
		this.dv = dv;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public void creditar(double vlrCredito){
        saldo = saldo + vlrCredito;
    }
    public boolean debitar(double vlrDebito){
        if(vlrDebito <= saldo){
            saldo = saldo - vlrDebito;
            return true;
        }else{
            return false;
        }
    }
}
