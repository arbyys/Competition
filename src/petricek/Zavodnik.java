package petricek;

public class Zavodnik
{
    private String name;
    private String surname;
    private String dateOfBirth;
    private int registrationNumber;
    private int timestampStart;
    private int timestampEnd;
    private String state;
    private String race;
    private String club;
    private int wave;

    private Zavodnik(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }

    public static Zavodnik createInstance(String name, String surname)
    {
        return new Zavodnik(name, surname);
    }

    public int getRaceTime()
    {
        return timestampEnd - timestampStart;
    }

    public String getFullName()
    {
        return name + " " + surname;
    }



    // gettery, settery

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public int getTimestampStart() {
        return timestampStart;
    }

    public int getTimestampEnd() {
        return timestampEnd;
    }

    public String getState() {
        return state;
    }

    public String getRace() {
        return race;
    }

    public String getClub() {
        return club;
    }
    public String getWave() {
        return wave;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setTimestampStart(int timestampStart) {
        this.timestampStart = timestampStart;
    }

    public void setTimestampEnd(int timestampEnd) {
        this.timestampEnd = timestampEnd;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public void setWave(int wave) {
        this.wave = wave;
    }

}
