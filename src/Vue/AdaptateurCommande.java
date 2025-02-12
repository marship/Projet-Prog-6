package Vue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdaptateurCommande implements ActionListener {

    CollecteurEvenements collecteurEvenements;
    String commande;

    AdaptateurCommande(CollecteurEvenements cEvenements, String com) {
        collecteurEvenements = cEvenements;
        commande = com;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        collecteurEvenements.commande(commande);
    }
    
}
