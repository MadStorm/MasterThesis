package lukelunix.ntnumple.helpclasses;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by Luka on 07.03.2016.
 */
public class InternetConnectionAlertDialog {

    public static void showNoInternetConnectionAlertDialog(Context ctx){
        AlertDialog alertDialog = new AlertDialog.Builder(ctx).create();
        alertDialog.setTitle("No Internet connection");
        alertDialog.setMessage("There is no Internet connection, please turn it on and try again.");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();
    }
}
