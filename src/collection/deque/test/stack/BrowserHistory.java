package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    private ArrayDeque<String> browserHistory;

    public BrowserHistory() {
        this.browserHistory = new ArrayDeque<>();
    }

    public void visitPage(String url) {
        browserHistory.push(url);
    }

    public String goBack() {
        System.out.println("뒤로가기"+browserHistory.peek());

        return browserHistory.pop();

    }
}
