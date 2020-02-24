import android.content.Context;
import android.content.SharedPreferences;

public class EventInfo {
    Public static final String SP_Name = "EventDetails";
    SharedPreferences EventLocalDatabase;

    public Eventinfo(Context context){
        EventLocalDatabase = context.getSharedPreferences(SP_Name, 0);

    }

    public void StoreEventinfo(Events events){
        SharedPreferences.Editor spEditor = EventLocalDatabase.edit();
        spEditor.putString("Name", events.Name);
        spEditor.putString("Description", events.Description);
        spEditor.putString("Location", events.Location);
        spEditor.putInt("Date", events.Date);
        spEditor.putInt("Time", events.Time);
        spEditor.putInt("Week", events.Week);
        spEditor.putInt("Duration", events.Duration);
        spEditor.commit();
    }
    public Events getEvents(){
        String Name = EventLocalDatabase.getString("Name", "");
        String Location = EventLocalDatabase.getString("Location", "");
        Integer Date = EventLocalDatabase.getInt("Date", 0);

    }
}
