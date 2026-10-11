package h8;

import android.content.Context;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final j f5061a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f5062b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f5063c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f5064d;

    /* renamed from: e, reason: collision with root package name */
    public ImageView f5065e;

    /* renamed from: f, reason: collision with root package name */
    public HorizontalScrollView f5066f;

    /* renamed from: g, reason: collision with root package name */
    public LinearLayout f5067g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f5068h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f5069i;

    /* renamed from: j, reason: collision with root package name */
    public TextView f5070j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f5071k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f5072l;

    /* renamed from: m, reason: collision with root package name */
    public LinearLayout f5073m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f5074n;
    public TextView o;

    /* renamed from: p, reason: collision with root package name */
    public LinearLayout f5075p;

    /* renamed from: q, reason: collision with root package name */
    public LinearLayout f5076q;

    /* renamed from: r, reason: collision with root package name */
    public a8.b f5077r;

    public o(j jVar) {
        this.f5061a = jVar;
        this.f5062b = jVar.getContext();
    }

    public final ImageView a(int i10, int i11) {
        Context context = this.f5062b;
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i10);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setPadding(w8.i.e(context, 8), w8.i.e(context, 8), w8.i.e(context, 8), w8.i.e(context, 8));
        imageView.setColorFilter(i11);
        return imageView;
    }

    public final String b() {
        String str = this.f5077r.f176z;
        if (str != null && !str.isEmpty()) {
            String trim = this.f5077r.f176z.trim();
            if (trim.matches(".*(19|20)\\d{2}.*")) {
                return trim;
            }
        }
        return "Unknown";
    }

    public final void c(boolean z9) {
        int i10;
        int i11;
        int i12;
        int i13;
        LinearLayout linearLayout = this.f5073m;
        if (linearLayout == null) {
            return;
        }
        int i14 = 0;
        if (z9) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        linearLayout.setVisibility(i10);
        LinearLayout linearLayout2 = this.f5075p;
        if (linearLayout2 != null) {
            if (z9) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            linearLayout2.setVisibility(i13);
        }
        HorizontalScrollView horizontalScrollView = this.f5066f;
        if (horizontalScrollView != null) {
            if (z9) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            horizontalScrollView.setVisibility(i12);
        }
        TextView textView = this.f5074n;
        if (textView != null) {
            if (z9) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            textView.setVisibility(i11);
        }
        TextView textView2 = this.o;
        if (textView2 != null) {
            if (z9) {
                i14 = 8;
            }
            textView2.setVisibility(i14);
        }
    }

    public final TextView d(String str) {
        int i10 = w8.i.f11065e;
        Context context = this.f5062b;
        TextView l10 = w8.i.l(context, str, 12, i10, 1);
        l10.setGravity(17);
        l10.setIncludeFontPadding(false);
        l10.setSingleLine(true);
        l10.setPadding(w8.i.e(context, 10), w8.i.e(context, 6), w8.i.e(context, 10), w8.i.e(context, 6));
        l10.setBackgroundResource(R.drawable.bg_tag_outline);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(w8.i.e(context, 8), 0, 0, 0);
        l10.setLayoutParams(layoutParams);
        return l10;
    }
}
