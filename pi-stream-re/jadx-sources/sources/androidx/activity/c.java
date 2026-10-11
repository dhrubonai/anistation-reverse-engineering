package androidx.activity;

import android.os.Bundle;
import androidx.fragment.app.b0;
import androidx.fragment.app.s0;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements n3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f259a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f260b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f259a = i10;
        this.f260b = obj;
    }

    @Override // n3.d
    public final Bundle a() {
        int i10 = this.f259a;
        Object obj = this.f260b;
        switch (i10) {
            case 0:
                return j.f((j) obj);
            case 1:
                return b0.i((b0) obj);
            default:
                return ((s0) obj).T();
        }
    }
}
