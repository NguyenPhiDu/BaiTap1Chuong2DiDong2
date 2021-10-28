package com.example.nhom09quanlyuser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private TextView id, name, url;
    private ImageView hinh;
    private String link;
    private CustomAdapter adapter;
    private ListView listView;
    private ArrayList<UserModel> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Starts Retrofit
        setcontrol();
        setEnvet();

    }

    private void setEnvet() {
        calApi();
        adapter = new CustomAdapter(getApplicationContext(), R.layout.listview_user, data);
        listView.setAdapter(adapter);
    }

    private void calApi() {
        final GetAPI gitHubApi = GetAPI.retrofit.create(GetAPI.class);

        //Sets up up the API call
        Call<List<UserModel>> call = gitHubApi.loadUser();
        //Runs the call on a different thread
        call.enqueue(new Callback<List<UserModel>>() {
            @Override
            //Once the call has finished
            public void onResponse(Call<List<UserModel>> call, Response<List<UserModel>> response) {
                //Gets the list of followers
                List<UserModel> userlist = response.body();
                for (int i = 0; i < userlist.size(); i++) {
                    UserModel userModel = userlist.get(i);
                    data.add(userModel);
                }

                adapter.notifyDataSetChanged();
                //Log.e("test", data.toString());

            }

            @Override
            //If the call failed
            public void onFailure(Call<List<UserModel>> call, Throwable t) {
                Log.e("test", "fail");
            }
        });
    }

    private void setcontrol() {
        listView = findViewById(R.id.lvHinhThi);
        id = findViewById(R.id.id);
        name = findViewById(R.id.ten);
        url = findViewById(R.id.link);
        hinh = findViewById(R.id.anh);

    }
}
