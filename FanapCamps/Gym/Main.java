package FanapCamps.Gym;

public class Main {
    public static void main(String[] args) {
        GymMembership mem1= new GymMembership("eli", MembershipType.MONTHLY, "12345" );
        GymMembership mem2= new GymMembership("eli2", MembershipType.YEARLY, "67890" );
        PremiumMembership mem3= new PremiumMembership("eli3", MembershipType.DISCOUNTED, "75239", true, false );
        PremiumMembership mem4= new PremiumMembership("eli4", MembershipType.TIEREDPLAN, "15987", false, true );

        System.out.println(mem1.calculateMembershipFee());
        System.out.println(mem2.calculateMembershipFee());
        System.out.println(mem3.calculateMembershipFee());
        System.out.println(mem4.calculateMembershipFee());
    }
}
