package ekud.command;

/**
 * Represents the clean command used to deduplicate tasks,
 */
public final class CleanCommand extends Command {
    /**
     * Creates a new clean command.
     */
    public CleanCommand() {
    }

    /**
     * Returns the string representation of the command.
     * This is identical (excluding whitespace) to how the user would type it into
     * the CLI.
     * 
     * @return String representation.
     */
    @Override
    public String toString() {
        return "clean";
    }
}
