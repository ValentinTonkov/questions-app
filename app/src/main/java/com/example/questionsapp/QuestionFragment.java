package com.example.questionsapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.questionsapp.databinding.FragmentQuestionBinding;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class QuestionFragment extends Fragment {
    private FragmentQuestionBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentQuestionBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Question question1 = new Question("Which is the capital of Bulgaria?", Arrays.asList("Sofia", "Varna", "Bourgas", "Plovdiv"), 0);

        /*
        List<Question> questions = new LinkedList<>();
        questions.add(new Question("Which is the capital of Bulgaria?", Arrays.asList("Sofia", "Varna", "Bourgas", "Plovdiv"), 0));
      */

    }
}