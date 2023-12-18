# Jatek

szerializálás(serializable)
Tervezési minta (design pattern)

A probléma a mozgásnál hogy ha elágazásokat használunk:
	- akkor elöször is az egy idő után kezelhetetlen lesz
	- nem lesz újrafelhasználható
	- bármilyen változásnál borulhat az egész
	- tudnunk kell hogy egy adott pillanatban pontosan hol vagyunk,
	   és hogy onnan hova lehet tovább menni