
                #############################################################################################
                #################  STRATEGIE POUR L'ALGORITHME DE DIVISER POUR REGNER   #####################   
                #############################################################################################



Notre algorithme de diviser pour régner repose sur le principe suivant : étant donné que nous cherchons une plante envahissante dans une rangée de plantation, définie comme une plante qui apparaît plus de M/2 fois dans une rangée de M plantes, nous décidons de diviser une rangée de M plantes en deux en ajoutant une plante supplémentaire. Cela nous assure d'obtenir la plus grande partie de la rangée de M plantes, soit un total de M/2 + 1 plantes.

Nous vérifions ensuite si la première plante de la plus grande partie n'est pas la plante envahissante de la rangée de plantes initiale (c'est-à-dire celle avant la division). Si ce n'est pas le cas, nous continuons à diviser la plus grande partie en deux, récupérant chaque fois la plus grande partie de la division et vérifiant à nouveau le premier élément de cette partie. Ce processus est répété jusqu'à ce que tous les éléments de la plus grande partie initiale soient parcourus et qu'une plante envahissante soit trouvée. Si aucune plante envahissante n'est trouvée, notre programme retourne "null".

Cette approche est justifiée car le programme s'intéresse uniquement à la plus grande partie de la division initiale de la rangée de plantes. Une plante qui se trouve dans cette partie et qui n'apparaît pas strictement plus de M/2 fois dans la rangée d'origine ne peut pas être envahissante.

Illustration de la justification : prenons l'exemple suivant : {'beterave','orange','orange','ananas','ananas','ananas'}. Au début, la plus grande partie est {'beterave','orange','orange','ananas'}. En parcourant cette liste en faisant des divisions de deux en deux, on peut conclure que aucune plante n'est envahissante.
