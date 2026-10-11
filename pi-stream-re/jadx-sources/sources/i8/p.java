package i8;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import h8.r;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import m3.a1;
import m3.d0;
import m3.k0;
import m3.l0;
import m3.v;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class p extends d0 {

    /* renamed from: d, reason: collision with root package name */
    public final Context f5468d;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f5470f = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5469e = true;

    public p(Context context) {
        this.f5468d = context;
    }

    public static long e(String str) {
        long time;
        if (str == null) {
            return -1L;
        }
        if (str.length() >= 10) {
            try {
                Date parse = new SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(str.substring(0, 10));
                if (parse == null) {
                    return -1L;
                }
                time = (parse.getTime() - System.currentTimeMillis()) / 86400000;
                if (time < 0) {
                    return -1L;
                }
            } catch (Exception unused) {
                return -1L;
            }
        }
        return time;
    }

    public static String[] g(String str) {
        if (str != null && str.length() >= 10) {
            try {
                Locale locale = Locale.US;
                Date parse = new SimpleDateFormat("yyyy-MM-dd", locale).parse(str.substring(0, 10));
                if (parse == null) {
                    return new String[]{"", "", ""};
                }
                return new String[]{new SimpleDateFormat("MMM", locale).format(parse).toUpperCase(locale), new SimpleDateFormat("dd", locale).format(parse), new SimpleDateFormat("yyyy", locale).format(parse)};
            } catch (Exception unused) {
                return new String[]{"", "", ""};
            }
        }
        return new String[]{"", "", ""};
    }

    @Override // m3.d0
    public final int a() {
        ArrayList arrayList = this.f5470f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return arrayList.size() * 200;
    }

    @Override // m3.d0
    public final void c(a1 a1Var, int i10) {
        int size;
        String str;
        String str2;
        String str3;
        String str4;
        long j4;
        String str5;
        int i11;
        o oVar = (o) a1Var;
        ArrayList arrayList = this.f5470f;
        if (arrayList.isEmpty()) {
            size = 0;
        } else {
            size = i10 % arrayList.size();
        }
        a8.b bVar = (a8.b) arrayList.get(size);
        String[] g10 = g(bVar.M);
        boolean z9 = !g10[0].isEmpty();
        if (z9) {
            str = g10[0];
        } else {
            str = "TBA";
        }
        oVar.f5462u.setText(str);
        if (z9) {
            str2 = g10[1];
        } else {
            str2 = "?";
        }
        oVar.f5463v.setText(str2);
        if (z9) {
            str3 = g10[2];
        } else {
            str3 = "Unknown";
        }
        oVar.f5464w.setText(str3);
        String str6 = bVar.f170c;
        if (str6 != null && !str6.isEmpty()) {
            str4 = bVar.f170c;
        } else {
            str4 = bVar.A;
        }
        ImageView imageView = oVar.f5465x;
        p pVar = oVar.B;
        if (str4 != null && !str4.isEmpty()) {
            ((com.bumptech.glide.l) com.bumptech.glide.b.d(pVar.f5468d).n(str4).j()).x(imageView);
        } else {
            imageView.setImageResource(R.drawable.bg_card);
        }
        String str7 = bVar.f168a;
        String str8 = "";
        if (str7 == null) {
            str7 = "";
        }
        oVar.f5466y.setText(str7);
        boolean z10 = pVar.f5469e;
        TextView textView = oVar.f5467z;
        if (z10) {
            String str9 = bVar.f172e;
            if (str9 != null && !str9.trim().isEmpty()) {
                str8 = bVar.f172e;
            }
            textView.setText(str8);
            if (str8.isEmpty()) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            textView.setVisibility(i11);
        } else {
            textView.setVisibility(8);
        }
        if (z9) {
            j4 = e(bVar.M);
        } else {
            j4 = -1;
        }
        TextView textView2 = oVar.A;
        if (j4 >= 0) {
            if (j4 == 0) {
                str5 = "TODAY";
            } else {
                str5 = j4 + " DAYS LEFT";
            }
            textView2.setText(str5);
            textView2.setTextColor(-1);
            int i12 = w8.i.f11064d;
            Context context = pVar.f5468d;
            textView2.setBackground(w8.i.j(i12, w8.i.e(context, 6)));
            textView2.setPadding(w8.i.e(context, 8), w8.i.e(context, 4), w8.i.e(context, 8), w8.i.e(context, 4));
        } else {
            textView2.setText("Not announced");
            textView2.setTextColor(w8.i.f11068h);
            textView2.setBackground(null);
            textView2.setPadding(0, 0, 0, 0);
        }
        oVar.f7153a.setOnClickListener(new r(9, oVar, bVar));
    }

    @Override // m3.d0
    public final a1 d(RecyclerView recyclerView) {
        int i10;
        int i11;
        boolean z9 = this.f5469e;
        if (z9) {
            i10 = 300;
        } else {
            i10 = 280;
        }
        Context context = this.f5468d;
        int e10 = w8.i.e(context, i10);
        if (z9) {
            i11 = 240;
        } else {
            i11 = 170;
        }
        int e11 = w8.i.e(context, i11);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(w8.i.j(-1, w8.i.e(context, 14)));
        frameLayout.setElevation(w8.i.e(context, 4));
        frameLayout.setClipToOutline(true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(View.generateViewId());
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(16);
        linearLayout2.setPadding(w8.i.e(context, 16), 0, w8.i.e(context, 10), 0);
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(w8.i.e(context, 92), -1));
        int i12 = w8.i.f11062b;
        TextView l10 = w8.i.l(context, "", 13, i12, 1);
        l10.setTag("month");
        linearLayout2.addView(l10, new LinearLayout.LayoutParams(-2, -2));
        TextView l11 = w8.i.l(context, "", 34, i12, 1);
        l11.setTag("day");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = w8.i.e(context, 2);
        linearLayout2.addView(l11, layoutParams);
        TextView l12 = w8.i.l(context, "", 13, w8.i.f11068h, 0);
        l12.setTag("year");
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = w8.i.e(context, 4);
        linearLayout2.addView(l12, layoutParams2);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setTag("posterBox");
        linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(0, -1, 1.0f));
        ImageView imageView = new ImageView(context);
        imageView.setTag("poster");
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        frameLayout2.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        View view = new View(context);
        view.setBackgroundResource(R.drawable.gradient_bottom);
        frameLayout2.addView(view, new FrameLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout3.setPadding(w8.i.e(context, 12), 0, w8.i.e(context, 12), w8.i.e(context, 12));
        frameLayout2.addView(linearLayout3, new FrameLayout.LayoutParams(-1, -2, 80));
        TextView l13 = w8.i.l(context, "", 14, -1, 1);
        l13.setTag("title");
        l13.setMaxLines(2);
        l13.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout3.addView(l13, new LinearLayout.LayoutParams(-1, -2));
        TextView l14 = w8.i.l(context, "", 11, w8.i.f11067g, 0);
        l14.setTag("meta");
        l14.setMaxLines(1);
        l14.setEllipsize(TextUtils.TruncateAt.END);
        l14.setVisibility(8);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = w8.i.e(context, 2);
        linearLayout3.addView(l14, layoutParams3);
        TextView l15 = w8.i.l(context, "", 11, -1, 1);
        l15.setTag("badge");
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = w8.i.e(context, 6);
        linearLayout3.addView(l15, layoutParams4);
        l0 l0Var = new l0(e10, e11);
        l0Var.setMargins(0, 0, 0, 0);
        frameLayout.setLayoutParams(l0Var);
        w8.i.a(frameLayout);
        return new o(this, frameLayout);
    }

    public final void f(RecyclerView recyclerView) {
        ArrayList arrayList = this.f5470f;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size() * 100;
        k0 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            linearLayoutManager.f1225x = size;
            linearLayoutManager.f1226y = 0;
            v vVar = linearLayoutManager.f1227z;
            if (vVar != null) {
                vVar.f7388a = -1;
            }
            linearLayoutManager.k0();
            return;
        }
        recyclerView.e0(size);
    }
}
