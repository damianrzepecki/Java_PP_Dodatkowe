import controller.Controller;
import controller.MenuControll;
import zadania.*;

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
                        Task_02.task();
                        break;
                    case 3:
                        Task_03.task();
                        break;
                    case 4:
                        Task_04.task();
                        break;
                    case 5:
                        Task_05.task();
                        break;
                    case 6:
                        Task_06.task();
                        break;
                    case 7:
                        Task_07.task();
                        break;
                    case 8:
                        Task_08.task();
                        break;
                    case 9:
                        Task_09.task();
                        break;
                    case 10:
                        Task_10.task();
                        break;
                    case 11:
                        Task_11.task();
                        break;

            }

        }while(Controller.runAgain());
    }
}
