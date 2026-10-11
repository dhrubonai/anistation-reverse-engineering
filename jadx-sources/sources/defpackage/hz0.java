package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class hz0 {
    public static final jz0 a;

    static {
        nt1 nt1Var = nt1.x;
        new jz0("multipart", "*", nt1Var);
        new jz0("multipart", "mixed", nt1Var);
        new jz0("multipart", "alternative", nt1Var);
        new jz0("multipart", "related", nt1Var);
        a = new jz0("multipart", "form-data", nt1Var);
        new jz0("multipart", "signed", nt1Var);
        new jz0("multipart", "encrypted", nt1Var);
        new jz0("multipart", "byteranges", nt1Var);
    }
}
