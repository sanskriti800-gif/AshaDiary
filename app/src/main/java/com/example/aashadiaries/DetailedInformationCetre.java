package com.example.aashadiaries;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class DetailedInformationCetre extends YouTubeBaseActivity {

    String api_key = "AIzaSyDOUppRz21to7q_bEbGTtKfOmTtG88DWzg";

    YouTubePlayerView ytPlayer;
    TextView description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_information_cetre);

        Intent intent = getIntent();
        String YTLink = intent.getStringExtra("YTLink");

        description = findViewById(R.id.description);

        description.setText(YTLink);

        // Initialize and assign variable
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);

        // Set Home selected
        bottomNavigationView.setSelectedItemId(R.id.info);

        // Perform item selected listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId())
                {
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.info:
                        startActivity(new Intent(getApplicationContext(),Info.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext(),profile.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

//        ytPlayer = (YouTubePlayerView) findViewById(R.id.youTubePlayerView);
////        description = findViewById(R.id.description);
//
//        ytPlayer.initialize(api_key, new YouTubePlayer.OnInitializedListener() {
//            @Override
//            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
//                youTubePlayer.loadVideo(YTLink);
////                youTubePlayer.play();
//            }
//
//            @Override
//            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
//                Toast.makeText(DetailedInformationCetre.this, "Video Player Failed", Toast.LENGTH_SHORT).show();
//            }
//        });

//        description.setText(new StringBuilder().append("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus sed nisl ut lorem viverra aliquam mollis a tellus. Ut ac felis erat. Nunc commodo pharetra sagittis. Praesent sodales dictum metus quis pretium. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi pretium diam at felis pulvinar posuere.\n").append("\n").append("Aliquam ut dapibus dui. Nam a nunc convallis, placerat lorem ac, fringilla arcu. Proin eget massa eu nisl accumsan facilisis sit amet vel libero. Nullam dictum arcu nisl. Curabitur bibendum quis erat in convallis. Praesent quis lacinia ex. Donec ac dolor rhoncus, eleifend purus non, mollis ex. In nec fermentum lectus. Nam ipsum tortor, commodo non molestie at, tempus et est. Fusce aliquet erat eu dui malesuada, vitae ornare augue dignissim. Fusce dignissim sed est sed dignissim. Nam pulvinar tincidunt nisi nec pharetra. Pellentesque sit amet tortor cursus, lacinia nibh eget, ultrices mi. Donec ornare finibus tortor.\n").append("\n").append("Suspendisse non libero in mauris placerat maximus vel vitae leo. Nunc sem lorem, aliquet sed ipsum sit amet, consequat vulputate purus. Maecenas auctor purus nec ultrices consectetur. Pellentesque porta augue sed sollicitudin mollis. Mauris ornare lorem a odio mollis egestas. Nullam vel mattis ex, nec finibus massa. Sed vehicula mollis est, vitae eleifend est tempus et. Curabitur sem leo, ornare et varius id, sagittis ut arcu. Suspendisse nisi urna, posuere nec gravida at, auctor nec nisi. Nunc elementum diam maximus, dapibus ipsum in, semper diam. Vestibulum non tempor nulla.").toString());
    }
}