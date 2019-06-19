package br.com.friends.notification.general.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.friends.notification.general.dto.NotificationRequest;
import br.com.friends.notification.general.dto.NotificationResponse;
import br.com.friends.notification.general.service.NotificationService;

@RestController
@RequestMapping("/api")
public class NotificationController {
	
	@Autowired
	private NotificationService service;
	
	@PostMapping(path="/send")
	public ResponseEntity<?> send(@RequestBody NotificationRequest request) throws MessagingException{
		service.send(request);
		NotificationResponse response = new NotificationResponse("00","Notificação enviada com sucesso");
		return new ResponseEntity<NotificationResponse>(response, HttpStatus.OK);
	}
}
