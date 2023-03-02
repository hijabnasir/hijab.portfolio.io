/* --------- INITIALIZE CANVAS --------- */
const canvas = document.querySelector('canvas'); //canvas er et element. 
const ctx = canvas.getContext('2d'); //context i 2 dimensi.
canvas.width = window.innerWidth; //canvas størelsen ligesom computer bredde og højt
canvas.height = window.innerHeight;

/* --------- CREATES IMAGE MODEL --------- */
export function drawImageMap(greenRoute, nonGreenRoute, listOfNodes) {
	//only draws image if canvas is initialized
	if (ctx) { //først gå vi og spørger om har vi en canvas, så hvis ja så gå det igang. 
		const mapImg = new Image(); //opretter et nyt billede
		mapImg.src = './MapGraphicBackground.png'; //isigner værdier til src. 
		mapImg.onload = function () { //så sætter vi en onload propertie
			//så hvad sker det, når vi loader billder. bruger drawImage til at tegne.
			//use of drawImage method for drawing an image onto the canvas
			ctx.drawImage(mapImg, 0, 0); // 0,0 er det kaner som det tegner på. 
			mapGraphics(greenRoute, nonGreenRoute, listOfNodes); //kalder mapGraphies, så det kan tegner. 
		};
	}
}

/* --------- DRAW ROUTES ONTO MODEL --------- */
function mapGraphics(greenRoute, nonGreenRoute, listOfNodes) {
	//MapGraphies skal have demissioner
	let topLeftCorner = [55.697750, 12.535578]; //så den få længdengrad og breddegrad på kanter.
	let topRightCorner = [55.697750, 12.552651];
	let botRightCorner = [55.688963, 12.552651];
		//så regner det forskellige, så ved vi hvor mange længdegrad og breddegrad spinder det over. 
	let deltaLon = topRightCorner[1] - topLeftCorner[1]; //longitude span
	let deltaLat = topRightCorner[0] - botRightCorner[0]; //latitude span

	//image dimensions, så kigger den over hvor mange Pixels er det over billedet.
	const imgPixelsX = 796;
	const imgPixelsY = 720;
		//så igen hvor mange længdegrad og breddegrad går det over hver pixels. 
	let pixelLon = imgPixelsX / deltaLon; //pixels per degree of longitude
	let pixelLat = imgPixelsY / deltaLat; //pixels per degree of latitude
		//oprette nogen arrays. 
	let greenRouteInPixels = createEmptyArrayForPixels(greenRoute);
	let nonGreenRouteInPixels = createEmptyArrayForPixels(nonGreenRoute);

	//draw all nodes on map
	for (let i = 0; i < listOfNodes.length; i++) { //finds new coordinates for nodes in array
		let tempDeltaLon = listOfNodes[i].lon - topLeftCorner[1]; //difference in longitude
		let tempDeltaLat = listOfNodes[i].lat - botRightCorner[0]; //difference in latitude
		let pixelCoordinateX = Math.floor(tempDeltaLon * pixelLon); //new pixel coordinate
		let pixelCoordinateY = imgPixelsY - Math.floor(tempDeltaLat * pixelLat); //new pixel coordinate
		ctx.fillStyle = "rgba(0, 200, 0, 0.8)"; //tegner farver, hvad hvor rød, blå og rød.
		ctx.fillRect((pixelCoordinateX - 3), (pixelCoordinateY - 3), 6, 6); //draw nodes
	}
	//tegner nodes inden på map, og det gøre ved løber vores listOfNodes igennem,
	//så gå vi ind og kigge på en bestemt node. så samligner breddegrad og længdengrad, så finder den laveste værdi på kortet. 
	//så har fundet hvad er forskellen på bestem node. så gå vi ind og kigger på pixel. 

	//from non green route to pixels
	for (let i = 0; i < nonGreenRoute.length; i++) { //draw path
		let tempDeltaLon = nonGreenRoute[i][1] - topLeftCorner[1]; //difference in longitude
		let tempDeltaLat = nonGreenRoute[i][0] - botRightCorner[0]; //difference in latitude
		let nodePathCoX = Math.floor(tempDeltaLon * pixelLon); //new pixel coordinate
		let nodePathCoY = imgPixelsY - Math.floor(tempDeltaLat * pixelLat);
		nonGreenRouteInPixels[i][1] = nodePathCoX; 
		nonGreenRouteInPixels[i][0] = nodePathCoY; 
	}
	//from pixels to graphical line
	for (let i = 0; i < (nonGreenRouteInPixels.length - 1); i++) {
		let j = i + 1; 
		//route outline (initialized as a background)
		ctx.beginPath(); 
		ctx.lineWidth = 4; //vil tegne en linje med tykkeste på 4 pixels. 
		ctx.moveTo(nonGreenRouteInPixels[i][1], nonGreenRouteInPixels[i][0]); //nu flytte vi fokus til den punkt som står her. 
		ctx.lineTo(nonGreenRouteInPixels[j][1], nonGreenRouteInPixels[j][0]); //hvor vi gerne egne til. 
		ctx.strokeStyle = "#0000FF"; 
		ctx.stroke(); //tegner bare det som sker moveto og lineto. 
		//route foreground
		ctx.beginPath();
		ctx.lineWidth = 3;
		ctx.moveTo(nonGreenRouteInPixels[i][1], nonGreenRouteInPixels[i][0]);
		ctx.lineTo(nonGreenRouteInPixels[j][1], nonGreenRouteInPixels[j][0]);
		ctx.strokeStyle = "#FF0000";
		ctx.stroke();
	}

	//from green route to pixels
	for (let i = 0; i < greenRoute.length; i++) { //draw path
		let tempDeltaLon = greenRoute[i][1] - topLeftCorner[1]; //difference in longitude
		let tempDeltaLat = greenRoute[i][0] - botRightCorner[0]; //difference in latitude
		let nodePathCoX = Math.floor(tempDeltaLon * pixelLon); //new pixel coordinate
		let nodePathCoY = imgPixelsY - Math.floor(tempDeltaLat * pixelLat);
		greenRouteInPixels[i][1] = nodePathCoX;
		greenRouteInPixels[i][0] = nodePathCoY;
	}

	//from pixels to graphical line
	for (let i = 0; i < (greenRouteInPixels.length - 1); i++) {
		let j = i + 1;
		//route outline (initialized as a background)
		ctx.beginPath();
		ctx.lineWidth = 4;
		ctx.moveTo(greenRouteInPixels[i][1], greenRouteInPixels[i][0]);
		ctx.lineTo(greenRouteInPixels[j][1], greenRouteInPixels[j][0]);
		ctx.strokeStyle = "#0000FF";
		ctx.stroke();
		//route foreground
		ctx.beginPath();
		ctx.lineWidth = 3;
		ctx.moveTo(greenRouteInPixels[i][1], greenRouteInPixels[i][0]);
		ctx.lineTo(greenRouteInPixels[j][1], greenRouteInPixels[j][0]);
		ctx.strokeStyle = "#00FF00";
		ctx.stroke();
	}
}

/* --------- ARRAY FOR PIXELS --------- */
function createEmptyArrayForPixels(inputArray) {
	let arrayForPixels = [];
	for(let i = 0; i < inputArray.length; i++) {
		let innerArray = [0, 0];
		arrayForPixels.push(innerArray);
	}
	return arrayForPixels;
}

//den tage en input og oprette et nyt array. så fører det den array med 0 værdier. 