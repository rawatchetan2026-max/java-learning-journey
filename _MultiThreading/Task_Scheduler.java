class Task {
    private int taskId;
    private String taskName;
    private int duration;

    public Task(int taskId, String taskName, int duration) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.duration = duration;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getDuration() {
        return duration;
    }

}

class TaskRunner extends Thread {
    private Task task;

    public TaskRunner(Task task) {
        this.task = task;
    }

    public void run() {
        System.out.println(getName() + " started : " + task.getTaskName());

        try {
            Thread.sleep(task.getDuration());
        } catch (Exception e) {
            System.out.println(getName() + " interrupted");
        }
        System.out.println(getName() + " finished : " + task.getTaskName());
    }
}

class TaskServices {
    public void executeTasks(Task[] tasks) throws InterruptedException {
        TaskRunner[] runners = new TaskRunner[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            runners[i] = new TaskRunner(tasks[i]);
            runners[i].start();
        }
        for (TaskRunner runner : runners) {
            runner.join();
        }
        System.out.println("all task completed");
    }
}

public class Task_Scheduler {
    public static void main(String[] args) throws InterruptedException {

        Task t1 = new Task(1, "Download File", 2000);
        Task t2 = new Task(2, "Process Data", 3000);
        Task t3 = new Task(3, "Send Email", 1500);

        Task[] tasks = { t1, t2, t3 };

        TaskServices scheduler = new TaskServices();
        scheduler.executeTasks(tasks);
    }
}
