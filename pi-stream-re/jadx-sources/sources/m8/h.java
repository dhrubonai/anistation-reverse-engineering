package m8;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import msr.pistream.app.ui.home.screens.MainActivity;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: n, reason: collision with root package name */
    public static final String[] f7602n = {"playback-error", "download-issue", "search-not-found", "subtitle-issue", "login-sync", "request-movie", "other"};
    public static final String[] o = {"Always", "Sometimes", "Once"};

    /* renamed from: a, reason: collision with root package name */
    public final Context f7603a;

    /* renamed from: b, reason: collision with root package name */
    public final l8.z f7604b;

    /* renamed from: c, reason: collision with root package name */
    public String f7605c = "playback-error";

    /* renamed from: d, reason: collision with root package name */
    public String f7606d = "Sometimes";

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f7607e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f7608f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7609g;

    /* renamed from: h, reason: collision with root package name */
    public LinearLayout f7610h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f7611i;

    /* renamed from: j, reason: collision with root package name */
    public TextView f7612j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f7613k;

    /* renamed from: l, reason: collision with root package name */
    public File f7614l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f7615m;

    public h(MainActivity mainActivity, l8.z zVar) {
        this.f7603a = mainActivity;
        this.f7604b = zVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r23v0, types: [android.widget.LinearLayout, android.view.ViewGroup] */
    public final void a(LinearLayout linearLayout, String str, String[] strArr, String str2, a aVar) {
        char c6;
        int i10 = w8.i.f11068h;
        Context context = this.f7603a;
        int i11 = 1;
        TextView l10 = w8.i.l(context, str, 13, i10, 1);
        int i12 = -2;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i13 = 12;
        layoutParams.setMargins(w8.i.e(context, 16), w8.i.e(context, 12), w8.i.e(context, 16), 0);
        linearLayout.addView(l10, layoutParams);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        int i14 = -1;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, w8.i.e(context, 8), 0, 0);
        linearLayout.addView(horizontalScrollView, layoutParams2);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setPadding(w8.i.e(context, 16), 0, w8.i.e(context, 16), w8.i.e(context, 4));
        horizontalScrollView.addView(linearLayout2, new LinearLayout.LayoutParams(-2, -2));
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i15 = 0;
        while (i15 < length) {
            String str3 = strArr[i15];
            if (!str3.equals(str2)) {
                i14 = w8.i.f11068h;
            }
            TextView l11 = w8.i.l(context, str3, i13, i14, i11);
            l11.setPadding(w8.i.e(context, 16), w8.i.e(context, 10), w8.i.e(context, 16), w8.i.e(context, 10));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i12, i12);
            if (!arrayList.isEmpty()) {
                c6 = '\b';
                layoutParams3.setMargins(w8.i.e(context, 8), 0, 0, 0);
            } else {
                c6 = '\b';
            }
            ArrayList arrayList2 = arrayList;
            ?? r11 = linearLayout2;
            l11.setOnClickListener(new j3.u(this, aVar, str3, arrayList2, 2));
            w8.i.d(l11);
            arrayList2.add(l11);
            r11.addView(l11, layoutParams3);
            i15++;
            arrayList = arrayList2;
            linearLayout2 = r11;
            length = length;
            i11 = 1;
            i12 = -2;
            i13 = 12;
            i14 = -1;
        }
        h(str2, arrayList);
    }

    public final EditText b(LinearLayout linearLayout, String str, String str2, String str3, boolean z9) {
        int i10;
        if (z9) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        return c(linearLayout, str, str2, str3, z9, i10);
    }

    public final EditText c(LinearLayout linearLayout, String str, String str2, String str3, boolean z9, int i10) {
        int i11 = w8.i.f11068h;
        Context context = this.f7603a;
        TextView l10 = w8.i.l(context, str, 12, i11, 1);
        l10.setLetterSpacing(0.06f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(w8.i.e(context, 18), w8.i.e(context, 14), w8.i.e(context, 18), 0);
        linearLayout.addView(l10, layoutParams);
        final EditText c6 = this.f7604b.c(str2, str3);
        c6.setBackground(e(false));
        c6.setTextSize(15.0f);
        int e10 = w8.i.e(context, 16);
        if (z9) {
            c6.setSingleLine(false);
            c6.setInputType(131073);
            c6.setMinLines(i10);
            c6.setGravity(48);
            c6.setVerticalScrollBarEnabled(true);
            c6.setNestedScrollingEnabled(true);
            c6.setPadding(e10, w8.i.e(context, 14), e10, w8.i.e(context, 14));
        } else {
            c6.setSingleLine(true);
            c6.setGravity(16);
            c6.setMinHeight(w8.i.e(context, 54));
            c6.setPadding(e10, w8.i.e(context, 12), e10, w8.i.e(context, 12));
        }
        c6.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: m8.c
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                c6.setBackground(h.this.e(z10));
            }
        });
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(w8.i.e(context, 14), w8.i.e(context, 8), w8.i.e(context, 14), 0);
        linearLayout.addView(c6, layoutParams2);
        return c6;
    }

    public final String d() {
        File f10 = f();
        if (!this.f7608f) {
            if (f10 == null) {
                return "No crash log found";
            }
            return "Available: " + f10.getName();
        }
        if (f10 == null) {
            return "No crash log found";
        }
        return "Will send: " + f10.getName();
    }

    public final GradientDrawable e(boolean z9) {
        int argb;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(w8.i.f11062b);
        Context context = this.f7603a;
        gradientDrawable.setCornerRadius(w8.i.e(context, 14));
        int e10 = w8.i.e(context, 1);
        if (z9) {
            argb = w8.i.f11065e;
        } else {
            argb = Color.argb(30, 255, 255, 255);
        }
        gradientDrawable.setStroke(e10, argb);
        return gradientDrawable;
    }

    public final File f() {
        try {
            File[] d10 = w8.d.d(this.f7603a);
            if (d10.length == 0) {
                return null;
            }
            File file = d10[0];
            for (File file2 : d10) {
                if (file2.lastModified() > file.lastModified()) {
                    file = file2;
                }
            }
            return file;
        } catch (Exception unused) {
            return null;
        }
    }

    public final LinearLayout g(LinearLayout linearLayout, String str) {
        Context context = this.f7603a;
        linearLayout.addView(r6.h0.G0(context, str), r6.h0.H0(context));
        LinearLayout E0 = r6.h0.E0(context);
        E0.setPadding(0, w8.i.e(context, 6), 0, w8.i.e(context, 16));
        linearLayout.addView(E0, r6.h0.F0());
        return E0;
    }

    public final void h(String str, List list) {
        int i10;
        int i11;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TextView textView = (TextView) it.next();
            boolean equals = textView.getText().toString().equals(str);
            if (equals) {
                i10 = Color.argb(70, 14, 165, 233);
            } else {
                i10 = w8.i.f11064d;
            }
            textView.setBackground(w8.i.j(i10, w8.i.e(this.f7603a, 16)));
            if (equals) {
                i11 = -1;
            } else {
                i11 = w8.i.f11068h;
            }
            textView.setTextColor(i11);
        }
    }

    public final void i() {
        Context context;
        String str;
        LinearLayout linearLayout = this.f7610h;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        ArrayList arrayList = this.f7607e;
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            context = this.f7603a;
            if (!hasNext) {
                break;
            }
            Uri uri = (Uri) it.next();
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageURI(uri);
            imageView.setBackground(w8.i.j(w8.i.f11064d, w8.i.e(context, 10)));
            imageView.setClipToOutline(true);
            int i11 = i10 + 1;
            imageView.setOnClickListener(new j3.n(this, i10, 1));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(w8.i.e(context, 64), w8.i.e(context, 64));
            if (i10 > 0) {
                layoutParams.setMargins(w8.i.e(context, 8), 0, 0, 0);
            }
            this.f7610h.addView(imageView, layoutParams);
            i10 = i11;
        }
        if (arrayList.isEmpty()) {
            TextView l10 = w8.i.l(context, "Tap below to add (max 10)", 12, w8.i.f11068h, 0);
            l10.setPadding(w8.i.e(context, 4), w8.i.e(context, 20), w8.i.e(context, 4), w8.i.e(context, 20));
            this.f7610h.addView(l10);
        }
        TextView textView = this.f7611i;
        if (textView != null) {
            if (arrayList.isEmpty()) {
                str = "No screenshots yet (max 10)";
            } else {
                str = arrayList.size() + " / 10 — tap a photo to remove";
            }
            textView.setText(str);
        }
    }
}
