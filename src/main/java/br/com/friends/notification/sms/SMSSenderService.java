package br.com.friends.notification.sms;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;

import br.com.friends.notification.general.dto.NotificationRequest;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class SMSSenderService {
	
	@Autowired
	private SMSProperties properties;
	
	public void send(String number, String smsMessage) {
		try {
			// Construct data
			String apiKey = "apikey=" + properties.getApikey();
			String message = "&message=" + smsMessage;
			String sender = "&sender=" + properties.getSender();
			String numbers = "&numbers=" + number;

			String data = apiKey + numbers + message + sender;

			HttpResponse<JsonNode> jsonResponse = Unirest.post(properties.getUrl())
					.header("Accept", "charset=UTF-8")
					//.header("Content-Type", "application/json")
					.header("Content-Length", Integer.toString(data.length()))
					.body(data.getBytes("UTF-8"))
					.asJson();
			
			if (jsonResponse.getStatus() == HttpStatus.SC_OK) {
				log.info("Return {}", jsonResponse.getBody().toString());
			}
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
	}

	public void send(NotificationRequest request) {
		log.info("Enviando sms para: {}", request.toString());
		send(request.getNumber(), request.getMessage());
	}
}
