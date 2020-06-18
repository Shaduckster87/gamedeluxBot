import javax.security.auth.login.LoginException;

public class Main {

    public static Main INSTANCE;
    public static JDA jda;
    public static String prefix = "!";


    public Main() {
    }

    public static void main(String[] args) throws LoginException {
        jda = (new JDABuilder(AccountType.BOT)).setToken(process.env.SECRETS.TOKEN).build();
