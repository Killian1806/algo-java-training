# Ma prédiction - Exercice 11

## Analyse des fonctions

### Fonction `xxx(int[] t)`

**Que fait cette fonction ?**
- Analyse le code ligne par ligne :
  - r = t[0] → Initialise r avec la première valeur du tableau t donc r = 3
  - Boucle : si t[i] > r alors r = t[i] → Parcours du tableau et mise a jour de r si un élément du tableau est strictement plus grand
  - return r → Retourne la plus grande valeur

**En une phrase, cette fonction :** La fonction sert a trouvée la plus grande valeur du tableau.

**xxx({3, 7, 2, 9, 1, 5}) = 9**

---

### Fonction `yyy(int[] t)`

**Que fait cette fonction ?**
- Analyse :
  - r = 0 → Initialise r à 0
  - Boucle : r = r + t[i] → ajoute la valeur des valeurs récupéré lors des itérations de la boucle et les ajoute à r
  - return r → Renvoie r

**En une phrase, cette fonction :** La somme de tous les éléments du tableau

**yyy({3, 7, 2, 9, 1, 5}) = 27**

---

### Fonction `zzz(int[] t, int v)`

**Que fait cette fonction ?**
- Première boucle : compte les éléments où t[i] < v → détermine les éléments qui sont inférieur a v
- Crée un nouveau tableau de taille c → Le tableau où le résultat sera stocké
- Deuxième boucle : remplit le tableau avec les éléments < v → Remplit le tableau c avec les éléments strictement inférieur à v

**En une phrase, cette fonction :** Récupère les éléments inférieur à une valeur donné

**zzz({3, 7, 2, 9, 1, 5}, 4) = {1, 3, 4}**

---

### Fonction `aaa(int[] t)`

**Que fait cette fonction ?**
- Double boucle imbriquée → La boucle i sert à détérminer combien de fois le tableau doit être parcouru et la boucle j permet de comparer deux éléments 
- Compare t[j] et t[j+1], échange si t[j] > t[j+1] → compare deux valeurs et si t[j] > t[j+1 alors on échange leur position entre eux]

**En une phrase, cette fonction :** Algorithme de tri (tri à bulles ou quadratique)

**Après aaa({3, 7, 2, 9, 1, 5}) : {1, 2, 3, 5, 7, 9}**


