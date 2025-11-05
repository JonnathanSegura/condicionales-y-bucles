public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int steps = 0;

        // print starting point
        System.out.println("(" + x + ", " + y + ")");

        while (Math.abs(x) + Math.abs(y) != r) {
            double rand = Math.random();
            if (rand < 0.25) {
                x++;            // east
            } else if (rand < 0.50) {
                x--;            // west
            } else if (rand < 0.75) {
                y++;            // north
            } else {
                y--;            // south
            }
            steps++;
            System.out.println("(" + x + ", " + y + ")");
        }

        System.out.println("steps = " + steps);
    }
}