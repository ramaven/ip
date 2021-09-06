package duke.commands;

import duke.exceptions.DukeException;
import duke.utils.*;

public abstract class Command {
    public abstract void execute(TaskList taskList, Ui ui, Storage storage) throws DukeException;
    public abstract boolean isExit();

}
