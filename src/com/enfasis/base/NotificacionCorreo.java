package com.enfasis.base;

import com.enfasis.interfaces.INotificacion;

/**
 * Clase que sirve como base para que sea "envuelta" por nuevas funcionalidades
 * 
 * @author Equipo 4
 *
 */
public class NotificacionCorreo implements INotificacion {

	@Override
	public void enviar(String msg, String destinatario) {
		System.out.println("Mensaje: "+msg);
		System.out.println("enviado a: "+destinatario);
		System.out.println("----------");
		System.out.println("mensaje enviado por Email");
	}

}
