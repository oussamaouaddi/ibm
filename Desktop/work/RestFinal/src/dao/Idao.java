package dao;

import java.util.List;

import model.Client;



public interface Idao {
	
	public List<Client> getallClient();
	public Client getClientbyid(int id);
	public void addClient(Client c);

}
