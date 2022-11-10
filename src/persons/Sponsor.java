package persons;

import java.util.Objects;

public class Sponsor {

    private final String sponsorFullName;

    private final float sponsorSum;
    private final boolean physical;

    public Sponsor(String sponsorFullName, float sponsorSum, boolean physical) {
        if (sponsorFullName!= null) {
            this.sponsorFullName = sponsorFullName;
        }else {
            this.sponsorFullName = "Неизвестно";
        }
        this.sponsorSum = sponsorSum;
        this.physical = physical;
    }

    public String getSponsorFullName() {
        return sponsorFullName;
    }

    public float getSponsorSum() {
        return sponsorSum;
    }

    public boolean isPhysical() {
        return physical;
    }
    public void sponsorInfo() {
        System.out.println("Спонсор: " +
                    "Имя: " + sponsorFullName + '\'' +
                    ", сумма " + sponsorSum);
        }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return Float.compare(sponsor.sponsorSum, sponsorSum) == 0 && physical == sponsor.physical && Objects.equals(sponsorFullName, sponsor.sponsorFullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sponsorFullName, sponsorSum, physical);
    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "sponsorFullName='" + sponsorFullName + '\'' +
                ", sponsorSum=" + sponsorSum +
                ", physical=" + physical +
                '}';
    }
}
