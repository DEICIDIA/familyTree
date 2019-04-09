
public class main {
  public static void main(String[] args) {
    Famille Thoumine = new Famille();
    Famille Ygrie = new Famille();
    Famille th = new Famille();

    Femme lea = new Femme("lea","thoumine",Thoumine);

    Homme nathan = new Homme("nathan","thoumine",Thoumine);
    Homme clement = new Homme("clement","thoumine",Thoumine);
    Homme evan = new Homme("evan","thoumine",Thoumine);


    Homme arnaud = new Homme("arnaud","thoumine",Thoumine);
    Femme nelly = new Femme("nelly","ygrie",Ygrie);
    Femme laetitia = new Femme("laetitia","th",th);

    lea.setPere(nathan);
    nathan.setPere(arnaud);
    nathan.setMere(nelly);
    evan.setPere(arnaud);
    evan.setMere(nelly);
    clement.setMere(laetitia);
    clement.setPere(arnaud);

    afficherEnfants(arnaud);
  }
  public static void afficherEnfants(Personne pers){
    int nbEnfants = pers.enfants.size();
    System.out.println(pers.prenom());
    for(int i = 0; i < nbEnfants; i++){
          System.out.print(pers.enfants().get(i).prenom() + "\t");
    }
    for(int i = 0; i < nbEnfants; i++) {
        if(!(pers.enfants().get(i).estFeuille())) {
          afficherEnfants(pers.enfants().get(i));
        }
    }
    System.out.print("\n");
    }
  }
