public abstract class EnderCommand {
    protected static EnderPlugin plugin;
    public static String PlugMsg;
    public static String Error;
    public static String ConsoleNotAllowed;
    public static String PlayerNotAllowed;
    public static String BlockNotAllowed;
    public static String OnlyUser;
    public static String NoArgs;
    public static String MuchArgs;
    public static String NoPlayer;

    public EnderCommand() {
    }

    public void Ender(EnderPlugin plugin) {
    }

    public abstract boolean onCommand(CommandSender var1, Command var2, String[] var3);

    protected Boolean isPlayer(CommandSender sender) {
        if (!(sender instanceof Player)) {
        }

        return null;
    }

    static {
        PlugMsg = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("Plug Message"));
        Error = PlugMsg + "§4Error: §c";
        ConsoleNotAllowed = PlugMsg + "Consoles cannot use this command.";
        PlayerNotAllowed = PlugMsg + "Players cannot use this command.";
        BlockNotAllowed = PlugMsg + "CommandBlocks cannot use this command";
        OnlyUser = PlugMsg + "Only users can run this command.";
        NoArgs = Error + "Not enough arguments.";
        MuchArgs = Error + "Too many arguments.";
        NoPlayer = Error + "The request player is offline";
    }
}