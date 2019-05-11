package br.com.wm.async.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wm.async.services.MessageService;

@RestController
@RequestMapping(value="/showmessage", produces=MediaType.TEXT_HTML_VALUE)
public class MessageController {
	
	@Autowired
	private MessageService messageService;

	@GetMapping
	public String get() {
		String returnMessage = "Success!!!";
		
		try {
			messageService.showMessage();
		}catch(Exception e) {
			returnMessage = "Error!!!";
		}
		
		return returnMessage;
	}
	
}
