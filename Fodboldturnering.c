#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

// Navn: Hijab Nasir    Email: Hijab21@yahoo.com     gruppe: 002   studieretning: software
// Jeg har fået lidt hjælp med et par spørgsmål fra en ven. 

struct team
{
	char* name;
	int points;
	int goalsScored;
	int goalsConceded;
};
struct battle
{
	char* matchDay;
	char* date;
	char* time;
	struct team t1;
	struct team t2;
	int matchResult; //1 if team1 won, 2 if team 2 won, 0 if draw, -1 if match is in future
	int spectators;
};

void readDataFromFile(FILE* file, struct battle arr[], struct team t[]);
void initializeTeamStruct(struct team *t);
void initializeTeamNames(struct team t[]);
void initializeBatlleStruct(struct battle* b);
void updateTeamArray(struct battle* b, struct team arr[]);
void displayTeam(struct team* t);
void sortTeamArray(struct team arr[]);

void main()
{
	FILE* file;
	file = fopen("data.txt", "r"); //opening file
	if (file == NULL)
		printf("Cannot open file");
	else
	{
		struct battle battleArr[183]; //array to store all battles
		struct team teamsArr[14]; //array to store data of all 14 teams
		for (int i = 0; i < 183; i++)
			initializeBatlleStruct(&battleArr[i]); //initialize all battle seructs
		for (int i = 0; i < 14; i++)
			initializeTeamStruct(&teamsArr[i]); //initialize all team structs
		initializeTeamNames(teamsArr); //setting team names in team array
		readDataFromFile(file, battleArr, teamsArr); //reading data from file and updating the both team and battle array according to data
		sortTeamArray(teamsArr);
		printf("Team Name    Points    Goals Scored    Goals Conceded\n");
		for (int i = 0; i < 14; i++) //displaying all teams
			displayTeam(&teamsArr[i]);
	}
}

void mySwap(struct team* a, struct team* b) //this will swap place of two teams in team array
{
	struct team temp = *a;
	*a = *b;
	*b = temp;
}

void sortTeamArray(struct team arr[])
{
	int i, j, max_idx;
	for (i = 0; i < 14; i++)
	{
		max_idx = i;
		for (j = i + 1; j < 14; j++)
			if (arr[j].points > arr[max_idx].points) //check on points
				max_idx = j;
			else if (arr[j].points == arr[max_idx].points) 
			{ //if points are equal the check on goal difference
				if ((arr[j].goalsScored - arr[j].goalsConceded) > (arr[max_idx].goalsScored - arr[max_idx].goalsConceded))
					max_idx = j;
			}
		mySwap(&arr[max_idx], &arr[i]);
	}
}

void readDataFromFile(FILE* file, struct battle arr[], struct team t[])
{
	char day[10];
	char date[10];
	char time[10];
	char team1[10];
	char temp1[10];
	char team2[10];
	char goalsT1[10];
	char temp2[10];
	char goalsT2[10];
	char spectators[10];
	int check = 0;
	while (!feof(file))
	{
		fscanf(file, "%s", day);
		
		fscanf(file, "%s", date);
		arr[check].date = date;
		
		fscanf(file, "%s", time);
		arr[check].time = time;
		
		fscanf(file, "%s", team1);
		arr[check].t1.name = team1;
		
		fscanf(file, "%s", temp1);
		
		fscanf(file, "%s", team2);
		arr[check].t2.name = team2;
		
		fscanf(file, "%s", goalsT1);
		arr[check].t1.goalsScored = atoi(goalsT1);
		arr[check].t2.goalsConceded = atoi(goalsT1);
		
		fscanf(file, "%s", temp2);
		
		fscanf(file, "%s", goalsT2);
		arr[check].t2.goalsScored = atoi(goalsT2);
		arr[check].t1.goalsConceded = atoi(goalsT2);

		fscanf(file, "%s", spectators);
		arr[check].spectators = atoi(spectators);

		if (day[0] == 'M')
			arr[check].matchDay = "Monday";
		else if (day[0] == 'F')
			arr[check].matchDay = "Friday";
		else if (day[0] == 'L')
			arr[check].matchDay = "Saturday";
		else if (day[0] == 'S')
			arr[check].matchDay = "Sunday";
		else if (day[0] == 'O')
			arr[check].matchDay = "Wednesday";
		else if (day[0] == 'T' && day[1] == 'i')
			arr[check].matchDay = "Tuesday";
		else
			arr[check].matchDay = "Thirsday";

		int res = arr[check].t1.goalsScored - arr[check].t2.goalsScored;
		if (res < 0)
			arr[check].matchResult = 2;
		else if (res > 0)
			arr[check].matchResult = 1;
		else
			arr[check].matchResult = 0;
		updateTeamArray(&arr[check], t); //updating data in team array every time after a battle
		check++;
	}
}

void displayTeam(struct team* t)
{
	printf("%6s        %3d          %3d             %3d\n", t->name, t->points, t->goalsScored, t->goalsConceded);
}

bool teamSame(char* a, char* b) //this will check if given names of temas are same or not
{
	if (a[0] == 'F' && b[0] == 'F' && a[2] == b[2])
		return true;
	if (a[0] == b[0] && a[1] == b[1] && a[0] != 'F' && b[0] != 'F')
		return true;
	return false;
}

void updateTeamArray(struct battle* b, struct team arr[])
{
	for (int i = 0; i < 14; i++)
	{
		if (teamSame(arr[i].name, b->t1.name))
		{
			arr[i].goalsScored += b->t1.goalsScored;
			arr[i].goalsConceded += b->t2.goalsScored;
			if (b->matchResult == 1)
				arr[i].points += 3;
			else if (b->matchResult == 0)
				arr[i].points += 1;
		}
		if (teamSame(arr[i].name, b->t2.name))
		{
			arr[i].goalsScored += b->t2.goalsScored;
			arr[i].goalsConceded += b->t1.goalsScored;
			if (b->matchResult == 2)
				arr[i].points += 3;
			else if (b->matchResult == 0)
				arr[i].points += 1;
		}
	}
}

void initializeBatlleStruct(struct battle* b)
{
	b->date = "";
	b->matchDay = "";
	b->time = "";
	b->matchResult = -1;
	b->spectators = -1;
	initializeTeamStruct(&b->t1);
	initializeTeamStruct(&b->t2);
}

void initializeTeamStruct(struct team *t)
{
	t->goalsConceded = 0;
	t->goalsScored = 0;
	t->points = 0;
}

void initializeTeamNames(struct team t[])
{
	t[0].name = "FCM";
	t[1].name = "EFB";
	t[2].name = "SDR";
	t[3].name = "RFC";
	t[4].name = "ACH";
	t[5].name = "FCN";
	t[6].name = "OB";
	t[7].name = "AaB";
	t[8].name = "LBK";
	t[9].name = "FCK";
	t[10].name = "BIF";
	t[11].name = "SIF";
	t[12].name = "HOB";
	t[13].name = "AGF";
}