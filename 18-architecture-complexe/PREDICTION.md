# Ma prédiction - Exercice 18

## Architecture

**Classes présentes :**
- Main → Point d'entré, création des objets et execution de la logique
- Banque → Classe qui gère une liste de client et possède des fonctionnalités globales
- Client → Reprèsente l'utilisateur (nom et compte), sert d'interface pour les opérations bancaires
- Compte → Gère le solde du compte client et les opérations

**Qui contient quoi ?**
- Banque contient : un tableau de clients
- Client contient : une instance de Compte
- Compte contient : une variable primitive pour le solde du compte

---

## Traçage de l'exécution

### Création des objets

**Ligne 3 :** `new Banque("MaBanque")`
- Crée une Banque avec clients[] vide

**Lignes 5-6 :** `new Client(...)`
- Alice créé avec un Compte (solde = 0)
- Bob créé avec un Compte (solde = 0)

**Lignes 8-9 :** `ajouterClient(...)`
- clients[0] = Alice, nbClients = 1
- clients[1] = Bob, nbClients = 2

---

### Dépôts

**Ligne 11 :** `alice.deposer(100)`
- Appelle compte.crediter(100)
- Alice.compte.solde = 100

**Ligne 12 :** `bob.deposer(50)`
- Bob.compte.solde = 50

---

### Affichage initial

```
=== Etat initial ===
Alice : 100
Bob : 50

```

---

### Transfert

**Ligne 17 :** `alice.transferer(bob, 30)`

Que se passe-t-il dans transferer() ?
1. `this.retirer(30)` → Alice.compte.solde = 70
2. `destinataire.deposer(30)` → Bob.compte.solde = 80

---

### Affichage après transfert

```
=== Apres transfert ===
Alice : 70
Bob : 80

```

---

### Total en banque

**Ligne 22 :** `banque.totalDepots()`
- total = 70 + 80 = 150

```
=== Total en banque ===
Total : 150

```
