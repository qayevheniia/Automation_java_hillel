package pageObject;


public class TaskManager {

    public static String  Run(int taskId) {
        String result;
        switch (taskId) {
            case 1: {
                result = Tasks.evenNumber();
                break;
            }
            case 2: {
                result = Tasks.armStrong();
                break;
            }
            case 3: {
                result = Tasks.reverse();
                break;
            }
            case 4: {
                result = Tasks.fibonacci();
                break;
            }
            case 5: {
                result = Tasks.replace();
                break;
            }

            default:
                result = "wrong number of task";
        }
        System.out.println(result);
        return result;
    }

}

