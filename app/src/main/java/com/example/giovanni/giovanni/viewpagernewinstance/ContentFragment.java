package com.example.giovanni.giovanni.viewpagernewinstance;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.giovanni.giovanni.R;

public class ContentFragment extends android.support.v4.app.Fragment {

    private TextView textFragment;
    private Button buttonShow;
    private int position;

    public static ContentFragment newInstance(int position) {
        ContentFragment fragment = new ContentFragment();
        fragment.setPosition(position);

        return fragment;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_content, container, false);

        textFragment = view.findViewById(R.id.text_content_fragment);

        switchPosition();

        buttonShow = view.findViewById(R.id.button_content_fragment);
        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (position) {
                    case 0:
                        Toast.makeText(getContext(), "Position 1", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(getContext(), "Position 2", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(getContext(), "Position 3", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        return view;
    }

    private void switchPosition() {
        switch (position) {
            case 0:
                textFragment.setText(R.string.fragment_1);
                textFragment.setTextColor(getResources().getColor(R.color.azzurro));
                break;
            case 1:
                textFragment.setText(R.string.fragment_2);
                textFragment.setTextColor(getResources().getColor(R.color.giada));
                break;
            case 2:
                textFragment.setText(R.string.fragment_3);
                textFragment.setTextColor(getResources().getColor(R.color.red));
                break;
        }
    }
}