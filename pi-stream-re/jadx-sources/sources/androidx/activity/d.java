package androidx.activity;

import android.content.Context;
import androidx.fragment.app.b0;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements b.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f262b;

    public /* synthetic */ d(b0 b0Var, int i10) {
        this.f261a = i10;
        this.f262b = b0Var;
    }

    @Override // b.b
    public final void a(Context context) {
        int i10 = this.f261a;
        j jVar = this.f262b;
        switch (i10) {
            case 0:
                j.d(jVar);
                return;
            default:
                b0.h((b0) jVar);
                return;
        }
    }
}
