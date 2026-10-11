package msr.pistream.app.ui.auth;

import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.a;
import androidx.fragment.app.s0;
import dagger.hilt.android.AndroidEntryPoint;
import f8.g;
import f8.h;
import f8.l;
import msr.pistream.app.R;

@AndroidEntryPoint
/* loaded from: classes.dex */
public class WelcomeActivity extends g {
    public WelcomeActivity() {
        super(1);
    }

    @Override // androidx.activity.j, android.app.Activity
    public final void onBackPressed() {
        finishAffinity();
    }

    @Override // f8.g, androidx.fragment.app.b0, androidx.activity.j, w.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_PiStream);
        super.onCreate(bundle);
        Window window = getWindow();
        window.setStatusBarColor(0);
        window.getDecorView().setSystemUiVisibility(1280);
        l lVar = new l();
        lVar.f3972s0 = new h(this);
        s0 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        a aVar = new a(supportFragmentManager);
        aVar.g(android.R.id.content, lVar, "welcome_fragment", 1);
        aVar.e();
    }
}
