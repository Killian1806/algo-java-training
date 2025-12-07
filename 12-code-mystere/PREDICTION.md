# Ma prédiction - Exercice 12

## Test 1 : mystere(12, 5)

**État initial :** a = 12, b = 5

### Itération 1
- b != 0 ? 5 != 0 → True
- temp = b = 5
- b = a % b = 12 % 5 = 2
- a = temp = 5
- État : a = 5, b = 2

### Itération 2
- b != 0 ? 2 != 0 → True
- temp = b = 2
- b = a % b = 5 % 2 = 1
- a = temp = 2
- État : a = 2, b = ___1

### Itération 3
- b != 0 ? 1 != 0 → True
- temp = b = 1
- b = a % b = 2 % 1 = 0
- a = temp = 1
- État : a = 1, b = 0

### Sortie de boucle
- b != 0 ? 0 != 0 → False
- return a = 1

**Résultat : 1**

---

## Test 2 : mystere(48, 18)

**État initial :** a = 48, b = 18

### Itération 1
- temp = 18, b = 48 % 18 = 12, a = 18

### Itération 2
- temp = 12, b = 18 % 12 = 6, a = 12

### Itération 3
- temp = 6, b = 12 % 6 = 0, a = 6

### Sortie
- return a = 6

**Résultat : 6**
