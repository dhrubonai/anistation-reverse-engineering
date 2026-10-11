package f8;

import android.content.Intent;
import android.widget.LinearLayout;
import androidx.lifecycle.d0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.firebase.auth.GoogleAuthProvider;
import msr.pistream.app.ui.auth.AuthActivity;
import msr.pistream.app.ui.home.screens.MainActivity;
import msr.pistream.app.viewmodel.AuthViewModel;
import p7.a0;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements d0, c.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3935a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f3936b;

    public /* synthetic */ b(e eVar, int i10) {
        this.f3935a = i10;
        this.f3936b = eVar;
    }

    @Override // c.b
    public final void a(Object obj) {
        String str;
        c.a aVar = (c.a) obj;
        int i10 = e.J0;
        e eVar = this.f3936b;
        eVar.getClass();
        if (aVar.f1572a == -1) {
            try {
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) a0.C(aVar.f1573b).getResult(com.google.android.gms.common.api.j.class);
                if (googleSignInAccount != null && (str = googleSignInAccount.f2325c) != null) {
                    AuthViewModel authViewModel = eVar.f3948s0;
                    authViewModel.f7782d.j(b8.a.c());
                    e8.b bVar = authViewModel.f7779a;
                    bVar.getClass();
                    bVar.f3595a.signInWithCredential(GoogleAuthProvider.getCredential(str, null)).addOnCompleteListener(new x8.a(authViewModel, 1));
                    return;
                }
                return;
            } catch (com.google.android.gms.common.api.j e10) {
                eVar.f0("Google Sign-In failed: " + e10.getLocalizedMessage());
                return;
            }
        }
        eVar.f0("Google Sign-In cancelled");
    }

    @Override // androidx.lifecycle.d0
    public final void f(Object obj) {
        boolean z9;
        w.f fVar;
        int i10 = this.f3935a;
        e eVar = this.f3936b;
        switch (i10) {
            case 0:
                int i11 = e.J0;
                eVar.getClass();
                if (((Boolean) obj).booleanValue() && (fVar = eVar.f3949t0) != null) {
                    AuthActivity authActivity = (AuthActivity) fVar.f10698b;
                    int i12 = AuthActivity.f7734y;
                    authActivity.getClass();
                    Intent intent = new Intent(authActivity, (Class<?>) MainActivity.class);
                    intent.setFlags(268468224);
                    authActivity.startActivity(intent);
                    authActivity.finish();
                    return;
                }
                return;
            default:
                b8.a aVar = (b8.a) obj;
                int i13 = e.J0;
                if (eVar.q() && aVar != null) {
                    boolean z10 = false;
                    int i14 = aVar.f1545a;
                    if (i14 == 1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        eVar.e0(true);
                        LinearLayout linearLayout = eVar.D0;
                        if (linearLayout != null) {
                            linearLayout.setEnabled(false);
                        }
                    } else {
                        eVar.e0(false);
                        LinearLayout linearLayout2 = eVar.D0;
                        if (linearLayout2 != null) {
                            linearLayout2.setEnabled(true);
                        }
                    }
                    if (i14 == 3) {
                        z10 = true;
                    }
                    if (z10) {
                        eVar.f0(aVar.f1547c);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
