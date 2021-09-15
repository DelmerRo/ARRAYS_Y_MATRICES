package EstacionamientoMatrizClaseFecha;

import java.util.Calendar;
public  class Fecha {
private int dia;
private int mes;
private int a�o;
public Fecha(int dia, int mes, int a�o) {
	super();
	this.dia = dia;
	this.mes = mes;
	this.a�o = a�o;
}
@Override
public String toString() {
	return "Fecha [dia=" + dia + ", mes=" + mes + ", a�o=" + a�o + "]";
}
private int getDia() {
	return dia;
}
private void setDia(int dia) {
	this.dia = dia;
}
public int getMes() {
	return mes;
}
private void setMes(int mes) {
	this.mes = mes;
}
private int getA�o() {
	return a�o;
}
private void setA�o(int a�o) {
	this.a�o = a�o;
}

public static Fecha  hoy() {
	int dia = 0;
	int mes = 0;
	int a�o = 0;
	Fecha hoy;
	dia = (Calendar.DATE);
	mes = (Calendar.MONTH);
	a�o = (Calendar.YEAR);
	hoy=new Fecha(dia,mes,a�o);
	return hoy;	
}
}
