# Ma prédiction - Exercice 15

## Fonction `trouverMax`

```java
int max = ???;      // Trou 1 : t[0]
for (int i = ???;   // Trou 2 : 1
    if (t[i] ??? max)  // Trou 3 : >
        max = ???;     // Trou 4 : t[i]
```

**Raisonnement :**
- Trou 1 : Pour trouver le maximum on initialise la première valeur pour avoir une référence
- Trou 2 : Comme t[0] est déjà vérifier, la boucle peut commencer directement à 1
- Trou 3 : Il faut que ce soit strictement supérieur
- Trou 4 : Si la condition est vrai alors la nouvelle valeur max est t[i]

---

## Fonction `contient`

```java
if (??? == ???)     // Trou 1 et 2 : t[i] == val
    return ???;     // Trou 3 : True
return ???;         // Trou 4 : False
```

**Raisonnement :**
- Trous 1-2 : On vérifie si t[i] est égal a la valeur recherché
- Trou 3 : Retourne True si la valeur est trouvé
- Trou 4 : Retourne False si la boucle se finie sans avoir trouvée

---

## Fonction `sommePairs`

```java
if (t[i] ??? 2 == ???)  // Trou 1 et 2 : % et 0
    somme = somme + ???; // Trou 3 : t[i]
```

**Raisonnement :**
- Trou 1 : Vérification du nombre pair avec modulo pour avoir le reste de la division
- Trou 2 : Si le reste est 0 alors c'est pair sinon non
- Trou 3 : Si le nombre est pair on l'ajoute a la somme donc on ajout t[i]

---

## Fonction `dupliquer`

```java
int[] res = new int[t.length ??? 2];  // Trou 1 : *
res[i ??? 2] = t[i];                   // Trou 2 : *
res[i ??? 2 ??? 1] = t[i];              // Trou 3 et 4 : * et +
```

**Raisonnement :**
- Trou 1 : Pour dupliquer le tableau res doit avoir une taille deux fois plus grande 
- Trou 2 : le premier élément doit aller dans l'indice pair de res
- Trous 3-4 : le deuxième élément dans l'indice impair donc (i*2) +1
