import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DayOfWeekCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.print("Введите дату в формате ГГГГ-ММ-ДД (например, 2023-09-12), или введите 'exit' для выхода: ");
            String inputDate = scanner.nextLine();

            if (inputDate.equalsIgnoreCase("exit")) {
                continueProgram = false;
            } else {
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    Date date = dateFormat.parse(inputDate);

                    Calendar calendar = new GregorianCalendar();
                    calendar.setTime(date);

                    String[] daysOfWeek = {
                            "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота","Воскресенье"
                    };

                    int dayOfWeekIndex = calendar.get(Calendar.DAY_OF_WEEK);
                    String dayOfWeekInRussian = daysOfWeek[dayOfWeekIndex];

                    System.out.println("День недели для введенной даты: " + dayOfWeekInRussian);
                } catch (Exception e) {
                    System.out.println("Неверный формат даты. Попробуйте еще раз.");
                }
            }
        }
    }
}
