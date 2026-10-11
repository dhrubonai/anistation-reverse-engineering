package n;

/* loaded from: classes.dex */
public final class i implements Cloneable {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f7880e = new Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f7881a = false;

    /* renamed from: b, reason: collision with root package name */
    public long[] f7882b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f7883c;

    /* renamed from: d, reason: collision with root package name */
    public int f7884d;

    public i() {
        int i10;
        int i11 = 4;
        while (true) {
            i10 = 80;
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (80 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 8;
        this.f7882b = new long[i13];
        this.f7883c = new Object[i13];
    }

    public final void a(Long l10, long j4) {
        int i10 = this.f7884d;
        if (i10 != 0 && j4 <= this.f7882b[i10 - 1]) {
            f(l10, j4);
            return;
        }
        if (this.f7881a && i10 >= this.f7882b.length) {
            d();
        }
        int i11 = this.f7884d;
        if (i11 >= this.f7882b.length) {
            int i12 = (i11 + 1) * 8;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 8;
            long[] jArr = new long[i15];
            Object[] objArr = new Object[i15];
            long[] jArr2 = this.f7882b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f7883c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f7882b = jArr;
            this.f7883c = objArr;
        }
        this.f7882b[i11] = j4;
        this.f7883c[i11] = l10;
        this.f7884d = i11 + 1;
    }

    public final void b() {
        int i10 = this.f7884d;
        Object[] objArr = this.f7883c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f7884d = 0;
        this.f7881a = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final i clone() {
        try {
            i iVar = (i) super.clone();
            iVar.f7882b = (long[]) this.f7882b.clone();
            iVar.f7883c = (Object[]) this.f7883c.clone();
            return iVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final void d() {
        int i10 = this.f7884d;
        long[] jArr = this.f7882b;
        Object[] objArr = this.f7883c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f7880e) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f7881a = false;
        this.f7884d = i11;
    }

    public final Object e(Long l10, long j4) {
        Object obj;
        int c6 = j5.a.c(this.f7882b, this.f7884d, j4);
        if (c6 >= 0 && (obj = this.f7883c[c6]) != f7880e) {
            return obj;
        }
        return l10;
    }

    public final void f(Object obj, long j4) {
        int c6 = j5.a.c(this.f7882b, this.f7884d, j4);
        if (c6 >= 0) {
            this.f7883c[c6] = obj;
            return;
        }
        int i10 = ~c6;
        int i11 = this.f7884d;
        if (i10 < i11) {
            Object[] objArr = this.f7883c;
            if (objArr[i10] == f7880e) {
                this.f7882b[i10] = j4;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.f7881a && i11 >= this.f7882b.length) {
            d();
            i10 = ~j5.a.c(this.f7882b, this.f7884d, j4);
        }
        int i12 = this.f7884d;
        if (i12 >= this.f7882b.length) {
            int i13 = (i12 + 1) * 8;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 8;
            long[] jArr = new long[i16];
            Object[] objArr2 = new Object[i16];
            long[] jArr2 = this.f7882b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f7883c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f7882b = jArr;
            this.f7883c = objArr2;
        }
        int i17 = this.f7884d - i10;
        if (i17 != 0) {
            long[] jArr3 = this.f7882b;
            int i18 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i18, i17);
            Object[] objArr4 = this.f7883c;
            System.arraycopy(objArr4, i10, objArr4, i18, this.f7884d - i10);
        }
        this.f7882b[i10] = j4;
        this.f7883c[i10] = obj;
        this.f7884d++;
    }

    public final Object g(int i10) {
        if (this.f7881a) {
            d();
        }
        return this.f7883c[i10];
    }

    public final String toString() {
        if (this.f7881a) {
            d();
        }
        int i10 = this.f7884d;
        if (i10 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i10 * 28);
        sb.append('{');
        for (int i11 = 0; i11 < this.f7884d; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            if (this.f7881a) {
                d();
            }
            sb.append(this.f7882b[i11]);
            sb.append('=');
            Object g10 = g(i11);
            if (g10 != this) {
                sb.append(g10);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
