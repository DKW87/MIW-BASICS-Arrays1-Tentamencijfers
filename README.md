# Programming –opdracht Arrays 1 - Tentamencijfers

## Beschrijving
Schrijf een applicatie om docenten te helpen met het analyseren van tentamenresultaten. De applicatie vraagt allereerst om het aantal cijfers dat de docent wil invoeren. Hierna voert de docent de cijfers in. Vervolgens toont het programma het aantal cijfers, het gemiddelde cijfer, het aantal voldoende en het hoogste cijfer.

Hieronder een voorbeeld van input/output van deze applicatie. Input die de gebruiker invoert is schuin en onderstreept.

```
Hoeveel cijfers wilt u invoeren? 0
Aantal cijfers moet groter zijn dan 0!
Hoeveel cijfers wilt u invoeren? 12
Cijfer student 1: 5,8
Cijfer student 2: 9,1
Cijfer student 3: 3,5
Cijfer student 4: 6
Cijfer student 5: 5,1
Cijfer student 6: 8
Cijfer student 7: 7,2
Cijfer student 8: 4,9
Cijfer student 9: 9,3
Cijfer student 10: 7,7
Cijfer student 11: 5
Cijfer student 12: 6,2
Aantal cijfers : 12
Gemiddelde cijfer: 6.5
Aantal voldoendes: 8
Hoogste cijfer : 9.3
```

## Stappenplan
1. Vraag de gebruikers om het aantal cijfers en lees dit in. Test of dit getal groter is dan 0. Zo niet, vraag net zo lang om invoer tot het ingevoerde aantal groter dan 0 is.
2. Declareer en creëer, nadat je het aantal hebt ingelezen, een array om de cijfers in op te slaan. De lengte van de array moet gelijk zijn aan het aantal cijfers dat de gebruiker heeft opgegeven.
3. Lees de cijfers van alle studenten in.
4. Bereken en print vervolgens het aantal cijfers, het gemiddelde cijfer, het aantal voldoendes en het hoogste cijfer.

## Tips
a. Zie boek §7.2.1 en 7.2.2 voor het declareren en creëren van arrays.
b. § 7.2.6 bevat veel nuttige voorbeelden van het verwerken van arrays. Gebruik deze paragraaf bij stap 3 en 4.

## Vervolg – gebruik van methodes
De main methode van deze applicatie kun je veel eenvoudiger maken door gebruik te maken van een drietal methodes. Volg hiervoor het stappenplan hieronder en gebruik de tips.

## Stappenplan vervolg
1. Schrijf een methode krijgGemiddelde die het gemiddelde van een array van kommagetallen teruggeeft.
2. Schrijf een methode krijgAantalVoldoendes die het aantal getallen >= 5,5 in een array van kommagetallen teruggeeft.
3. Schrijf een methode krijgHoogsteCijfer die het hoogste getal van een array van kommagetallen teruggeeft.
4. Pas je main vervolgens zo aan dat bij het genereren van de gevraagde output gebruik wordt gemaakt van bovenstaande methodes. Als het goed is, is de code in je main nu korter en gemakkelijker te begrijpen.

## Tips vervolg
a. In §7.6 van het boek staat hoe je arrays doorgeeft aan een methode. Je geeft dan niet de array zelf door, maar de referentie naar de plaats waar de array staat. In §7.6 staat ook beschreven wat de gevolgen hiervan zijn als een methode wijzigingen aanbrengt in de array.
b. Voor het berekenen van het gemiddelde heb je het aantal getallen in de array nodig. Hiervoor kun je de variabele length van een array gebruiken (zie boek §7.2.3).

## Richtlijnen bij coderen (zie ook MIW code conventions)
- Zorg dat je naam en het doel van het programma bovenin staan (ICC #1).
- Gebruik de juiste inspringing (indentation) bij de lay-out (ICC #2).
- Let op juist gebruik hoofdletters en kleine letters (ICC #3).
- Gebruik goede namen (ICC #4).
- Voeg waar nodig commentaar toe dat inzicht geeft in je code (ICC#7).