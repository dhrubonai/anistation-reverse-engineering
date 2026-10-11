package com.google.android.material.datepicker;

import android.widget.BaseAdapter;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class q extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public static final int f2753d = w.d(null).getMaximum(4);

    /* renamed from: e, reason: collision with root package name */
    public static final int f2754e = (w.d(null).getMaximum(7) + w.d(null).getMaximum(5)) - 1;

    /* renamed from: a, reason: collision with root package name */
    public final p f2755a;

    /* renamed from: b, reason: collision with root package name */
    public android.support.v4.media.d f2756b;

    /* renamed from: c, reason: collision with root package name */
    public final c f2757c;

    public q(p pVar, c cVar) {
        this.f2755a = pVar;
        this.f2757c = cVar;
        throw null;
    }

    public final int a() {
        int i10 = this.f2757c.f2713e;
        p pVar = this.f2755a;
        Calendar calendar = pVar.f2746a;
        int i11 = calendar.get(7);
        if (i10 <= 0) {
            i10 = calendar.getFirstDayOfWeek();
        }
        int i12 = i11 - i10;
        if (i12 < 0) {
            return i12 + pVar.f2749d;
        }
        return i12;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i10) {
        if (i10 >= a()) {
            int a10 = a();
            p pVar = this.f2755a;
            if (i10 <= (a10 + pVar.f2750e) - 1) {
                int a11 = (i10 - a()) + 1;
                Calendar b10 = w.b(pVar.f2746a);
                b10.set(5, a11);
                return Long.valueOf(b10.getTimeInMillis());
            }
            return null;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f2754e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10 / this.f2755a.f2749d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            android.content.Context r0 = r7.getContext()
            android.support.v4.media.d r1 = r4.f2756b
            if (r1 != 0) goto Lf
            android.support.v4.media.d r1 = new android.support.v4.media.d
            r1.<init>(r0)
            r4.f2756b = r1
        Lf:
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r6 != 0) goto L27
            android.content.Context r6 = r7.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r0 = 2131558482(0x7f0d0052, float:1.8742281E38)
            android.view.View r6 = r6.inflate(r0, r7, r1)
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
        L27:
            int r6 = r4.a()
            int r6 = r5 - r6
            if (r6 < 0) goto L5d
            com.google.android.material.datepicker.p r7 = r4.f2755a
            int r2 = r7.f2750e
            if (r6 < r2) goto L36
            goto L5d
        L36:
            r2 = 1
            int r6 = r6 + r2
            r0.setTag(r7)
            android.content.res.Resources r7 = r0.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            java.util.Locale r7 = r7.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3[r1] = r6
            java.lang.String r6 = "%d"
            java.lang.String r6 = java.lang.String.format(r7, r6, r3)
            r0.setText(r6)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L65
        L5d:
            r6 = 8
            r0.setVisibility(r6)
            r0.setEnabled(r1)
        L65:
            java.lang.Long r5 = r4.getItem(r5)
            if (r5 != 0) goto L6c
            goto L71
        L6c:
            r5.longValue()
            if (r0 != 0) goto L72
        L71:
            return r0
        L72:
            r0.getContext()
            java.util.Calendar r5 = com.google.android.material.datepicker.w.c()
            r5.getTimeInMillis()
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.q.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
