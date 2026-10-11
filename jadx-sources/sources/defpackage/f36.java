package defpackage;

import android.database.Cursor;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class f36 extends g36 {
    public int[] A;
    public long[] B;
    public double[] C;
    public String[] D;
    public byte[][] E;
    public Cursor F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f36(x26 x26Var, String str) {
        super(x26Var, str);
        x26Var.getClass();
        str.getClass();
        this.A = new int[0];
        this.B = new long[0];
        this.C = new double[0];
        this.D = new String[0];
        this.E = new byte[0];
    }

    public static void q(Cursor cursor, int i) {
        if (i >= 0 && i < cursor.getColumnCount()) {
            return;
        }
        zz.c0(25, "column index out of range");
        throw null;
    }

    @Override // defpackage.m85
    public final void J(int i, String str) {
        str.getClass();
        a();
        l(3, i);
        this.A[i] = 3;
        this.D[i] = str;
    }

    @Override // defpackage.m85
    public final void b(int i, double d) {
        a();
        l(2, i);
        this.A[i] = 2;
        this.C[i] = d;
    }

    @Override // defpackage.m85
    public final String c0(int i) {
        a();
        Cursor t = t();
        q(t, i);
        String string = t.getString(i);
        string.getClass();
        return string;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.z) {
            k();
            reset();
        }
        this.z = true;
    }

    @Override // defpackage.m85
    public final void e(int i, long j) {
        a();
        l(1, i);
        this.A[i] = 1;
        this.B[i] = j;
    }

    @Override // defpackage.m85
    public final void f(int i, byte[] bArr) {
        a();
        l(4, i);
        this.A[i] = 4;
        this.E[i] = bArr;
    }

    @Override // defpackage.m85
    public final byte[] getBlob(int i) {
        a();
        Cursor t = t();
        q(t, i);
        byte[] blob = t.getBlob(i);
        blob.getClass();
        return blob;
    }

    @Override // defpackage.m85
    public final int getColumnCount() {
        a();
        p();
        Cursor cursor = this.F;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // defpackage.m85
    public final String getColumnName(int i) {
        a();
        p();
        Cursor cursor = this.F;
        if (cursor != null) {
            q(cursor, i);
            String columnName = cursor.getColumnName(i);
            columnName.getClass();
            return columnName;
        }
        ze0.m("Required value was null.");
        return null;
    }

    @Override // defpackage.m85
    public final long getLong(int i) {
        a();
        Cursor t = t();
        q(t, i);
        return t.getLong(i);
    }

    @Override // defpackage.m85
    public final void h(int i) {
        a();
        l(5, i);
        this.A[i] = 5;
    }

    @Override // defpackage.m85
    public final boolean isNull(int i) {
        a();
        Cursor t = t();
        q(t, i);
        return t.isNull(i);
    }

    @Override // defpackage.g36, defpackage.m85
    public final void k() {
        a();
        this.A = new int[0];
        this.B = new long[0];
        this.C = new double[0];
        this.D = new String[0];
        this.E = new byte[0];
    }

    public final void l(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.A;
        if (iArr.length < i3) {
            this.A = Arrays.copyOf(iArr, i3);
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        byte[][] bArr = this.E;
                        if (bArr.length < i3) {
                            this.E = (byte[][]) Arrays.copyOf(bArr, i3);
                            return;
                        }
                        return;
                    }
                    return;
                }
                String[] strArr = this.D;
                if (strArr.length < i3) {
                    this.D = (String[]) Arrays.copyOf(strArr, i3);
                    return;
                }
                return;
            }
            double[] dArr = this.C;
            if (dArr.length < i3) {
                this.C = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        long[] jArr = this.B;
        if (jArr.length < i3) {
            this.B = Arrays.copyOf(jArr, i3);
        }
    }

    public final void p() {
        if (this.F == null) {
            this.F = this.x.o(new eo3(this, (byte) 19));
        }
    }

    @Override // defpackage.m85
    public final boolean p0() {
        a();
        p();
        Cursor cursor = this.F;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        ze0.m("Required value was null.");
        return false;
    }

    @Override // defpackage.g36, defpackage.m85
    public final void reset() {
        a();
        Cursor cursor = this.F;
        if (cursor != null) {
            cursor.close();
        }
        this.F = null;
    }

    public final Cursor t() {
        Cursor cursor = this.F;
        if (cursor != null) {
            return cursor;
        }
        zz.c0(21, "no row");
        throw null;
    }
}
