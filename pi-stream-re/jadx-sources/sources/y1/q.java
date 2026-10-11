package y1;

import c1.f1;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final f1 f11524a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f11525b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11526c;

    public q(f1 f1Var, int[] iArr) {
        if (iArr.length == 0) {
            f1.o.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f11524a = f1Var;
        this.f11525b = iArr;
        this.f11526c = 0;
    }
}
