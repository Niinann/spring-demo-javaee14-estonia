package com.sda.spriingdemojavaee14.homework.optional;


import java.util.Optional;
import java.util.function.Consumer;

public class OptionalExerciseMain {

    public static void main(String[] args) {
        int nickLenght = personNick().length();

        System.out.println("nick length is: =" + nickLenght);

        Optional<String> maybeNick = personNickIfPresent();
        if (maybeNick.isPresent()) {
            System.out.println(maybeNick.get());
        } else {
            System.out.println("sorry no nick");
        }
        if (maybeNick.isEmpty()){
            System.out.println("Sorry, no nick");
        } else {
            System.out.println(maybeNick.get());
        }

        System.out.println("Better usage of Optional");
        System.out.println("nick:" + maybeNick.orElse("no nick"));

        System.out.println("Optional with Lambda");
        maybeNick.ifPresent(new MyNickConsumer());

        System.out.println("Now with Lambda");
        //lamda is about reducing ceremony
        //lambda is for shorter way of providing interface implementation
        //lambda is just content of missing interface method
        //we don't need type in lambda because we know which method we implement
        // -> arrow - is separator of argument and method body
        maybeNick.ifPresent(nick -> System.out.println("Nick is:" + nick));
        maybeNick.ifPresent((String nick) -> System.out.println("Nick is:" + nick));



    }
    //in Kotlin language: String (never null) and String?

    public static String personNick(){
        return null;
    }

    // Optional is bag for just one item
// we're using "factory methods" for creating instances of this class
// factory method - is static method which is able to produce instances of classes and have good name
    public static Optional<String> personNickIfPresent() {
        return Optional.of("niina");
    }

}

//generic inteerface Consumer - T will be replaced with String in our case

class MyNickConsumer implements Consumer<String> {

    @Override
    public void accept(String t) {
        System.out.println("Nick is :" + t);
    }
}
