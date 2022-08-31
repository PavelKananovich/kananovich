import com.homework4.entity.CallCenter;
import com.homework4.entity.Operator;
import com.homework4.entity.User;
import util.ThreedUtil;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;


public class OperatorUserTest {
    private static final int MAX_QUEUE_CAPACITY = 1;


    public static void showMultipleOperatorAndMultipleUser() throws InterruptedException {
        CallCenter callCenter = new CallCenter(MAX_QUEUE_CAPACITY);
        int operatorThreadCount = 3;
        int userThreadCount = 5;
        List<Thread> threads = new ArrayList<>();
        Operator operator = new Operator(callCenter);

        for (int i = 0; i < operatorThreadCount; i++) {
            Thread operatorThread = new Thread(operator);
            operatorThread.setName("Name " + i);
            System.out.println("Operator-" + operatorThread.getName() + " started to work");
            operatorThread.start();
            threads.add(operatorThread);
        }
        User user = new User(callCenter);
        for (int i = 0; i < userThreadCount; i++) {
            Thread userThread = new Thread(user);
            userThread.setName("Name" + i);
            userThread.start();
            threads.add(userThread);
        }

        sleep(2000);
        operator.stop();
        user.stop();

        ThreedUtil.waitForAllThreadsToComplete(threads);
    }

    public static void main(String[] args) {
        try {
            showMultipleOperatorAndMultipleUser();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End of the working day");
    }
}