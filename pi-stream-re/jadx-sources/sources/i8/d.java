package i8;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import h8.r;
import java.util.ArrayList;
import java.util.List;
import m3.a1;
import m3.d0;
import m3.l0;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class d extends d0 {

    /* renamed from: d, reason: collision with root package name */
    public final Context f5420d;

    /* renamed from: e, reason: collision with root package name */
    public final c f5421e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5422f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5423g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f5424h = new ArrayList();

    public d(Context context, c cVar, boolean z9, boolean z10) {
        this.f5420d = context;
        this.f5421e = cVar;
        this.f5422f = z9;
        this.f5423g = z10;
    }

    @Override // m3.d0
    public final int a() {
        return this.f5424h.size();
    }

    @Override // m3.d0
    public final void c(a1 a1Var, int i10) {
        String str;
        String str2;
        String str3;
        b bVar = (b) a1Var;
        a8.b bVar2 = (a8.b) this.f5424h.get(i10);
        boolean z9 = this.f5423g;
        if (z9) {
            String str4 = bVar2.f174x;
            if (str4 != null && !str4.trim().isEmpty()) {
                str = bVar2.f174x;
            } else {
                String str5 = bVar2.G;
                if (str5 != null && !str5.trim().isEmpty()) {
                    str = bVar2.G;
                } else {
                    str = "Episode " + (i10 + 1);
                }
            }
        } else {
            str = bVar2.f168a;
        }
        bVar.f5416v.setText(str);
        View view = bVar.f5419y;
        TextView textView = bVar.f5417w;
        TextView textView2 = bVar.f5418x;
        if (z9) {
            textView.setTextSize(15.0f);
            textView.setText("i");
            w8.i.d(textView);
            int i11 = 5;
            textView.setOnClickListener(new r(i11, this, bVar));
            textView2.setTextSize(15.0f);
            textView2.setText("x");
            w8.i.d(textView2);
            textView2.setOnClickListener(new f8.d(this, bVar, bVar2, i11));
            view.setPivotX(0.0f);
            view.setScaleX(Math.max(0.03f, Math.min(1.0f, bVar2.J / 100.0f)));
        } else {
            String str6 = bVar2.f175y;
            if (str6 != null && !str6.isEmpty()) {
                str2 = bVar2.f175y.toUpperCase();
            } else {
                str2 = "HD";
            }
            textView.setText(str2);
            textView.setVisibility(0);
            String str7 = bVar2.C;
            if (str7 != null && !str7.trim().isEmpty()) {
                textView2.setVisibility(0);
                StringBuilder sb = new StringBuilder();
                if (bVar2.L) {
                    str3 = "";
                } else {
                    str3 = "★ ";
                }
                sb.append(str3);
                sb.append(bVar2.C);
                textView2.setText(sb.toString());
            } else {
                textView2.setVisibility(8);
            }
            textView.setOnClickListener(null);
            textView2.setOnClickListener(null);
            textView.setFocusable(false);
            textView2.setFocusable(false);
            textView.setOnFocusChangeListener(null);
            textView2.setOnFocusChangeListener(null);
            view.setScaleX(1.0f);
        }
        Context context = this.f5420d;
        com.bumptech.glide.o d10 = com.bumptech.glide.b.d(context);
        d10.getClass();
        ImageView imageView = bVar.f5415u;
        d10.l(new com.bumptech.glide.m(imageView));
        ((com.bumptech.glide.l) com.bumptech.glide.b.d(context).n(bVar2.f170c).j()).x(imageView);
        bVar.f7153a.setOnClickListener(new r(6, this, bVar2));
    }

    @Override // m3.d0
    public final a1 d(RecyclerView recyclerView) {
        int i10;
        int i11;
        int e10;
        int e11;
        int e12;
        int i12;
        int e13;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Context context = this.f5420d;
        a aVar = new a(this, context);
        boolean z9 = this.f5422f;
        if (z9) {
            i10 = w8.i.e(context, 168);
        } else {
            i10 = -1;
        }
        if (z9) {
            i11 = w8.i.e(context, 230);
        } else {
            i11 = -2;
        }
        l0 l0Var = new l0(i10, i11);
        if (z9) {
            e10 = 0;
        } else {
            e10 = w8.i.e(context, 6);
        }
        if (z9) {
            e11 = w8.i.e(context, 12);
        } else {
            e11 = w8.i.e(context, 6);
        }
        if (z9) {
            e12 = 0;
        } else {
            e12 = w8.i.e(context, 12);
        }
        l0Var.setMargins(e10, 0, e11, e12);
        aVar.setLayoutParams(l0Var);
        aVar.setBackground(w8.i.j(w8.i.f11063c, w8.i.e(context, 6)));
        aVar.setClipToOutline(true);
        w8.i.a(aVar);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        aVar.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        View view = new View(context);
        view.setBackgroundResource(R.drawable.gradient_bottom);
        aVar.addView(view, new FrameLayout.LayoutParams(-1, w8.i.e(context, 96), 80));
        TextView l10 = w8.i.l(context, "", 13, -1, 1);
        boolean z10 = this.f5423g;
        if (z10) {
            i12 = 1;
        } else {
            i12 = 2;
        }
        l10.setMaxLines(i12);
        l10.setIncludeFontPadding(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        int e14 = w8.i.e(context, 12);
        int e15 = w8.i.e(context, 12);
        if (z10) {
            e13 = w8.i.e(context, 26);
        } else {
            e13 = w8.i.e(context, 14);
        }
        layoutParams.setMargins(e14, 0, e15, e13);
        aVar.addView(l10, layoutParams);
        TextView l11 = w8.i.l(context, "", 10, -1, 1);
        l11.setGravity(17);
        l11.setPadding(w8.i.e(context, 10), w8.i.e(context, 6), w8.i.e(context, 10), w8.i.e(context, 6));
        if (z10) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(Color.argb(140, 0, 0, 0));
            l11.setBackground(gradientDrawable);
            l11.setPadding(0, 0, 0, 0);
        } else {
            l11.setBackgroundResource(R.drawable.background_rating);
            l11.setPadding(w8.i.e(context, 10), w8.i.e(context, 6), w8.i.e(context, 10), w8.i.e(context, 6));
        }
        if (z10) {
            i13 = w8.i.e(context, 30);
        } else {
            i13 = -2;
        }
        if (z10) {
            i14 = w8.i.e(context, 30);
        } else {
            i14 = -2;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i13, i14, 51);
        layoutParams2.setMargins(w8.i.e(context, 12), w8.i.e(context, 12), 0, 0);
        aVar.addView(l11, layoutParams2);
        TextView l12 = w8.i.l(context, "", 10, -1, 1);
        l12.setGravity(17);
        l12.setPadding(w8.i.e(context, 10), w8.i.e(context, 6), w8.i.e(context, 10), w8.i.e(context, 6));
        if (z10) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(1);
            gradientDrawable2.setColor(Color.argb(140, 0, 0, 0));
            l12.setBackground(gradientDrawable2);
            l12.setPadding(0, 0, 0, 0);
        } else {
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setColor(Color.argb(179, 0, 0, 0));
            gradientDrawable3.setCornerRadius(w8.i.e(context, 4));
            l12.setBackground(gradientDrawable3);
        }
        if (z10) {
            i15 = 30;
            i16 = w8.i.e(context, 30);
        } else {
            i15 = 30;
            i16 = -2;
        }
        if (z10) {
            i17 = w8.i.e(context, i15);
        } else {
            i17 = -2;
        }
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i16, i17, 53);
        layoutParams3.setMargins(0, w8.i.e(context, 12), w8.i.e(context, 12), 0);
        aVar.addView(l12, layoutParams3);
        View view2 = new View(context);
        view2.setBackgroundColor(w8.i.f11065e);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, w8.i.e(context, 2), 80);
        layoutParams4.setMargins(w8.i.e(context, 12), 0, w8.i.e(context, 12), w8.i.e(context, 12));
        if (z10) {
            i18 = 0;
        } else {
            i18 = 8;
        }
        view2.setVisibility(i18);
        aVar.addView(view2, layoutParams4);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.ic_check_circle);
        imageView2.setColorFilter(w8.i.f11066f);
        imageView2.setVisibility(8);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(w8.i.e(context, 26), w8.i.e(context, 26), 53);
        layoutParams5.setMargins(0, w8.i.e(context, 10), w8.i.e(context, 10), 0);
        aVar.addView(imageView2, layoutParams5);
        return new b(aVar, imageView, l10, l11, l12, view2, imageView2);
    }

    public final void e(List list) {
        ArrayList arrayList = this.f5424h;
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
        this.f7192a.b();
    }
}
