package route.com.practiceg17;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Mohamed Nabil Mohamed (Nobel) on 10/20/2018.
 * byte code SA
 * m.nabil.fci2015@gmail.com
 */
public class GreenFragment extends Fragment {

    public GreenFragment(){

    }

    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view =inflater.inflate(R.layout.green_fragment,container,false);



        return view;
    }
}
