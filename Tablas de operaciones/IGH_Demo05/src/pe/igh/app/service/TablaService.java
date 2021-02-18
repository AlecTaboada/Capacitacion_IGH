package pe.igh.app.service;

import java.util.ArrayList;
import java.util.List;

import pe.igh.app.dto.TablaItem;

public class TablaService {
	
	public List<TablaItem> multiplicar(int num){
		List<TablaItem> lista = new ArrayList<>();
		int rpta;
		for(int i = 1; i <= 12; i++){
			rpta = i * num;
			TablaItem item = new TablaItem();
			item.setNum1(num);
			item.setNum2(i);
			item.setRpta(rpta);
			item.setOperador("X");
			lista.add(item);
		}
		return lista;
	}
	public List<TablaItem> sumar(int num){
		List<TablaItem> lista = new ArrayList<>();
		int rpta;
		for(int i = 1; i <= 12; i++){
			rpta = i + num;
			TablaItem item = new TablaItem();
			item.setNum1(num);
			item.setNum2(i);
			item.setRpta(rpta);
			item.setOperador("+");
			lista.add(item);
		}
		return lista;
	}
	public List<TablaItem> restar(int num){
		List<TablaItem> lista = new ArrayList<>();
		int rpta;
		for(int i = 1; i <= 12; i++){
			
			rpta = num-i;
			TablaItem item = new TablaItem();
			item.setNum1(num);
			item.setNum2(i);
			item.setRpta(rpta);
			item.setOperador("-");
			lista.add(item);
			
		}
		return lista;
	}
	public List<TablaItem> dividir(int num){
		List<TablaItem> lista = new ArrayList<>();
		double rpta;
		for(int i = 1; i <= 12; i++){
			
			rpta = redondear((double)num/i);
			
			TablaItem item = new TablaItem();
			item.setNum1(num);
			item.setNum2(i);
			item.setRptadiv(rpta);
			item.setOperador("/");
			lista.add(item);
			
		}
		return lista;
	}
	
	public double redondear( double valor){
	      valor *= 100;
	      valor = Math.round(valor) * 1.0;
	      valor /= 100;
	      return valor;
	   }

}
