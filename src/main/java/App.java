//imports
import java.util.*;

//class app ( my main class)
public class App {

  public static void main(String[] args) {
    List<Character> guess = new ArrayList<>();
    Random randomNumber  = new Random();
    String[] words =
    { "cadillac", "mozilla", "player", "noun", "leafy", "surbubs","wineglass", "bottletop", "letters", "telephone", "kitchen", "happiness", "lacrosse", "america", "africa", "loving", "request", "mother", "daylight", "king"
    };
    Prompter prompter = new Prompter(new Hangman(words[randomNumber.nextInt(words.length)]));
	// Prompter prompter = new Prompter(new Hangman("collins"));
	  prompter.promptForGuess();
    }
}
