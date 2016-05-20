package org.chalup.fragmentlifecycleissue;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends FragmentActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    if (savedInstanceState == null){
      getSupportFragmentManager()
          .beginTransaction()
          .add(new AutoDestructionFragment(), "ADF")
          .commitNow();
    }
  }
}
