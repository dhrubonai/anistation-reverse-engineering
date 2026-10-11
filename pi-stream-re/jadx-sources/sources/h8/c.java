package h8;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import l8.g0;
import l8.h0;
import m3.a1;
import m3.l0;
import msr.pistream.app.R;
import msr.pistream.app.viewmodel.ScheduleViewModel;

/* loaded from: classes.dex */
public final class c extends m3.d0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5024d;

    /* renamed from: e, reason: collision with root package name */
    public final List f5025e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f5026f;

    public c(Context context) {
        this.f5024d = 0;
        this.f5025e = new ArrayList();
        this.f5026f = context;
    }

    @Override // m3.d0
    public final int a() {
        int i10 = this.f5024d;
        List list = this.f5025e;
        switch (i10) {
            case 0:
                return list.size();
            default:
                return list.size();
        }
    }

    @Override // m3.d0
    public final void c(a1 a1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14 = this.f5024d;
        Object obj = this.f5026f;
        List list = this.f5025e;
        switch (i14) {
            case 0:
                b bVar = (b) a1Var;
                a8.c cVar = (a8.c) list.get(i10);
                bVar.f5017v.setText(cVar.f177a);
                TextView textView = bVar.f5018w;
                String str = cVar.f178b;
                textView.setText(str);
                if (str.isEmpty()) {
                    i13 = 8;
                } else {
                    i13 = 0;
                }
                textView.setVisibility(i13);
                Context context = (Context) obj;
                com.bumptech.glide.o d10 = com.bumptech.glide.b.d(context);
                d10.getClass();
                ImageView imageView = bVar.f5016u;
                d10.l(new com.bumptech.glide.m(imageView));
                String str2 = cVar.f179c;
                if (str2 != null && !str2.isEmpty()) {
                    ((com.bumptech.glide.l) ((com.bumptech.glide.l) com.bumptech.glide.b.d(context).n(str2).j()).e()).z(new a()).x(imageView);
                } else {
                    imageView.setImageResource(R.drawable.bg_card);
                }
                View view = bVar.f7153a;
                view.setOnClickListener(null);
                view.setClickable(false);
                view.setFocusable(false);
                return;
            default:
                Calendar calendar = (Calendar) list.get(i10);
                FrameLayout frameLayout = ((g0) a1Var).f6936u;
                frameLayout.removeAllViews();
                h0 h0Var = (h0) obj;
                String str3 = (String) h0Var.f6942s0.f7845b.d();
                h0Var.f6942s0.getClass();
                boolean equals = ScheduleViewModel.f(calendar).equals(str3);
                h0Var.f6942s0.getClass();
                String h10 = ScheduleViewModel.h(calendar);
                LinearLayout linearLayout = new LinearLayout(h0Var.f4484m0);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(17);
                linearLayout.setPadding(h0Var.U(4), h0Var.U(10), h0Var.U(4), h0Var.U(10));
                h0Var.f6942s0.getClass();
                linearLayout.setTag(ScheduleViewModel.f(calendar));
                if (equals) {
                    i11 = w8.i.f11065e;
                } else {
                    i11 = w8.i.f11064d;
                }
                linearLayout.setBackground(w8.i.j(i11, h0Var.U(14)));
                Context context2 = h0Var.f4484m0;
                int i15 = -1;
                if (equals) {
                    i12 = -1;
                } else {
                    i12 = w8.i.f11068h;
                }
                TextView l10 = w8.i.l(context2, h10, 10, i12, 1);
                l10.setGravity(17);
                l10.setLetterSpacing(0.03f);
                linearLayout.addView(l10, new LinearLayout.LayoutParams(-2, -2));
                Locale locale = Locale.US;
                TextView l11 = w8.i.l(h0Var.f4484m0, new SimpleDateFormat("d", locale).format(calendar.getTime()), 20, -1, 1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(0, h0Var.U(4), 0, 0);
                linearLayout.addView(l11, layoutParams);
                String format = new SimpleDateFormat("MMM", locale).format(calendar.getTime());
                Context context3 = h0Var.f4484m0;
                if (!equals) {
                    i15 = w8.i.f11068h;
                }
                TextView l12 = w8.i.l(context3, format, 11, i15, 0);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.setMargins(0, h0Var.U(2), 0, 0);
                linearLayout.addView(l12, layoutParams2);
                linearLayout.setOnClickListener(new r(18, h0Var, linearLayout));
                frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(h0Var.U(92), h0Var.U(98), 19));
                return;
        }
    }

    @Override // m3.d0
    public final a1 d(RecyclerView recyclerView) {
        int i10 = this.f5024d;
        Object obj = this.f5026f;
        switch (i10) {
            case 0:
                Context context = (Context) obj;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(1);
                l0 l0Var = new l0(w8.i.e(context, 96), -2);
                l0Var.setMargins(w8.i.e(context, 6), 0, w8.i.e(context, 6), 0);
                linearLayout.setLayoutParams(l0Var);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setClipToOutline(true);
                imageView.setOutlineProvider(new a6.d(this, 1));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(w8.i.e(context, 72), w8.i.e(context, 72));
                layoutParams.setMargins(0, w8.i.e(context, 4), 0, w8.i.e(context, 8));
                layoutParams.gravity = 1;
                linearLayout.addView(imageView, layoutParams);
                TextView l10 = w8.i.l(context, "", 12, -1, 1);
                l10.setGravity(17);
                l10.setMaxLines(1);
                l10.setIncludeFontPadding(false);
                r.f.i(-1, -2, linearLayout, l10);
                TextView l11 = w8.i.l(context, "", 11, w8.i.f11068h, 0);
                l11.setGravity(17);
                l11.setMaxLines(1);
                l11.setIncludeFontPadding(false);
                linearLayout.addView(l11, new LinearLayout.LayoutParams(-1, -2));
                return new b(linearLayout, imageView, l10, l11);
            default:
                h0 h0Var = (h0) obj;
                int i11 = h0.C0;
                FrameLayout frameLayout = new FrameLayout(h0Var.f4484m0);
                frameLayout.setLayoutParams(new l0(h0Var.U(100), h0Var.U(98)));
                return new g0(frameLayout);
        }
    }

    public c(h0 h0Var, ArrayList arrayList) {
        this.f5024d = 1;
        this.f5026f = h0Var;
        this.f5025e = arrayList;
    }
}
