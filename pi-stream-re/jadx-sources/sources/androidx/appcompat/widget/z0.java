package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class z0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextView f729a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Typeface f730b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f731c;

    public z0(TextView textView, Typeface typeface, int i10) {
        this.f729a = textView;
        this.f730b = typeface;
        this.f731c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f729a.setTypeface(this.f730b, this.f731c);
    }
}
