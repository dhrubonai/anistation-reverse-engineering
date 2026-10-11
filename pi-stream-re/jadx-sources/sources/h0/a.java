package h0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f4522a;

    /* renamed from: b, reason: collision with root package name */
    public final h f4523b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4524c;

    public a(int i10, h hVar, int i11) {
        this.f4522a = i10;
        this.f4523b = hVar;
        this.f4524c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f4522a);
        this.f4523b.f4539a.performAction(this.f4524c, bundle);
    }
}
