package br.com.friends.notification.push;

import org.springframework.stereotype.Service;

import br.com.friends.notification.general.dto.NotificationRequest;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class PushService {

	public void sendPush(NotificationRequest request) {
		log.info("Enviando push para: {}", request.toString());		
	}

}
