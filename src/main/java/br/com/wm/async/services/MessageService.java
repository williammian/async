package br.com.wm.async.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import br.com.wm.async.repositories.MessageRepository;

@Service
public class MessageService {

	@Autowired
	private MessageRepository messageRepository;
	
	@Async
	public void showMessage() throws InterruptedException {
		Thread.sleep(10000);
		messageRepository.printMessage();
	}
	
}
