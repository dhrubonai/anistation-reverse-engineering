package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mq0 implements or1 {
    public final ko a;
    public final int b;

    public mq0(String str, int i) {
        this(new ko(str), i);
    }

    @Override // defpackage.or1
    public final void a(sr1 sr1Var) {
        int length;
        int i = sr1Var.d;
        ko koVar = this.a;
        int i2 = -1;
        if (i != -1) {
            sr1Var.n(koVar.y, i, sr1Var.e);
        } else {
            sr1Var.n(koVar.y, sr1Var.b, sr1Var.c);
        }
        int i3 = sr1Var.b;
        int i4 = sr1Var.c;
        if (i3 == i4) {
            i2 = i4;
        }
        int i5 = this.b;
        if (i5 > 0) {
            length = (i2 + i5) - 1;
        } else {
            length = (i2 + i5) - koVar.y.length();
        }
        int C = db.C(length, 0, ((wp) sr1Var.f).g());
        sr1Var.p(C, C);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq0)) {
            return false;
        }
        mq0 mq0Var = (mq0) obj;
        if (a34.i(this.a.y, mq0Var.a.y) && this.b == mq0Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.y.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "CommitTextCommand(text='" + this.a.y + "', newCursorPosition=" + this.b + ")";
    }

    public mq0(ko koVar, int i) {
        this.a = koVar;
        this.b = i;
    }
}
