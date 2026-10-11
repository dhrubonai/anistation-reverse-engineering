package defpackage;

import com.google.protobuf.CodedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sz7 {
    public static final sz7 c = new sz7(kz7.b, hz7.y());
    public final kz7 a;
    public final hz7 b;

    public sz7(kz7 kz7Var, hz7 hz7Var) {
        kz7Var.getClass();
        this.a = kz7Var;
        this.b = hz7Var;
    }

    public static sz7 a(ze7 ze7Var, boolean z) {
        kz7 a;
        int min;
        int C = ze7Var.C();
        if (C <= 1) {
            ze7Var.C();
            int a2 = ze7Var.a(ze7Var.A());
            ff7 ff7Var = ff7.a;
            int i = se7.a;
            hz7 x = hz7.x(ze7Var, ff7.b);
            ze7Var.b(a2);
            w71 w71Var = new w71();
            Inflater inflater = (Inflater) w71Var.y;
            try {
                if (z) {
                    int a3 = ze7Var.a(ze7Var.A());
                    int c2 = ze7Var.c();
                    if (c2 < 0) {
                        min = 4096;
                    } else {
                        min = Math.min(c2, CodedOutputStream.DEFAULT_BUFFER_SIZE);
                    }
                    try {
                        a = kz7.a(ze7.h(new InflaterInputStream(new na0(w71Var, ze7Var), inflater, min), CodedOutputStream.DEFAULT_BUFFER_SIZE));
                        inflater.reset();
                        if (ze7Var.c() == 0) {
                            ze7Var.b(a3);
                            w71Var.close();
                            return new sz7(a, x);
                        }
                        throw new IOException("Unexpected bytes remaining after FlagsBlob parsing.");
                    } finally {
                    }
                }
                inflater.setInput(ze7Var.z());
                try {
                    a = kz7.a(ze7.h(new na0((Closeable) w71Var, (byte) 3), CodedOutputStream.DEFAULT_BUFFER_SIZE));
                    w71Var.close();
                    return new sz7(a, x);
                } finally {
                }
            } finally {
                try {
                    w71Var.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(C).length() + 44);
        sb.append("Unsupported version: ");
        sb.append(C);
        sb.append(". Current version is: 1");
        throw new IOException(sb.toString());
    }
}
