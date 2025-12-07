# Ma prédiction - Exercice 09

## Schéma mémoire

Dessine les objets et les références :

```
Après ligne 5 :

p1 ──→ [Objet A: nom= Alice, age= 25]

p2 ──→ Même objet que p1 pas de vouvel objet (même objet que p1 ou nouvel objet ?)

p3 ──→ [Objet B: nom= Alice, age= 25]
```

---

## Traçage ligne par ligne

**Ligne 3 :** `Personne p1 = new Personne("Alice", 25);`
- Création d'un nouvel objet : {nom="Alice", age=25}
- p1 pointe vers cet objet

**Ligne 4 :** `Personne p2 = p1;`
- p2 pointe vers même objet que p1 (nouvel objet / même objet que p1)

**Ligne 5 :** `Personne p3 = new Personne("Alice", 25);`
- p3 pointe vers nouvel objet (nouvel objet / même objet que p1)

**Lignes 7-9 :** Affichages
```
p1.nom = Alice
p2.nom = Alice
p3.nom = Alice


```

---

**Lignes 11-12 :** Modification via p2
- p2.nom = "Bob"
- p2.age = 30

**Question : p1 est-il affecté par ces modifications ?** Oui

**Question : p3 est-il affecté par ces modifications ?** Non

---

**Lignes 14-17 :** Affichages après modification
```
Après modification de p2 :
p1.nom = Bob , p1.age = 30
p2.nom = Bob , p2.age = 30
p3.nom = Alice , p3.age = 25

```

---

**Lignes 19-20 :** Comparaisons de références
- p1 == p2 → True (comparent-ils la même adresse mémoire ?)
- p1 == p3 → False (comparent-ils la même adresse mémoire ?)

```


```
