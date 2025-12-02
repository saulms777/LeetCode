import java.util.LinkedList;
import java.util.Queue;

public class P225_ImplementStackUsingQueues {

    public static class MyStack {

        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> temp = new LinkedList<>();

        public MyStack() {

        }

        public void push(int x) {
            int realloc = queue.size();
            queue.offer(x);
            for (int i = 0; i < realloc; i++) {
                temp.add(queue.poll());
            }
            for (int i = 0; i < realloc; i++) {
                queue.offer(temp.poll());
            }
        }

        public int pop() {
            return queue.poll();
        }

        public int top() {
            return queue.peek();
        }

        public boolean empty() {
            return queue.isEmpty();
        }

    }

}
