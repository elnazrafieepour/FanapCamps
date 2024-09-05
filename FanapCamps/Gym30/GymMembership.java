package FanapCamps.Gym30;

public class GymMembership {
    public String MemberName;
    public MembershipType MembershipType;
    public int Duration;
    public boolean PersonalTrainer = false;
    public boolean SpaAccess = false;
    public long MembershipFee;

    //Constructors:
    public GymMembership(String memberName, FanapCamps.Gym30.MembershipType membershipType, int duration, boolean personalTrainer, boolean spaAccess) {
        MemberName = memberName;
        MembershipType = membershipType;
        Duration = duration;
        PersonalTrainer = personalTrainer;
        SpaAccess = spaAccess;
    }

    public GymMembership(String memberName, FanapCamps.Gym30.MembershipType membershipType, int duration) {
        MemberName = memberName;
        MembershipType = membershipType;
        Duration = duration;
    }

    public long calculateMembershipFee() {
        if (MembershipType == MembershipType.MONTHLY) {
            this.MembershipFee = 100;
        } else if (MembershipType == MembershipType.YEARLY) {
            this.MembershipFee = 101;
        } else if (MembershipType == MembershipType.PAYASYOUGO) {
            this.MembershipFee = 102;
        } else if (MembershipType == MembershipType.DISCOUNTED) {
            this.MembershipFee = 103;
        } else if (MembershipType == MembershipType.DYNAMICPRICING) {
            this.MembershipFee = 104;
        } else if (MembershipType == MembershipType.TIEREDPLAN) {
            this.MembershipFee = 105;
        }
        return MembershipFee;
    }

    public void DisplayDetail() {
        System.out.println("The Member with name of : " + this.MemberName + " with duration Membership of: " + this.Duration);
        System.out.println("And with The Membership Type is : " + this.MembershipType);
        System.out.println("should be pay the amount of: " + this.calculateMembershipFee());
    }
    }
