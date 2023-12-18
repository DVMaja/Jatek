# Jatek

szerializálás(serializable)
Tervezési minta (design pattern)

A probléma a mozgásnál hogy ha elágazásokat használunk:
	- akkor elöször is az egy idő után kezelhetetlen lesz
	- nem lesz újrafelhasználható
	- bármilyen változásnál borulhat az egész
	- tudnunk kell hogy egy adott pillanatban pontosan hol vagyunk,
	   és hogy onnan hova lehet tovább menni

Megoldási lehetőségek:
	- Állapot tervezési minta lesz a megoldás a problémára.
Állapot (State)
	- Állapot mintát abban az esetben használunk, ha egy objektum megváltoztatja a viselkedését a belső állapota alapján.
	- Ez a viselkedési mód if–else blokkok használata helyett állapotobjektumokkal valósul meg.
	- A különböző állapottípusok mind ugyanannak az általános osztálynak a leszármazottai.