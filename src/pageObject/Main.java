package pageObject;

public class Main {

    private static String TASK_SELECTOR_MESSAGE =
            "Which task do you want to start: \n  1.Even Number\n  2.Armstrong\n  3.Reverse\n  4.Fibonacci\n  5.Replace";


    public static void main(String[] args) {

        UserManager userManager = new UserManager();

        try {
            User user  = userManager.login();
            System.out.println("current user:" +user.getName());

            // Task Message
            String taskName = Utils.readParameter(TASK_SELECTOR_MESSAGE);
            System.out.println("selected task:" +taskName);
            int taskId = Integer.parseInt(taskName, 10);

            TaskManager.Run(taskId);

        } catch (Exception error) {
            System.out.println(error.toString());
        }



    }
}








