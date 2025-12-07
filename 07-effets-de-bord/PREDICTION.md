# Ma prédiction - Exercice 07

## Traçage ligne par ligne

**Lignes 3-4 :** Initialisation
- nombre = 10
- tableau = {1, 2, 3}

**Lignes 6-7 :** Affichages "Avant"
```
Avant : nombre = 10
Avant : tableau[0] = 1
```

---

### Appel : `modifierNombre(nombre)` (ligne 9)

**Dans la fonction :**
- n reçoit une COPIE de nombre : n = 10
- n = n + 100 → n = 110
- Affichage :
  ```
  Dans modifierNombre : n = 110
  ```

**Question : `nombre` dans main a-t-il changé ?** Non

---

### Appel : `modifierTableau(tableau)` (ligne 10)

**Dans la fonction :**
- tab reçoit une RÉFÉRENCE vers le même tableau
- tab[0] = tab[0] + 100 → tab[0] = 101
- Affichage :
  ```
  Dans modifierTableau : tab[0] = 101
  ```

**Question : `tableau[0]` dans main a-t-il changé ?** Oui

---

**Lignes 12-13 :** Affichages "Après"
- nombre = 10(modifié ou pas ?)
- tableau[0] = 101 (modifié ou pas ?)
```


```

---

### Appel : `doubler(nombre)` avec affectation (ligne 15)

- doubler(10) retourne : 20
- nombre = 20 (réaffecté avec la valeur de retour)

**Ligne 16 :** Affichage
```
Après doubler : nombre = 20
```

---

## Question finale

Pourquoi `modifierNombre` n'a pas changé `nombre` mais `modifierTableau` a changé `tableau[0]` ?

Réponse : nombre est un type primitif int et est une valeur alors que tab est un objet de référence, ce qui permet la modification de l'objet.
