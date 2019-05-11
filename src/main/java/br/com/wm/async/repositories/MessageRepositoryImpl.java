package br.com.wm.async.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class MessageRepositoryImpl implements MessageRepository {

	@Override
	public void printMessage() {
		System.out.println("Your message is ready!!! \nYour message is ready!!! \nYour message is ready!!!");
	}
	
}
