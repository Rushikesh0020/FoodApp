package info.androidhive.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

import info.androidhive.foodorderapp.Adapters.MainAdapter;
import info.androidhive.foodorderapp.Models.MainModel;
import info.androidhive.foodorderapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();

        list.add(new MainModel(R.drawable.burger1,"Mexican Chorizo Burger", "5","Chicken Burger with Extra Cheese"));
        list.add(new MainModel(R.drawable.burger2,"Beach BBQ Burger", "9","Cheesesteak Burgers with Pickled Peppers, Onions, and Cucumber"));
        list.add(new MainModel(R.drawable.pizza1,"Maxican Pizza", "12","The ever-popular Margherita - loaded with extra cheese... oodies of it!"));
        list.add(new MainModel(R.drawable.burger4,"Korean Cheesey Burger", "8","Rich ground-beef patties studded with caviar make for the ultimate in surf and turf--and decadence."));
        list.add(new MainModel(R.drawable.burger3,"Turkey Dinner Burgers", "7","Burgers with Green Tomato Mayonnaise"));

        MainAdapter adapter = new MainAdapter(list, this);
        binding.recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerView.setLayoutManager(layoutManager);
    }
}