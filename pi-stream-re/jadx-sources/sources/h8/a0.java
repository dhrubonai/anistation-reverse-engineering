package h8;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;

/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5010a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5011b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5012c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5014e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5015f;

    public /* synthetic */ a0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f5010a = i10;
        this.f5011b = obj;
        this.f5012c = obj2;
        this.f5013d = obj3;
        this.f5014e = obj4;
        this.f5015f = obj5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f5010a;
        Object obj = this.f5015f;
        Object obj2 = this.f5014e;
        Object obj3 = this.f5013d;
        Object obj4 = this.f5012c;
        Object obj5 = this.f5011b;
        switch (i10) {
            case 0:
                h hVar = (h) obj5;
                hVar.getClass();
                String str = ((String[]) obj3)[0];
                int i11 = ((int[]) obj2)[0];
                w7.c.a(hVar.f5039b, (a8.b) obj4, str, i11);
                hVar.f5040c.d(true);
                AlertDialog alertDialog = ((AlertDialog[]) obj)[0];
                if (alertDialog != null) {
                    alertDialog.dismiss();
                    return;
                }
                return;
            default:
                l8.z zVar = (l8.z) obj4;
                Context context = (Context) obj3;
                FirebaseUser firebaseUser = (FirebaseUser) obj2;
                TextView textView = (TextView) obj;
                String trim = ((EditText) obj5).getText().toString().trim();
                if (trim.isEmpty()) {
                    zVar.m("Name can't be empty");
                    return;
                }
                if (!trim.trim().isEmpty()) {
                    context.getApplicationContext().getSharedPreferences("pistream_profile", 0).edit().putString("display_name", trim.trim()).apply();
                }
                if (firebaseUser == null) {
                    zVar.m("Profile updated");
                    zVar.k();
                    return;
                } else {
                    textView.setEnabled(false);
                    textView.setText("Updating...");
                    firebaseUser.updateProfile(new UserProfileChangeRequest.Builder().setDisplayName(trim).build()).addOnCompleteListener(new k1.x(17, textView, zVar));
                    return;
                }
        }
    }
}
