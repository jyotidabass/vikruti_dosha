package com.dozy.ayurvedaconverter;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Calc_Time_Frag extends Fragment {
    Spinner sp;
    String[] time_array;
    int index;

    public Calc_Time_Frag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_calc_time, container, false);

        final EditText field1 = (EditText) view.findViewById(R.id.time_input);

        field1.addTextChangedListener(new TextWatcher() {
            TextView textView = view.findViewById(R.id.time_output);

            //             Double input = Double.parseDouble(field1.getText().toString());
            double input = 0.0;
            //            String ss = input.toString();
            String output = "";

            @Override
            public void afterTextChanged(Editable s) {
//                ss = field1.getText().toString();
//                textView.setText("After Method"+ss);
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                String x = field1.getText().toString();
                if (x.isEmpty()) {
                    x = "0.0";
                }
                if (x == "") {
                    x = "0.0";
                }

                input = Double.parseDouble(x);
                //  ss = input.toString();


                if (index > 0) {
                    if (s.length() != 0) {

                        /////////    ss=Double.valueOf(field1.getText().toString());
                        ///ssssssssssssssssssssss
//                        String output = Calculate.calculate("length", input, length_array[index]);
                        textView.setText(performCalculation(input, view));
//                        Toast.makeText(getContext(), ""+ss, Toast.LENGTH_SHORT).show();
                    } else {
                        textView.setText("");
                    }
                    //Just to check
                }
            }
        });

        //
        sp = (Spinner) view.findViewById(R.id.time_options);
        time_array = getResources().getStringArray(R.array.time_spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, time_array);
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {
                index = arg0.getSelectedItemPosition();

                String x = field1.getText().toString();
                if (x.isEmpty()) {
                    x = "0.0";
                }
                if (x == "") {
                    x = "0.0";
                }

                if (index > 0) {
                    double input = Double.parseDouble(x);

                    TextView textView = view.findViewById(R.id.time_output);

                    textView.setText(performCalculation(input, view));
                    Toast.makeText(getContext(), "You selected " + time_array[index], Toast.LENGTH_LONG).show();
                } else {
                    //Do Nothing
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                //Leave Blank
            }
        });

        return view;
    }

    public String performCalculation(Double input, View view) {
        TextView textView = view.findViewById(R.id.time_output);

        String output = Calculate.calculate("time", input, time_array[index]);
        //textView.setText(output);
        // Toast.makeText(getContext(), ""+ss, Toast.LENGTH_SHORT).show();
        return output;
    }
}