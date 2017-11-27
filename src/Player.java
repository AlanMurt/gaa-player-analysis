import java.util.ArrayList;
import java.util.List;

public class Player {

    String name;
    int age;
    String club;
    String position;
    String preferredFoot;
    int height;
    int weight;
    List<Double> form = new ArrayList<Double>();

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setClub(String club){
        this.club = club;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public void setPreferredFoot(String preferredFoot){
        this.preferredFoot = preferredFoot;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public void setForm(double lastGameRating){
        this.form.add(lastGameRating);
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getClub(){
        return club;
    }

    public String getPosition(){
        return position;
    }

    public String getPreferredFoot(){
        return preferredFoot;
    }

    public int getHeight(){
        return height;
    }

    public int getWeight(){
        return weight;
    }

    public List getForm(){
        return form;
    }


    public double calculateRecentForm(){
        List<Double> recentForm = form.subList(Math.max(form.size() - 5, 0), form.size());

        double average = recentForm.stream().mapToDouble(Double::doubleValue).sum() / recentForm.size();
        return average;
    }



    public String getPlayerSummary() {
        return "Name: " + getName()
                + "\nAge: " + getAge()
                + "\nClub: " + getClub()
                + "\nPosition " + getPosition()
                + "\nPreferred Foot: " + getPreferredFoot()
                + "\nHeight: " + getHeight()
                + "\nWeight: " + getWeight()
                + "\nRecent Form: " + calculateRecentForm() + "\n";
    }
}
