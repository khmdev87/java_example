package adapter.robot;
public class RobotProgram {

  public static void main(String[] args) {
    RobotKit robotKit = new RobotKit();

    robotKit.addCommand(new MoveForwardCommand(2));
    robotKit.addCommand(new TurnCommand(Robot.Direction.LEFT));
    robotKit.addCommand(new MoveForwardCommand(1));
    robotKit.addCommand(new TurnCommand(Robot.Direction.RIGHT));
    robotKit.addCommand(new PickupCommand());
    //adapter command 작성
    robotKit.addCommand(new CommandOrderAdapter(new MoveBackOrder(1)));

    robotKit.start();

    // 2 칸 전진
    // 왼쪽으로 방향전환
    // 1 칸 전진
    // 오른쪽으로 방향전환
    // 앞의 물건 집어들기
  }
}