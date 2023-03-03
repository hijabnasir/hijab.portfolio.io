#include <stdio.h>      
#include <stdlib.h>
#include <time.h>

//Fik lidt vejledning fra en ven. 
 
#define MAX_SIDES 6
#define COGENT_DICE 5
#define BONUS 50

void showEndMessage(int score){
  printf("Din ikke-permanente yahtzee-score er %d.\n\n", score);
}

//generate random number on roll of dice.
int roll_Staging_Dice(void) {
    int x;
    x = (rand() % MAX_SIDES) + 1;
    return x;
}

//calculating number based on side of dice
//i-e if side_of_dice is 3 then when ever random number generated is 3 and 
//points are less then 3*5(dice has 5 faces) add number to fortune yachtzee
int calculateFortuneness(int enteredNumber,int side_of_dice){
    int d;
    int k;
    int points = 0;
    int fortunateness=side_of_dice * 5;
    for(k = 1; k <= enteredNumber; k++) {             
        d = roll_Staging_Dice();                            
        if(d == side_of_dice && points < fortunateness) {
            points++;
        }                                 
    }
    return points;


}

void getPairs(int arr[5][1], int size,int enteredNumber)
{
    int d;
    arr[0][0] = 0;
    arr[1][0] = 0;
    arr[2][0] = 0;
    arr[3][0] = 0;
    arr[4][0] = 0;
    arr[5][0] = 0;
 
   for(int k = 1; k <= enteredNumber; k++) {
        d = roll_Staging_Dice();
       

        switch (d)
        {
        case 1:
             arr[0][0]++;
            break;

        case 2:
            arr[1][0]++;
            break;

        case 3:
            arr[2][0]++;
            break;

        case 4:
            arr[3][0]++;
            break;
        
        case 5:
            arr[4][0]++;
            break;

        case 6:
            arr[5][0]++;
            break;

        default:
            break;
        }
    } 
}

//replacement for three_of_kind and four_of_kind
int get_same_kind(int n,int number_of_same_kind) {
    
     
    int arr[5][1];
    getPairs(arr,COGENT_DICE,n);
    
    int pair_of_one = arr[0][0];
    //printf("pair of one %d \n",pair_of_one);
    int pair_of_two = arr[1][0];
    //printf("pair of one %d \n",pair_of_two);
    int pair_of_three = arr[2][0];
    //printf("pair of one %d \n",pair_of_three);
    int pair_of_four = arr[3][0];
    //printf("pair of one %d \n",pair_of_four);
    int pair_of_five = arr[4][0];
    //printf("pair of one %d \n",pair_of_five);
    int pair_of_six = arr[5][0];
    //printf("pair of one %d \n",pair_of_six);
    int points=0;
   
    if(pair_of_six>= number_of_same_kind) {
        points = pair_of_one*number_of_same_kind;
    } 
    else if(pair_of_five >= number_of_same_kind) {
        points = pair_of_five*number_of_same_kind;
    } 
    else if(pair_of_four >= number_of_same_kind) {
        points = pair_of_four*number_of_same_kind;
    } 
    else if(pair_of_three >= number_of_same_kind) {
        points = pair_of_three*number_of_same_kind;
    } 
    else if(pair_of_two >= number_of_same_kind) {
        points = pair_of_two*number_of_same_kind;
    } 
    else if(pair_of_one >= number_of_same_kind) {
        points = pair_of_one*number_of_same_kind;
    } 
    else {
        points = 0;
    }
        
    return points;
        
}
int one_pair(int n) {


     int arr[5][1];
    getPairs(arr,COGENT_DICE,n);
    int points;
    int pair_of_one = arr[0][0];
    int pair_of_two = arr[1][0];
    int pair_of_three = arr[2][0];
    int pair_of_four = arr[3][0];
    int pair_of_five = arr[4][0];
    int pair_of_six = arr[5][0];
    if(pair_of_six >= 2) {
        points = 12;
    } else if(pair_of_five >= 2) {
        points = 10;
    } else if(pair_of_four>= 2) {
        points = 8;
    } else if(pair_of_three >= 2) {
        points = 6;
    } else if(pair_of_two >= 2) {
        points = 4;
    } else if(pair_of_one>= 2) {
        points = 2;
    } else {
        points = 0;
    }
    return points;
}


int two_pairs(int n) {
    int arr[5][1];
    getPairs(arr,COGENT_DICE,n);
    int points;
    int pair_of_one = arr[0][0];
    int pair_of_two = arr[1][0];
    int pair_of_three = arr[2][0];
    int pair_of_four = arr[3][0];
    int pair_of_five = arr[4][0];
    int pair_of_six = arr[5][0];
    if(pair_of_six>= 2) {
            points = 12;
            pair_of_six = 0;
        } else if(pair_of_five >= 2) {
            points = 10;
            pair_of_five= 0;
        } else if(pair_of_four >= 2) {
            points = 8;
            pair_of_four = 0;
        } else if(pair_of_three >= 2) {
            points = 6;
            pair_of_three = 0;
        } else if(pair_of_two >= 2) {
            points = 4;
            pair_of_two = 0;
        } else if(pair_of_one >= 2) {
            points = 2;
            pair_of_one = 0;
        } else {
            points = 0;
        }

        if(pair_of_five >= 2) {
            points = points + 10;
        } else if(pair_of_four >= 2) {
            points = points + 8;
        } else if(pair_of_three >= 2) {
            points = points + 6;
        } else if(pair_of_two >= 2) {
            points = points + 4;
        } else if(pair_of_one >= 2) {
            points = points + 2;
        } else {
            points = 0;
        }
    return points;
}
//replacement for short straing and long straing by passing param as S for short and L for long.
int straight(int enteredNumber,char s[50]){
     int d;
    int pair_of_one = 0;
   
    int pair_of_two = 0;
    int pair_of_three = 0;
    int pair_of_four = 0;
    int pair_of_five = 0;
    int pair_of_six = 0;
    int points=0;
   for(int k = 1; k <= enteredNumber; k++) {
        d = roll_Staging_Dice();
       

        switch (d)
        {
        case 1:
            pair_of_one++;
            break;

        case 2:
            pair_of_two++;
            break;

        case 3:
            pair_of_three++;
            break;

        case 4:
            pair_of_four++;
            break;
        
        case 5:
            pair_of_five++;
            break;

        case 6:
            pair_of_six++;
            break;

        default:
            break;
        }
        if(s[1]=='S')
        {
            if(pair_of_one >= 1 && pair_of_two >= 1 && pair_of_three >= 1 && pair_of_four >= 1 && pair_of_five >= 1) {
                points = 15;
            } else {
                points = 0;
            };
        }
        
        if(s[1]== 'L') 
        {
            if(pair_of_two>= 1 && pair_of_three >= 1 && pair_of_four >= 1 && pair_of_five >= 1 && pair_of_six >= 1) {
                points = 20;
            } else {
                points = 0;
            }
        }
    }

    return points;

}



int full_house(int n) {
    int k;
    int d;
    int pair_one = 0;
    int pair_of_two = 0;
    int pair_of_three = 0;
    int pair_of_four = 0;
    int pair_of_five = 0;
    int pair_of_six = 0;
    int points;

    for(k = 1; k <= n; k++) {
        d = roll_Staging_Dice();

        switch (d)
        {
        case 1:
            pair_one++;
            break;

        case 2:
            pair_of_two++;
            break;

        case 3:
            pair_of_three++;
            break;

        case 4:
            pair_of_four++;
            break;
        
        case 5:
            pair_of_five++;
            break;

        case 6:
            pair_of_six++;
            break;

        default:
            break;
        }
    }

        if(pair_of_six >= 3) {
            points = 18;
            pair_of_six = 0;
        } else if(pair_of_five>= 3) {
            points = 15;
            pair_of_five= 0;
        } else if(pair_of_four>= 3) {
            points = 12;
            pair_of_four= 0;
        } else if(pair_of_three >= 3) {
            points = 9;
            pair_of_three= 0;
        } else if(pair_of_two >= 3) {
            points = 6;
            pair_of_two= 0;
        } else if(pair_one >= 3) {
            points = 3;
            pair_one = 0;
        } else {
            points = 0;
        }

        if(points > 0) {
        if(pair_of_five >= 2) {
            points = points + 10;
        } else if(pair_of_four>= 2) {
            points = points + 8;
        } else if(pair_of_three >= 2) {
            points = points + 6;
        } else if(pair_of_two >= 2) {
            points = points + 4;
        } else if(pair_one >= 2) {
            points = points + 2;
        } else {
            points = 0;
        }
        }
    return points;
}



int chance(int n) {
    int k;
    int d;
    int c = COGENT_DICE;
    int pair_of_one = 0;
    int pair_of_two = 0;
    int pair_of_three = 0;
    int pair_of_four = 0;
    int pair_of_five = 0;
    int pair_of_six = 0;
    int points = 0;

    for(k = 1; k <= n; k++) {
        d = roll_Staging_Dice();

        switch (d)
        {
        case 1:
            if(pair_of_one < 5) {
            pair_of_one++;
            }
            break;

        case 2:
            pair_of_two++;
            break;

        case 3:
            pair_of_three++;
            break;

        case 4:
            pair_of_four++;
            break;
        
        case 5:
            pair_of_five++;
            break;

        case 6:
            pair_of_six++;
            break;

        default:
            break;
        }
    }

    for(k = 1; k <= c; k++) {
        if(pair_of_six >= 1) {
        points = points + 6;
        pair_of_six = pair_of_six - 1;
    } else if(pair_of_five>= 1) {
        points = points + 5;
        pair_of_five = pair_of_five - 1;
    } else if(pair_of_four>= 1) {
        points = points + 4;
        pair_of_four = pair_of_four - 1;
    } else if(pair_of_three >= 1) {
        points = points + 3;
        pair_of_three = pair_of_three - 1;
    } else if(pair_of_two >= 1) {
        points = points + 2;
        pair_of_two = pair_of_two - 1;
    } else if(pair_of_one >= 1) {
        points = points + 1;
        pair_of_one = pair_of_one - 1;
    } else {
        points = 0;
    }
    }
    return points;
}



int yatzy(int n) {
    int k;
    int d;
    int pair_of_one = 0;
    int pair_of_two = 0;
    int pair_of_three = 0;
    int pair_of_four = 0;
    int pair_of_five = 0;
    int pair_of_six = 0;
    int points;

    for(k = 1; k <= n; k++) {
        d = roll_Staging_Dice();

        switch (d)
        {
        case 1:
            pair_of_one++;
            break;

        case 2:
            pair_of_two++;
            break;

        case 3:
            pair_of_three++;
            break;

        case 4:
            pair_of_four++;
            break;
        
        case 5:
            pair_of_five++;
            break;

        case 6:
            pair_of_six++;
            break;

        default:
            break;
        }
    }

        if(pair_of_one >= 5 || pair_of_two >= 5 || pair_of_three >= 5 || pair_of_four >= 5 || pair_of_five >= 5 || pair_of_six>= 5) {
            points = 50;
        } else {
            points = 0;
        }
    return points;
}


int main(void) {  
    //initialize all score to zero indicates the start.
    // Regler fra Forced Yatzy
    int score=0;
    int score_check = 0;
    int n;
   

    printf("indtast nummer for at kaste terninger (mindst fem terninger).\n\n");
    scanf(" %d", &n);
    if(n < 5) {
        n = 5;
    }else if(n > 50000) {
        n = 50000;
    }
    printf("n er %d.\n\n", n);

    srand(time(NULL));

    //calculating Yachtzee...
    for(int i=1;i<=6;i++){
        score = score + calculateFortuneness(n,i);
        printf("Din ikke-permanente score er %d.\n\n", score);
    }
    if(score >= 63) {
        score = score + BONUS;
        printf("Du rammer JACKPOT! Din Yahtzee-score er %d.\n\n", score);
    }



    // score = score + one_pair(n);
   
    score_check = one_pair(n);
    printf("Din forste par score er %d.\n\n", score_check);
    score = score + score_check;
    showEndMessage(score);
    // score = score + two_pairs(n);
    score_check = two_pairs(n);
    printf("Dit andet par score er %d.\n\n", score_check);
    score = score + score_check;
   showEndMessage(score);
    // score = score + three_of_a_kind(n);
    score_check = get_same_kind(n,3);
    printf("Din tredje par score er %d.\n\n", score_check);
    score = score + score_check;
   showEndMessage(score);
    // score = score + four_of_a_kind(n);
    score_check = get_same_kind(n,4);
    printf("Dit fjerde par score er %d.\n\n", score_check);
    score = score + score_check;
  showEndMessage(score);
    // score = score + small_straight(n);
    score_check = straight(n,"S");
    printf("Din score fra gruppe small_straight er %d.\n\n", score_check);
    score = score + score_check;
   showEndMessage(score);
    
    score_check = straight(n,"L");
    printf("Din score fra gruppe large_straight er %d.\n\n", score_check);
    score = score + score_check;
  showEndMessage(score);
    
    score_check = full_house(n);
    printf("Din score fra gruppens fulde hus er%d.\n\n", score_check);
    score = score + score_check;
   showEndMessage(score);
   
    score_check = chance(n);
    printf("Din gruppe Chance score er %d.\n\n", score_check);
    score = score + score_check;
 showEndMessage(score);
    score_check = yatzy(n);
    printf("Din gruppe yahtzee score er %d.\n\n", score_check);
    score = score + score_check;
   showEndMessage(score);


    printf("Din generelle samlet Yahtzee-score er %d.\n\n\n", score);

    return 0;
}