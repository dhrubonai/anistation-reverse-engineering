package l8;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public class d extends g8.b {

    /* renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ int f6901t0 = 0;

    /* renamed from: n0, reason: collision with root package name */
    public LinearLayout f6902n0;

    /* renamed from: o0, reason: collision with root package name */
    public TextView f6903o0;

    /* renamed from: p0, reason: collision with root package name */
    public final Handler f6904p0 = new Handler(Looper.getMainLooper());

    /* renamed from: q0, reason: collision with root package name */
    public final a f6905q0 = new a(this, 0);

    /* renamed from: r0, reason: collision with root package name */
    public final b f6906r0 = new b(this);

    /* renamed from: s0, reason: collision with root package name */
    public final HashSet f6907s0 = new HashSet();

    public static String Y(long j4) {
        if (j4 < 1024) {
            return j4 + "B";
        }
        if (j4 < 1048576) {
            return (j4 / 1024) + "KB";
        }
        if (j4 < 1073741824) {
            return String.format("%.1fMB", Float.valueOf(((float) j4) / 1048576.0f));
        }
        return String.format("%.2fGB", Float.valueOf(((float) j4) / 1.0737418E9f));
    }

    @Override // androidx.fragment.app.y
    public final void A() {
        this.T = true;
        try {
            this.f6904p0.removeCallbacks(this.f6905q0);
        } catch (Exception unused) {
        }
        z7.f o = z7.f.o();
        b bVar = this.f6906r0;
        synchronized (o.f12123a) {
            o.f12123a.remove(bVar);
        }
        this.f6902n0 = null;
    }

    @Override // g8.b
    public final View W() {
        LinearLayout linearLayout = new LinearLayout(this.f4484m0);
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(this.f4484m0);
        linearLayout2.setGravity(16);
        linearLayout2.setPadding(U(24), U(54), U(24), 0);
        ImageView imageView = new ImageView(this.f4484m0);
        imageView.setImageResource(R.drawable.ic_app_header_mark);
        linearLayout2.addView(imageView, new LinearLayout.LayoutParams(U(52), U(52)));
        TextView l10 = w8.i.l(this.f4484m0, "Download", 24, -1, 1);
        l10.setIncludeFontPadding(false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(U(18), 0, 0, 0);
        linearLayout2.addView(l10, layoutParams);
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, U(112)));
        LinearLayout linearLayout3 = new LinearLayout(this.f4484m0);
        linearLayout3.setOrientation(1);
        linearLayout3.setPadding(U(16), U(8), U(16), U(40));
        a3.g.w(-1, -2, linearLayout, linearLayout3);
        TextView l11 = w8.i.l(this.f4484m0, "No downloads yet", 18, -1, 1);
        this.f6903o0 = l11;
        l11.setGravity(17);
        linearLayout3.addView(this.f6903o0, new LinearLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout4 = new LinearLayout(this.f4484m0);
        this.f6902n0 = linearLayout4;
        linearLayout4.setOrientation(1);
        linearLayout3.addView(this.f6902n0, new LinearLayout.LayoutParams(-1, -2));
        z7.f o = z7.f.o();
        b bVar = this.f6906r0;
        synchronized (o.f12123a) {
            if (!o.f12123a.contains(bVar)) {
                o.f12123a.add(bVar);
            }
        }
        z7.f.o().x(this.f4484m0);
        this.f6904p0.post(this.f6905q0);
        Z();
        return linearLayout;
    }

    public final TextView X(String str, c cVar) {
        TextView i10 = w8.i.i(this.f4484m0, str, false);
        i10.setTextSize(13.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, U(38));
        layoutParams.setMargins(U(6), 0, 0, 0);
        i10.setLayoutParams(layoutParams);
        i10.setOnClickListener(cVar);
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0485 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04cb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z() {
        /*
            Method dump skipped, instructions count: 1263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.d.Z():void");
    }
}
