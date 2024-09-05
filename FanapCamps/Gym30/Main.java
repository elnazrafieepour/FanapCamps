package FanapCamps.Gym30;

public class Main {
    public static void main(String[] args) {
        GymMembership mem1= new GymMembership("eli", MembershipType.MONTHLY, 1 );
        GymMembership mem2= new GymMembership("eli2", MembershipType.YEARLY, 2 );
        PremiumMembership mem3= new PremiumMembership("eli3", MembershipType.DISCOUNTED, 3, true, false );
        PremiumMembership mem4= new PremiumMembership("eli4", MembershipType.TIEREDPLAN, 4, false, true );
        PremiumMembership mem5= new PremiumMembership("eli5", MembershipType.TIEREDPLAN, 5, true, true );
        PremiumMembership mem6= new PremiumMembership("eli6", MembershipType.TIEREDPLAN, 6, false, false );

        mem3.DisplayDetail();
        mem4.DisplayDetail();
        mem5.DisplayDetail();
        mem6.DisplayDetail();
    }
}
