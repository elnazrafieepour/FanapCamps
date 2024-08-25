package FanapCamps.Gym;

import java.util.Date;

public class PremiumMembership extends GymMembership {
    public boolean PersonalTrainer;
    public long PersonalTrainerFee = 1500;
    public boolean SpaAccess;
    public long SpaAccessFee = 1000;

    //Constructors:
    public PremiumMembership(String memberName, FanapCamps.Gym.MembershipType membershipType, String duration, boolean personalTrainer, boolean spaAccess) {
        super(memberName, membershipType, duration);
        PersonalTrainer = personalTrainer;
        SpaAccess = spaAccess;
    }

    @Override
    public long calculateMembershipFee() {
        if (this.PersonalTrainer && this.SpaAccess) {
            return this.PersonalTrainerFee + this.SpaAccessFee + super.calculateMembershipFee();
        } else if (!this.PersonalTrainer && this.SpaAccess) {
            return this.SpaAccessFee + super.calculateMembershipFee();
        } else if (this.PersonalTrainer && !this.SpaAccess) {
            return this.PersonalTrainerFee + super.calculateMembershipFee();
        } else {
            return super.calculateMembershipFee();
        }

    }
}