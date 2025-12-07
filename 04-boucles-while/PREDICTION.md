# Ma prédiction - Exercice 04

## Traçage ligne par ligne

**Lignes 3-4 :** Initialisation
- n = 100
- compteur = 0

### Itération 1
- Condition : n > 1 ? 100 > 1 → True
- **Ligne 7 :** `n = n / 2;` → 100 / 2 = 50
- **Ligne 8 :** `compteur++;` → compteur = 1
- État : n = 5, compteur = 1
- Affichage :
  ```
  n = 50 , compteur = 1
  ```

### Itération 2
- Condition : n > 1 ? 50 > 1 → True
- **Ligne 7 :** `n = n / 2;` → 50 / 2 = 25
- **Ligne 8 :** `compteur++;` → compteur = 2
- État : n = 25, compteur = 2
- Affichage :
  ```
  n = 25 , compteur = 2
  ```

### Itération 3
- Condition : n > 1 ? 25 > 1 → True
- **Ligne 7 :** `n = n / 2;` → 25 / 2 = 12
- **Ligne 8 :** `compteur++;` → compteur = 3
- État : n = 12, compteur = 3
- Affichage :
  ```
  n = 12 , compteur = 3
  ```

### Itération 4
- Condition : n > 1 ? 12 > 1 → True
- **Ligne 7 :** `n = n / 2;` →  12/ 2 = 6
- **Ligne 8 :** `compteur++;` → compteur = 4
- État : n = 6, compteur = 4
- Affichage :
  ```
  n = 6 , compteur = 4
  ```

### Itération 5
- Condition : n > 1 ? 6 > 1 → True
- **Ligne 7 :** `n = n / 2;` → 6 / 2 = 3
- **Ligne 8 :** `compteur++;` → compteur = 5
- État : n = 3, compteur = 5
- Affichage :
  ```
  n = 3 , compteur = 5
  ```

### Itération 6
- Condition : n > 1 ? 3 > 1 → True
- **Ligne 7 :** `n = n / 2;` → 3 / 2 = 2
- **Ligne 8 :** `compteur++;` → compteur = 6
- État : n = 2, compteur = 6
- Affichage :
  ```
  n = 2, compteur = 6
  ```

### Sortie de boucle (si applicable)
- Condition : n > 1 ? 2 > 1 → False
- La boucle s'arrête

**Ligne 12 :** Affichage final
```
Nombre de divisions : 6
```



## Questions

Combien d'itérations au total ? 6

Pourquoi la boucle s'arrête ? 
la boucle s'arrète car n est devenu 1 et la boucle while continue tant que n était strictement supérieur à 1.
