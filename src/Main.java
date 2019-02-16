import controller.Controller;
import controller.MenuControll;
import zadania.Task_01;

public class Main {
    public static void main(String[] args) {
        do{
            MenuControll.menu();

            switch (Controller.choice(11)){
                    case 0:
                        System.exit(0);
                    case 1:
                        Task_01.task();
                        break;
                    case 2:
                        Task_01.task();
                        break;
                    case 3:
                        Task_01.task();
                        break;
                    case 4:
                        Task_01.task();
                        break;
                    case 5:
                        Task_01.task();
                        break;
                    case 6:
                        Task_01.task();
                        break;
                    case 7:
                        Task_01.task();
                        break;
                    case 8:
                        Task_01.task();
                        break;
                    case 9:
                        Task_01.task();
                        break;
                    case 10:
                        Task_01.task();
                        break;
                    case 11:

            }

        }while(Controller.runAgain());
    }
}
