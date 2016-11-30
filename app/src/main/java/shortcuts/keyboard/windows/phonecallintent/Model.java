package shortcuts.keyboard.windows.phonecallintent;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import static android.R.attr.phoneNumber;

/**
 * Created by acer on 11/30/2016.
 */

public class Model {
    private String phoneNo;
    private Context context;

    public Model(Context context, String phoneNo) {
        this.context = context;
        this.phoneNo = phoneNo;
    }
    public void makeCall(){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phoneNo));
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
        }
    }
}
