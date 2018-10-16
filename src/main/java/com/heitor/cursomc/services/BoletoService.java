package com.heitor.cursomc.services;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.heitor.cursomc.domain.PagamentoComBoleto;

@Service
public class BoletoService {

	private static final int SETE_DIAS = 7;

	public void preencherPagamentoComBoleto(PagamentoComBoleto pagto, Date instanteDoPedido) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(instanteDoPedido);
		cal.add(Calendar.DAY_OF_MONTH, SETE_DIAS);
		pagto.setDataVencimento(cal.getTime());
	}
	
}
