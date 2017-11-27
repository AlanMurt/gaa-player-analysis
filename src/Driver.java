public class Driver {

    public static void main(String args[]){

        Player player1 = new Player();
        player1.setName("Alan");
        player1.setAge(22);
        player1.setClub("Legion");
        player1.setPosition("Forward");
        player1.setPreferredFoot("Right");
        player1.setHeight(180);
        player1.setWeight(73);
        player1.setForm(10);
        player1.setForm(8);
        player1.setForm(5);
        player1.setForm(6);
        player1.setForm(13);
        player1.setForm(9);
        System.out.print(player1.getPlayerSummary());

    }
}
