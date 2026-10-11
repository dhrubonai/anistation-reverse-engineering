package msr.pistream.app.ui.auth;

import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.a;
import androidx.fragment.app.s0;
import dagger.hilt.android.AndroidEntryPoint;
import f8.e;
import f8.g;
import msr.pistream.app.R;
import w.f;

@AndroidEntryPoint
/* loaded from: classes.dex */
public class AuthActivity extends g {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f7734y = 0;

    /* renamed from: x, reason: collision with root package name */
    public String f7735x;

    public AuthActivity() {
        super(0);
        this.f7735x = "signin";
    }

    @Override // androidx.activity.j, android.app.Activity
    public final void onBackPressed() {
        finish();
    }

    @Override // f8.g, androidx.fragment.app.b0, androidx.activity.j, w.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_PiStream);
        super.onCreate(bundle);
        if ("signup".equals(getIntent().getStringExtra("mode"))) {
            this.f7735x = "signup";
        }
        Window window = getWindow();
        window.setStatusBarColor(0);
        window.getDecorView().setSystemUiVisibility(1280);
        e eVar = new e();
        Bundle bundle2 = new Bundle();
        bundle2.putString("mode", this.f7735x);
        eVar.S(bundle2);
        eVar.f3949t0 = new f(this, 22);
        s0 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        a aVar = new a(supportFragmentManager);
        aVar.g(android.R.id.content, eVar, "auth_fragment", 1);
        aVar.e();
    }
}
