import {listOfNodes} from "./nodes.js";

function dijkstra(matrix, startNode, endNode) {
	let shortestPath = new Array(matrix.length).fill(null); //array med shortest path, fyldes med null og er lige stort som længden af matricen
	let verticiesCompleted = new Array(matrix.length).fill(false); //array med hvilke knuder som vi har tjekket. Alle sættes til at være false til at starte med
	let distanceFromSource = new Array(matrix.length).fill(Infinity); //array med distancen fra et givent punkt til source (start node)
	shortestPath[startNode] = [startNode]; //shortestPath angiver så start knuden ved hjælp at vores input (startNode)
	distanceFromSource[startNode] = 0; //vi sætter startknudens distance til sig selv = 0;

	while(verticiesCompleted.includes(false)){ //while lykke køre så længe at der er et punkt vi endnu ikke har tjekket, altså at der er et punkt der er false.
		let indexU = findMinimumNonCompletedVertex(matrix, distanceFromSource, verticiesCompleted); //Vi finder den næste korteste knude fra hvor vi står i matricen og kalder den indexU
		let weights = matrix[indexU]; //weights er et array der indeholder adjacencylisten for en knude ad gangen     weight = [null, null, 0, 2, 18, 30, null, null  ... 89 punkter i alt]
		verticiesCompleted[indexU] = true; //vi sætter nu knuden vi har fundet til true, så den ikke bliver tjekket igen.
		if (endNode === indexU){ //hvis vi har fundet endNode så slutter vi af!
			break; //break break break break break break, vi breaker når indexU er også 14, som er givent tal i main.js
		}
		//relaxation
		for (let i = 0; i < weights.length; i++){ //for løkke der løber hele adjacency listen igennem der er indeholdt i variablen weights.
			if (!verticiesCompleted[i] && weights[i] != null){ //hvis punktet i ikke er true og der er en forbindelse (ikke null) så er denne opfyldt
				// Checking the connection between vertex indexU, i
				if (distanceFromSource[indexU] + weights[i] < distanceFromSource[i]){ //hvis distancen til startknuden med det nyfundne index (indexU) + weights[i] er kortere en den forhenværende distance til start knuden, så den opfyldt
					distanceFromSource[i] = distanceFromSource[indexU] + weights[i]; //da sætter vi denne kortere distance til at være længden til startknuden fra plads i
					let newpath = [...shortestPath[indexU]]; //vi opretter et hjælpe array til at kopiere arrayet der ligger i shortestPath[indexU]
					newpath.push(i);
					shortestPath[i] = newpath;
				}
			}
		}
	}
	return shortestPath[endNode];
}

//den finder laveste ikke fandne knud, dvs kant. 
function findMinimumNonCompletedVertex(matrix, distanceFromsource, verticiesCompleted){ //her skal vi finde indexet af den tætteste knude/korteste kant
	let index = null; 
	let value = Infinity; //value er infinity fordi den skal være opfyldt den første i alle tilfælde
						  // infinity gøre at vi kommer ind i for-løkke
	for (let i = 0; i < matrix.length; i++){
		if (!verticiesCompleted[i] && distanceFromsource[i] < value){ 
			value = distanceFromsource[i]; //value bliver her sat til den umiddelbare korteste kant distanceFromSource[i] for at kunne vurdere om der er en kortere kant
			index = i; //når forløkken er done, så vil det i der er gemt i index, være det index med den korteste kant
		}
	}
	return index;//det index vil vi gerne tage med os hjem! :)
}

//får returneret et array med alle indexer fra den korteste rute 
export function createArrayOfCoordinatesFromShortestPath(matrix, startNode, endNode){
	let shortestPath = dijkstra(matrix, startNode, endNode);
	let pathArray = []; //[[55.697532, 12.8812346], [55.697532, 12.8812346], [55.697532, 12.8812346], [55.697532, 12.8812346]]
	for (let i = 0; i < shortestPath.length; i++) {
		let index = shortestPath[i];
		let node = listOfNodes[index];
		let nodeCoords = [node.lat, node.lon]; //[55.697532, 12.8812346]
		pathArray.push(nodeCoords);
	}
	return pathArray; //sidste array der indeholder alle coordinater på shortestPath[endNode]
}