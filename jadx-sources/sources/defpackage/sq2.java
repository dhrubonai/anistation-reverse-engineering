package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class sq2 {
    public final mk0 a;
    public int b;
    public int c;
    public mk2 d;

    public sq2(mk0 mk0Var) {
        mk0Var.getClass();
        this.a = mk0Var;
        this.d = (mk2) vq2.b.y();
    }

    public final kk0 a(String str) {
        if (this.b != 0) {
            long[] jArr = il0.a;
            int abs = Math.abs(il0.b(str, 0, str.length()));
            int i = this.c;
            while (true) {
                int i2 = abs % i;
                int i3 = i2 * 6;
                if (this.d.a(i3) != -1) {
                    if (b(str, i3)) {
                        return f(i3);
                    }
                    abs = i2 + 1;
                    i = this.c;
                } else {
                    return null;
                }
            }
        } else {
            return null;
        }
    }

    public final boolean b(CharSequence charSequence, int i) {
        return il0.a(this.a, this.d.a(i + 1), this.d.a(i + 2), charSequence);
    }

    public final kk0 c(int i) {
        return (kk0) this.a.subSequence(this.d.a(i + 1), this.d.a(i + 2));
    }

    public final void d(int i, int i2, int i3, int i4) {
        int i5;
        int i6 = this.b;
        double d = i6;
        int i7 = this.c;
        if (d >= i7 * 0.75d) {
            mk2 mk2Var = this.d;
            this.b = 0;
            this.c = (i7 * 2) | 128;
            mk2 mk2Var2 = (mk2) vq2.b.y();
            int size = (mk2Var.a.size() * 2) | 1;
            for (int i8 = 0; i8 < size; i8++) {
                mk2Var2.a.add(vq2.a.y());
            }
            this.d = mk2Var2;
            ri5 V = io3.V((ic2) mk2Var.b().b);
            while (V.hasNext()) {
                int intValue = ((Number) V.next()).intValue();
                d(mk2Var.a(intValue + 1), mk2Var.a(intValue + 2), mk2Var.a(intValue + 3), mk2Var.a(intValue + 4));
            }
            vq2.b.i0(mk2Var);
            if (i6 != this.b) {
                ze0.k("Failed requirement.");
                return;
            }
        }
        mk0 mk0Var = this.a;
        int abs = Math.abs(il0.b(mk0Var, i, i2));
        CharSequence subSequence = mk0Var.subSequence(i, i2);
        int i9 = abs % this.c;
        int i10 = -1;
        while (true) {
            i5 = i9 * 6;
            if (this.d.a(i5) == -1) {
                break;
            }
            if (b(subSequence, i5)) {
                i10 = i9;
            }
            i9 = (i9 + 1) % this.c;
        }
        this.d.c(i5, abs);
        this.d.c(i5 + 1, i);
        this.d.c(i5 + 2, i2);
        this.d.c(i5 + 3, i3);
        this.d.c(i5 + 4, i4);
        this.d.c(i5 + 5, -1);
        if (i10 != -1) {
            this.d.c((i10 * 6) + 5, i9);
        }
        this.b++;
    }

    public final void e() {
        this.b = 0;
        this.c = 0;
        tq2 tq2Var = vq2.b;
        tq2Var.i0(this.d);
        this.d = (mk2) tq2Var.y();
    }

    public final kk0 f(int i) {
        return (kk0) this.a.subSequence(this.d.a(i + 3), this.d.a(i + 4));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        uq2 uq2Var = vq2.a;
        ri5 V = io3.V((ic2) this.d.b().b);
        while (V.hasNext()) {
            int intValue = ((Number) V.next()).intValue();
            sb.append((CharSequence) "");
            sb.append((CharSequence) c(intValue));
            sb.append((CharSequence) " => ");
            sb.append((CharSequence) f(intValue));
            sb.append((CharSequence) "\n");
        }
        return sb.toString();
    }
}
