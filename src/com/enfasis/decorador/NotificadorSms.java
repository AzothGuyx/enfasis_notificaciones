package com.enfasis.decorador;

import com.enfasis.interfaces.INotificacion;

/**
 * Clase que hereda de Notificador y funciona para decorar la clase base
 * 
 * @author Equipo 4
 *
 */
public class NotificadorSms extends Notificador {

	public NotificadorSms(INotificacion notificacion) {
		super(notificacion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void enviar(String msg, String destinatario) {
		notificacionWrapper.enviar(msg, destinatario);
		System.out.println("----------");
		System.out.println("mensaje enviado por SMS");
	}
}
