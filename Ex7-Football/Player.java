public class Player {

private String name;
private int num;
private Position position;

public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getNum() {
    return num;
}
public void setNum(int num) {
    this.num = num;
}
public Position getPosition() {
    return position;
}
public void setPosition(Position position) {
    this.position = position;
}
@Override
public String toString() {
    return "Player [name=" + name + ", num=" + num + ", position=" + position + "]";
}
public Player(String name,   Position position, int num) {
    this.name = name;
    this.num = num;
    this.position = position;
}
public Player(){
    
}
    
}