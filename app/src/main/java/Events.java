public class Events {
    String Name, Description, Location;
    int Date, Time, Duration, Week;

    public Events (String Name, String Description, String Location, int Date, int Time, int Duration, int Week){
        this.Name = Name;
        this.Date = Date;
        this.Description = Description;
        this.Location = Location;
        this.Time = Time;
        this.Duration = Duration;
        this.Week = Week;
    }
    public Events(String Name, String Location, int Date, int time){
        this.Name = Name;
        this.Date = 0;
        this.Location = "";
        this.Time = "0000";
    }


}

