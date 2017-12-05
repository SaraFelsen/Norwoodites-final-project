//code for endings G and I.
public static void engineExplode(){
  TextIO.putf("The engine explodes. The fireball consumes you.%n");
  displayQuitOption();
}
//code for scenario J
public static void podTunnel(){
  TextIO.putf("You hear a strange hum and see a block of dark material. Its appearance terrifies you.%n");
  TextIO.putf("By chance, you see that the door leading to the ship's other rooms is open.%n");
  TextIO.putf("Enter 'door' to go towards the other rooms, or 'explore' to stay in the pod tunnel.%n");
  String userInput = TextIO.getln();
  String doNext = actionChoice("door", "explore", userInput);
  if(doNext.equals("door")){
    hallway();
  }
  else{
    tunnel();
  }
}
//code for ending K
public static void hallway(){
  TextIO.putf("You enter the hallway leading to the ship's other rooms and start to walk.%n");
  TextIO.putf("You walk for what feels like hours. The hallway seems to never end...%n");
  displayQuitOption();
}
//code for ending L
public static void tunnel(){
  TextIO.putf("You take a few steps forward in the pod tunnel, away from the dark object.%n");
  TextIO.putf("As you walk, you see pieces of metal fly towards you and feel a wave of heat.%n");
  TextIO.putf("As the shockwave arrives, you realize the engine exploded. The blast kills you before the fire.%n");
  displayQuitOption();
}

public static boolean displayQuitOption(){
  String userInput, quitResult = new String;
  boolean replay = false;
  displayQuitMessage();
  userInput = TextIO.getln();
  quitResult = actionChoice("retry", "no", userInput);
  if(quitResult.equals(retry)){
    replay = true;
  }
  return replay;
}

public static void displayQuitMessage(){
  TextIO.putf("You have died. You see a bright orb in front of you.%n");
  TextIO.putf("Its presence gives you great comfort, though you don't know why.%n");
  TextIO.putf("The orb wavers. 'I can offer you another chance to save the ship,' it says.%n");
  TextIO.putf("Enter 'retry' to take this chance, or 'no' to pass on and end the game.%n");
}

public static String actionChoice(String opt1, String opt2, String userInput){
  do{
    if(opt1.equalsIgnoreCase(userInput)){
      return opt1;
    }
    else if(opt2.equalsIgnoreCase(userInput)){
      return opt2;
    }
    else{
       userInput = notChoice(opt1, opt2, userInput);
    }
  }while(!userInput.equalsIgnoreCase(opt1) && !userInput.equalsIgnoreCase(opt2));
}

public static String notChoice(String opt1, String opt2, String userInput){
  TextIO.putf("That choice is not valid. Enter '%s' or '%s' to continue.%n", opt1, opt2);
  userInput = TextIO.getln();
  return userInput;
}
