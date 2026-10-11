package defpackage;

import com.google.protobuf.CodedOutputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class rk0 {
    public static final gc4 a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z;
        ea1 ea1Var;
        String property = System.getProperty("ktor.internal.cio.disable.chararray.pooling");
        if (property != null) {
            z = Boolean.parseBoolean(property);
        } else {
            z = false;
        }
        if (z) {
            ea1Var = new Object();
        } else {
            ea1Var = new ea1(CodedOutputStream.DEFAULT_BUFFER_SIZE);
        }
        a = ea1Var;
    }
}
