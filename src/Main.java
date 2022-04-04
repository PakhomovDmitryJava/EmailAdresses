import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
    public static void main(String[] args)
    {
        HashSet<String> emails = new HashSet<>(){{
          add("qwe123@gmail.com");
          add("qwe123@mail.ru");
          add("VasyaPersik@yandex.ru");
          add("MariaPetrova@rambler.ru");
          add("dfkgjlsdflkgj@proton.com");
        }};
        
        for(String email : emails)
        {
            System.out.println(email);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an email or LIST if you want to see all the emails");
        String newEmail = scanner.nextLine();

        String pattern = "^[A-Za-z0-9+_.-]+[@]{1}[.]{1}[A-Za-z]{1}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(newEmail);

        if (newEmail.equals("LIST"))
            for (String email : emails)
            {
                System.out.println(email);
            }
        else
        {
            if (m.find())
            {
                emails.add(newEmail);
            }
            else
            {
                System.out.println("Wrong email address! Chek it!");
            }
        }

        System.out.println();
        for(String email : emails)
        {
            System.out.println(email);
        }
    }
}
