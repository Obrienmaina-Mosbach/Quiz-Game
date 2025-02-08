package root;

        import java.util.Scanner;

        public class Game {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Choose quiz topic
                System.out.println("Choose a quiz topic:");
                System.out.println("1. Animal");
                System.out.println("2. Planets");
                System.out.println("3. Artificial Intelligence");
                System.out.println("4. General Knowledge");
                System.out.println("5. History");
                System.out.println("6. Science");
                System.out.println("7. Technology");
                System.out.println("8. Mathematics");
                System.out.print("Enter the number of your choice: ");
                int topicChoice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                String topic = switch (topicChoice) {
                    case 1 -> "Animal";
                    case 2 -> "Planets";
                    case 3 -> "Artificial Intelligence";
                    case 4 -> "General Knowledge";
                    case 5 -> "History";
                    case 6 -> "Science";
                    case 7 -> "Technology";
                    case 8 -> "Mathematics";
                    default -> {
                        System.out.println("Invalid choice. Defaulting to Animal.");
                        yield "Animal";
                    }
                };

                // Choose difficulty level
                System.out.println("Choose a difficulty level:");
                System.out.println("1. Easy");
                System.out.println("2. Medium");
                System.out.println("3. Hard");
                System.out.print("Enter the number of your choice: ");
                int difficultyChoice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                String difficulty;
                switch (difficultyChoice) {
                    case 1:
                        difficulty = "Easy";
                        break;
                    case 2:
                        difficulty = "Medium";
                        break;
                    case 3:
                        difficulty = "Hard";
                        break;
                    default:
                        System.out.println("Invalid choice. Defaulting to Easy.");
                        difficulty = "Easy";
                        break;
                }

                GameController game = new GameController(topic, difficulty);
                game.startGame();
                scanner.close();
            }
        }