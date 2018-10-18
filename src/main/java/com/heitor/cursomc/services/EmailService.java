package com.heitor.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.heitor.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}
