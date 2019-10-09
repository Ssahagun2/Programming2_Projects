//Saul Sahagun, Carl Powaza, Baseer Hameed
//CS207-2 Spring, 2019
//PLTL Project 1
import java.math.*;

public class GameOfLife
{
   private int [][] grid;
   
   public GameOfLife(int oof, int yikes)
   {
      this.grid = new int[oof][yikes];
   }

   public int[][] getGrid()
   {
      return(this.grid);
   }
   public void nextIteration()
   {
      boolean [][] check = new boolean [30][30];
      int  count = 0; 
      int countNum = 0;
      int  countLives = 0;
      int tempRow = 0; int tempCol = 0;
      boolean living = false;
         
         for(int i = 1; i < grid.length - 1; i++)
         {
            for(int j = 1; j < grid[i].length -1; j++)
            {
                  if (grid[i - 1][j - 1] == 1)
                     countLives++;
                  if (grid[i -1][j] == 1)
                     countLives++;
                  if (grid[i -1][j +1] == 1) 
                     countLives++;
                  if (grid[i][j - 1] == 1)
                     countLives++;
                  if (grid[i][j] == 1) 
                     living = true;
                  if (grid[i][j + 1] == 1)
                     countLives++;
                  if (grid[i + 1][j - 1] == 1)
                     countLives++;
                  if(grid[i + 1][j] == 1)
                     countLives++;
                  if(grid[i + 1][j + 1] == 1)
                     countLives++;
                  count++;
                  if(living == true && countLives < 2 || living == true && countLives > 3)
                  {
                     check[i][j] = false;
                  } 
                  
                   else if(living == true && countLives > 1 && countLives  < 4 || living == false && countLives == 3)       
                        {
                             check[i][j] = true;
                         } 
                                                
                         else
                         {
                        check[i][j] =false; 
                         }
                         
                         countLives = 0;
                         living = false;

                      }
                    }  
         for(int i = 1; i < grid.length - 1; i++)
         {
            for(int j = 1; j < grid[j].length - 1;j++)
            {
                  countNum++;
                  if(check[i][j] == true)
                  {
                     grid[i][j] = 1;
                  }
                  else
                  {
                     grid[i][j] = 0;
                  }
              
               }
      } 
  } 
         public void oscillatePatternInitialGrid()
         {
            for(int i = 1; i < grid.length - 1; i++)
            {
               for(int j = 1; j < grid[i].length -1; j++)
               {
                  if(i == (grid.length - 2) / 2 && j == grid[i].length / 2 || i == (grid.length - 2) / 2 && j == (grid[i].length / 2) - 1 || i == (grid.length - 2) / 2 && j == (grid[i].length / 2) + 1)
                     grid[i][j] = 1;
               } 
             }
         }
         
         public void blockPatternInitialGrid()
         {
             for(int i = 1; i < grid.length - 1; i++)
            {
               for(int j = 1; j < grid[i].length -1; j++)
               {
                  if(i == (grid.length - 2) / 2 && j == grid[i].length / 2 || i == (grid.length - 2) / 2 && j == (grid[i].length / 2) - 1 || i ==( (grid.length - 2) / 2) - 1 && j == (grid[i].length / 2) || i == ((grid.length  - 2) /2)  - 1 && j == (grid[i].length / 2) - 1)
                  grid[i][j] = 1;
               }
         }
      }
  
         public void randomizeInitialGrid()
         {
            double randomNum = 0.0;
            int placeholder= 0;
             for(int i = 1; i< grid.length - 1; i++)
            {
               for(int j = 1; j < grid[i].length -1; j++)
               {
                  randomNum = Math.random() * 2; 
                  if(randomNum < 1.0)
                  {
                     placeholder = 0;
                  }
                  else
                  {
                      placeholder = 1;
                  }
                  grid[i][j] = placeholder;
                                 
               }

         }
  
      }
  }
  
  
  