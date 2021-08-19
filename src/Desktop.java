

public class Desktop {
private Monitor monitor;
private Keyboard keyboard;
public Desktop(Keyboard keyboard, Monitor monitor){
    this.keyboard = keyboard;// dependency injection as we pass the objects in constructor instead of creating them
    this.monitor = monitor;
}
}
interface Keyboard{}
class Monitor{}
class QwertyKeyboard implements Keyboard{}

