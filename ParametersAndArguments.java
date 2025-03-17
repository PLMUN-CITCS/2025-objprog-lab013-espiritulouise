public class ParametersAndArguments {
    // Method to calculate area
    public static int calculateArea(int width, int height) {
        return width * height;
    }

    public static void main(String[] args) {
        int roomWidth = 10;
        int roomHeight = 15;

        // Calling the method
        int area = calculateArea(roomWidth, roomHeight);

        // Printing the result
        System.out.println("The calculated area is: " + area);
    }
}

