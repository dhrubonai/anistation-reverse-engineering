package defpackage;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class a73 {
    public static final <T> T decodeFromStream(y43 y43Var, ne1 ne1Var, InputStream inputStream) {
        y43Var.getClass();
        ne1Var.getClass();
        inputStream.getClass();
        cn7 cn7Var = new cn7(inputStream);
        jl0 jl0Var = (jl0) cn7Var.x;
        try {
            return (T) p63.a(y43Var, ne1Var, cn7Var);
        } finally {
            ub0 ub0Var = ub0.c;
            byte[] array = jl0Var.c.array();
            array.getClass();
            ub0Var.getClass();
            ub0Var.a(array);
        }
    }

    public static final <T> ni5 decodeToSequence(y43 y43Var, InputStream inputStream, ne1 ne1Var, h61 h61Var) {
        y43Var.getClass();
        inputStream.getClass();
        ne1Var.getClass();
        h61Var.getClass();
        return p63.decodeToSequenceByReader(y43Var, new cn7(inputStream), ne1Var, h61Var);
    }

    public static final <T> void encodeToStream(y43 y43Var, mj5 mj5Var, T t, OutputStream outputStream) {
        y43Var.getClass();
        mj5Var.getClass();
        outputStream.getClass();
        ad adVar = new ad(outputStream);
        byte[] bArr = (byte[]) adVar.A;
        try {
            p63.b(y43Var, adVar, mj5Var, t);
        } finally {
            adVar.g();
            nk0 nk0Var = nk0.c;
            char[] cArr = (char[]) adVar.B;
            nk0Var.getClass();
            nk0Var.b(cArr);
            vb0 vb0Var = vb0.c;
            vb0Var.getClass();
            vb0Var.a(bArr);
        }
    }

    public static final <T> ni5 decodeToSequence(y43 y43Var, InputStream inputStream, h61 h61Var) {
        y43Var.getClass();
        inputStream.getClass();
        h61Var.getClass();
        a34.r0();
        throw null;
    }

    public static final <T> T decodeFromStream(y43 y43Var, InputStream inputStream) {
        y43Var.getClass();
        inputStream.getClass();
        a34.r0();
        throw null;
    }

    public static final <T> void encodeToStream(y43 y43Var, T t, OutputStream outputStream) {
        y43Var.getClass();
        outputStream.getClass();
        a34.r0();
        throw null;
    }
}
