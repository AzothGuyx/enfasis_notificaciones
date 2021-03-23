package com.enfasis.decorador;

import com.enfasis.interfaces.INotificacion;

/**
 * Clase abstracta que implementa la interfaz INotificacion que funciona como el decorador o wrapper base, y es la clase padre de los tipos
 * de notificaciones 
 * 
 * @author Equipo 4
 *
 */
public abstract class Notificador implements INotificacion {

	protected INotificacion notificacionWrapper;
	
	
	@Override
	public void enviar(String msg, String destinatario) {
		 notificacionWrapper.enviar(msg, destinatario);

	}
	
	public Notificador(INotificacion notificacion) {
		this.notificacionWrapper = notificacion;
	}

}

