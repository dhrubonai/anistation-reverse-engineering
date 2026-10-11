package android.support.v4.media;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.appcompat.widget.r;
import com.google.android.material.datepicker.k;
import msr.pistream.app.R;
import p7.a0;
import q6.g;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public Object f225a;

    /* renamed from: b, reason: collision with root package name */
    public Object f226b;

    /* renamed from: c, reason: collision with root package name */
    public Object f227c;

    /* renamed from: d, reason: collision with root package name */
    public Object f228d;

    /* renamed from: e, reason: collision with root package name */
    public Object f229e;

    /* renamed from: f, reason: collision with root package name */
    public Object f230f;

    /* renamed from: g, reason: collision with root package name */
    public Object f231g;

    /* renamed from: h, reason: collision with root package name */
    public Object f232h;

    public d(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(g.e0(context, k.class.getCanonicalName(), R.attr.materialCalendarStyle).data, s5.a.f9910k);
        this.f225a = r.b(context, obtainStyledAttributes.getResourceId(3, 0));
        this.f231g = r.b(context, obtainStyledAttributes.getResourceId(1, 0));
        this.f226b = r.b(context, obtainStyledAttributes.getResourceId(2, 0));
        this.f227c = r.b(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList u9 = a0.u(context, obtainStyledAttributes, 6);
        this.f228d = r.b(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f229e = r.b(context, obtainStyledAttributes.getResourceId(7, 0));
        this.f230f = r.b(context, obtainStyledAttributes.getResourceId(9, 0));
        Paint paint = new Paint();
        this.f232h = paint;
        paint.setColor(u9.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
