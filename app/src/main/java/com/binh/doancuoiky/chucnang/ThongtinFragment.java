package com.binh.doancuoiky.chucnang;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.binh.doancuoiky.MainActivity;
import com.binh.doancuoiky.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ThongtinFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ThongtinFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    ListView listView;
    ArrayList<String> arraycourse;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ThongtinFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ThongtinFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ThongtinFragment newInstance(String param1, String param2) {
        ThongtinFragment fragment = new ThongtinFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_thongtin, container, false);
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Xem thông tin");
        listView = (ListView) view.findViewById(R.id.lv);

        arraycourse = new ArrayList<>();
        arraycourse.add("1. Ngô Quốc Tuân(Nhóm trưởng)\n Mssv:2184986\n"+" Gmail: nguyenvinhbinh18@gmail.com");
        arraycourse.add("2. Nguyễn Minh Đoàn\n Mssv:2184986\n"          +" Gmail: nguyenvinhbinh18@gmail.com");
        arraycourse.add("3. Đoàn Hoài Nam\n Mssv:2184995\n"             +" Gmail: nguyenvinhbinh18@gmail.com");
        arraycourse.add("4. Nguyễn Vĩnh Bình\n Mssv:2184986\n"          +" Gmail: nguyenvinhbinh18@gmail.com");
        ArrayAdapter adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, arraycourse);
        listView.setAdapter(adapter);
        return view;
    }


}