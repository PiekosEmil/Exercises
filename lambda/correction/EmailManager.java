package lambda.correction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class EmailManager {
    public static void main(String[] args) {
        List<Email> emailList = createEmailList();
        List<Email> sentEmails = filterEmails(emailList, Email::isSent);
        System.out.println("Wysłane maile:");
        System.out.println(sentEmails);
        List<Email> bartEmails = filterEmails(emailList, email -> email.isSenderOrRecipient("joe@example.com"));
        System.out.println("Maile przefiltrowane na podstawie nadawcy lub odbiorcy");
        System.out.println("---------------------------------------------------------");
        System.out.println(bartEmails);
    }

    private static List<Email> filterEmails(List<Email> emails, Predicate<Email> predicate) {
        List<Email> list = new ArrayList<>();
        for (Email email : emails) {
            if (predicate.test(email)) {
                list.add(email);
            }
        }
        return list;
    }

    private static List<Email> createEmailList() {
        List<Email> emails = new ArrayList<>();
        emails.add(new Email(
                "joe@example.com",
                "barbara@example.com",
                "Kup bułki",
                "Cześć!, Kup proszę bułki, gdy będziesz wracać z pracy.",
                false)
        );
        emails.add(new Email(
                "barbara@example.com",
                "joe@example.com",
                "Teraz ja",
                "Chciałabym Ci przekazać, że teraz moja kolej na zmywanie naczyń",
                false)
        );
        emails.add(new Email(
                "carl@example.com",
                "joe@example.com",
                "Nowa inwestycja",
                "Siema! Musimy omówić temat nowej inwestycji, pasuje Ci jutro?",
                true)
        );
        emails.add(new Email(
                "joe@example.com",
                "bart@example.com",
                "Wypad na miasto",
                "Cześć. Idziemy dzisiaj wieczorem z chłopakami na miasto. Dołączasz do nas?",
                true)
        );
        return emails;
    }
}
