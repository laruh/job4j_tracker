package ru.job4j.tracker;

import java.util.List;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    private void showMenu(List<UserAction> actions) {
        out.println("Menu:");
        for (int index = 0; index < actions.size(); index++) {
            out.println(index + ". " + actions.get(index).name());
        }
    }

    public void init(Input input, Store store, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.size()) {
                out.println("Wrong input, you can select: 0 .. " + (actions.size() - 1));
                continue;
            }
            UserAction action = actions.get(select);
            run = action.execute(input, store);
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        MemTracker tracker = new MemTracker();
        List<UserAction> actions = List.of(
                new CreateAction(output),
                new ReplaceAction(output),
                new DeleteAction(output),
                new FindAllAction(output),
                new FindByIdAction(output),
                new FindByNameAction(output),
                new ExitAction(output)
        );
        new StartUI(output).init(input, tracker, actions);

        MemTracker tracker1 = new MemTracker();
        for (int i = 0; i < 100000; i++) {
            tracker1.add(new Item("name" + i));
            tracker1.add(new Item("name1" + i));
            tracker1.add(new Item("name2" + i));
            tracker1.add(new Item("name2" + i));
            tracker1.add(new Item("name2" + i));
            tracker1.add(new Item("name2" + i));
            tracker1.add(new Item("name2" + i));
            tracker1.replace(i, new Item("namename"));
            tracker1.delete(i+1);
            tracker1.findById(i+3);
            tracker1.findAll();
        }
    }
}
