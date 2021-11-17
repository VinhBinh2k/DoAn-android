package com.binh.doancuoiky.chucnang;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.AutoText;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;

import com.binh.doancuoiky.MainActivity;
import com.binh.doancuoiky.R;
import com.binh.doancuoiky.slide.ScreenSlideActivity;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
.
 */
public class EnglishquizFragment extends Fragment {

    ExamAdapter examAdapter;
    GridView gvExam;
    ArrayList<Exam> arrayexam = new ArrayList<Exam>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("English quiz");
        return inflater.inflate(R.layout.fragment_englishquiz, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        gvExam= (GridView) getActivity().findViewById(R.id.gvQuiz);
        arrayexam.add(new Exam("Đề số 1"));
        arrayexam.add(new Exam("Đề số 2"));
        arrayexam.add(new Exam("Đề số 3"));


        examAdapter= new ExamAdapter(getActivity(), arrayexam);
        gvExam.setAdapter(examAdapter);
        gvExam.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getActivity(), ScreenSlideActivity.class);
                startActivity(i);
            }
        });

    }
}