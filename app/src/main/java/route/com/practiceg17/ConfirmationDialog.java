package route.com.practiceg17;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Mohamed Nabil Mohamed (Nobel) on 10/20/2018.
 * byte code SA
 * m.nabil.fci2015@gmail.com
 */
public class ConfirmationDialog extends android.support.v4.app.DialogFragment {


    public ConfirmationDialog(){

    }

    String posText;
    String negText;
    String title;
    String message;


    TextView titleTv;
    TextView messageTv;
    Button pos,neg;

    View.OnClickListener posAction;
    View.OnClickListener negAction;

    public ConfirmationDialog PosAction(View.OnClickListener posAction) {
        this.posAction = posAction;
        return this;
    }

    public ConfirmationDialog NegAction(View.OnClickListener negAction) {
        this.negAction = negAction;
        return this;
    }

    public ConfirmationDialog PosText(String posText) {
        this.posText = posText;
        return this;
    }

    public ConfirmationDialog NegText(String negText) {
        this.negText = negText;
        return this;
    }

    public ConfirmationDialog Title(String title) {
        this.title = title;
        return this;
    }

    public ConfirmationDialog Message(String message) {
        this.message = message;
        return this;
    }

    View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.confirmation_dialog,container,false);
        messageTv = view.findViewById(R.id.message);
        titleTv = view.findViewById(R.id.title);
        pos = view.findViewById(R.id.pos);
        neg = view.findViewById(R.id.neg);

        pos.setText(posText);
        neg.setText(negText);
        titleTv.setText(title);
        messageTv.setText(message);
        pos.setOnClickListener(posAction);
        neg.setOnClickListener(negAction);


        return view;
    }
}
