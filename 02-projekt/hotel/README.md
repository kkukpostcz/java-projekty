# Domácí úkol &mdash; Hotel

Tvým úkolem je:
1. připravit třídy pro následující zadání. 
2. Vytvořit konstruktory a&nbsp;přístupové metody.
3. Každé ze tříd vytvoř metodu `getDescription`, která vrátí čitelný textový popis.
3. Poté vytvoř vzorovou testovací aplikaci v&nbsp;metodě `main`.

## Zadání

Potřebujeme evidovat hosty, které ubytováváme v hotelu. 

O&nbsp;každém hostu musíme uložit jméno, příjmení a&nbsp;datum narození.

Hosty vždy ubytováváme na pokojích. Pokoj je identifikován svým číslem. O&nbsp;každém pokoji chceme evidovat, kolik lůžek tam je (neřešte přistýlky apod.) a&nbsp;zda má pokoj balkón a&nbsp;výhled na moře a&nbsp;jaká je cena pokoje za jednu noc (předpokládej, že je cena pevně daná bez ohledu na sezónu a&nbsp;počet ubytovaných).

V&nbsp;rámci jedné rezervace (_booking_) vždy přiřazujeme pokoj jednomu nebo více hostům na časové období mezi dvěma daty (například pokoj číslo 3 na období od 15.&nbsp;7. do 24.&nbsp;7.&nbsp;2021). Pobyt je buď pracovní, nebo rekreační.

Připrav metodu, která vypíše informace o&nbsp;všech rezervacích.

## Testovací aplikace

Do kódu metody `main` připrav následující testovací aplikaci:

1. Vytvoř klienty Adélu Malíkovou (narozena 13. 3. 1993) a&nbsp;Jana Dvořáčka (narozen 5.5.1995). Vypiš na obrazovku jejich popis (description).
2. Vytvoř pokoje a&nbsp;vypiš na obrazovku jejich popis (description).: 
    - číslo 1 a&nbsp;2, které budou jednolůžkové za cenu 1000&nbsp;Kč/noc, s&nbsp;balkonem a&nbsp;výhledem na moře. Vypiš na obrazovku jejich popis (description).
    - pokoj číslo 3, který bude trojlůžkový za cenu 2400&nbsp;Kč/noc, bez balkónu, s&nbsp;výhledem na moře. 
4. Připrav rezervace: 
    - pro Adélu na pokoj č.&nbsp;1 od 19. do 26. 7. 2021.
    - pro oba (společná rezervace) na pokoj č. 3 od 1. do 14. 9. 2021.
5. Vypiš seznam všech rezervací.

## Zkontroluj si: zajímavé body, challenge a časté chyby
1. Je rozlišen pracovní a rekreační pobyt (potřebuje `enum`)?
2. Lze evidovat více hostů v&nbsp;rámci jedné rezervace.
3. Můžeme sledovat historii rezervací? Nepřepíše se novou rezervací informace o&nbsp;původní rezervaci? (Údaje o&nbsp;rezervaci by neměly být součástí hosta ani pokoje.)
3. Volitelně můžeš zkusit zařídit, aby se při vytváření rezervace rezervovalo automaticky na rekreační pobyt od dneška na dalších 6 nocí, pokud nezadáš konkrétní data začátku a&nbsp;konce. (Pokud uvedeš všechny parametry rezervace, použijí se tak, jak jsou zadané.)


---

[Zpět na přehled akademie](https://github.com/ENGETO-Java-Akademie-2021-07-12/intro)