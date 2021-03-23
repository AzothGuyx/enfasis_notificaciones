package com.enfasis;

import com.enfasis.base.NotificacionCorreo;
import com.enfasis.decorador.Notificador;
import com.enfasis.decorador.NotificadorEmpresarial;
import com.enfasis.decorador.NotificadorFacebook;
import com.enfasis.decorador.NotificadorSms;
import com.enfasis.interfaces.INotificacion;

public class Aplicacion {

	public static void main(String[] args) {
	
		/**
		 * con esto se empieza a apilar la notificacionCorreo  con otras funcionalidades para enviar mensajes a otras plataformas 
		 */
		INotificacion notificacion = new NotificacionCorreo();
		
		Notificador notificador = new NotificadorSms(notificacion);
		
		Notificador notificador2 = new NotificadorFacebook(notificador);
		
		Notificador notificador3 = new NotificadorEmpresarial(notificador2);
		
		
		notificador3.enviar("Llego la mazamorra, saque la ollaaaa", "sara");
		
	}

}
