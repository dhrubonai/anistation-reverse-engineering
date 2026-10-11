package h8;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.c3;
import f.m0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import msr.pistream.app.R;
import r6.h0;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final j f5120a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f5121b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.fragment.app.b0 f5122c;

    /* renamed from: e, reason: collision with root package name */
    public String f5124e;

    /* renamed from: g, reason: collision with root package name */
    public int f5126g;

    /* renamed from: l, reason: collision with root package name */
    public LinearLayout f5131l;

    /* renamed from: m, reason: collision with root package name */
    public LinearLayout f5132m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f5133n;
    public LinearLayout o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f5134p;

    /* renamed from: q, reason: collision with root package name */
    public LinearLayout f5135q;

    /* renamed from: r, reason: collision with root package name */
    public LinearLayout f5136r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5137s;

    /* renamed from: v, reason: collision with root package name */
    public TextView f5140v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f5141w;

    /* renamed from: x, reason: collision with root package name */
    public AlertDialog f5142x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f5143y;

    /* renamed from: d, reason: collision with root package name */
    public int f5123d = -1;

    /* renamed from: f, reason: collision with root package name */
    public String f5125f = "Original";

    /* renamed from: h, reason: collision with root package name */
    public int f5127h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final HashSet f5128i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    public List f5129j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f5130k = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public String f5138t = "";

    /* renamed from: u, reason: collision with root package name */
    public final HashSet f5139u = new HashSet();

    public x(j jVar) {
        this.f5120a = jVar;
        Context context = jVar.getContext();
        this.f5121b = context;
        this.f5122c = jVar.f5044b.d();
        this.f5126g = com.bumptech.glide.c.v(context);
    }

    public static ArrayList c(int i10, ArrayList arrayList) {
        String str;
        String str2;
        ArrayList arrayList2 = new ArrayList();
        if (i10 != 2 && arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a8.g gVar = (a8.g) it.next();
                if (gVar != null && (str = gVar.f195a) != null && !str.isEmpty()) {
                    if (i10 == 1) {
                        String str3 = "";
                        String str4 = gVar.f196b;
                        if (str4 == null) {
                            str2 = "";
                        } else {
                            str2 = str4.toLowerCase();
                        }
                        String str5 = gVar.f197c;
                        if (str5 != null) {
                            str3 = str5.toLowerCase();
                        }
                        if (!str2.startsWith("en") && !str3.contains("english")) {
                        }
                    }
                    arrayList2.add(gVar);
                }
            }
        }
        return arrayList2;
    }

    public final TextView a(String str, boolean z9, View.OnClickListener onClickListener) {
        int i10;
        if (z9) {
            i10 = -1;
        } else {
            i10 = w8.i.f11067g;
        }
        Context context = this.f5121b;
        TextView l10 = w8.i.l(context, str, 14, i10, z9 ? 1 : 0);
        l10.setGravity(17);
        l10.setPadding(w8.i.e(context, 16), w8.i.e(context, 9), w8.i.e(context, 16), w8.i.e(context, 9));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(w8.i.e(context, 100));
        if (z9) {
            gradientDrawable.setColor(w8.i.f11070j);
            gradientDrawable.setStroke(w8.i.e(context, 1), w8.i.f11065e);
        } else {
            gradientDrawable.setColor(w8.i.f11064d);
        }
        l10.setBackground(gradientDrawable);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, w8.i.e(context, 8), w8.i.e(context, 4));
        l10.setLayoutParams(layoutParams);
        l10.setFocusable(true);
        w8.i.d(l10);
        l10.setOnClickListener(onClickListener);
        return l10;
    }

    public final ArrayList b() {
        String str;
        ArrayList<a8.e> arrayList = this.f5130k;
        if (arrayList == null) {
            arrayList = new ArrayList();
        } else if (this.f5123d >= 0) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a8.e eVar = (a8.e) it.next();
                int[] D0 = h0.D0(eVar);
                if (D0 != null && D0[0] == this.f5123d) {
                    arrayList2.add(eVar);
                }
            }
            arrayList = arrayList2;
        }
        ArrayList arrayList3 = new ArrayList();
        for (a8.e eVar2 : arrayList) {
            if (eVar2 != null) {
                String str2 = this.f5138t;
                if (str2 != null && !str2.isEmpty()) {
                    String str3 = eVar2.f183a;
                    if (str3 != null) {
                        str = str3.toLowerCase();
                    } else {
                        str = "";
                    }
                    String valueOf = String.valueOf((int) eVar2.f186d);
                    if (!str.contains(this.f5138t) && !valueOf.equals(this.f5138t)) {
                    }
                }
                arrayList3.add(eVar2);
            }
        }
        if (this.f5137s) {
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList3.size();
            while (true) {
                size--;
                if (size >= 0) {
                    arrayList4.add((a8.e) arrayList3.get(size));
                } else {
                    return arrayList4;
                }
            }
        } else {
            return arrayList3;
        }
    }

    public final ImageView d(int i10, String str) {
        Context context = this.f5121b;
        ImageView imageView = new ImageView(context);
        try {
            imageView.setImageResource(i10);
            imageView.setColorFilter(w8.i.f11068h);
        } catch (Exception unused) {
        }
        imageView.setContentDescription(str);
        imageView.setFocusable(true);
        w8.i.d(imageView);
        int e10 = w8.i.e(context, 40);
        imageView.setPadding(w8.i.e(context, 9), w8.i.e(context, 9), w8.i.e(context, 9), w8.i.e(context, 9));
        imageView.setMinimumWidth(e10);
        imageView.setMinimumHeight(e10);
        return imageView;
    }

    public final LinearLayout.LayoutParams e() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        Context context = this.f5121b;
        layoutParams.setMargins(0, w8.i.e(context, 16), 0, w8.i.e(context, 8));
        return layoutParams;
    }

    public final void f() {
        String str;
        String str2;
        boolean z9;
        LinearLayout linearLayout = this.f5132m;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.addAll(this.f5129j);
        Iterator it = arrayList.iterator();
        while (true) {
            String str3 = "Original";
            if (!it.hasNext()) {
                break;
            }
            a8.d dVar = (a8.d) it.next();
            if (dVar == null) {
                str2 = null;
            } else {
                str2 = dVar.f180a;
            }
            if (dVar != null && ((str3 = dVar.f181b) == null || str3.isEmpty())) {
                str3 = "Dub";
            }
            if ((str2 == null && this.f5124e == null) || (str2 != null && str2.equals(this.f5124e))) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f5132m.addView(a(str3, z9, new f8.d(this, str2, str3, 2)));
        }
        TextView textView = this.f5133n;
        if (textView != null) {
            if (this.f5129j.isEmpty()) {
                str = "Original audio only";
            } else if (this.f5125f.equals("Original")) {
                str = "Original audio";
            } else {
                str = "Audio: " + this.f5125f;
            }
            textView.setText(str);
        }
    }

    public final void g() {
        String str;
        boolean z9;
        LinearLayout linearLayout = this.o;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        String[] strArr = {"AUTO", "1080p", "720p", "480p", "360p"};
        int i10 = 0;
        int[] iArr = {0, 1080, 720, 480, 360};
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = iArr[i11];
            String str2 = strArr[i11];
            if ((i12 == 0 && this.f5126g <= 0) || (i12 > 0 && this.f5126g == i12)) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.o.addView(a(str2, z9, new u(this, i12, i10)));
        }
        TextView textView = this.f5134p;
        if (textView != null) {
            if (this.f5126g <= 0) {
                str = "Best available per episode";
            } else {
                str = "Closest to " + this.f5126g + "p per episode (saved as default: " + com.bumptech.glide.c.v(this.f5121b) + "p)";
            }
            textView.setText(str);
        }
    }

    public final void h(List list) {
        boolean z9;
        String n9;
        boolean z10;
        LinearLayout linearLayout = this.f5131l;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        LinearLayout linearLayout2 = this.f5131l;
        int i10 = 0;
        if (this.f5123d < 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        linearLayout2.addView(a("All", z9, new r(3, this, list)));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (intValue == 0) {
                n9 = "Movie";
            } else {
                n9 = a3.g.n("S", intValue);
            }
            LinearLayout linearLayout3 = this.f5131l;
            if (this.f5123d == intValue) {
                z10 = true;
            } else {
                z10 = false;
            }
            linearLayout3.addView(a(n9, z10, new v(this, intValue, list, i10)));
        }
    }

    public final void i() {
        Context context;
        int i10;
        boolean z9;
        String str;
        String str2;
        int i11;
        LinearLayout linearLayout = this.f5136r;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        Iterator it = b().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            context = this.f5121b;
            if (!hasNext) {
                break;
            }
            a8.e eVar = (a8.e) it.next();
            String str3 = eVar.f184b;
            if (str3 != null && this.f5128i.contains(str3)) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            String str4 = eVar.f184b;
            if (str4 != null && this.f5139u.contains(str4)) {
                z9 = true;
            } else {
                z9 = false;
            }
            StringBuilder sb = new StringBuilder();
            int i12 = (int) eVar.f186d;
            if (i12 > 0) {
                str = String.valueOf(i12);
            } else {
                String str5 = eVar.f183a;
                if (str5 != null && !str5.trim().isEmpty()) {
                    str = str5.trim();
                    if (str.length() > 8) {
                        str = str.substring(0, 8);
                    }
                } else {
                    str = "?";
                }
            }
            sb.append(str);
            if (z9) {
                str2 = " ✓";
            } else {
                str2 = "";
            }
            sb.append(str2);
            String sb2 = sb.toString();
            if (i10 != 0) {
                i11 = -1;
            } else {
                i11 = w8.i.f11067g;
            }
            TextView l10 = w8.i.l(context, sb2, 15, i11, i10);
            l10.setGravity(17);
            l10.setSingleLine(true);
            l10.setFocusable(true);
            w8.i.d(l10);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(w8.i.e(context, 100));
            if (i10 != 0) {
                gradientDrawable.setColor(w8.i.f11065e);
            } else {
                gradientDrawable.setColor(w8.i.f11064d);
            }
            l10.setBackground(gradientDrawable);
            int e10 = w8.i.e(context, 18);
            l10.setPadding(e10, w8.i.e(context, 10), e10, w8.i.e(context, 10));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, w8.i.e(context, 8), 0);
            l10.setLayoutParams(layoutParams);
            l10.setMinWidth(w8.i.e(context, 52));
            l10.setOnClickListener(new r(2, this, eVar));
            this.f5136r.addView(l10);
        }
        if (this.f5136r.getChildCount() == 0) {
            TextView l11 = w8.i.l(context, "No episodes match", 14, w8.i.f11068h, 0);
            l11.setPadding(w8.i.e(context, 4), w8.i.e(context, 10), 0, w8.i.e(context, 10));
            r.f.i(-2, -2, this.f5136r, l11);
        }
    }

    public final void j() {
        boolean z9;
        LinearLayout linearLayout = this.f5135q;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        String[] strArr = {"All subs", "English only", "No subs"};
        for (int i10 = 0; i10 < 3; i10++) {
            LinearLayout linearLayout2 = this.f5135q;
            String str = strArr[i10];
            int i11 = 1;
            if (this.f5127h == i10) {
                z9 = true;
            } else {
                z9 = false;
            }
            linearLayout2.addView(a(str, z9, new u(this, i10, i11)));
        }
    }

    public final void k() {
        String str;
        String str2;
        String str3;
        j jVar = this.f5120a;
        List c6 = jVar.c();
        if (c6 != null) {
            ArrayList arrayList = (ArrayList) c6;
            if (!arrayList.isEmpty()) {
                a8.b b10 = jVar.b();
                HashSet hashSet = this.f5128i;
                hashSet.clear();
                this.f5123d = -1;
                this.f5137s = false;
                this.f5138t = "";
                this.f5124e = null;
                this.f5125f = "Original";
                this.f5129j = new ArrayList();
                this.f5143y = false;
                Context context = this.f5121b;
                this.f5126g = com.bumptech.glide.c.v(context);
                this.f5130k = arrayList;
                if (!arrayList.isEmpty() && ((a8.e) arrayList.get(0)).f184b != null) {
                    hashSet.add(((a8.e) arrayList.get(0)).f184b);
                }
                HashSet hashSet2 = this.f5139u;
                hashSet2.clear();
                try {
                    Iterator it = z7.d.a(context).iterator();
                    while (it.hasNext()) {
                        z7.b bVar = (z7.b) it.next();
                        if (bVar != null && bVar.f12101u == 4 && (str3 = bVar.f12085d) != null) {
                            hashSet2.add(str3);
                        }
                    }
                } catch (Exception unused) {
                }
                ScrollView scrollView = new ScrollView(context);
                scrollView.setVerticalScrollBarEnabled(false);
                scrollView.setFillViewport(true);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setPadding(w8.i.e(context, 20), w8.i.e(context, 10), w8.i.e(context, 20), w8.i.e(context, 28));
                scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
                View view = new View(context);
                int i10 = w8.i.f11064d;
                view.setBackground(w8.i.j(i10, w8.i.e(context, 3)));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(w8.i.e(context, 40), w8.i.e(context, 4));
                layoutParams.gravity = 1;
                layoutParams.setMargins(0, 0, 0, w8.i.e(context, 14));
                linearLayout.addView(view, layoutParams);
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                linearLayout2.setGravity(16);
                linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setBackground(w8.i.j(i10, w8.i.e(context, 8)));
                imageView.setClipToOutline(true);
                try {
                    com.bumptech.glide.o d10 = com.bumptech.glide.b.d(context);
                    if (b10 != null) {
                        str2 = b10.f170c;
                    } else {
                        str2 = null;
                    }
                    ((com.bumptech.glide.l) ((com.bumptech.glide.l) d10.n(str2).j()).i(120, 168)).x(imageView);
                } catch (Exception unused2) {
                }
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(w8.i.e(context, 44), w8.i.e(context, 62));
                layoutParams2.setMargins(0, 0, w8.i.e(context, 12), 0);
                linearLayout2.addView(imageView, layoutParams2);
                LinearLayout linearLayout3 = new LinearLayout(context);
                linearLayout3.setOrientation(1);
                linearLayout2.addView(linearLayout3, new LinearLayout.LayoutParams(0, -2, 1.0f));
                int i11 = w8.i.f11065e;
                r.f.i(-1, -2, linearLayout3, w8.i.l(context, "DOWNLOAD EPISODES", 11, i11, 1));
                if (b10 == null || (str = b10.f168a) == null) {
                    str = "";
                }
                TextView l10 = w8.i.l(context, str, 16, -1, 1);
                l10.setSingleLine(true);
                l10.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout3.addView(l10, new LinearLayout.LayoutParams(-1, -2));
                String str4 = arrayList.size() + " episodes";
                int i12 = w8.i.f11068h;
                linearLayout3.addView(w8.i.l(context, str4, 13, i12, 0), new LinearLayout.LayoutParams(-1, -2));
                ArrayList L0 = h0.L0(c6);
                if (L0.size() > 1) {
                    linearLayout.addView(w8.i.l(context, "SEASON", 12, i12, 1), e());
                    HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
                    horizontalScrollView.setHorizontalScrollBarEnabled(false);
                    LinearLayout linearLayout4 = new LinearLayout(context);
                    this.f5131l = linearLayout4;
                    linearLayout4.setOrientation(0);
                    horizontalScrollView.addView(this.f5131l, new LinearLayout.LayoutParams(-2, -2));
                    linearLayout.addView(horizontalScrollView, new LinearLayout.LayoutParams(-1, -2));
                    h(L0);
                } else {
                    this.f5131l = null;
                }
                linearLayout.addView(w8.i.l(context, "AUDIO", 12, i12, 1), e());
                TextView l11 = w8.i.l(context, "Loading audio…", 13, i12, 0);
                this.f5133n = l11;
                linearLayout.addView(l11, new LinearLayout.LayoutParams(-1, -2));
                HorizontalScrollView horizontalScrollView2 = new HorizontalScrollView(context);
                horizontalScrollView2.setHorizontalScrollBarEnabled(false);
                LinearLayout linearLayout5 = new LinearLayout(context);
                this.f5132m = linearLayout5;
                linearLayout5.setOrientation(0);
                horizontalScrollView2.addView(this.f5132m, new LinearLayout.LayoutParams(-2, -2));
                linearLayout.addView(horizontalScrollView2, new LinearLayout.LayoutParams(-1, -2));
                f();
                linearLayout.addView(w8.i.l(context, "QUALITY", 12, i12, 1), e());
                LinearLayout linearLayout6 = new LinearLayout(context);
                this.o = linearLayout6;
                linearLayout6.setOrientation(0);
                a3.g.w(-1, -2, linearLayout, this.o);
                TextView l12 = w8.i.l(context, "", 13, i12, 0);
                this.f5134p = l12;
                linearLayout.addView(l12, new LinearLayout.LayoutParams(-1, -2));
                g();
                linearLayout.addView(w8.i.l(context, "SUBTITLES", 12, i12, 1), e());
                LinearLayout linearLayout7 = new LinearLayout(context);
                this.f5135q = linearLayout7;
                linearLayout7.setOrientation(0);
                linearLayout.addView(this.f5135q, new LinearLayout.LayoutParams(-1, -2));
                j();
                LinearLayout linearLayout8 = new LinearLayout(context);
                linearLayout8.setOrientation(0);
                linearLayout8.setGravity(16);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams3.setMargins(0, w8.i.e(context, 6), 0, 0);
                linearLayout.addView(linearLayout8, layoutParams3);
                a3.g.v(0, -2, 1.0f, linearLayout8, w8.i.l(context, "EPISODES", 13, i12, 1));
                ImageView d11 = d(R.drawable.ic_sort, "Reverse order");
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(w8.i.e(context, 40), w8.i.e(context, 40));
                layoutParams4.setMargins(w8.i.e(context, 4), 0, 0, 0);
                linearLayout8.addView(d11, layoutParams4);
                ImageView d12 = d(R.drawable.ic_search, "Search episodes");
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(w8.i.e(context, 40), w8.i.e(context, 40));
                layoutParams5.setMargins(w8.i.e(context, 4), 0, 0, 0);
                linearLayout8.addView(d12, layoutParams5);
                LinearLayout linearLayout9 = new LinearLayout(context);
                linearLayout9.setOrientation(0);
                linearLayout9.setGravity(16);
                linearLayout9.setVisibility(8);
                LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams6.setMargins(0, w8.i.e(context, 6), 0, 0);
                linearLayout.addView(linearLayout9, layoutParams6);
                EditText editText = new EditText(context);
                editText.setHint("Search episode…");
                editText.setTextColor(-1);
                editText.setHintTextColor(i12);
                editText.setTextSize(15.0f);
                editText.setSingleLine(true);
                editText.setBackground(w8.i.j(w8.i.f11064d, w8.i.e(context, 12)));
                editText.setPadding(w8.i.e(context, 14), w8.i.e(context, 10), w8.i.e(context, 14), w8.i.e(context, 10));
                linearLayout9.addView(editText, new LinearLayout.LayoutParams(0, -2, 1.0f));
                HorizontalScrollView horizontalScrollView3 = new HorizontalScrollView(context);
                horizontalScrollView3.setHorizontalScrollBarEnabled(false);
                LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams7.setMargins(0, w8.i.e(context, 10), 0, 0);
                linearLayout.addView(horizontalScrollView3, layoutParams7);
                LinearLayout linearLayout10 = new LinearLayout(context);
                this.f5136r = linearLayout10;
                linearLayout10.setOrientation(0);
                this.f5136r.setGravity(16);
                horizontalScrollView3.addView(this.f5136r, new LinearLayout.LayoutParams(-2, -2));
                i();
                d11.setOnClickListener(new r(0, this, d11));
                d12.setOnClickListener(new f8.d((Object) this, (Object) linearLayout9, editText, 1));
                editText.addTextChangedListener(new c3(this, 2));
                LinearLayout linearLayout11 = new LinearLayout(context);
                linearLayout11.setOrientation(0);
                linearLayout11.setGravity(16);
                LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams8.setMargins(0, w8.i.e(context, 8), 0, 0);
                linearLayout.addView(linearLayout11, layoutParams8);
                TextView l13 = w8.i.l(context, "Select all", 13, i11, 1);
                l13.setPadding(w8.i.e(context, 4), w8.i.e(context, 8), w8.i.e(context, 8), w8.i.e(context, 8));
                w8.i.b(l13);
                a3.g.v(0, -2, 1.0f, linearLayout11, l13);
                TextView l14 = w8.i.l(context, "Unselect all", 13, i12, 1);
                l14.setGravity(8388613);
                l14.setPadding(w8.i.e(context, 8), w8.i.e(context, 8), w8.i.e(context, 4), w8.i.e(context, 8));
                w8.i.b(l14);
                final int i13 = 0;
                linearLayout11.addView(l14, new LinearLayout.LayoutParams(0, -2, 1.0f));
                l13.setOnClickListener(new View.OnClickListener(this) { // from class: h8.s

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ x f5099b;

                    {
                        this.f5099b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i14 = i13;
                        x xVar = this.f5099b;
                        switch (i14) {
                            case 0:
                                Iterator it2 = xVar.b().iterator();
                                while (it2.hasNext()) {
                                    String str5 = ((a8.e) it2.next()).f184b;
                                    if (str5 != null) {
                                        xVar.f5128i.add(str5);
                                    }
                                }
                                xVar.i();
                                xVar.l();
                                return;
                            case 1:
                                Iterator it3 = xVar.b().iterator();
                                while (it3.hasNext()) {
                                    String str6 = ((a8.e) it3.next()).f184b;
                                    if (str6 != null) {
                                        xVar.f5128i.remove(str6);
                                    }
                                }
                                xVar.i();
                                xVar.l();
                                return;
                            default:
                                xVar.f5142x.dismiss();
                                return;
                        }
                    }
                });
                final int i14 = 1;
                l14.setOnClickListener(new View.OnClickListener(this) { // from class: h8.s

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ x f5099b;

                    {
                        this.f5099b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i142 = i14;
                        x xVar = this.f5099b;
                        switch (i142) {
                            case 0:
                                Iterator it2 = xVar.b().iterator();
                                while (it2.hasNext()) {
                                    String str5 = ((a8.e) it2.next()).f184b;
                                    if (str5 != null) {
                                        xVar.f5128i.add(str5);
                                    }
                                }
                                xVar.i();
                                xVar.l();
                                return;
                            case 1:
                                Iterator it3 = xVar.b().iterator();
                                while (it3.hasNext()) {
                                    String str6 = ((a8.e) it3.next()).f184b;
                                    if (str6 != null) {
                                        xVar.f5128i.remove(str6);
                                    }
                                }
                                xVar.i();
                                xVar.l();
                                return;
                            default:
                                xVar.f5142x.dismiss();
                                return;
                        }
                    }
                });
                TextView l15 = w8.i.l(context, "", 13, i12, 0);
                this.f5140v = l15;
                LinearLayout.LayoutParams c10 = r.f.c(l15, 17, -1, -2);
                c10.setMargins(0, w8.i.e(context, 12), 0, 0);
                linearLayout.addView(this.f5140v, c10);
                l();
                TextView i15 = w8.i.i(context, "Download", true);
                this.f5141w = i15;
                i15.setGravity(17);
                w8.i.d(this.f5141w);
                LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, w8.i.e(context, 52));
                layoutParams9.setMargins(0, w8.i.e(context, 8), 0, 0);
                linearLayout.addView(this.f5141w, layoutParams9);
                TextView l16 = w8.i.l(context, "Close", 15, i12, 1);
                l16.setGravity(17);
                w8.i.b(l16);
                linearLayout.addView(l16, new LinearLayout.LayoutParams(-1, w8.i.e(context, 48)));
                AlertDialog create = new AlertDialog.Builder(context, R.style.BottomSheetDialogTheme).setView(scrollView).create();
                this.f5142x = create;
                w8.i.k(context, create, true);
                final int i16 = 2;
                l16.setOnClickListener(new View.OnClickListener(this) { // from class: h8.s

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ x f5099b;

                    {
                        this.f5099b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i142 = i16;
                        x xVar = this.f5099b;
                        switch (i142) {
                            case 0:
                                Iterator it2 = xVar.b().iterator();
                                while (it2.hasNext()) {
                                    String str5 = ((a8.e) it2.next()).f184b;
                                    if (str5 != null) {
                                        xVar.f5128i.add(str5);
                                    }
                                }
                                xVar.i();
                                xVar.l();
                                return;
                            case 1:
                                Iterator it3 = xVar.b().iterator();
                                while (it3.hasNext()) {
                                    String str6 = ((a8.e) it3.next()).f184b;
                                    if (str6 != null) {
                                        xVar.f5128i.remove(str6);
                                    }
                                }
                                xVar.i();
                                xVar.l();
                                return;
                            default:
                                xVar.f5142x.dismiss();
                                return;
                        }
                    }
                });
                this.f5141w.setOnClickListener(new r(1, this, b10));
                this.f5142x.show();
                Executors.newSingleThreadExecutor().execute(new m0(18, this, b10));
            }
        }
    }

    public final void l() {
        String str;
        String str2;
        String str3;
        String str4;
        TextView textView = this.f5140v;
        if (textView == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        HashSet hashSet = this.f5128i;
        sb.append(hashSet.size());
        sb.append(" selected • ");
        if (this.f5124e == null) {
            str = "Original";
        } else {
            str = this.f5125f;
        }
        sb.append(str);
        sb.append(" • ");
        if (this.f5126g <= 0) {
            str2 = "AUTO";
        } else {
            str2 = this.f5126g + "p";
        }
        sb.append(str2);
        sb.append(" • ");
        int i10 = this.f5127h;
        if (i10 == 0) {
            str3 = "All subs";
        } else if (i10 == 1) {
            str3 = "EN subs";
        } else {
            str3 = "No subs";
        }
        sb.append(str3);
        textView.setText(sb.toString());
        TextView textView2 = this.f5141w;
        if (textView2 != null && !this.f5143y) {
            if (hashSet.isEmpty()) {
                str4 = "Download";
            } else {
                str4 = "Download " + hashSet.size();
            }
            textView2.setText(str4);
        }
    }
}
