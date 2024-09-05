package FanapCamps.Gym30;

public class PremiumMembership extends GymMembership {
    public boolean PersonalTrainer;
    public long PersonalTrainerFee = 1500;
    public boolean SpaAccess;
    public long SpaAccessFee = 1000;

    //Constructors:
    public PremiumMembership(String memberName, FanapCamps.Gym30.MembershipType membershipType, int duration, boolean personalTrainer, boolean spaAccess) {
        super(memberName, membershipType, duration);
        this.PersonalTrainer = personalTrainer;
        this.SpaAccess = spaAccess;
    }

    @Override
    public long calculateMembershipFee() {
        long OptionFee = 0;
        if (this.PersonalTrainer && this.SpaAccess) {
            OptionFee = this.PersonalTrainerFee + this.SpaAccessFee;
            // return this.PersonalTrainerFee + this.SpaAccessFee + super.calculateMembershipFee();
        } else if (!this.PersonalTrainer && this.SpaAccess) {
            OptionFee = this.SpaAccessFee;
            // return this.SpaAccessFee + super.calculateMembershipFee();
        } else if (this.PersonalTrainer && !this.SpaAccess) {
            OptionFee = this.PersonalTrainerFee;
            // return this.PersonalTrainerFee + super.calculateMembershipFee();
        }
        //else {
        //    return super.calculateMembershipFee();
        // }
        return super.calculateMembershipFee() + OptionFee;
    }

    @Override
    public void DisplayDetail() {
        super.DisplayDetail();
        System.out.println("Personal Trainer is : " + (this.PersonalTrainer ? "YES" : "NO"));
        System.out.println("Spa Services is : " + (this.SpaAccess ? "YES" : "NO"));
    }
}