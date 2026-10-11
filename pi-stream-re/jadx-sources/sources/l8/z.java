package l8;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import java.util.function.BiConsumer;
import msr.pistream.app.R;
import msr.pistream.app.ui.home.screens.MainActivity;

/* loaded from: classes.dex */
public final class z implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7035a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f7036b;

    public /* synthetic */ z(MainActivity mainActivity, int i10) {
        this.f7035a = i10;
        this.f7036b = mainActivity;
    }

    public final void a() {
        int i10 = this.f7035a;
        MainActivity mainActivity = this.f7036b;
        switch (i10) {
            case 2:
                int i11 = MainActivity.f7741b0;
                mainActivity.D();
                return;
            case 3:
                int i12 = MainActivity.f7741b0;
                mainActivity.D();
                return;
            case 4:
                int i13 = MainActivity.f7741b0;
                mainActivity.D();
                return;
            default:
                int i14 = MainActivity.f7741b0;
                mainActivity.D();
                return;
        }
    }

    public final ImageView b(int i10, int i11, int i12, int i13) {
        int i14 = this.f7035a;
        MainActivity mainActivity = this.f7036b;
        switch (i14) {
            case 6:
                int i15 = MainActivity.f7741b0;
                return mainActivity.E(i10, i11, i12, i13);
            case zzaja.zze.zzg /* 7 */:
                int i16 = MainActivity.f7741b0;
                return mainActivity.E(i10, i11, i12, i13);
            case 8:
            case 9:
            case 12:
            default:
                int i17 = MainActivity.f7741b0;
                return mainActivity.E(i10, i11, i12, i13);
            case 10:
                int i18 = MainActivity.f7741b0;
                return mainActivity.E(i10, i11, i12, i13);
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                int i19 = MainActivity.f7741b0;
                return mainActivity.E(i10, i11, i12, i13);
            case 13:
                int i20 = MainActivity.f7741b0;
                return mainActivity.E(i10, i11, i12, i13);
            case 14:
                int i21 = MainActivity.f7741b0;
                return mainActivity.E(i10, i11, i12, i13);
        }
    }

    public final EditText c(String str, String str2) {
        int i10 = this.f7035a;
        MainActivity mainActivity = this.f7036b;
        switch (i10) {
            case 9:
                return MainActivity.w(mainActivity, str, str2);
            case 13:
                return MainActivity.w(mainActivity, str, str2);
            default:
                return MainActivity.w(mainActivity, str, str2);
        }
    }

    public final void d(a8.b bVar) {
        int i10 = this.f7035a;
        MainActivity mainActivity = this.f7036b;
        switch (i10) {
            case 0:
                mainActivity.e(bVar);
                return;
            case 1:
                mainActivity.e(bVar);
                return;
            case 2:
                mainActivity.e(bVar);
                return;
            case 3:
                mainActivity.e(bVar);
                return;
            case 19:
                mainActivity.e(bVar);
                return;
            case 20:
                mainActivity.e(bVar);
                return;
            case 21:
                mainActivity.e(bVar);
                return;
            default:
                mainActivity.e(bVar);
                return;
        }
    }

    public final void e(String str) {
        int i10 = this.f7035a;
        MainActivity mainActivity = this.f7036b;
        switch (i10) {
            case 6:
                try {
                    mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    return;
                } catch (Exception unused) {
                    Toast.makeText(mainActivity, "Couldn't open link", 0).show();
                    return;
                }
            default:
                try {
                    mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    return;
                } catch (Exception unused2) {
                    Toast.makeText(mainActivity, "Couldn't open link", 0).show();
                    return;
                }
        }
    }

    public final void f() {
        int i10 = this.f7035a;
        MainActivity mainActivity = this.f7036b;
        switch (i10) {
            case zzaja.zze.zzg /* 7 */:
                MainActivity.x(mainActivity);
                return;
            case 10:
                MainActivity.y(mainActivity);
                return;
            case 12:
                int i11 = MainActivity.f7741b0;
                mainActivity.K();
                return;
            default:
                int i12 = MainActivity.f7741b0;
                mainActivity.U();
                return;
        }
    }

    public final void g(String str, String str2, m8.q0 q0Var) {
        z3.e eVar = this.f7036b.C;
        eVar.getClass();
        LinearLayout linearLayout = new LinearLayout((Activity) eVar.f12044b);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(w8.i.e((Activity) eVar.f12044b, 24), w8.i.e((Activity) eVar.f12044b, 8), w8.i.e((Activity) eVar.f12044b, 24), w8.i.e((Activity) eVar.f12044b, 24));
        View view = new View((Activity) eVar.f12044b);
        view.setBackgroundColor(w8.i.f11064d);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(w8.i.e((Activity) eVar.f12044b, 38), w8.i.e((Activity) eVar.f12044b, 3));
        layoutParams.gravity = 1;
        linearLayout.addView(view, layoutParams);
        TextView l10 = w8.i.l((Activity) eVar.f12044b, str, 20, -1, 1);
        LinearLayout.LayoutParams c6 = r.f.c(l10, 17, -1, -2);
        c6.setMargins(0, w8.i.e((Activity) eVar.f12044b, 20), 0, w8.i.e((Activity) eVar.f12044b, 16));
        linearLayout.addView(l10, c6);
        EditText editText = new EditText((Activity) eVar.f12044b);
        editText.setSingleLine(true);
        editText.setText(str2);
        editText.setTextColor(-1);
        editText.setHintTextColor(w8.i.f11068h);
        editText.setTextSize(18.0f);
        editText.setGravity(17);
        editText.setBackgroundResource(R.drawable.bg_search);
        linearLayout.addView(editText, new LinearLayout.LayoutParams(-1, w8.i.e((Activity) eVar.f12044b, 54)));
        AlertDialog create = new AlertDialog.Builder((Activity) eVar.f12044b).setView(linearLayout).create();
        w8.i.k((Activity) eVar.f12044b, create, false);
        TextView i10 = w8.i.i((Activity) eVar.f12044b, "OK", true);
        i10.setTextSize(16.0f);
        i10.setMinHeight(0);
        i10.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, w8.i.e((Activity) eVar.f12044b, 50));
        layoutParams2.setMargins(0, w8.i.e((Activity) eVar.f12044b, 16), 0, 0);
        i10.setOnClickListener(new f8.d((Object) create, (Object) q0Var, editText, 6));
        linearLayout.addView(i10, layoutParams2);
        create.show();
    }

    public final void h() {
        FirebaseUser firebaseUser;
        MainActivity mainActivity = this.f7036b;
        mainActivity.P = "profile_sub";
        mainActivity.H.removeAllViews();
        mainActivity.z("Edit profile");
        LinearLayout linearLayout = mainActivity.H;
        z zVar = new z(mainActivity, 9);
        try {
            firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        } catch (Exception unused) {
            firebaseUser = null;
        }
        FirebaseUser firebaseUser2 = firebaseUser;
        String str = "PiStream User";
        String string = mainActivity.getApplicationContext().getSharedPreferences("pistream_profile", 0).getString("display_name", "PiStream User");
        if (string == null || string.trim().isEmpty()) {
            string = "PiStream User";
        }
        String str2 = "";
        if (firebaseUser2 != null) {
            if (firebaseUser2.getDisplayName() != null && !firebaseUser2.getDisplayName().trim().isEmpty()) {
                string = firebaseUser2.getDisplayName();
            }
            if (firebaseUser2.getEmail() != null) {
                str2 = firebaseUser2.getEmail();
            }
        }
        String str3 = str2;
        if (string != null && !string.trim().isEmpty()) {
            str = string;
        }
        LinearLayout w02 = r6.h0.w0(linearLayout, mainActivity);
        TextView l10 = w8.i.l(mainActivity, str.substring(0, 1).toUpperCase(), 54, -1, 1);
        l10.setGravity(17);
        l10.setBackgroundResource(R.drawable.bg_button_red);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(w8.i.e(mainActivity, 140), w8.i.e(mainActivity, 140));
        layoutParams.gravity = 1;
        layoutParams.setMargins(0, w8.i.e(mainActivity, 24), 0, w8.i.e(mainActivity, 24));
        w02.addView(l10, layoutParams);
        int i10 = w8.i.f11068h;
        TextView l11 = w8.i.l(mainActivity, "Display name", 13, i10, 1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(w8.i.e(mainActivity, 4), 0, 0, 0);
        w02.addView(l11, layoutParams2);
        EditText c6 = zVar.c("Display name", str);
        w02.addView(c6);
        if (firebaseUser2 != null) {
            TextView l12 = w8.i.l(mainActivity, "Email", 13, i10, 1);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams3.setMargins(w8.i.e(mainActivity, 4), w8.i.e(mainActivity, 20), 0, 0);
            w02.addView(l12, layoutParams3);
            EditText c10 = zVar.c("Email", str3);
            c10.setEnabled(false);
            c10.setFocusable(false);
            c10.setFocusableInTouchMode(false);
            c10.setTextColor(i10);
            c10.setAlpha(0.75f);
            w02.addView(c10);
            TextView l13 = w8.i.l(mainActivity, "Email can't be changed", 12, i10, 0);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams4.setMargins(w8.i.e(mainActivity, 4), w8.i.e(mainActivity, 8), 0, 0);
            w02.addView(l13, layoutParams4);
        }
        TextView i11 = w8.i.i(mainActivity, "Update", true);
        i11.setTextSize(16.0f);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, w8.i.e(mainActivity, 58));
        layoutParams5.setMargins(0, w8.i.e(mainActivity, 30), 0, 0);
        i11.setOnClickListener(new h8.a0(c6, zVar, mainActivity, firebaseUser2, i11, 1));
        w02.addView(i11, layoutParams5);
        if (firebaseUser2 != null) {
            TextView l14 = w8.i.l(mainActivity, "Reset password", 15, w8.i.f11065e, 1);
            l14.setGravity(17);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, w8.i.e(mainActivity, 48));
            layoutParams6.setMargins(0, w8.i.e(mainActivity, 14), 0, 0);
            l14.setOnClickListener(new h8.r(24, str3, zVar));
            w02.addView(l14, layoutParams6);
        }
    }

    public final void i() {
        int i10 = this.f7035a;
        MainActivity mainActivity = this.f7036b;
        switch (i10) {
            case 3:
                mainActivity.T.push(new m0(this, 1));
                mainActivity.M();
                return;
            default:
                mainActivity.M();
                return;
        }
    }

    public final void j(String str, String[] strArr, int i10, BiConsumer biConsumer) {
        int i11;
        GradientDrawable gradientDrawable;
        int i12;
        int i13;
        z3.e eVar = this.f7036b.C;
        eVar.getClass();
        LinearLayout linearLayout = new LinearLayout((Activity) eVar.f12044b);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(w8.i.e((Activity) eVar.f12044b, 20), w8.i.e((Activity) eVar.f12044b, 8), w8.i.e((Activity) eVar.f12044b, 20), w8.i.e((Activity) eVar.f12044b, 20));
        View view = new View((Activity) eVar.f12044b);
        int i14 = w8.i.f11064d;
        view.setBackgroundColor(i14);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(w8.i.e((Activity) eVar.f12044b, 38), w8.i.e((Activity) eVar.f12044b, 3));
        layoutParams.gravity = 1;
        linearLayout.addView(view, layoutParams);
        TextView l10 = w8.i.l((Activity) eVar.f12044b, str, 20, -1, 1);
        LinearLayout.LayoutParams c6 = r.f.c(l10, 17, -1, -2);
        int i15 = 0;
        c6.setMargins(0, w8.i.e((Activity) eVar.f12044b, 22), 0, w8.i.e((Activity) eVar.f12044b, 10));
        linearLayout.addView(l10, c6);
        LinearLayout linearLayout2 = new LinearLayout((Activity) eVar.f12044b);
        linearLayout2.setOrientation(1);
        int i16 = 14;
        linearLayout2.setBackground(w8.i.j(i14, w8.i.e((Activity) eVar.f12044b, 14)));
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
        AlertDialog create = new AlertDialog.Builder((Activity) eVar.f12044b).setView(linearLayout).create();
        w8.i.k((Activity) eVar.f12044b, create, false);
        int i17 = 0;
        while (i15 < strArr.length) {
            String str2 = strArr[i15];
            if (i15 == i10) {
                i11 = 1;
            } else {
                i11 = i17;
            }
            LinearLayout linearLayout3 = new LinearLayout((Activity) eVar.f12044b);
            linearLayout3.setOrientation(i17);
            linearLayout3.setGravity(16);
            linearLayout3.setPadding(w8.i.e((Activity) eVar.f12044b, 16), w8.i.e((Activity) eVar.f12044b, i16), w8.i.e((Activity) eVar.f12044b, 16), w8.i.e((Activity) eVar.f12044b, i16));
            if (i11 != 0) {
                gradientDrawable = w8.i.j(w8.i.f11070j, w8.i.e((Activity) eVar.f12044b, 12));
            } else {
                gradientDrawable = null;
            }
            linearLayout3.setBackground(gradientDrawable);
            linearLayout3.setClickable(true);
            linearLayout3.setForeground(new RippleDrawable(ColorStateList.valueOf(w8.i.f11070j), null, null));
            w8.i.d(linearLayout3);
            Activity activity = (Activity) eVar.f12044b;
            if (i11 != 0) {
                i12 = -1;
            } else {
                i12 = w8.i.f11067g;
            }
            linearLayout3.addView(w8.i.l(activity, str2, 16, i12, i11), new LinearLayout.LayoutParams(0, -2, 1.0f));
            View view2 = new View((Activity) eVar.f12044b);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(1);
            if (i11 != 0) {
                int i18 = w8.i.f11065e;
                gradientDrawable2.setColor(i18);
                gradientDrawable2.setStroke(w8.i.e((Activity) eVar.f12044b, 1), i18);
                i13 = 0;
            } else {
                i13 = 0;
                gradientDrawable2.setColor(0);
                gradientDrawable2.setStroke(w8.i.e((Activity) eVar.f12044b, 2), w8.i.f11068h);
            }
            view2.setBackground(gradientDrawable2);
            linearLayout3.addView(view2, new LinearLayout.LayoutParams(w8.i.e((Activity) eVar.f12044b, 20), w8.i.e((Activity) eVar.f12044b, 20)));
            linearLayout3.setOnClickListener(new h8.b0(create, biConsumer, i15, str2));
            a3.g.w(-1, -2, linearLayout2, linearLayout3);
            if (i15 < strArr.length - 1) {
                View view3 = new View((Activity) eVar.f12044b);
                view3.setBackgroundColor(w8.i.f11061a);
                linearLayout2.addView(view3, new LinearLayout.LayoutParams(-1, w8.i.e((Activity) eVar.f12044b, 1)));
            }
            i15++;
            i16 = 14;
            i17 = i13;
        }
        create.show();
    }

    public final void k() {
        int i10 = this.f7035a;
        MainActivity mainActivity = this.f7036b;
        switch (i10) {
            case 8:
                mainActivity.S();
                return;
            default:
                mainActivity.S();
                return;
        }
    }

    public final void l(String str, int[] iArr, String str2, int i10, m8.v vVar) {
        int i11 = this.f7035a;
        MainActivity mainActivity = this.f7036b;
        switch (i11) {
            case zzaja.zze.zzg /* 7 */:
                mainActivity.C.G(str, iArr, str2, i10, vVar);
                return;
            default:
                mainActivity.C.G(str, iArr, str2, i10, vVar);
                return;
        }
    }

    public final void m(String str) {
        int i10 = this.f7035a;
        MainActivity mainActivity = this.f7036b;
        switch (i10) {
            case 9:
                Toast.makeText(mainActivity, str, 0).show();
                return;
            case 13:
                Toast.makeText(mainActivity, str, 0).show();
                return;
            default:
                Toast.makeText(mainActivity, str, 0).show();
                return;
        }
    }

    public final void n() {
        int i10 = this.f7035a;
        MainActivity mainActivity = this.f7036b;
        switch (i10) {
            case 3:
                int i11 = MainActivity.f7741b0;
                mainActivity.V();
                return;
            case 20:
                int i12 = MainActivity.f7741b0;
                mainActivity.V();
                return;
            default:
                int i13 = MainActivity.f7741b0;
                mainActivity.V();
                return;
        }
    }

    public final LinearLayout o(String str, String str2) {
        int i10 = MainActivity.f7741b0;
        MainActivity mainActivity = this.f7036b;
        mainActivity.getClass();
        LinearLayout linearLayout = new LinearLayout(mainActivity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(w8.i.e(mainActivity, 20), w8.i.e(mainActivity, 18), w8.i.e(mainActivity, 20), w8.i.e(mainActivity, 18));
        linearLayout.setBackground(w8.i.j(w8.i.f11063c, w8.i.e(mainActivity, 14)));
        TextView l10 = w8.i.l(mainActivity, str, 18, -1, 1);
        TextView l11 = w8.i.l(mainActivity, str2, 14, w8.i.f11068h, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, w8.i.e(mainActivity, 8), 0, 0);
        linearLayout.addView(l10);
        linearLayout.addView(l11, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(w8.i.e(mainActivity, 24), w8.i.e(mainActivity, 24), w8.i.e(mainActivity, 24), 0);
        linearLayout.setLayoutParams(layoutParams2);
        return linearLayout;
    }
}
