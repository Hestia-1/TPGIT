package nintendo.model;

import java.util.ArrayList;

public class Client {

	private String nom;
	private String prenom;
	private ArrayList<Achat> listeAchat;
	
	
	public Client(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		this.listeAchat = new ArrayList<Achat>();

	}
	
    public void ajouterAchat(Achat a) {
        listeAchat.add(a);
    }
	
    public ArrayList<Achat> getListeAchat() {
        return listeAchat;
    }

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
	
}
