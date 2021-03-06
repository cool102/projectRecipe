import java.util.Scanner;

class Robot {

    private String CPU;
    private int legs;
    private int hands;
    private int eyes;

    Robot(String CPU, int legs, int hands, int eyes) {
        this.CPU = CPU;
        this.legs = legs;
        this.hands = hands;
        this.eyes = eyes;
    }

    @Override
    public String toString() {
        return "CPU : " + CPU + "\n" +
                "Legs : " + legs + "\n" +
                "Hands : " + hands + "\n" +
                "Eyes : " + eyes + "\n";
    }

    public static class RobotBuilder {

        private String CPU;
        private int legs;
        private int hands;
        private int eyes;

        RobotBuilder setCPU(String cpu) {
            this.CPU = cpu;
            return this;
        }

        RobotBuilder setLegs(int legs) {
            /* write your code here */
            this.legs = legs;
            return this;
        }

        RobotBuilder setHands(int hands) {
            this.hands = hands;
            return this;
        }

        RobotBuilder setEyes(int eyes) {
            this.eyes = eyes;
            return this;
        }

        Robot build() {
            return new Robot(CPU, legs, hands, eyes);
        }
    }
}

class TestDrive {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final Robot.RobotBuilder robotBuilder = new Robot.RobotBuilder();
        /* Set CPU */
        robotBuilder.setCPU("Intel Core i5");
        /* Would like to set legs? */
        int legs = scanner.nextInt();
        robotBuilder.setLegs(legs);

        int hands = scanner.nextInt();
        robotBuilder.setHands(hands);

        int eyes = scanner.nextInt();
        robotBuilder.setEyes(eyes);

        Robot robot = robotBuilder.build();

        System.out.println(robot);
        scanner.close();
    }
}