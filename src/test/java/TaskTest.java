import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void ShouldMatchSimpleTask() {
        SimpleTask simpleTask = new SimpleTask(1, "Погладить кота");

        boolean expected = true;
        Assertions.assertEquals(expected, simpleTask.matches("Погладить кота"));
    }

    @Test
    public void ShouldMatchEpic() {
        String[] subtasks = {"Украсть", "Выпить", "В тюрьму"};
        Epic epic = new Epic(2, subtasks);

        boolean expected = true;
        Assertions.assertEquals(expected, epic.matches("Выпить"));
    }

    @Test
    public void ShouldMatchMeeting() {
        Meeting meeting = new Meeting(1, "Поднятие зарплат лекторам", "Нетология", "01.09.2023");

        boolean expected = true;
        Assertions.assertEquals(expected, meeting.matches("Нетология"));
    }
}
