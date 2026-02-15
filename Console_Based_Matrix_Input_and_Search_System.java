import java.util.Scanner;
public class Console_Based_Matrix_Input_and_Search_System
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        while(true)
        {
            int n=1;
            System.out.println("Hello");
            System.out.println("Welcome to Console Based Matrix Input and Search System");
            System.out.println("Entre Row of Matrix");
            int row=read.nextInt();
            System.out.println("Entre Column of Matrix");
            int column=read.nextInt();
            int [][] number=new int[row][column];
            System.out.println("Entre 1st Row");
            for (int i=0; i<row; i++)
            {
                for (int j=0; j<column; j++)
                {
                    number[i][j]=read.nextInt();
                }
                n++;
                if(n<=row)
                {
                    System.out.println("Entre "+n+" Row");
                }
            }
            System.out.println();
            System.out.println("Values are");
            for (int i=0; i<row; i++)
            {
                for (int j=0; j<column; j++)
                {
                    System.out.print(number[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            read.nextLine();
            while(true)
            {
                boolean found=false;
                System.out.println("Entre No you want to search and Type Exit to move on");
                String s=read.nextLine();
                if(s.equalsIgnoreCase("exit"))
                {
                    break;
                }
                else
                {
                    int value=Integer.parseInt(s);
                    for (int i=0; i<row; i++)
                    {
                        for (int j=0; j<column; j++)
                        {
                            if(number[i][j]==value)
                            {
                                System.out.println("Row= "+(i+1)+"\t"+"Column= "+(j+1));
                                System.out.println();
                                found=true;
                            }
                        }
                    }
                    if(!found)
                    {
                        System.out.println("Value not found");
                        System.out.println("Try again");
                        System.out.println();
                    }
                }
            }
            System.out.println();
            while(true)
            {
                System.out.println("Entre Row of which u want to find Value and Type exit to move on");
                String g=read.nextLine();
                if(g.equalsIgnoreCase("exit"))
                {
                    break;
                } 
                else
                {
                    System.out.println("Enter Column of which u want to find Value and Type exit to move on");
                    String w=read.nextLine();
                    if(w.equalsIgnoreCase("exit"))
                    {
                        break;
                    }
                    else
                    {
                        int rows=Integer.parseInt(g);
                        int columns=Integer.parseInt(w);
                        rows=(rows-1);
                        columns=(columns-1);
                        if(rows>=0 && rows<row && columns>=0 && columns<column)
                        {
                            System.out.println();
                            for (int i=0; i<row; i++)
                            {
                                for (int j=0; j<column; j++)
                                {
                                    if(i==rows && j==columns)
                                    {
                                        System.out.println("Value on the row="+(rows+1)+" and column="+(columns+1)+" is  "+number[i][j]);
                                        System.out.println();
                                    }
                                }
                            }
                        }
                        else
                        {
                            System.out.println("Wrong rows and columns");
                            System.out.println("Try again");
                            System.out.println();
                        }
                    }    
                }
            }
            System.out.println();
            System.out.println("Do you want to restart type yes or no");
            String f=read.nextLine();
            if(f.equalsIgnoreCase("no"))
            {
                System.out.println("Thank");
                System.out.println("Bye");
                break;
            }
            if(f.equalsIgnoreCase("yes"))
            {
                System.out.println();
            }
        }
    }

}
