# Ma prédiction - Exercice 05

## État du tableau

Dessine le tableau après chaque modification :

**Initial :**
| Indice | 0  | 1  | 2  | 3  | 4  |
|--------|----|----|----|----|----|
| Valeur | 10 | 20 | 30 | 40 | 50 |



## Traçage ligne par ligne

**Ligne 3 :** Initialisation du tableau
- tab = {10, 20, 30, 40, 50}

**Ligne 5 :** `tab[0]` → 10
```
tab[0] = 10
```

**Ligne 6 :** `tab[2]` → 30
```
tab[2] = 30
```

**Ligne 8 :** `tab[1] = tab[0] + tab[2];`
- Calcul : 10 + 30 = 40
- tab[1] devient 40

**Tableau après ligne 8 :**
| Indice | 0  | 1  | 2  | 3  | 4  |
|--------|----|----|----|----|----|
| Valeur | 10 | 40 | 30 | 40 | 50 |

**Ligne 9 :** Affichage
```
tab[1] = 40
```

**Ligne 11 :** `tab[4] = tab[1] - tab[3];`
- Calcul : 40 - 40 = 0
- tab[4] devient 0

**Tableau après ligne 11 :**
| Indice | 0  | 1  | 2  | 3  | 4 |
|--------|----|----|----|----|---|
| Valeur | 10 | 40 | 30 | 40 | 0 |

**Ligne 12 :** Affichage
```
tab[4] = 0
```

**Lignes 14-17 :** Boucle de somme
- i=0 : somme = 0 + tab[0] = 0 + 10 = 10
- i=1 : somme = 10 + tab[1] = 10 + 40 = 50
- i=2 : somme = 50 + tab[2] = 50 + 30 = 80
- i=3 : somme = 80 + tab[3] = 80 + 40 = 120
- i=4 : somme = 120 + tab[4] = 120 + 0 = 120

**Ligne 19 :** Affichage final
```
Somme = 120
```
