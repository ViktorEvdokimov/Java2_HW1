public class Team {
    private String name;
    private Member[] members = new Member[4];
    private int[] results;

    public Team(String name, Member[] members) {
        this.name = name;
        this.members = members;
    }
    public void showResults(){
        for(int i=0; i<members.length; i++){
            System.out.printf("Player %s of team %s overcame %d barriers%n", members[i].getName(), name, results[i]);
        }
    }

    public void showInfo (){
        System.out.println("Team "+ name +" have members:");
       for (int i=0; i<members.length; i++){
           System.out.println(members[i].getName() + " with power " + members[i].getPower() + ";");
        }
    }

    public void setResults(int[] results) {
        this.results = results;
    }

    public Member[] getMembers() {
        return members;
    }
}
