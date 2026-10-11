package r6;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public int f9516a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9517b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9518c;

    /* renamed from: d, reason: collision with root package name */
    public Object f9519d;

    /* renamed from: e, reason: collision with root package name */
    public Object f9520e;

    public q0(String str, int i10, m8.a0 a0Var) {
        this(str, i10, a0Var, false, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01f9  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r6.s1 a() {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.q0.a():r6.s1");
    }

    public final void b(int i10) {
        int i11 = i10 * 2;
        Object obj = this.f9519d;
        if (i11 > ((Object[]) obj).length) {
            this.f9519d = Arrays.copyOf((Object[]) obj, q6.g.y(((Object[]) obj).length, i11));
            this.f9517b = false;
        }
    }

    public final void c(Object obj, Object obj2) {
        b(this.f9516a + 1);
        if (obj != null) {
            if (obj2 != null) {
                Object[] objArr = (Object[]) this.f9519d;
                int i10 = this.f9516a;
                int i11 = i10 * 2;
                objArr[i11] = obj;
                objArr[i11 + 1] = obj2;
                this.f9516a = i10 + 1;
                return;
            }
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
        throw new NullPointerException("null key in entry: null=" + obj2);
    }

    public q0(String str, int i10, m8.a0 a0Var, boolean z9, String str2) {
        this.f9518c = str;
        this.f9516a = i10;
        this.f9519d = a0Var;
        this.f9517b = z9;
        this.f9520e = str2;
    }

    public q0(int i10) {
        this.f9519d = new Object[i10 * 2];
        this.f9516a = 0;
        this.f9517b = false;
    }
}
