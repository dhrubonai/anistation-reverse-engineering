package r6;

import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h1 implements q6.m, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int f9475a;

    public h1(int i10) {
        h0.p(i10, "expectedValuesPerKey");
        this.f9475a = i10;
    }

    @Override // q6.m
    public final Object get() {
        return new ArrayList(this.f9475a);
    }
}
