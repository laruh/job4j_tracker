package ru.job4j.tracker;

public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        CreateAction createAction = new CreateAction();
        createAction.execute(input, tracker);
    }

    public static void findAllItem(Input input, Tracker tracker) {
        FindAllAction findAllAction = new FindAllAction();
        findAllAction.execute(input, tracker);
    }

    public static void replaceItem(Input input, Tracker tracker) {
        ReplaceAction replaceAction = new ReplaceAction();
        replaceAction.execute(input, tracker);
    }

    public static void deteleItem(Input input, Tracker tracker) {
       DeleteAction deleteAction = new DeleteAction();
       deleteAction.execute(input, tracker);
    }

    public static void findByIdItem(Input input, Tracker tracker) {
        FindByIdAction findByIdAction = new FindByIdAction();
        findByIdAction.execute(input, tracker);
    }

    public static void findByNameItem(Input input, Tracker tracker) {
        FindByNameAction findByNameAction = new FindByNameAction();
        findByNameAction.execute(input, tracker);
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new FindAllAction(),
                new ReplaceAction(),
                new DeleteAction(),
                new FindByIdAction(),
                new FindByNameAction(),
                new ExitAction()
        };
        new StartUI().init(input, tracker, actions);
    }
}
