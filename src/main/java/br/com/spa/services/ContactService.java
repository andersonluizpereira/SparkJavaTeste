package br.com.spa.services;

import java.util.Collection;

import br.com.spa.beans.Contact;

public interface ContactService {
	public void insertContact(Contact contact);
	public Collection<Contact> getContacts();
	public Contact getContact(String id);
	public Contact editContact(Contact contact);
	public void deleteContact(String id);
}

