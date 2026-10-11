package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.protobuf.CodedOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qx2 implements fu5, s48 {
    public static final qx2 A;
    public static final qx2 z;
    public final /* synthetic */ byte x;
    public boolean y;

    static {
        byte b = 0;
        z = new qx2(b, true);
        A = new qx2(b, false);
    }

    public qx2(rc4 rc4Var, qc4 qc4Var) {
        boolean z2;
        boolean z3;
        int i;
        this.x = (byte) 1;
        int i2 = qc4Var.a;
        ByteBuffer byteBuffer = qc4Var.b;
        if (i2 != 6 && i2 != 3) {
            z2 = false;
        } else {
            z2 = true;
        }
        io3.n(z2);
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        yi0 yi0Var = new yi0(min, bArr);
        if (!rc4Var.a) {
            if (yi0Var.f()) {
                this.y = false;
                return;
            }
            int g = yi0Var.g(2);
            boolean f = yi0Var.f();
            if (!rc4Var.b) {
                if (!f) {
                    this.y = true;
                    return;
                }
                if (g != 3 && g != 0) {
                    z3 = yi0Var.f();
                } else {
                    z3 = true;
                }
                yi0Var.n();
                if (rc4Var.d) {
                    if (yi0Var.f()) {
                        if (rc4Var.e) {
                            yi0Var.n();
                        } else {
                            throw new Exception();
                        }
                    }
                    if (!rc4Var.c) {
                        if (g != 3) {
                            yi0Var.n();
                        }
                        yi0Var.o(rc4Var.f);
                        if (g != 2 && g != 0 && !z3) {
                            yi0Var.o(3);
                        }
                        if (g != 3 && g != 0) {
                            i = yi0Var.g(8);
                        } else {
                            i = 255;
                        }
                        this.y = i != 0;
                        return;
                    }
                    throw new Exception();
                }
                throw new Exception();
            }
            throw new Exception();
        }
        throw new Exception();
    }

    public void a(boolean z2) {
        if (this.y == z2) {
            return;
        }
        this.y = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s48
    public /* bridge */ /* synthetic */ Object c(q48 q48Var) {
        sz7 a;
        InputStream s = nu5.s(q48Var);
        try {
            boolean z2 = this.y;
            int i = CodedOutputStream.DEFAULT_BUFFER_SIZE;
            if (z2) {
                if (s instanceof e58) {
                    long length = ((e58) s).a().length();
                    if (length == 0) {
                        i = 512;
                    } else if (length < 4096) {
                        i = (int) length;
                    }
                }
                a = sz7.a(ze7.h(s, i), true);
            } else {
                a = sz7.a(ze7.h(s, CodedOutputStream.DEFAULT_BUFFER_SIZE), false);
            }
            a34.C(s, null);
            return a;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                a34.C(s, th);
                throw th2;
            }
        }
    }

    public String toString() {
        switch (this.x) {
            case 0:
                return qx1.r(new StringBuilder("IncorrectFragmentation{expected="), !this.y, "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ qx2(byte b, boolean z2) {
        this.x = b;
        this.y = z2;
    }

    public qx2(Context context, Looper looper, f46 f46Var) {
        this.x = (byte) 3;
        new og5(context.getApplicationContext(), (byte) 8);
        f46Var.a(looper, null);
        f46Var.a(Looper.getMainLooper(), null);
    }

    public /* synthetic */ qx2(byte b) {
        this.x = b;
    }
}
