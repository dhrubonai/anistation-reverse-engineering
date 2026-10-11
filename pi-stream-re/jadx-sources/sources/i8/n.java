package i8;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import l8.z;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5451a;

    /* renamed from: b, reason: collision with root package name */
    public final z f5452b;

    /* renamed from: f, reason: collision with root package name */
    public ImageView f5456f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f5457g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f5458h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f5459i;

    /* renamed from: j, reason: collision with root package name */
    public a8.b f5460j;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f5453c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final Handler f5454d = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    public int f5461k = 0;

    /* renamed from: e, reason: collision with root package name */
    public final g.f f5455e = new g.f(this, 12);

    public n(Context context, z zVar) {
        this.f5451a = context;
        this.f5452b = zVar;
    }

    public final void a(a8.b bVar) {
        String str;
        String str2;
        boolean z9;
        String str3;
        com.bumptech.glide.l lVar;
        String str4;
        String str5;
        this.f5460j = bVar;
        TextView textView = this.f5457g;
        if (textView != null) {
            if (bVar != null) {
                str5 = bVar.f168a;
            } else {
                str5 = "Pi Stream";
            }
            textView.setText(str5);
        }
        TextView textView2 = this.f5458h;
        String str6 = "";
        if (textView2 != null) {
            if (bVar == null || (str4 = bVar.f172e) == null) {
                str4 = "";
            }
            textView2.setText(str4);
        }
        if (bVar != null && this.f5456f != null) {
            String str7 = bVar.A;
            if (str7 == null) {
                str = "";
            } else {
                str = str7.trim();
            }
            String str8 = bVar.f170c;
            if (str8 == null) {
                str2 = "";
            } else {
                str2 = str8.trim();
            }
            boolean z10 = true;
            if (str.startsWith("http") && str.length() > 10) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!str2.startsWith("http") || str2.length() <= 10) {
                z10 = false;
            }
            if (z9) {
                str3 = str;
            } else if (!z10) {
                str3 = "";
            } else {
                str3 = str2;
            }
            if (z9 && z10 && !str.equals(str2)) {
                str6 = str2;
            }
            if (str3.isEmpty()) {
                this.f5456f.setImageResource(R.drawable.bg_card);
                this.f5456f.setAlpha(1.0f);
                return;
            }
            l4.f fVar = (l4.f) ((l4.f) new l4.f().j()).e();
            fVar.getClass();
            l4.f fVar2 = (l4.f) fVar.m(g4.i.f4432b, Boolean.TRUE);
            Context context = this.f5451a;
            com.bumptech.glide.l t9 = com.bumptech.glide.b.d(context).n(str3).t(fVar2);
            f4.d dVar = new f4.d();
            dVar.f2286a = new n4.a(260, false);
            com.bumptech.glide.l C = t9.C(dVar);
            if (!str6.isEmpty()) {
                lVar = com.bumptech.glide.b.d(context).n(str6).t(fVar2);
            } else {
                lVar = null;
            }
            C.w(lVar).x(this.f5456f);
        }
    }
}
