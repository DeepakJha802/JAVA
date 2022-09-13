import java.util.Scanner;

public class Rat_in_maze_problem {
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
        boolean ans = Rat_in_maze(maze);
        System.out.println(ans);
    }
    static boolean Rat_in_maze (int[][] maze)
    {
        int x = maze.length;
        int[][] path = new int[x][x];
        return Solve_maze (maze , 0 , 0 , path);
    }
    static boolean Solve_maze (int[][] maze , int i , int j , int[][] path)
    {
        int n = maze.length;

        // Cheack the i , j cell is valid or not
        if (i < 0 ||    i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1)
        {
            return false;
        }
        // Include the cell in current path
        path[i][j] = 1;

        // Destination cell
        if (i == n - 1 && j == n - 1)
        {
            System.out.println();
            // If we have to print the path
            // for (int a = 0; a < n; ++a)
            // {
            //     for (int b = 0; b < n; ++b)
            //     {
            //         System.out.print(path[a][b] + " ");
            //     }
            //     System.out.println();
            // }
            return true;
        }

        // Explore further in all direction

        // Exploring Top
        if (Solve_maze(maze, i - 1 , j , path))
        {
            return true;
        }

        // Exploring Right
        if (Solve_maze(maze, i, j + 1, path))
        {
            return true;
        }

        // Exploring Down
        if (Solve_maze(maze, i + 1, j, path))
        {
            return true;
        }

        // Exploring left
        if (Solve_maze(maze, i, j - 1, path))
        {
            return true;
        }
        return false;
    }
}

// In this problem we have to just find that is any path is exists or not in maze.
// So a Rat can travel rom first cell to last cell of the block.
