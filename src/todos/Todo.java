package todos;
import java.util.Scanner;

public class Todo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] todos = new String[3];
        int index = 0;
        int decision;
        do {
            TodoViews.menu();
            decision = scanner.nextInt();
            scanner.nextLine();
            switch (decision) {
                case 1:
                    if (index == todos.length) {
                        TodoViews.noSpaceWarningMessage();
                        TodoViews.waitForUser(scanner);
                    } else {
                        addTodo(scanner, todos, index);
                        index++;
                    }
                    break;
                case 2:
                    listTodos(todos, index);
                    TodoViews.waitForUser(scanner);
                    break;
            }
        } while(decision != 0);
    }

    private static void addTodo(Scanner scanner, String[] todos, int index) {
        //getting data
        TodoViews.newTodoMessage();
        String newTodo = scanner.nextLine();
        //inserting to array
        todos[index] = newTodo;
    }

    private static void listTodos(String[] todos, int todosToDisplay) {
        //printing data
        if (todosToDisplay == 0) {
            TodoViews.noTodosToDisplayMessage();
        }
        for (int i = 0; i < todosToDisplay; i++) {
            System.out.println(i + ". " + todos[i]);
        }
    }
}

