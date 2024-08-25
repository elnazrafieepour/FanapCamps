package FanapCamps.Gym;

import java.util.Date;

public class GymMembership {
    public String MemberName;
    public MembershipType MembershipType;
    public String Duration;
    public boolean PersonalTrainer = false;
    public boolean SpaAccess = false;
    public long MembershipFee;

    //Constructors:
    public GymMembership(String memberName, FanapCamps.Gym.MembershipType membershipType, String duration, boolean personalTrainer, boolean spaAccess) {
        MemberName = memberName;
        MembershipType = membershipType;
        Duration = duration;
        PersonalTrainer = personalTrainer;
        SpaAccess = spaAccess;
    }

    public GymMembership(String memberName, FanapCamps.Gym.MembershipType membershipType, String duration) {
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

    }
