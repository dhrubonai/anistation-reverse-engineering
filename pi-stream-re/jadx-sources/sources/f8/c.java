package f8;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import k1.x;
import msr.pistream.app.viewmodel.AuthViewModel;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3937a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f3938b;

    public /* synthetic */ c(e eVar, int i10) {
        this.f3937a = i10;
        this.f3938b = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Intent a10;
        String str;
        CharSequence charSequence;
        int i10 = this.f3937a;
        e eVar = this.f3938b;
        switch (i10) {
            case 0:
                int i11 = e.J0;
                eVar.N().onBackPressed();
                return;
            case 1:
                if (!eVar.f3950u0.equals("signin")) {
                    str = "signin";
                } else {
                    str = "signup";
                }
                eVar.f3950u0 = str;
                LinearLayout linearLayout = eVar.G0;
                if (linearLayout != null && linearLayout.getChildCount() >= 3) {
                    String str2 = "Sign In";
                    if (eVar.G0.getChildAt(1) instanceof TextView) {
                        TextView textView = (TextView) eVar.G0.getChildAt(1);
                        if (eVar.f3950u0.equals("signin")) {
                            charSequence = "Sign In";
                        } else {
                            charSequence = "Sign Up";
                        }
                        textView.setText(charSequence);
                    }
                    if (eVar.G0.getChildAt(2) instanceof TextView) {
                        TextView textView2 = (TextView) eVar.G0.getChildAt(2);
                        if (eVar.f3950u0.equals("signin")) {
                            str2 = "Sign Up";
                        }
                        textView2.setText(str2);
                    }
                }
                LinearLayout linearLayout2 = eVar.f3951v0;
                if (linearLayout2 != null) {
                    linearLayout2.removeAllViews();
                    TextView l10 = w8.i.l(eVar.f4484m0, "", 14, w8.i.f11065e, 0);
                    eVar.A0 = l10;
                    l10.setVisibility(8);
                    r.f.i(-1, -2, eVar.f3951v0, eVar.A0);
                    g8.c h10 = w8.i.h(eVar.f4484m0, 48);
                    eVar.C0 = h10;
                    h10.setVisibility(8);
                    FrameLayout frameLayout = new FrameLayout(eVar.f4484m0);
                    frameLayout.addView(eVar.C0, new FrameLayout.LayoutParams(eVar.U(48), eVar.U(48), 17));
                    eVar.f3951v0.addView(frameLayout, new LinearLayout.LayoutParams(-1, eVar.U(70)));
                    if ("signup".equals(eVar.f3950u0)) {
                        eVar.Z();
                        return;
                    } else {
                        eVar.Y();
                        return;
                    }
                }
                return;
            case 2:
                String trim = eVar.f3952w0.getText().toString().trim();
                String trim2 = eVar.f3953x0.getText().toString().trim();
                String trim3 = eVar.f3954y0.getText().toString().trim();
                String trim4 = eVar.f3955z0.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    eVar.f0("Please enter a display name");
                    return;
                }
                if (TextUtils.isEmpty(trim2)) {
                    eVar.f0("Please enter your email");
                    return;
                }
                if (TextUtils.isEmpty(trim3)) {
                    eVar.f0("Please enter your password");
                    return;
                }
                if (trim3.length() < 6) {
                    eVar.f0("Password must be at least 6 characters");
                    return;
                }
                if (!trim3.equals(trim4)) {
                    eVar.f0("Passwords don't match");
                    return;
                }
                AuthViewModel authViewModel = eVar.f3948s0;
                authViewModel.f7782d.j(b8.a.c());
                e8.b bVar = authViewModel.f7779a;
                bVar.f3595a.createUserWithEmailAndPassword(trim2, trim3).continueWithTask(new x(13, bVar, trim)).addOnCompleteListener(new x8.a(authViewModel, 3));
                return;
            case 3:
                eVar.F0.setVisibility(8);
                eVar.E0.setVisibility(0);
                return;
            case 4:
                String trim5 = eVar.f3953x0.getText().toString().trim();
                if (TextUtils.isEmpty(trim5)) {
                    eVar.f0("Enter your email first to reset password");
                    return;
                }
                AuthViewModel authViewModel2 = eVar.f3948s0;
                authViewModel2.f7782d.j(b8.a.c());
                authViewModel2.f7779a.f3595a.sendPasswordResetEmail(trim5).addOnCompleteListener(new x8.a(authViewModel2, 2));
                return;
            case 5:
                String trim6 = eVar.f3953x0.getText().toString().trim();
                String trim7 = eVar.f3954y0.getText().toString().trim();
                if (TextUtils.isEmpty(trim6)) {
                    eVar.f0("Please enter your email");
                    return;
                } else {
                    if (TextUtils.isEmpty(trim7)) {
                        eVar.f0("Please enter your password");
                        return;
                    }
                    AuthViewModel authViewModel3 = eVar.f3948s0;
                    authViewModel3.f7782d.j(b8.a.c());
                    authViewModel3.f7779a.f3595a.signInWithEmailAndPassword(trim6, trim7).addOnCompleteListener(new x8.a(authViewModel3, 0));
                    return;
                }
            default:
                d5.b bVar2 = eVar.H0;
                Context applicationContext = bVar2.getApplicationContext();
                int d10 = bVar2.d();
                int i12 = d10 - 1;
                if (d10 != 0) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) bVar2.getApiOptions();
                            a5.j.f107a.a("getNoImplementationSignInIntent()", new Object[0]);
                            a10 = a5.j.a(applicationContext, googleSignInOptions);
                            a10.setAction("com.google.android.gms.auth.NO_IMPL");
                        } else {
                            a10 = a5.j.a(applicationContext, (GoogleSignInOptions) bVar2.getApiOptions());
                        }
                    } else {
                        GoogleSignInOptions googleSignInOptions2 = (GoogleSignInOptions) bVar2.getApiOptions();
                        a5.j.f107a.a("getFallbackSignInIntent()", new Object[0]);
                        a10 = a5.j.a(applicationContext, googleSignInOptions2);
                        a10.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
                    }
                    eVar.I0.a(a10);
                    return;
                }
                throw null;
        }
    }
}
