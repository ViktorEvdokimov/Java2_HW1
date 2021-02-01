import java.awt.event.ItemEvent;

public class Course {
    private int[] barriers;

    public Course(int ... barriers) {
        this.barriers = barriers;
    }

    public int[] getBarriers() {
        return barriers;
    }

    public void doIt(Team team){
        Member[] members = team.getMembers();
        int [] results = new int[members.length];
        for (int i=0; i<members.length; i++){
            int sumLength = 0;
            for (int j=0; j< barriers.length; j++){
                sumLength+=barriers[j];
                if (members[i].getPower()<sumLength){
                    results[i]=j;
                    j=barriers.length;
                }
            }
        }
        team.setResults(results);
    }
}
