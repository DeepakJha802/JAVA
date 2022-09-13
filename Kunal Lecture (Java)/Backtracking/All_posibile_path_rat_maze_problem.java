import java.util.*;

public class All_posibile_path_rat_maze_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix : ");
        int n = sc.nextInt();
        int[][] maze = new int[n][n];
        System.out.println("Enter the block cell and unblock cell: ");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                maze[i][j] = sc.nextInt();
            }
        }
        Rat_in_maze(maze);
    }
    static void Rat_in_maze (int[][] maze)
    {
        int x = maze.length;
        int[][] path = new int[x][x];
        All_posibile_Path (maze , 0 , 0 , path);
    }
    static void All_posibile_Path (int[][] maze , int i , int j , int[][] path)
    {
        int n = maze.length;

        // Cheack the i , j cell is valid or not
        if (i < 0 ||    i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1)
        {
            return;
        }
        // Include the cell in current path
        path[i][j] = 1;

        // Destination cell
        if (i == n - 1 && j == n - 1)
        {
            System.out.println();
            for (int a = 0; a < n; ++a)
            {
                for (int b = 0; b < n; ++b)
                {
                    System.out.print(path[a][b] + " ");
                }
                System.out.println();
            }
            System.out.println();
            path[i][j] = 0;
            return;
        }

        // Explore further in all direction

        // Exploring Top
        All_posibile_Path (maze, i - 1 , j , path);

        // Exploring Right
        All_posibile_Path (maze, i, j + 1, path);

        // Exploring Down
        All_posibile_Path (maze, i + 1, j, path);

        // Exploring left
        All_posibile_Path (maze, i, j - 1, path);

        path[i][j] = 0;
    }
}

// In this code we are print the all path.
