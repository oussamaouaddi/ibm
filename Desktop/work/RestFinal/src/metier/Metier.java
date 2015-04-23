package metier;

import java.util.List;

import model.Client;
import dao.Idao;

public class Metier {

	Idao dao;

	public List<Client> getallClients() {
		return dao.getallClient();

	}

	public Client getClientbyid(int id) {

		return dao.getClientbyid(id);

	}

	public void addClient(Client b) {

		dao.addClient(b);

	}

	public void setDao(Idao dao) {
		this.dao = dao;
	}

}
